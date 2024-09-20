package com.trendyol.theme

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf

public data class TrendyolDesignTheme(
    val colors: TrendyolDesignColors,
    val typography: TrendyolDesignTypography,
    val fontFamily: TrendyolDesignFontFamily,
)

public val LocalTrendyolDesignTheme: ProvidableCompositionLocal<TrendyolDesignTheme> = staticCompositionLocalOf {
    error("CompositionLocal LocalAppResources not present")
}
