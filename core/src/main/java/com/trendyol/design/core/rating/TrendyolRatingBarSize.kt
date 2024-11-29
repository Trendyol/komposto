package com.trendyol.design.core.rating

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.trendyol.theme.TrendyolDesign

/**
 * A sealed interface defining the styling options for the `RatingBar` composable function
 * specific to Trendyol's design system.
 *
 * `TrendyolRatingBarSize`  implements the `RatingBarStyle` interface and offers
 * predefined styles (`Small` and `Medium`) according to Trendyol's design guidelines.
 */
public sealed interface TrendyolRatingBarSize : RatingBarSize {

    public data object Small : TrendyolRatingBarSize {
        override val starIconSize: Dp
            get() = 10.dp
        override val cameraIconSize: DpSize
            @Composable
            get() = DpSize(width = 12.dp, height = (10.3).dp)
        override val textSize: TextStyle
            @Composable
            get() = TrendyolDesign.typography.body2ColorOnSurfaceVariant3
    }

    public data object Medium : TrendyolRatingBarSize {
        override val starIconSize: Dp
            get() = 12.dp
        override val cameraIconSize: DpSize
            @Composable
            get() = DpSize(width = 14.dp, height = 12.dp)
        override val textSize: TextStyle
            @Composable
            get() = TrendyolDesign.typography.body1ColorOnSurfaceVariant3
    }
}
