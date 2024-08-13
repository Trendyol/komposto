package com.trendyol.design.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.trendyol.theme.LocalTrendyolDesignTheme
import com.trendyol.theme.TrendyolDesignFontFamily
import com.trendyol.theme.TrendyolDesignTheme
import com.trendyol.theme.TrendyolDesignTypography

private val trendyolDesignTheme = TrendyolDesignTheme(
    colors = TrendyolColor.themeColor,
    typography = TrendyolDesignTypography(),
    fontFamily = TrendyolDesignFontFamily(
        regular = Fonts.RobotoRegular,
        medium = Fonts.RobotoMedium,
        bold = Fonts.RobotoBold,
    ),
)

private val trendyolDesignRTLTheme = trendyolDesignTheme.copy(
    fontFamily = TrendyolDesignFontFamily(
        regular = Fonts.CairoRegular,
        medium = Fonts.CairoMedium,
        bold = Fonts.CairoBold
    )
)

@Composable
fun TrendyolTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = TrendyolColor.materialColor
    ) {
        val theme = if (LocalLayoutDirection.current == LayoutDirection.Ltr) {
            trendyolDesignTheme
        } else {
            trendyolDesignRTLTheme
        }
        CompositionLocalProvider(
            LocalTrendyolDesignTheme provides theme
        ) {
            content()
        }
    }
}
