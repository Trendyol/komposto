package com.trendyol.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

class TrendyolDesignColors(
    colorOnSurfaceVariant1: Color = DefaultColors.colorOnSurfaceVariant1,
    colorOnSurfaceVariant2: Color = DefaultColors.colorOnSurfaceVariant2,
    colorOnSurfaceVariant3: Color = DefaultColors.colorOnSurfaceVariant3,
    colorPrimary: Color = DefaultColors.colorPrimary,
    colorPrimaryVariant1: Color = DefaultColors.colorPrimaryVariant1,
    colorPrimaryVariant2: Color = DefaultColors.colorPrimaryVariant2,
    colorOnPrimary: Color = DefaultColors.colorOnPrimary,
    colorWarning: Color = DefaultColors.colorWarning,
    colorWarningVariant1: Color = DefaultColors.colorWarningVariant1,
    colorWarningVariant2: Color = DefaultColors.colorWarningVariant2,
    colorGreen: Color = DefaultColors.colorGreen,
    colorGreenVariant1: Color = DefaultColors.colorGreenVariant1,
    colorGreenVariant2: Color = DefaultColors.colorGreenVariant2,
    colorBlue: Color = DefaultColors.colorBlue,
    colorBlueVariant1: Color = DefaultColors.colorBlueVariant1,
    colorBlueVariant2: Color = DefaultColors.colorBlueVariant2,
    colorSurface: Color = DefaultColors.colorSurface,
    colorBackground: Color = DefaultColors.colorBackground,
    colorBorder: Color = DefaultColors.colorBorder,
    colorTransparent: Color = DefaultColors.colorTransparent,
    colorPink: Color = DefaultColors.colorPink,
    colorPinkVariant1: Color = DefaultColors.colorPinkVariant1,
    colorPinkVariant2: Color = DefaultColors.colorPinkVariant2,
    colorStar: Color = DefaultColors.colorStar,
    colorStarVariant1: Color = DefaultColors.colorStarVariant1,
    colorStarVariant2: Color = DefaultColors.colorStarVariant2,
) {

    var colorOnSurfaceVariant1 by mutableStateOf(colorOnSurfaceVariant1)
        private set

    var colorOnSurfaceVariant2 by mutableStateOf(colorOnSurfaceVariant2)
        private set

    var colorOnSurfaceVariant3 by mutableStateOf(colorOnSurfaceVariant3)
        private set

    var colorPrimary by mutableStateOf(colorPrimary)
        private set

    var colorPrimaryVariant1 by mutableStateOf(colorPrimaryVariant1)
        private set

    var colorPrimaryVariant2 by mutableStateOf(colorPrimaryVariant2)
        private set

    var colorOnPrimary by mutableStateOf(colorOnPrimary)
        private set

    var colorWarning by mutableStateOf(colorWarning)
        private set

    var colorWarningVariant1 by mutableStateOf(colorWarningVariant1)
        private set

    var colorWarningVariant2 by mutableStateOf(colorWarningVariant2)
        private set

    var colorGreen by mutableStateOf(colorGreen)
        private set

    var colorGreenVariant1 by mutableStateOf(colorGreenVariant1)
        private set

    var colorGreenVariant2 by mutableStateOf(colorGreenVariant2)
        private set

    var colorBlue by mutableStateOf(colorBlue)
        private set

    var colorBlueVariant1 by mutableStateOf(colorBlueVariant1)
        private set

    var colorBlueVariant2 by mutableStateOf(colorBlueVariant2)
        private set

    var colorSurface by mutableStateOf(colorSurface)
        private set

    var colorBackground by mutableStateOf(colorBackground)
        private set

    var colorBorder by mutableStateOf(colorBorder)
        private set

    var colorTransparent by mutableStateOf(colorTransparent)
        private set

    var colorPink by mutableStateOf(colorPink)
        private set

    var colorPinkVariant1 by mutableStateOf(colorPinkVariant1)
        private set

    var colorPinkVariant2 by mutableStateOf(colorPinkVariant2)
        private set

    var colorStar by mutableStateOf(colorStar)
        private set

    var colorStarVariant1 by mutableStateOf(colorStarVariant1)
        private set

    var colorStarVariant2 by mutableStateOf(colorStarVariant2)
        private set

    fun copy(
        colorOnSurfaceVariant1: Color = DefaultColors.colorOnSurfaceVariant1,
        colorOnSurfaceVariant2: Color = DefaultColors.colorOnSurfaceVariant2,
        colorOnSurfaceVariant3: Color = DefaultColors.colorOnSurfaceVariant3,
        colorPrimary: Color = DefaultColors.colorPrimary,
        colorPrimaryVariant1: Color = DefaultColors.colorPrimaryVariant1,
        colorPrimaryVariant2: Color = DefaultColors.colorPrimaryVariant2,
        colorOnPrimary: Color = DefaultColors.colorOnPrimary,
        colorWarning: Color = DefaultColors.colorWarning,
        colorWarningVariant1: Color = DefaultColors.colorWarningVariant1,
        colorWarningVariant2: Color = DefaultColors.colorWarningVariant2,
        colorGreen: Color = DefaultColors.colorGreen,
        colorGreenVariant1: Color = DefaultColors.colorGreenVariant1,
        colorGreenVariant2: Color = DefaultColors.colorGreenVariant2,
        colorBlue: Color = DefaultColors.colorBlue,
        colorBlueVariant1: Color = DefaultColors.colorBlueVariant1,
        colorBlueVariant2: Color = DefaultColors.colorBlueVariant2,
        colorSurface: Color = DefaultColors.colorSurface,
        colorBackground: Color = DefaultColors.colorBackground,
        colorBorder: Color = DefaultColors.colorBorder,
        colorTransparent: Color = DefaultColors.colorTransparent,
        colorPink: Color = DefaultColors.colorPink,
        colorPinkVariant1: Color = DefaultColors.colorPinkVariant1,
        colorPinkVariant2: Color = DefaultColors.colorPinkVariant2,
        colorStar: Color = DefaultColors.colorStar,
        colorStarVariant1: Color = DefaultColors.colorStarVariant1,
        colorStarVariant2: Color = DefaultColors.colorStarVariant2,
    ): TrendyolDesignColors = TrendyolDesignColors(
        colorOnSurfaceVariant1 = colorOnSurfaceVariant1,
        colorOnSurfaceVariant2 = colorOnSurfaceVariant2,
        colorOnSurfaceVariant3 = colorOnSurfaceVariant3,
        colorPrimary = colorPrimary,
        colorPrimaryVariant1 = colorPrimaryVariant1,
        colorPrimaryVariant2 = colorPrimaryVariant2,
        colorOnPrimary = colorOnPrimary,
        colorWarning = colorWarning,
        colorWarningVariant1 = colorWarningVariant1,
        colorWarningVariant2 = colorWarningVariant2,
        colorGreen = colorGreen,
        colorGreenVariant1 = colorGreenVariant1,
        colorGreenVariant2 = colorGreenVariant2,
        colorBlue = colorBlue,
        colorBlueVariant1 = colorBlueVariant1,
        colorBlueVariant2 = colorBlueVariant2,
        colorSurface = colorSurface,
        colorBackground = colorBackground,
        colorBorder = colorBorder,
        colorTransparent = colorTransparent,
        colorPink = colorPink,
        colorPinkVariant1 = colorPinkVariant1,
        colorPinkVariant2 = colorPinkVariant2,
        colorStar = colorStar,
        colorStarVariant1 = colorStarVariant1,
        colorStarVariant2 = colorStarVariant2,
    )
}
