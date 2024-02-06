package com.trendyol.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

class TrendyolDesignColors(
    colorOnSurfaceVariant1: Color = DefaultColors.colorGray60,
    colorOnSurfaceVariant2: Color = DefaultColors.colorGray40,
    colorOnSurfaceVariant3: Color = DefaultColors.colorGray20,
    colorPrimary: Color = DefaultColors.colorPrimary,
    colorOnPrimary: Color = DefaultColors.colorOnPrimary,
    colorWarning: Color = DefaultColors.colorWarning,
    colorGreen: Color = DefaultColors.colorGreen,
    colorGreenVariant: Color = DefaultColors.colorGreenVariant,
    colorBlue: Color = DefaultColors.colorBlue,
    colorSurface: Color = DefaultColors.colorSurface,
    colorBackground: Color = DefaultColors.colorBackground,
    colorBorder: Color = DefaultColors.colorBorder,
    colorWarningVariant: Color = DefaultColors.colorWarningVariant,
    colorPrimaryVariant: Color = DefaultColors.colorPrimaryVariant,
    colorTransparent: Color = DefaultColors.colorTransparent
) {

    var colorOnSurfaceVariant1 by mutableStateOf(colorOnSurfaceVariant1)
        private set

    var colorOnSurfaceVariant2 by mutableStateOf(colorOnSurfaceVariant2)
        private set

    var colorOnSurfaceVariant3 by mutableStateOf(colorOnSurfaceVariant3)
        private set

    var colorPrimary by mutableStateOf(colorPrimary)
        private set

    var colorOnPrimary by mutableStateOf(colorOnPrimary)
        private set

    var colorWarning by mutableStateOf(colorWarning)
        private set

    var colorGreen by mutableStateOf(colorGreen)
        private set

    var colorGreenVariant by mutableStateOf(colorGreenVariant)
        private set

    var colorBlue by mutableStateOf(colorBlue)
        private set

    var colorSurface by mutableStateOf(colorSurface)
        private set

    var colorBackground by mutableStateOf(colorBackground)
        private set

    var colorBorder by mutableStateOf(colorBorder)
        private set

    var colorWarningVariant by mutableStateOf(colorWarningVariant)
        private set

    var colorPrimaryVariant by mutableStateOf(colorPrimaryVariant)
        private set

    var colorTransparent by mutableStateOf(colorTransparent)
        private set

    fun copy(
        colorOnSurfaceVariant1: Color = DefaultColors.colorGray60,
        colorOnSurfaceVariant2: Color = DefaultColors.colorGray40,
        colorOnSurfaceVariant3: Color = DefaultColors.colorGray20,
        colorPrimary: Color = DefaultColors.colorPrimary,
        colorOnPrimary: Color = DefaultColors.colorOnPrimary,
        colorWarning: Color = DefaultColors.colorWarning,
        colorGreen: Color = DefaultColors.colorGreen,
        colorGreenVariant: Color = DefaultColors.colorGreenVariant,
        colorBlue: Color = DefaultColors.colorBlue,
        colorSurface: Color = DefaultColors.colorSurface,
        colorBackground: Color = DefaultColors.colorBackground,
        colorBorder: Color = DefaultColors.colorBorder,
        colorWarningVariant: Color = DefaultColors.colorWarningVariant,
        colorPrimaryVariant: Color = DefaultColors.colorPrimaryVariant,
        colorTransparent: Color = DefaultColors.colorTransparent
    ): TrendyolDesignColors = TrendyolDesignColors(
        colorOnSurfaceVariant1 = colorOnSurfaceVariant1,
        colorOnSurfaceVariant2 = colorOnSurfaceVariant2,
        colorOnSurfaceVariant3 = colorOnSurfaceVariant3,
        colorPrimary = colorPrimary,
        colorOnPrimary = colorOnPrimary,
        colorWarning = colorWarning,
        colorGreen = colorGreen,
        colorGreenVariant = colorGreenVariant,
        colorBlue = colorBlue,
        colorSurface = colorSurface,
        colorBackground = colorBackground,
        colorBorder = colorBorder,
        colorWarningVariant = colorWarningVariant,
        colorPrimaryVariant = colorPrimaryVariant,
        colorTransparent = colorTransparent
    )
}