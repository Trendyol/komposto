package com.trendyol.design.core.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.state.ToggleableState

@Stable
interface TrendyolCheckboxColors {

    /**
     * Represents the color used for the checkmark inside the checkbox, depending on [state].
     *
     * @param state the [ToggleableState] of the checkbox
     */
    @Composable
    fun checkmarkColor(enabled: Boolean, state: ToggleableState): State<Color>

    /**
     * Represents the color used for the box (background) of the checkbox, depending on [enabled]
     * and [state].
     *
     * @param enabled whether the checkbox is enabled or not
     * @param state the [ToggleableState] of the checkbox
     */
    @Composable
    fun boxColor(enabled: Boolean, state: ToggleableState): State<Color>

    /**
     * Represents the color used for the border of the checkbox, depending on [enabled] and [state].
     *
     * @param enabled whether the checkbox is enabled or not
     * @param state the [ToggleableState] of the checkbox
     */
    @Composable
    fun borderColor(enabled: Boolean, state: ToggleableState): State<Color>
}
