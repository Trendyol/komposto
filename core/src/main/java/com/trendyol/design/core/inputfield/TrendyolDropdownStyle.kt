package com.trendyol.design.core.inputfield

import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import com.trendyol.theme.KPDesign

public sealed interface KPDropdownStyle : DropdownStyle {

    public data object FloatingLabelOutlined : KPDropdownStyle {
        override val outlinedTextFieldColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = KPDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = KPDesign.colors.colorSurface,

                placeholderColor = KPDesign.colors.colorOnSurfaceVariant1,
                unfocusedLabelColor = KPDesign.colors.colorOnSurfaceVariant1,
                unfocusedBorderColor = KPDesign.colors.colorOnSurfaceVariant1,

                focusedLabelColor = KPDesign.colors.colorOnSurfaceVariant1,
                focusedBorderColor = KPDesign.colors.colorOnSurfaceVariant1,

                disabledBorderColor = KPDesign.colors.colorBorder,
                disabledLabelColor = KPDesign.colors.colorOnSurfaceVariant1,
                disabledTextColor = KPDesign.colors.colorOnSurfaceVariant1,

                errorBorderColor = KPDesign.colors.colorWarning,
                errorLabelColor = KPDesign.colors.colorWarning,
            )
    }

    public data object Outlined : KPDropdownStyle {
        override val outlinedTextFieldColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = KPDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = KPDesign.colors.colorSurface,

                placeholderColor = KPDesign.colors.colorOnSurfaceVariant1,
                unfocusedLabelColor = KPDesign.colors.colorOnSurfaceVariant1,
                unfocusedBorderColor = KPDesign.colors.colorOnSurfaceVariant1,

                focusedLabelColor = KPDesign.colors.colorOnSurfaceVariant1,
                focusedBorderColor = KPDesign.colors.colorOnSurfaceVariant1,

                disabledBorderColor = KPDesign.colors.colorBorder,
                disabledLabelColor = KPDesign.colors.colorOnSurfaceVariant1,
                disabledTextColor = KPDesign.colors.colorOnSurfaceVariant1,

                errorBorderColor = KPDesign.colors.colorWarning,
                errorLabelColor = KPDesign.colors.colorWarning,
            )
    }

    public data object Filled : KPDropdownStyle {
        override val outlinedTextFieldColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = KPDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = KPDesign.colors.colorBackground,

                placeholderColor = KPDesign.colors.colorOnSurfaceVariant1,
                unfocusedLabelColor = KPDesign.colors.colorOnSurfaceVariant1,
                unfocusedBorderColor = KPDesign.colors.colorBorder,

                focusedLabelColor = KPDesign.colors.colorOnSurfaceVariant1,
                focusedBorderColor = KPDesign.colors.colorBorder,

                disabledBorderColor = KPDesign.colors.colorBorder.copy(alpha = 0.5f),
                disabledLabelColor = KPDesign.colors.colorOnSurfaceVariant1
                    .copy(alpha = 0.5f),
                disabledTextColor = KPDesign.colors.colorOnSurfaceVariant1.copy(alpha = 0.5f),

                errorBorderColor = KPDesign.colors.colorWarning,
                errorLabelColor = KPDesign.colors.colorWarning,
            )
    }
}
