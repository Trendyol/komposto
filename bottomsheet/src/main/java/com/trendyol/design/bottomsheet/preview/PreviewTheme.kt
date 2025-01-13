package com.trendyol.design.bottomsheet.preview

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import com.trendyol.theme.KPDesignColors
import com.trendyol.theme.KPDesignFontFamily
import com.trendyol.theme.KPDesignTheme
import com.trendyol.theme.KPDesignTypography
import com.trendyol.theme.LocalKPDesignTheme

@Composable
internal fun PreviewTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = MaterialTheme.colors.copy(
            primary = colorPrimary
        )
    ) {
        CompositionLocalProvider(
            LocalKPDesignTheme provides kompostoDesignTheme
        ) {
            content()
        }
    }
}

private val colorPrimary = Color(color = 0xFFF27A1A)

private val kompostoDesignTheme = KPDesignTheme(
    colors = KPDesignColors(),
    typography = KPDesignTypography(),
    fontFamily = KPDesignFontFamily()
)
