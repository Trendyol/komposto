package com.trendyol.theme

import androidx.compose.ui.text.font.FontFamily

@Deprecated(
    message = "Use KPDesignFontFamily instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPDesignFontFamily"
    ),
    level = DeprecationLevel.WARNING
)
public class TrendyolDesignFontFamily(
    public val regular: FontFamily = FontFamily.Default,
    public val medium: FontFamily = FontFamily.Default,
    public val bold: FontFamily = FontFamily.Default,
)

public class KPDesignFontFamily(
    public val regular: FontFamily = FontFamily.Default,
    public val medium: FontFamily = FontFamily.Default,
    public val bold: FontFamily = FontFamily.Default,
)
