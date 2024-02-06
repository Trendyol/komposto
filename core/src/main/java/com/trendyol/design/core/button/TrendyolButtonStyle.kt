package com.trendyol.design.core.button

import androidx.compose.runtime.Composable
import com.trendyol.theme.TrendyolDesign

sealed interface TrendyolButtonStyle {
    data object Primary : ButtonStyle {
        override val buttonColors: TrendyolButtonColors
            @Composable
            get() = TrendyolButtonDefaults.buttonColors(
                backgroundColor = TrendyolDesign.colors.colorPrimary,
                contentColor = TrendyolDesign.colors.colorOnPrimary,
                disabledBackgroundColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                disabledContentColor = TrendyolDesign.colors.colorOnPrimary,
            )
    }

    data object Secondary : ButtonStyle {
        override val buttonColors: TrendyolButtonColors
            @Composable
            get() = TrendyolButtonDefaults.buttonColors(
                backgroundColor = TrendyolDesign.colors.colorSurface,
                contentColor = TrendyolDesign.colors.colorPrimary,
                borderColor = TrendyolDesign.colors.colorPrimary,
                disabledBackgroundColor = TrendyolDesign.colors.colorSurface,
                disabledContentColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                disabledBorderColor = TrendyolDesign.colors.colorBorder,
            )
    }

    data object Tertiary : ButtonStyle {
        override val buttonColors: TrendyolButtonColors
            @Composable
            get() = TrendyolButtonDefaults.buttonColors(
                backgroundColor = TrendyolDesign.colors.colorSurface,
                contentColor = TrendyolDesign.colors.colorOnSurfaceVariant2,
                borderColor = TrendyolDesign.colors.colorBorder,
                disabledBackgroundColor = TrendyolDesign.colors.colorSurface,
                disabledContentColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                disabledBorderColor = TrendyolDesign.colors.colorBorder,
            )
    }
}
