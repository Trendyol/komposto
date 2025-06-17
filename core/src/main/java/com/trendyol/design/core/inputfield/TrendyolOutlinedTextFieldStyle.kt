package com.trendyol.design.core.inputfield

import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import com.trendyol.theme.KPDesign

public sealed interface KPOutlinedTextFieldStyle : OutlinedTextFieldStyle {

    public data object FloatingLabelOutlined : KPOutlinedTextFieldStyle {
        override val outlinedTextFieldColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = KPDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = KPDesign.colors.colorSurface,

                placeholderColor = KPDesign.colors.colorOnSurfaceVariant1,
                unfocusedLabelColor = KPDesign.colors.colorOnSurfaceVariant1,
                unfocusedBorderColor = KPDesign.colors.colorOnSurfaceVariant1,

                focusedLabelColor = KPDesign.colors.colorPrimary,
                focusedBorderColor = KPDesign.colors.colorPrimary,
                cursorColor = KPDesign.colors.colorPrimary,

                disabledBorderColor = KPDesign.colors.colorBorder,
                disabledLabelColor = KPDesign.colors.colorOnSurfaceVariant1,
                disabledTextColor = KPDesign.colors.colorOnSurfaceVariant1,

                errorCursorColor = KPDesign.colors.colorWarning,
                errorBorderColor = KPDesign.colors.colorWarning,
                errorLabelColor = KPDesign.colors.colorWarning,
            )
    }

    public data object Outlined : KPOutlinedTextFieldStyle {
        override val outlinedTextFieldColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = KPDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = KPDesign.colors.colorSurface,

                placeholderColor = KPDesign.colors.colorOnSurfaceVariant1,
                unfocusedLabelColor = KPDesign.colors.colorOnSurfaceVariant1,
                unfocusedBorderColor = KPDesign.colors.colorOnSurfaceVariant1,

                focusedLabelColor = KPDesign.colors.colorPrimary,
                focusedBorderColor = KPDesign.colors.colorPrimary,
                cursorColor = KPDesign.colors.colorPrimary,

                disabledBorderColor = KPDesign.colors.colorBorder,
                disabledLabelColor = KPDesign.colors.colorOnSurfaceVariant1,
                disabledTextColor = KPDesign.colors.colorOnSurfaceVariant1,

                errorCursorColor = KPDesign.colors.colorWarning,
                errorBorderColor = KPDesign.colors.colorWarning,
                errorLabelColor = KPDesign.colors.colorWarning,
            )
    }

    public data object Filled : KPOutlinedTextFieldStyle {
        override val outlinedTextFieldColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = KPDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = KPDesign.colors.colorBackground,

                placeholderColor = KPDesign.colors.colorOnSurfaceVariant1,
                unfocusedLabelColor = KPDesign.colors.colorOnSurfaceVariant1,
                unfocusedBorderColor = KPDesign.colors.colorBorder,

                focusedLabelColor = KPDesign.colors.colorPrimary,
                focusedBorderColor = KPDesign.colors.colorBorder,
                cursorColor = KPDesign.colors.colorPrimary,

                disabledLabelColor = KPDesign.colors.colorBorder.copy(alpha = 0.5f),
                disabledBorderColor = KPDesign.colors.colorBorder.copy(alpha = 0.5f),
                disabledTextColor = KPDesign.colors.colorOnSurfaceVariant1.copy(alpha = 0.5f),

                errorCursorColor = KPDesign.colors.colorWarning,
                errorBorderColor = KPDesign.colors.colorWarning,
                errorLabelColor = KPDesign.colors.colorWarning,
            )
    }
}
