package com.trendyol.design.core.button

import androidx.compose.runtime.Composable
import com.trendyol.theme.KPDesign

public sealed interface KPButtonStyle : ButtonStyle {
    public data object Primary : KPButtonStyle {
        override val buttonColors: KPButtonColors
            @Composable
            get() = KPButtonDefaults.buttonColors(
                backgroundColor = KPDesign.colors.colorPrimary,
                contentColor = KPDesign.colors.colorOnPrimary,
                disabledBackgroundColor = KPDesign.colors.colorOnSurfaceVariant1,
                disabledContentColor = KPDesign.colors.colorOnPrimary,
            )
    }

    public data object Secondary : KPButtonStyle {
        override val buttonColors: KPButtonColors
            @Composable
            get() = KPButtonDefaults.buttonColors(
                backgroundColor = KPDesign.colors.colorSurface,
                contentColor = KPDesign.colors.colorPrimary,
                borderColor = KPDesign.colors.colorPrimary,
                disabledBackgroundColor = KPDesign.colors.colorSurface,
                disabledContentColor = KPDesign.colors.colorOnSurfaceVariant1,
                disabledBorderColor = KPDesign.colors.colorBorder,
            )
    }

    public data object Tertiary : KPButtonStyle {
        override val buttonColors: KPButtonColors
            @Composable
            get() = KPButtonDefaults.buttonColors(
                backgroundColor = KPDesign.colors.colorSurface,
                contentColor = KPDesign.colors.colorOnSurfaceVariant2,
                borderColor = KPDesign.colors.colorBorder,
                disabledBackgroundColor = KPDesign.colors.colorSurface,
                disabledContentColor = KPDesign.colors.colorOnSurfaceVariant1,
                disabledBorderColor = KPDesign.colors.colorBorder,
            )
    }
}
