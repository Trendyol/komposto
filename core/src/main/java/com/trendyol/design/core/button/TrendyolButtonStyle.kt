package com.trendyol.design.core.button

import androidx.compose.runtime.Composable
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign

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

@Deprecated(
    message = "Use KPButtonStyle instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPButtonStyle"
    ),
    level = DeprecationLevel.WARNING
)
public sealed interface TrendyolButtonStyle {
    public data object Primary : ButtonStyle {
        override val buttonColors: TrendyolButtonColors
            @Composable
            get() = TrendyolButtonDefaults.buttonColors(
                backgroundColor = TrendyolDesign.colors.colorPrimary,
                contentColor = TrendyolDesign.colors.colorOnPrimary,
                disabledBackgroundColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                disabledContentColor = TrendyolDesign.colors.colorOnPrimary,
            )
    }

    public data object Secondary : ButtonStyle {
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

    public data object Tertiary : ButtonStyle {
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
