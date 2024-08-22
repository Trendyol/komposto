package com.trendyol.design.ui.component.ratingbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.core.rating.RatingBar
import com.trendyol.design.core.rating.TrendyolRatingBarSize
import com.trendyol.design.ui.theme.TrendyolTheme

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.RATING_BAR,
    name = Component.RATING_BAR,
    styleName = "1.Small"
)
@Composable
internal fun RatingBar_1_Small() = TrendyolTheme {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        RatingBar(
            rating = 3.5f,
            size = TrendyolRatingBarSize.Small,
            reviewCount = "277",
            showRating = false,
            showCameraIcon = false,
        )
        RatingBar(
            rating = 3.5f,
            size = TrendyolRatingBarSize.Small,
            showRating = true,
            showCameraIcon = false,
        )
        RatingBar(
            rating = 3.5f,
            size = TrendyolRatingBarSize.Small,
            reviewCount = "277",
            showRating = false,
            showCameraIcon = true,
        )
        RatingBar(
            rating = 3.5f,
            size = TrendyolRatingBarSize.Small,
            reviewCount = "277",
            showRating = true,
            showCameraIcon = false,
        )
        RatingBar(
            rating = 3.5f,
            size = TrendyolRatingBarSize.Small,
            reviewCount = "277",
            showRating = true,
            showCameraIcon = true
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.RATING_BAR,
    name = Component.RATING_BAR,
    styleName = "2.Medium"
)
@Composable
internal fun RatingBar_2_Medium() = TrendyolTheme {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        RatingBar(
            rating = 3.5f,
            size = TrendyolRatingBarSize.Medium,
            reviewCount = "277",
            showRating = false,
            showCameraIcon = false,
        )
        RatingBar(
            rating = 3.5f,
            size = TrendyolRatingBarSize.Medium,
            showRating = true,
            showCameraIcon = false,
        )
        RatingBar(
            rating = 3.5f,
            size = TrendyolRatingBarSize.Medium,
            reviewCount = "277",
            showRating = false,
            showCameraIcon = true,
        )
        RatingBar(
            rating = 3.5f,
            size = TrendyolRatingBarSize.Medium,
            reviewCount = "277",
            showRating = true,
            showCameraIcon = false,
        )
        RatingBar(
            rating = 3.5f,
            size = TrendyolRatingBarSize.Medium,
            reviewCount = "277",
            showRating = true,
            showCameraIcon = true
        )
    }
}
