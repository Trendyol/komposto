package com.trendyol.theme

import androidx.compose.material.Colors
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

public object TrendyolDesign {
    /**
     * Retrieves the current [Colors] at the call site's position in the hierarchy.
     *
     * @sample androidx.compose.material.samples.ThemeColorSample
     */
    public val colors: TrendyolDesignColors
        @Composable
        @ReadOnlyComposable
        get() = LocalTrendyolDesignTheme.current.colors

    /**
     * Retrieves the current [Typography] at the call site's position in the hierarchy.
     *
     * @sample androidx.compose.material.samples.ThemeTextStyleSample
     */
    public val typography: TrendyolDesignTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTrendyolDesignTheme.current.typography
}
