package com.trendyol.design.core.radiobutton

import androidx.compose.material.RadioButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.trendyol.theme.KPDesign

/**
 * Object containing default values and utilities for [KPRadioButton] components tailored for the
 * [com.trendyol.theme.KPDesign] theme.
 */
public object KPRadioButtonDefaults {

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
    public fun colors(
        selectedColor: Color = KPDesign.colors.colorPrimary,
        unselectedColor: Color = KPDesign.colors.colorOnSurfaceVariant1,
        disabledSelectedColor: Color = KPDesign.colors.colorOnSurfaceVariant1,
        disabledUnselectedColor: Color = KPDesign.colors.colorBorder,
    ): RadioButtonColors {
        return remember(
            selectedColor,
            unselectedColor,
            disabledSelectedColor,
            disabledUnselectedColor,
        ) {
            KPDefaultRadioButtonColors(
                selectedColor = selectedColor,
                unselectedColor = unselectedColor,
                disabledSelectedColor = disabledSelectedColor,
                disabledUnselectedColor = disabledUnselectedColor,
            )
        }
    }
}
