package com.trendyol.design.core.infobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.trendyol.theme.TrendyolDesign

/**
 * `InfoBoxStyle` is an interface that defines the styling properties for an information box.
 * It provides customizable colors for the background, border, text, and icon.
 *
 * Each property is annotated with `@Composable`, allowing it to be used within composable functions
 * and providing the ability to dynamically change styles based on the composition context.
 *
 * Properties:
 *
 * @property backgroundColor A [Color] that sets the background color of the info box.
 * @property borderColor A [Color] that sets the border color of the info box.
 * @property textColor A [Color] that sets the color of the text within the info box.
 * @property iconTint A [Color] that sets the tint color for the icon displayed in the info box.
 */

public interface InfoBoxStyle {
    @get:Composable
    public val backgroundColor: Color

    @get:Composable
    public val borderColor: Color

    @get:Composable
    public val textColor: Color

    @get:Composable
    public val iconTint: Color
}

public sealed interface KPInfoBoxStyle {
    public data object Orange : InfoBoxStyle {
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

    public data object White : InfoBoxStyle {
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

    public data object Gray : InfoBoxStyle {
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

    public data object Red : InfoBoxStyle {
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

    public data object Blue : InfoBoxStyle {
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

    public data object Green : InfoBoxStyle {
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

    public data object Pink : InfoBoxStyle {
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
