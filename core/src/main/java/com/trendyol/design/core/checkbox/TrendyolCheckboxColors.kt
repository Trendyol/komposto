package com.trendyol.design.core.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.state.ToggleableState

@Stable
public interface KPCheckboxColors {

    /**
     * Represents the color used for the checkmark inside the checkbox, depending on [state].
     *
     * @param state the [ToggleableState] of the checkbox
     */
    @Composable
    public fun checkmarkColor(enabled: Boolean, state: ToggleableState): State<Color>

    /**
     * Represents the color used for the box (background) of the checkbox, depending on [enabled]
     * and [state].
     *
     * @param enabled whether the checkbox is enabled or not
     * @param state the [ToggleableState] of the checkbox
     */
    @Composable
    public fun boxColor(enabled: Boolean, state: ToggleableState): State<Color>

    /**
     * Represents the color used for the border of the checkbox, depending on [enabled] and [state].
     *
     * @param enabled whether the checkbox is enabled or not
     * @param state the [ToggleableState] of the checkbox
     */
    @Composable
    public fun borderColor(enabled: Boolean, state: ToggleableState): State<Color>
}

@Stable
@Deprecated(
    message = "Use KPCheckboxColors instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPCheckboxColors",
    ),
    level = DeprecationLevel.WARNING
)
public interface TrendyolCheckboxColors : KPCheckboxColors {

    /**
     * Represents the color used for the checkmark inside the checkbox, depending on [state].
     *
     * @param state the [ToggleableState] of the checkbox
     */
    @Composable
    public override fun checkmarkColor(enabled: Boolean, state: ToggleableState): State<Color>

    /**
     * Represents the color used for the box (background) of the checkbox, depending on [enabled]
     * and [state].
     *
     * @param enabled whether the checkbox is enabled or not
     * @param state the [ToggleableState] of the checkbox
     */
    @Composable
    public override fun boxColor(enabled: Boolean, state: ToggleableState): State<Color>

    /**
     * Represents the color used for the border of the checkbox, depending on [enabled] and [state].
     *
     * @param enabled whether the checkbox is enabled or not
     * @param state the [ToggleableState] of the checkbox
     */
    @Composable
    public override fun borderColor(enabled: Boolean, state: ToggleableState): State<Color>
}
