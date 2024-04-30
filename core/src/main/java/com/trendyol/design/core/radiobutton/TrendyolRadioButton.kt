package com.trendyol.design.core.radiobutton

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.RadioButtonColors
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

@Composable
fun TrendyolRadioButton(
    selected: Boolean,
    style: RadioButtonStyle,
    size: RadioButtonSize,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: RadioButtonColors = style.colors,
    position: Alignment.Vertical = Alignment.CenterVertically,
) {
    val dotRadius = animateDpAsState(
        targetValue = if (selected) size.dotSize / 2 else 0.dp,
        animationSpec = tween(durationMillis = RADIO_ANIMATION_DURATION)
    )
    val radioColor = colors.radioColor(enabled = enabled, selected = selected)
    val selectableModifier =
        if (onClick != null) {
            Modifier.selectable(
                selected = selected,
                onClick = onClick,
                enabled = enabled,
                role = Role.RadioButton,
                interactionSource = interactionSource,
                indication = rememberRipple(
                    bounded = false,
                    radius = size.rippleRadius,
                )
            )
        } else {
            Modifier
        }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.clickable(enabled = enabled, onClick = { onClick?.invoke() })
    ) {
        Canvas(
            selectableModifier
                .wrapContentSize(Alignment.Center)
                .padding(2.dp)
                .requiredSize(size.buttonSize)
                .align(position)
        ) {
            // Draw the radio button
            val strokeWidth = 2.dp.toPx()
            drawCircle(
                radioColor.value,
                size.radius.toPx() - strokeWidth / 2,
                style = Stroke(strokeWidth)
            )
            if (dotRadius.value > 0.dp) {
                drawCircle(radioColor.value, dotRadius.value.toPx() - strokeWidth / 2, style = Fill)
            }
        }

        when (style) {
            is RadioButtonStyle.Text -> {
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = style.text,
                    style = size.textSize.copy(color = TrendyolDesign.colors.colorOnSurfaceVariant3)
                )
            }

            is RadioButtonStyle.Content -> {
                Spacer(modifier = Modifier.width(8.dp))
                style.content()
            }
        }
    }
}
