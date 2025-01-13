package com.trendyol.design.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.trendyol.theme.KPDesignFontFamily
import com.trendyol.theme.KPDesignTheme
import com.trendyol.theme.KPDesignTypography
import com.trendyol.theme.LocalKPDesignTheme

private val KPDesignTheme = KPDesignTheme(
    colors = KompostoColor.kpThemeColor,
    typography = KPDesignTypography(),
    fontFamily = KPDesignFontFamily(
        regular = Fonts.RobotoRegular,
        medium = Fonts.RobotoMedium,
        bold = Fonts.RobotoBold,
    ),
)

private val KPDesignRTLTheme = KPDesignTheme.copy(
    fontFamily = KPDesignFontFamily(
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
        colors = KompostoColor.materialColor
    ) {
        val kpTheme = if (LocalLayoutDirection.current == LayoutDirection.Ltr) {
            KPDesignTheme
        } else {
            KPDesignRTLTheme
        }
        CompositionLocalProvider(
            LocalKPDesignTheme provides kpTheme
        ) {
            content()
        }
    }
}
