package com.trendyol.design.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.trendyol.theme.LocalTrendyolDesignTheme
import com.trendyol.theme.TrendyolDesignFontFamily
import com.trendyol.theme.TrendyolDesignTheme
import com.trendyol.theme.TrendyolDesignTypography

private val trendyolDesignTheme = TrendyolDesignTheme(
    colors =  TrendyolColor.themeColor,
    typography = TrendyolDesignTypography(),
    fontFamily = TrendyolDesignFontFamily(
        regular = Fonts.RobotoRegular,
        medium = Fonts.RobotoMedium,
        semiBold = Fonts.RobotoSemiBold,
        bold = Fonts.RobotoBold,
    ),
)

@Composable
fun TrendyolTheme(
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