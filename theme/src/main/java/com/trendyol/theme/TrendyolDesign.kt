package com.trendyol.theme

import androidx.compose.material.Colors
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

@Deprecated(
    message = "Use KPDesign instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPDesign",
    ),
    level = DeprecationLevel.WARNING
)
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

/**
 * A central object for accessing design system properties such as colors and typography in the Komposto design system.
 *
 * The `KPDesign` object provides a standardized interface to retrieve theme-specific color and typography configurations,
 * ensuring consistency across the application's UI components.
 *
 * ## Properties
 *
 * ### Colors
 * Access the current color palette for the Komposto design system. The colors are derived from the
 * [LocalKPDesignTheme] and are dynamically updated based on the current theme.
 *
 * Example usage:
 * ```
 * val backgroundColor = KPDesign.colors.background
 * ```
 *
 * @return [KPDesignColors] representing the active color scheme.
 *
 * ### Typography
 * Access the current typography settings for the Komposto design system. The typography is derived from the
 * [LocalKPDesignTheme] and is dynamically updated based on the current theme.
 *
 * Example usage:
 * ```
 * val bodyTextStyle = KPDesign.typography.body
 * ```
 *
 * @return [KPDesignTypography] representing the active typography styles.
 *
 * @see LocalKPDesignTheme
 * @see KPDesignColors
 * @see KPDesignTypography
 */
public object KPDesign {

    /**
     * Provides access to the color palette defined in the current [LocalKPDesignTheme].
     */
    public val colors: KPDesignColors
        @Composable
        @ReadOnlyComposable
        get() = LocalKPDesignTheme.current.colors

    /**
     * Provides access to the typography settings defined in the current [LocalKPDesignTheme].
     */
    public val typography: KPDesignTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalKPDesignTheme.current.typography
}
