package com.trendyol.theme

import androidx.compose.runtime.staticCompositionLocalOf

class TrendyolDesignTheme(
    val colors: TrendyolDesignColors,
    val typography: TrendyolDesignTypography,
    val fontFamily: TrendyolDesignFontFamily,
)

val LocalTrendyolDesignTheme = staticCompositionLocalOf<TrendyolDesignTheme> {
    error("CompositionLocal LocalAppResources not present")
}
