package com.trendyol.design.core.inputfield

import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign

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

@Deprecated(
    message = "Use KPOutlinedTextFieldStyle instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPOutlinedTextFieldStyle"
    ),
    level = DeprecationLevel.WARNING
)
public sealed interface TrendyolOutlinedTextFieldStyle {

    public data object FloatingLabelOutlined : OutlinedTextFieldStyle {
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
                disabledLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                disabledTextColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                errorCursorColor = TrendyolDesign.colors.colorWarning,
                errorBorderColor = TrendyolDesign.colors.colorWarning,
                errorLabelColor = TrendyolDesign.colors.colorWarning,
            )
    }

    public data object Outlined : OutlinedTextFieldStyle {
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
                disabledLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                disabledTextColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                errorCursorColor = TrendyolDesign.colors.colorWarning,
                errorBorderColor = TrendyolDesign.colors.colorWarning,
                errorLabelColor = TrendyolDesign.colors.colorWarning,
            )
    }

    public data object Filled : OutlinedTextFieldStyle {
        override val outlinedTextFieldColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = TrendyolDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = TrendyolDesign.colors.colorBackground,

                placeholderColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                unfocusedLabelColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                unfocusedBorderColor = TrendyolDesign.colors.colorBorder,

                focusedLabelColor = TrendyolDesign.colors.colorPrimary,
                focusedBorderColor = TrendyolDesign.colors.colorBorder,
                cursorColor = TrendyolDesign.colors.colorPrimary,

                disabledLabelColor = TrendyolDesign.colors.colorBorder.copy(alpha = 0.5f),
                disabledBorderColor = TrendyolDesign.colors.colorBorder.copy(alpha = 0.5f),
                disabledTextColor = TrendyolDesign.colors.colorOnSurfaceVariant1.copy(alpha = 0.5f),

                errorCursorColor = TrendyolDesign.colors.colorWarning,
                errorBorderColor = TrendyolDesign.colors.colorWarning,
                errorLabelColor = TrendyolDesign.colors.colorWarning,
            )
    }
}
