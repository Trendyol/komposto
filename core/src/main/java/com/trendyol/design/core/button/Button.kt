package com.trendyol.design.core.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonElevation
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.LocalMinimumInteractiveComponentEnforcement
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.text.TrendyolTextDefaults

/**
 * Button wrapper around [androidx.compose.material.Button] with customized options. Decides colors and paddings
 * according to given [style] and [size] parameters.
 *
 * @param style ButtonStyle configuration for the button, specifying its appearance and behavior.
 * @param size ButtonSize configuration for the button, determining its dimensions.
 * @param enabled Determines if the button is clickable and changes design according to given [style] value.
 * Default is `true`.
 * @param elevation Determines elevation of button. Default is `0.dp`.
 */
@OptIn(ExperimentalMaterialApi::class)
@Composable
public fun Button(
    onClick: () -> Unit,
    style: ButtonStyle,
    size: ButtonSize,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    elevation: ButtonElevation? = TrendyolButtonDefaults.elevation(),
    shape: Shape = MaterialTheme.shapes.small,
    border: BorderStroke? = style.getBorder(width = 1.dp, enabled = enabled),
    colors: ButtonColors = style.buttonColors,
    contentPadding: PaddingValues = size.contentPadding,
    content: @Composable RowScope.() -> Unit,
) {
    CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false) {
        androidx.compose.material.Button(
            onClick = onClick,
            modifier = modifier.defaultMinSize(minHeight = size.minHeight),
            enabled = enabled,
            interactionSource = interactionSource,
            elevation = elevation,
            shape = shape,
            border = border,
            colors = colors,
            contentPadding = contentPadding,
        ) {
            ProvideTextStyle(
                value = TextStyle.Default.copy(
                    fontFamily = size.font.fontFamily,
                    fontSize = size.font.fontSize,
                    color = style.buttonColors.contentColor(enabled = enabled).value,
                    letterSpacing = TrendyolTextDefaults.letterSpacing,
                    platformStyle = TrendyolTextDefaults.platformStyle,
                )
            ) {
                content()
            }
        }
    }
}
