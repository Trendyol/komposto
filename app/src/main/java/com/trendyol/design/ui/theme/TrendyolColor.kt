package com.trendyol.design.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import com.trendyol.theme.KPDesignColors
import com.trendyol.theme.TrendyolDesignColors

internal object TrendyolColor {
    internal val themeColor = TrendyolDesignColors().copy(colorPrimary = colorPrimary)
    internal val kpThemeColor = KPDesignColors().copy(colorPrimary = colorPrimary)
    internal val materialColor: Colors
        @ReadOnlyComposable
        @Composable
        get() = MaterialTheme.colors.copy(
            primary = colorPrimary
        )
}

private val colorPrimary = Color(color = 0xFFF27A1A)
