package com.trendyol.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

public class KPDesignColors(
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

    public var colorOnSurfaceVariant1: Color by mutableStateOf(colorOnSurfaceVariant1)
        private set

    public var colorOnSurfaceVariant2: Color by mutableStateOf(colorOnSurfaceVariant2)
        private set

    public var colorOnSurfaceVariant3: Color by mutableStateOf(colorOnSurfaceVariant3)
        private set

    public var colorPrimary: Color by mutableStateOf(colorPrimary)
        private set

    public var colorPrimaryVariant1: Color by mutableStateOf(colorPrimaryVariant1)
        private set

    public var colorPrimaryVariant2: Color by mutableStateOf(colorPrimaryVariant2)
        private set

    public var colorOnPrimary: Color by mutableStateOf(colorOnPrimary)
        private set

    public var colorWarning: Color by mutableStateOf(colorWarning)
        private set

    public var colorWarningVariant1: Color by mutableStateOf(colorWarningVariant1)
        private set

    public var colorWarningVariant2: Color by mutableStateOf(colorWarningVariant2)
        private set

    public var colorGreen: Color by mutableStateOf(colorGreen)
        private set

    public var colorGreenVariant1: Color by mutableStateOf(colorGreenVariant1)
        private set

    public var colorGreenVariant2: Color by mutableStateOf(colorGreenVariant2)
        private set

    public var colorBlue: Color by mutableStateOf(colorBlue)
        private set

    public var colorBlueVariant1: Color by mutableStateOf(colorBlueVariant1)
        private set

    public var colorBlueVariant2: Color by mutableStateOf(colorBlueVariant2)
        private set

    public var colorSurface: Color by mutableStateOf(colorSurface)
        private set

    public var colorBackground: Color by mutableStateOf(colorBackground)
        private set

    public var colorBorder: Color by mutableStateOf(colorBorder)
        private set

    public var colorTransparent: Color by mutableStateOf(colorTransparent)
        private set

    public var colorPink: Color by mutableStateOf(colorPink)
        private set

    public var colorPinkVariant1: Color by mutableStateOf(colorPinkVariant1)
        private set

    public var colorPinkVariant2: Color by mutableStateOf(colorPinkVariant2)
        private set

    public var colorStar: Color by mutableStateOf(colorStar)
        private set

    public var colorStarVariant1: Color by mutableStateOf(colorStarVariant1)
        private set

    public var colorStarVariant2: Color by mutableStateOf(colorStarVariant2)
        private set

    public fun copy(
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
    ): KPDesignColors = KPDesignColors(
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
