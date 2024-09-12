package com.trendyol.design.core.preview

import android.content.Context
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.trendyol.theme.LocalTrendyolDesignTheme
import com.trendyol.theme.TrendyolDesignColors
import com.trendyol.theme.TrendyolDesignFontFamily
import com.trendyol.theme.TrendyolDesignTheme
import com.trendyol.theme.TrendyolDesignTypography

@Composable
internal fun PreviewTheme(
    content: @Composable () -> Unit
) {
    val context = LocalContext.current

    val trendyolDesignTheme = remember {
        createTrendyolDesignTheme(context)
    }

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

private object TrendyolColor {
    val themeColor = TrendyolDesignColors().copy(colorPrimary = colorPrimary)
    val materialColor: Colors
        @ReadOnlyComposable
        @Composable
        get() = MaterialTheme.colors.copy(
            primary = colorPrimary
        )
}

private val colorPrimary = Color(color = 0xFFF27A1A)

private fun createTrendyolDesignTheme(context: Context) = TrendyolDesignTheme(
    colors = TrendyolDesignColors(),
    typography = TrendyolDesignTypography(),
    fontFamily = TrendyolDesignFontFamily(
        regular = PreviewFonts.getRobotoRegular(context),
        medium = PreviewFonts.getRobotoMedium(context),
        bold = PreviewFonts.getRobotoBold(context),
    )
)
