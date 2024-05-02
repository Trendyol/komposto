package com.trendyol.design.core.radiobutton

import androidx.compose.material.RadioButtonColors
import androidx.compose.runtime.Composable
import com.trendyol.theme.TrendyolDesign

interface RadioButtonContainerType {

    val colors: RadioButtonColors
        @Composable
        get() = TrendyolDefaultRadioButtonColors(
            selectedColor = TrendyolDesign.colors.colorPrimary,
            unselectedColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
            disabledSelectedColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
            disabledUnselectedColor = TrendyolDesign.colors.colorBorder,
        )

    interface None : RadioButtonContainerType

    interface Text : RadioButtonContainerType {
        val text: String
    }

    interface Content : RadioButtonContainerType {
        val content: @Composable () -> Unit
    }
}
