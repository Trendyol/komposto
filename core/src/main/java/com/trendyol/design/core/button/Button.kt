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
import com.trendyol.design.core.text.KPTextDefaults

/**
 * A customizable button component that wraps [androidx.compose.material.Button].
 * It adapts colors, paddings, and other properties based on the provided [style] and [size] parameters.
 *
 * This button provides a standardized appearance and behavior, integrating seamlessly
 * with the application's theme and design requirements.
 *
 * @param onClick Lambda to be executed when the button is clicked.
 * @param style Configuration for the button's appearance, defined by [ButtonStyle].
 * It includes colors, borders, and other stylistic options.
 * @param size Configuration for the button's dimensions and padding, defined by [ButtonSize].
 * It specifies the minimum height, content padding, and typography settings.
 * @param modifier [Modifier] for adjusting layout or adding additional behavior to the button.
 * Default is [Modifier].
 * @param enabled Boolean flag that determines whether the button is clickable. When `false`,
 * the button is styled as disabled according to the given [style]. Default is `true`.
 * @param interactionSource [MutableInteractionSource] to track interaction events such as clicks and presses.
 * Default is a new instance of [MutableInteractionSource].
 * @param elevation Elevation for the button, providing depth and shadow effects.
 * Default is `ButtonElevation` from [KPButtonDefaults.elevation].
 * @param shape [Shape] of the button's outline. Default is `MaterialTheme.shapes.small`.
 * @param border [BorderStroke] for the button's border, determined by [style.getBorder].
 * The width defaults to `1.dp`, and the appearance depends on the [enabled] state.
 * @param colors [ButtonColors] for the button's background, content, and other color properties.
 * Default is [style.buttonColors].
 * @param contentPadding [PaddingValues] for the button's internal padding. Default is
 * provided by [size.contentPadding].
 * @param content A composable lambda for defining the content inside the button.
 * Typically includes text or icons.
 *
 * Example usage:
 * ```
 * KPButton(
 *     onClick = { /* Handle click */ },
 *     style = KPButtonStyle.Primary,
 *     size = KPButtonSize.Medium,
 * ) {
 *     Text("Click Me")
 * }
 * ```
 *
 * @see androidx.compose.material.Button
 * @see ButtonStyle
 * @see ButtonSize
 * @see KPButtonDefaults
 */
@OptIn(ExperimentalMaterialApi::class)
@Composable
public fun KPButton(
    onClick: () -> Unit,
    style: ButtonStyle,
    size: ButtonSize,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    elevation: ButtonElevation? = KPButtonDefaults.elevation(),
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
                    letterSpacing = KPTextDefaults.letterSpacing,
                    platformStyle = KPTextDefaults.platformStyle,
                )
            ) {
                content()
            }
        }
    }
}
