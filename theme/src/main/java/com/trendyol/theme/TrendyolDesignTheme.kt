package com.trendyol.theme

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf

@Deprecated(
    message = "Use KPDesignTheme instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPDesignTheme"
    ),
    level = DeprecationLevel.WARNING
)
public data class TrendyolDesignTheme(
    val colors: TrendyolDesignColors,
    val typography: TrendyolDesignTypography,
    val fontFamily: TrendyolDesignFontFamily,
)

public data class KPDesignTheme(
    val colors: KPDesignColors,
    val typography: KPDesignTypography,
    val fontFamily: KPDesignFontFamily,
)

@Deprecated(
    message = "Use LocalKPDesignTheme instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "LocalKPDesignTheme"
    ),
    level = DeprecationLevel.WARNING
)
public val LocalTrendyolDesignTheme: ProvidableCompositionLocal<TrendyolDesignTheme> = staticCompositionLocalOf {
    error("CompositionLocal LocalAppResources not present")
}

public val LocalKPDesignTheme: ProvidableCompositionLocal<KPDesignTheme> = staticCompositionLocalOf {
    error("CompositionLocal LocalAppResources not present")
}
