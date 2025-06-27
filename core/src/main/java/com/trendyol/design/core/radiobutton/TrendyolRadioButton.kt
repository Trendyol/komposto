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
import androidx.compose.material.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign

/**
 * Composable function representing a RadioButton with customizable appearance and behavior tailored for the
 * [com.trendyol.theme.KPDesign] theme.
 *
 * @param selected Indicates whether the RadioButton is selected or not.
 * @param containerType The type of container for the RadioButton, which determines its appearance and content.
 * @param size The size configuration for the RadioButton, defining dimensions such as button size, dot size, etc.
 * @param onClick Callback invoked when the RadioButton is clicked. If null, the RadioButton is not clickable.
 * @param modifier Optional [Modifier] that can be applied to the RadioButton.
 * @param enabled Indicates whether the RadioButton is enabled for user interaction.
 * @param interactionSource [MutableInteractionSource] representing the source of user interactions.
 * @param colors [RadioButtonColors] defining the colors used for rendering the RadioButton.
 * @param position Alignment representing the vertical alignment of the RadioButton within its container.
 */
@Composable
public fun KPRadioButton(
    selected: Boolean,
    containerType: RadioButtonContainerType,
    size: RadioButtonSize,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: RadioButtonColors = KPRadioButtonDefaults.colors(),
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
                indication = ripple(
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
            val strokeWidth = size.strokeWidth.toPx()
            drawCircle(
                radioColor.value,
                (size.buttonSize / 2).toPx() - strokeWidth / 2,
                style = Stroke(strokeWidth)
            )
            if (dotRadius.value > 0.dp) {
                drawCircle(radioColor.value, dotRadius.value.toPx(), style = Fill)
            }
        }

        when (containerType) {
            is RadioButtonContainerType.None -> {}

            is RadioButtonContainerType.Text -> {
                Spacer(modifier = Modifier.width(8.dp))
                KPText(
                    text = containerType.text,
                    style = size.textSize.copy(color = KPDesign.colors.colorOnSurfaceVariant3)
                )
            }

            is RadioButtonContainerType.Content -> {
                Spacer(modifier = Modifier.width(8.dp))
                containerType.content()
            }
        }
    }
}
