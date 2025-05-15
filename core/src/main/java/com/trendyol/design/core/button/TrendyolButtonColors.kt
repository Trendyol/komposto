package com.trendyol.design.core.button

import androidx.compose.material.ButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color

/**
 * A stable interface for defining color properties for a button, extending [ButtonColors].
 * This interface adds support for specifying a border color that adapts to the button's state.
 *
 * ## Key Features
 * - Extends [ButtonColors], inheriting properties for background and content colors.
 * - Adds a method to dynamically provide border colors based on the enabled state.
 *
 * @see ButtonColors
 */
@Stable
public interface KPButtonColors : ButtonColors {

    /**
     * Provides the border color for the button, which adapts based on the `enabled` state.
     *
     * @param enabled A boolean indicating whether the button is enabled. If `true`, the color represents
     * the enabled state; otherwise, it represents the disabled state.
     *
     * @return A [State] containing the border color as a [Color] or `null` if no border color is specified.
     *
     */
    @Composable
    public fun borderColor(enabled: Boolean): State<Color?>
}

@Deprecated(
    message = "Use KPButtonColors instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPButtonColors"
    ),
    level = DeprecationLevel.WARNING
)
public interface TrendyolButtonColors : ButtonColors, KPButtonColors {
    @Composable
    public override fun borderColor(enabled: Boolean): State<Color?>
}

internal class KPDefaultButtonColors(
    private val backgroundColor: Color,
    private val contentColor: Color,
    private val borderColor: Color?,
    private val disabledBackgroundColor: Color,
    private val disabledContentColor: Color,
    private val disabledBorderColor: Color?,
) : TrendyolButtonColors {

    @Composable
    override fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) backgroundColor else disabledBackgroundColor)
    }

    @Composable
    override fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) contentColor else disabledContentColor)
    }

    @Composable
    override fun borderColor(enabled: Boolean): State<Color?> {
        return rememberUpdatedState(if (enabled) borderColor else disabledBorderColor)
    }
}
