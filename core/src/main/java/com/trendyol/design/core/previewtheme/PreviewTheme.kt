package com.trendyol.design.core.previewtheme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import com.trendyol.theme.LocalTrendyolDesignTheme
import com.trendyol.theme.TrendyolDesignColors
import com.trendyol.theme.TrendyolDesignFontFamily
import com.trendyol.theme.TrendyolDesignTheme
import com.trendyol.theme.TrendyolDesignTypography

@Composable
internal fun PreviewTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = TrendyolColor.materialColor
    ) {
        CompositionLocalProvider(
            LocalTrendyolDesignTheme provides trendyolDesignTheme
        ) {
            content()
        }
    }
}

internal object TrendyolColor {
    internal val themeColor = TrendyolDesignColors().copy(colorPrimary = colorPrimary)
    internal val materialColor: Colors
        @ReadOnlyComposable
        @Composable
        get() = MaterialTheme.colors.copy(
            primary = colorPrimary
        )
}

private val colorPrimary = Color(color = 0xFFF27A1A)

private val trendyolDesignTheme = TrendyolDesignTheme(
    colors = TrendyolColor.themeColor,
    typography = TrendyolDesignTypography(),
    fontFamily = TrendyolDesignFontFamily(),
)
