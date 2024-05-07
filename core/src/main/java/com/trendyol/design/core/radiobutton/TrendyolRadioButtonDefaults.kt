package com.trendyol.design.core.radiobutton

import androidx.compose.material.RadioButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.trendyol.theme.TrendyolDesign

/**
 * Object containing default values and utilities for [TrendyolRadioButton] components tailored for the
 * [com.trendyol.theme.TrendyolDesign] theme.
 */
object TrendyolRadioButtonDefaults {

    /**
     * Provides default RadioButtonColors based on the Trendyol design guidelines.
     *
     * @param selectedColor Color when the RadioButton is selected.
     * @param unselectedColor Color when the RadioButton is not selected.
     * @param disabledSelectedColor Color when the RadioButton is disabled and selected.
     * @param disabledUnselectedColor Color when the RadioButton is disabled and not selected.
     * @return RadioButtonColors object representing the default colors for RadioButton components.
     */
    @Composable
    fun colors(
        selectedColor: Color = TrendyolDesign.colors.colorPrimary,
        unselectedColor: Color = TrendyolDesign.colors.colorOnSurfaceVariant1,
        disabledSelectedColor: Color = TrendyolDesign.colors.colorOnSurfaceVariant1,
        disabledUnselectedColor: Color = TrendyolDesign.colors.colorBorder,
    ): RadioButtonColors {
        return remember(
            selectedColor,
            unselectedColor,
            disabledSelectedColor,
            disabledUnselectedColor,
        ) {
            TrendyolDefaultRadioButtonColors(
                selectedColor = selectedColor,
                unselectedColor = unselectedColor,
                disabledSelectedColor = disabledSelectedColor,
                disabledUnselectedColor = disabledUnselectedColor,
            )
        }
    }
}
