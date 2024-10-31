package ratingbar

import com.trendyol.design.core.rating.RatingBar
import com.trendyol.design.core.rating.TrendyolRatingBarSize
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class RatingBarTest : DesignScreenshotTest() {
    @Test
    fun ratingBarSizeTest() = runScreenShotTest(
        testName = "ratingBarSizeTest",
        contents = listOf(
            DesignScreenshotTestContainer("Small"){
                BoxWithHorizontalPadding {
                    RatingBar(
                        rating = 3.5f,
                        size = TrendyolRatingBarSize.Small,
                        reviewCount = "277",
                        showRating = false,
                        showCameraIcon = false,
                    )
                }
            },
            DesignScreenshotTestContainer("Medium"){
                RatingBar(
                    rating = 3.5f,
                    size = TrendyolRatingBarSize.Medium,
                    reviewCount = "277",
                    showRating = false,
                    showCameraIcon = false,
                )
            }
        )
    )

    @Test
    fun ratingBarCameraIconTest() = runScreenShotTest(
        testName = "ratingBarCameraIconTest",
        contents = listOf(
            DesignScreenshotTestContainer("Show Camera Icon"){
                BoxWithHorizontalPadding {
                    RatingBar(
                        rating = 3.5f,
                        size = TrendyolRatingBarSize.Small,
                        reviewCount = "277",
                        showRating = false,
                        showCameraIcon = true,
                    )
                }
            },
            DesignScreenshotTestContainer("Unshow Camera Icon"){
                RatingBar(
                    rating = 3.5f,
                    size = TrendyolRatingBarSize.Small,
                    reviewCount = "277",
                    showRating = false,
                    showCameraIcon = false,
                )
            }
        )
    )

    @Test
    fun ratingBarRatingTest() = runScreenShotTest(
        testName = "ratingBarRatingTest",
        contents = listOf(
            DesignScreenshotTestContainer("Show Rating"){
                BoxWithHorizontalPadding {
                    RatingBar(
                        rating = 3.5f,
                        size = TrendyolRatingBarSize.Small,
                        reviewCount = "277",
                        showRating = true,
                        showCameraIcon = false,
                    )
                }
            },
            DesignScreenshotTestContainer("Unshow Rating"){
                RatingBar(
                    rating = 3.5f,
                    size = TrendyolRatingBarSize.Small,
                    reviewCount = "277",
                    showRating = false,
                    showCameraIcon = false,
                )
            }
        )
    )
}