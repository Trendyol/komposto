package com.trendyol.design.core.preview

import android.content.Context
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.trendyol.theme.KPDesignColors
import com.trendyol.theme.KPDesignFontFamily
import com.trendyol.theme.KPDesignTheme
import com.trendyol.theme.KPDesignTypography
import com.trendyol.theme.LocalKPDesignTheme

@Composable
internal fun PreviewTheme(
    layoutDirection: LayoutDirection = LayoutDirection.Ltr,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current

    val kompostoDesignTheme = remember {
        createTrendyolDesignTheme(context)
    }

    MaterialTheme(
        colors = MaterialTheme.colors.copy(
            primary = colorPrimary
        )
    ) {
        CompositionLocalProvider(
            LocalKPDesignTheme provides kompostoDesignTheme,
            LocalLayoutDirection provides layoutDirection
        ) {
            content()
        }
    }
}

private val colorPrimary = Color(color = 0xFFF27A1A)

private fun createTrendyolDesignTheme(context: Context) = KPDesignTheme(
    colors = KPDesignColors(),
    typography = KPDesignTypography(),
    fontFamily = KPDesignFontFamily(
        regular = PreviewFonts.getRobotoRegular(context),
        medium = PreviewFonts.getRobotoMedium(context),
        bold = PreviewFonts.getRobotoBold(context),
    )
)
