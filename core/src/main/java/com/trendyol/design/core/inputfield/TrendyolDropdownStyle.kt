package com.trendyol.design.core.inputfield

import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign

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

@Deprecated(
    message = "Use KPDropdownStyle instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPDropdownStyle"
    ),
    level = DeprecationLevel.WARNING
)
public sealed interface TrendyolDropdownStyle {

    public data object FloatingLabelOutlined : DropdownStyle {
        override val outlinedTextFieldColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = TrendyolDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = TrendyolDesign.colors.colorSurface,

                placeholderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                unfocusedLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                unfocusedBorderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                focusedLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                focusedBorderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                disabledBorderColor = TrendyolDesign.colors.colorBorder,
                disabledLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                disabledTextColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                errorBorderColor = TrendyolDesign.colors.colorWarning,
                errorLabelColor = TrendyolDesign.colors.colorWarning,
            )
    }

    public data object Outlined : DropdownStyle {
        override val outlinedTextFieldColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = TrendyolDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = TrendyolDesign.colors.colorSurface,

                placeholderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                unfocusedLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                unfocusedBorderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                focusedLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                focusedBorderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                disabledBorderColor = TrendyolDesign.colors.colorBorder,
                disabledLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                disabledTextColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                errorBorderColor = TrendyolDesign.colors.colorWarning,
                errorLabelColor = TrendyolDesign.colors.colorWarning,
            )
    }

    public data object Filled : DropdownStyle {
        override val outlinedTextFieldColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = TrendyolDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = TrendyolDesign.colors.colorBackground,

                placeholderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                unfocusedLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                unfocusedBorderColor = TrendyolDesign.colors.colorBorder,

                focusedLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                focusedBorderColor = TrendyolDesign.colors.colorBorder,

                disabledBorderColor = TrendyolDesign.colors.colorBorder.copy(alpha = 0.5f),
                disabledLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1
                    .copy(alpha = 0.5f),
                disabledTextColor = TrendyolDesign.colors.colorOnSurfaceVariant1.copy(alpha = 0.5f),

                errorBorderColor = TrendyolDesign.colors.colorWarning,
                errorLabelColor = TrendyolDesign.colors.colorWarning,
            )
    }
}
