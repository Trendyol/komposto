package com.trendyol.theme

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf

public data class KPDesignTheme(
    val colors: KPDesignColors,
    val typography: KPDesignTypography,
    val fontFamily: KPDesignFontFamily,
)

public val LocalKPDesignTheme: ProvidableCompositionLocal<KPDesignTheme> = staticCompositionLocalOf {
    error("CompositionLocal LocalAppResources not present")
}
