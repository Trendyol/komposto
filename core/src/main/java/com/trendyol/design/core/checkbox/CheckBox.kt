package com.trendyol.design.core.checkbox

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.snap
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.material.minimumInteractiveComponentSize
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathMeasure
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import com.trendyol.design.core.previewtheme.PreviewTheme
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign
import kotlin.math.floor
import kotlin.math.max

@Composable
fun TrendyolCheckbox(
    style: CheckboxStyle,
    size: CheckBoxSize,
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    TrendyolTriStateCheckbox(
        modifier = modifier,
        style = style,
        size = size,
        state = ToggleableState(checked),
        onClick = if (onCheckedChange != null) {
            { onCheckedChange(!checked) }
        } else null,
        interactionSource = interactionSource,
        enabled = enabled,
        colors = style.colors,
    )
}

@Composable
private fun TrendyolTriStateCheckbox(
    style: CheckboxStyle,
    size: CheckBoxSize,
    state: ToggleableState,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: TrendyolCheckboxColors = TrendyolCheckboxDefaults.colors()
) {
    val toggleableModifier = if (onClick != null) {
        Modifier.triStateToggleable(
            state = state,
            onClick = onClick,
            enabled = enabled,
            role = Role.Checkbox,
            interactionSource = interactionSource,
            indication = rememberRipple(
                bounded = false,
                radius = size.rippleRadius
            )
        )
    } else {
        Modifier
    }

    Row(
        modifier = modifier.clickable(
            indication = null,
            interactionSource = remember { MutableInteractionSource() },
            onClick = { onClick?.invoke() },
            enabled = enabled
        ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(modifier = Modifier.size(size.containerSize)) {
            TrendyolCheckboxImpl(
                style = style,
                size = size,
                enabled = enabled,
                value = state,
                modifier = Modifier
                    .then(
                        if (onClick != null) {
                            Modifier.minimumInteractiveComponentSize()
                        } else {
                            Modifier
                        }
                    )
                    .then(toggleableModifier)
                    .padding(2.dp),
                colors = colors,
            )
        }

        when (style) {
            is CheckboxStyle.Text -> {
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = style.text,
                    style = size.textStyle,
                    color = TrendyolDesign.colors.colorOnSurfaceVariant3
                )
            }

            is CheckboxStyle.Content -> {
                Spacer(modifier = Modifier.width(8.dp))
                style.content()
            }
        }
    }
}

@Composable
private fun TrendyolCheckboxImpl(
    style: CheckboxStyle,
    size: CheckBoxSize,
    enabled: Boolean,
    value: ToggleableState,
    modifier: Modifier = Modifier,
    colors: TrendyolCheckboxColors
) {
    val transition = updateTransition(targetState = value, label = CHECKBOX_LABEL)
    val checkDrawFraction by transition.animateFloat(
        transitionSpec = {
            when {
                initialState == ToggleableState.Off -> tween(CHECK_ANIM_DURATION)
                targetState == ToggleableState.Off -> snap(BOX_OUT_DURATION)
                else -> spring()
            }
        },
        label = CHECKBOX_LABEL,
    ) {
        when (it) {
            ToggleableState.On -> 1F
            ToggleableState.Off -> 0F
            ToggleableState.Indeterminate -> 1F
        }
    }

    val checkCenterGravitationShiftFraction by transition.animateFloat(
        transitionSpec = {
            when {
                initialState == ToggleableState.Off -> snap()
                targetState == ToggleableState.Off -> snap(BOX_OUT_DURATION)
                else -> tween(durationMillis = CHECK_ANIM_DURATION)
            }
        },
        label = CHECKBOX_LABEL,
    ) {
        when (it) {
            ToggleableState.On, ToggleableState.Off -> 0F
            ToggleableState.Indeterminate -> 1F
        }
    }
    val checkCache = remember { CheckDrawingCache() }
    val checkColor by colors.checkmarkColor(enabled, value)
    val boxColor by colors.boxColor(enabled, value)
    val borderColor by colors.borderColor(enabled, value)

    Canvas(
        modifier
            .wrapContentSize(Alignment.Center)
            .requiredSize(size.checkboxSize)
    ) {
        val strokeWidthPx = floor(style.strokeWith.toPx())
        val paddingPx = floor(style.padding.toPx())

        drawBox(
            boxColor = boxColor,
            borderColor = borderColor,
            radius = size.borderCornerRadius.toPx(),
            strokeWidth = strokeWidthPx
        )
        drawCheck(
            checkColor = checkColor,
            checkFraction = checkDrawFraction,
            crossCenterGravitation = checkCenterGravitationShiftFraction,
            strokeWidthPx = strokeWidthPx,
            drawingCache = checkCache,
            paddingPx = paddingPx
        )
    }
}

private fun DrawScope.drawBox(
    boxColor: Color,
    borderColor: Color,
    radius: Float,
    strokeWidth: Float
) {
    val halfStrokeWidth = strokeWidth / 2.0F
    val stroke = Stroke(strokeWidth)
    val checkboxSize = size.width
    if (boxColor == borderColor) {
        drawRoundRect(
            boxColor,
            size = Size(checkboxSize, checkboxSize),
            cornerRadius = CornerRadius(radius),
            style = Fill
        )
    } else {
        drawRoundRect(
            boxColor,
            topLeft = Offset(strokeWidth, strokeWidth),
            size = Size(checkboxSize - strokeWidth * 2, checkboxSize - strokeWidth * 2),
            cornerRadius = CornerRadius(max(0F, radius - strokeWidth)),
            style = Fill,
        )
        drawRoundRect(
            borderColor,
            topLeft = Offset(halfStrokeWidth, halfStrokeWidth),
            size = Size(checkboxSize - strokeWidth, checkboxSize - strokeWidth),
            cornerRadius = CornerRadius(radius - halfStrokeWidth),
            style = stroke
        )
    }
}

@SuppressWarnings("MagicNumber", "LongParameterList")
private fun DrawScope.drawCheck(
    checkColor: Color,
    checkFraction: Float,
    crossCenterGravitation: Float,
    strokeWidthPx: Float,
    drawingCache: CheckDrawingCache,
    paddingPx: Float
) {
    val stroke = Stroke(width = strokeWidthPx, cap = StrokeCap.Square)
    val width = size.width - paddingPx * 2
    val height = size.height - paddingPx * 2
    val checkCrossX = 0.4F
    val checkCrossY = 0.7F
    val leftX = 0.2F
    val leftY = 0.5F
    val rightX = 0.8F
    val rightY = 0.3F

    val gravitatedCrossX = lerp(checkCrossX, 0.5F, crossCenterGravitation)
    val gravitatedCrossY = lerp(checkCrossY, 0.5F, crossCenterGravitation)
    val gravitatedLeftY = lerp(leftY, 0.5F, crossCenterGravitation)
    val gravitatedRightY = lerp(rightY, 0.5F, crossCenterGravitation)

    with(drawingCache) {
        checkPath.reset()
        checkPath.moveTo(width * leftX + paddingPx, height * gravitatedLeftY + paddingPx)
        checkPath.lineTo(
            width * gravitatedCrossX + paddingPx, height * gravitatedCrossY + paddingPx
        )
        checkPath.lineTo(width * rightX + paddingPx, height * gravitatedRightY + paddingPx)
        pathMeasure.setPath(checkPath, false)
        pathToDraw.reset()
        pathMeasure.getSegment(
            startDistance = 0F,
            stopDistance = pathMeasure.length * checkFraction, pathToDraw,
            startWithMoveTo = true
        )
    }
    drawPath(drawingCache.pathToDraw, checkColor, style = stroke)
}

@Immutable
private class CheckDrawingCache(
    val checkPath: Path = Path(),
    val pathMeasure: PathMeasure = PathMeasure(),
    val pathToDraw: Path = Path()
)

internal const val CHECKBOX_LABEL = "TrendyolCheckbox"
private const val BOX_OUT_DURATION = 100
private const val CHECK_ANIM_DURATION = 100

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolMediumCheckboxPreviewChecked() {
    PreviewTheme {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Medium,
            checked = true,
            onCheckedChange = { },
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolMediumCheckboxPreview() {
    PreviewTheme {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Medium,
            checked = false,
            onCheckedChange = { },
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolMediumCheckboxPreviewDisabled() {
    PreviewTheme {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Medium,
            checked = true,
            onCheckedChange = { },
            enabled = false
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolSmallCheckboxPreviewChecked() {
    PreviewTheme {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Small,
            checked = true,
            onCheckedChange = { },
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolSmallCheckboxPreview() {
    PreviewTheme {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Small,
            checked = false,
            onCheckedChange = { },
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolSmallCheckboxPreviewDisabled() {
    PreviewTheme {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Small,
            checked = true,
            onCheckedChange = { },
            enabled = false
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolXSmallCheckboxPreviewChecked() {
    PreviewTheme {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.XSmall,
            checked = true,
            onCheckedChange = { },
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolXSmallCheckboxPreview() {
    PreviewTheme {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.XSmall,
            checked = false,
            onCheckedChange = { },
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolXSmallCheckboxPreviewDisabled() {
    PreviewTheme {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.XSmall,
            checked = true,
            onCheckedChange = { },
            enabled = false
        )
    }
}
