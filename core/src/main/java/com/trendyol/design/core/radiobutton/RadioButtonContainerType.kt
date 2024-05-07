package com.trendyol.design.core.radiobutton

import androidx.compose.material.RadioButtonColors
import androidx.compose.runtime.Composable
import com.trendyol.theme.TrendyolDesign

/**
 * Interface defining what to display after radio dot while using [TrendyolRadioButton].
 */
interface RadioButtonContainerType {

    /**
     * Defines the colors used for rendering the RadioButton.
     */
    val colors: RadioButtonColors
        @Composable
        get() = TrendyolDefaultRadioButtonColors(
            selectedColor = TrendyolDesign.colors.colorPrimary,
            unselectedColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
            disabledSelectedColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
            disabledUnselectedColor = TrendyolDesign.colors.colorBorder,
        )

    /**
     * Represents a RadioButton container with no additional properties. Just showing radio dot.
     */
    interface None : RadioButtonContainerType

    /**
     * Represents a RadioButton container with a text.
     */
    interface Text : RadioButtonContainerType {
        val text: String
    }

    /**
     * Represents a RadioButton container with custom composable content.
     */
    interface Content : RadioButtonContainerType {
        val content: @Composable () -> Unit
    }
}
