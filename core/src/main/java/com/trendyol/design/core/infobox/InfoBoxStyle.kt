package com.trendyol.design.core.infobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.trendyol.theme.TrendyolDesign

interface InfoBoxStyle {
    @get:Composable
    val backgroundColor: Color

    @get:Composable
    val borderColor: Color

    @get:Composable
    val textColor: Color

    @get:Composable
    val iconTint: Color
}

sealed interface KPInfoBoxStyle {
    data object Orange : InfoBoxStyle {
        override val backgroundColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorPrimaryVariant1

        override val borderColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorPrimaryVariant2

        override val textColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorPrimary

        override val iconTint: Color
            @Composable
            get() = TrendyolDesign.colors.colorPrimary

    }

    data object White : InfoBoxStyle {
        override val backgroundColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorSurface

        override val borderColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorBorder

        override val textColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorPrimary

        override val iconTint: Color
            @Composable
            get() = TrendyolDesign.colors.colorPrimary
    }

    data object Gray : InfoBoxStyle {
        override val backgroundColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorOnSurfaceVariant1.copy(alpha = 0.12f)

        override val borderColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorBorder

        override val textColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorOnSurfaceVariant3

        override val iconTint: Color
            @Composable
            get() = TrendyolDesign.colors.colorPrimary
    }

    data object Red : InfoBoxStyle {
        override val backgroundColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorWarningVariant1

        override val borderColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorWarningVariant2

        override val textColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorWarning

        override val iconTint: Color
            @Composable
            get() = TrendyolDesign.colors.colorWarning

    }

    data object Blue : InfoBoxStyle {
        override val backgroundColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorBlueVariant1

        override val borderColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorBlueVariant2

        override val textColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorBlue

        override val iconTint: Color
            @Composable
            get() = TrendyolDesign.colors.colorBlue

    }

    data object Green : InfoBoxStyle {
        override val backgroundColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorGreenVariant1

        override val borderColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorGreenVariant2

        override val textColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorGreen

        override val iconTint: Color
            @Composable
            get() = TrendyolDesign.colors.colorGreen
    }

    data object Pink : InfoBoxStyle {
        override val backgroundColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorPinkVariant1

        override val borderColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorPinkVariant2

        override val textColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorPink

        override val iconTint: Color
            @Composable
            get() = TrendyolDesign.colors.colorPink
    }
}
