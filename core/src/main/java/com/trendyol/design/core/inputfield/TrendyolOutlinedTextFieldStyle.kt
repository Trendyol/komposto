package com.trendyol.design.core.inputfield

import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import com.trendyol.theme.TrendyolDesign

sealed interface TrendyolOutlinedTextFieldStyle {

    data object FloatingLabelOutlined : OutlinedTextFieldStyle {
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

                focusedLabelColor = TrendyolDesign.colors.colorPrimary,
                focusedBorderColor = TrendyolDesign.colors.colorPrimary,
                cursorColor = TrendyolDesign.colors.colorPrimary,

                disabledBorderColor = TrendyolDesign.colors.colorBorder,
                disabledLabelColor = TrendyolDesign.colors.colorBorder,
                disabledTextColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                errorCursorColor = TrendyolDesign.colors.colorWarning,
                errorBorderColor = TrendyolDesign.colors.colorWarning,
                errorLabelColor = TrendyolDesign.colors.colorWarning,
            )
    }

    data object Outlined : OutlinedTextFieldStyle {
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

                focusedLabelColor = TrendyolDesign.colors.colorPrimary,
                focusedBorderColor = TrendyolDesign.colors.colorPrimary,
                cursorColor = TrendyolDesign.colors.colorPrimary,

                disabledBorderColor = TrendyolDesign.colors.colorBorder,
                disabledLabelColor = TrendyolDesign.colors.colorBorder,
                disabledTextColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                errorCursorColor = TrendyolDesign.colors.colorWarning,
                errorBorderColor = TrendyolDesign.colors.colorWarning,
                errorLabelColor = TrendyolDesign.colors.colorWarning,
            )
    }

    data object Filled : OutlinedTextFieldStyle {
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

                focusedLabelColor = TrendyolDesign.colors.colorPrimary,
                focusedBorderColor = TrendyolDesign.colors.colorBorder,
                cursorColor = TrendyolDesign.colors.colorPrimary,

                disabledLabelColor = TrendyolDesign.colors.colorBorder,
                disabledTextColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                errorCursorColor = TrendyolDesign.colors.colorWarning,
                errorBorderColor = TrendyolDesign.colors.colorWarning,
                errorLabelColor = TrendyolDesign.colors.colorWarning,
            )
    }
}