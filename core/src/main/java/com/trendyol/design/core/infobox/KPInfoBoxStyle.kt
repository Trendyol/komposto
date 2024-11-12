package com.trendyol.design.core.infobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.theme.TrendyolDesign

/**
 * A sealed interface representing various styles for an InfoBox component.
 * Each style defines its own color palette for the background, border, text, and icon tint.
 */
public sealed interface KPInfoBoxStyle {

    /**
     * InfoBox style with an orange background color.
     */
    public data object Orange : InfoBoxStyle {
        override val backgroundColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorPrimaryVariant1

        override val borderColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorPrimaryVariant2

        override val dashedBorderDashWidth: Dp?
            @Composable
            get() = 4.dp

        override val dashedBorderGapWidth: Dp?
            @Composable
            get() = 4.dp

        override val textColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorPrimary

        override val iconTint: Color
            @Composable
            get() = TrendyolDesign.colors.colorPrimary
    }

    /**
     * InfoBox style with an white background color.
     */
    public data object White : InfoBoxStyle {
        override val backgroundColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorSurface

        override val borderColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorBorder

        override val dashedBorderDashWidth: Dp?
            @Composable
            get() = 4.dp

        override val dashedBorderGapWidth: Dp?
            @Composable
            get() = 4.dp

        override val textColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorPrimary

        override val iconTint: Color
            @Composable
            get() = TrendyolDesign.colors.colorPrimary
    }

    /**
     * InfoBox style with a gray background color.
     */
    public data object Gray : InfoBoxStyle {
        override val backgroundColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorOnSurfaceVariant1.copy(alpha = 0.12f)

        override val borderColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorBorder

        override val dashedBorderDashWidth: Dp?
            @Composable
            get() = 4.dp

        override val dashedBorderGapWidth: Dp?
            @Composable
            get() = 4.dp

        override val textColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorOnSurfaceVariant3

        override val iconTint: Color
            @Composable
            get() = TrendyolDesign.colors.colorPrimary
    }

    /**
     * InfoBox style with a red background color.
     */
    public data object Red : InfoBoxStyle {
        override val backgroundColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorWarningVariant1

        override val borderColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorWarningVariant2

        override val dashedBorderDashWidth: Dp?
            @Composable
            get() = 4.dp

        override val dashedBorderGapWidth: Dp?
            @Composable
            get() = 4.dp

        override val textColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorWarning

        override val iconTint: Color
            @Composable
            get() = TrendyolDesign.colors.colorWarning
    }

    /**
     * InfoBox style with a blue background color.
     */
    public data object Blue : InfoBoxStyle {
        override val backgroundColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorBlueVariant1

        override val borderColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorBlueVariant2

        override val dashedBorderDashWidth: Dp?
            @Composable
            get() = 4.dp

        override val dashedBorderGapWidth: Dp?
            @Composable
            get() = 4.dp

        override val textColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorBlue

        override val iconTint: Color
            @Composable
            get() = TrendyolDesign.colors.colorBlue
    }

    /**
     * InfoBox style with a green background color.
     */
    public data object Green : InfoBoxStyle {
        override val backgroundColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorGreenVariant1

        override val borderColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorGreenVariant2

        override val dashedBorderDashWidth: Dp?
            @Composable
            get() = 4.dp

        override val dashedBorderGapWidth: Dp?
            @Composable
            get() = 4.dp

        override val textColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorGreen

        override val iconTint: Color
            @Composable
            get() = TrendyolDesign.colors.colorGreen
    }

    /**
     * InfoBox style with a pink background color.
     */
    public data object Pink : InfoBoxStyle {
        override val backgroundColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorPinkVariant1

        override val borderColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorPinkVariant2

        override val dashedBorderDashWidth: Dp?
            @Composable
            get() = 4.dp

        override val dashedBorderGapWidth: Dp?
            @Composable
            get() = 4.dp

        override val textColor: Color
            @Composable
            get() = TrendyolDesign.colors.colorPink

        override val iconTint: Color
            @Composable
            get() = TrendyolDesign.colors.colorPink
    }
}
