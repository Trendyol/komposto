package com.trendyol.design.core.inputfield

import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import com.trendyol.theme.TrendyolDesign

sealed interface TrendyolDropdownStyle {

    data object FloatingLabelOutlined : DropdownStyle {
        override val shouldShowLabel: Boolean
            get() = true
        override val outlinedTextFieldColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = TrendyolDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = TrendyolDesign.colors.colorSurface,

                placeholderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                unfocusedLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                unfocusedBorderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                focusedLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant3,
                focusedBorderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                disabledBorderColor = TrendyolDesign.colors.colorBorder,
                disabledLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                disabledTextColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                errorBorderColor = TrendyolDesign.colors.colorWarning,
                errorLabelColor = TrendyolDesign.colors.colorWarning,
            )
    }

    data object Outlined : DropdownStyle {
        override val shouldShowLabel: Boolean
            get() = false
        override val outlinedTextFieldColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = TrendyolDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = TrendyolDesign.colors.colorSurface,

                placeholderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                unfocusedLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                unfocusedBorderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                focusedLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant3,
                focusedBorderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                disabledBorderColor = TrendyolDesign.colors.colorBorder,
                disabledLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                disabledTextColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                errorBorderColor = TrendyolDesign.colors.colorWarning,
                errorLabelColor = TrendyolDesign.colors.colorWarning,
            )
    }

    data object Filled : DropdownStyle {
        override val shouldShowLabel: Boolean
            get() = false
        override val outlinedTextFieldColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = TrendyolDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = TrendyolDesign.colors.colorBackground,

                placeholderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                unfocusedLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                unfocusedBorderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                focusedLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant3,
                focusedBorderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                disabledBorderColor = TrendyolDesign.colors.colorBorder,
                disabledLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                disabledTextColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                errorBorderColor = TrendyolDesign.colors.colorWarning,
                errorLabelColor = TrendyolDesign.colors.colorWarning,
            )
    }
}
