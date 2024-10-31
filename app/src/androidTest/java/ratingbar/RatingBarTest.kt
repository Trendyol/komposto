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
            DesignScreenshotTestContainer("Small") {
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
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    RatingBar(
                        rating = 3.5f,
                        size = TrendyolRatingBarSize.Medium,
                        reviewCount = "277",
                        showRating = false,
                        showCameraIcon = false,
                    )
                }
            }
        )
    )

    @Test
    fun ratingBarCameraTest() = runScreenShotTest(
        testName = "ratingBarCameraTest",
        contents = listOf(
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    RatingBar(
                        rating = 3.5f,
                        size = TrendyolRatingBarSize.Small,
                        reviewCount = "277",
                        showRating = true,
                        showCameraIcon = true,
                    )
                }
            },
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    RatingBar(
                        rating = 3.5f,
                        size = TrendyolRatingBarSize.Medium,
                        reviewCount = "277",
                        showRating = true,
                        showCameraIcon = true,
                    )
                }
            }
        )
    )



    @Test
    fun ratingBarRatingTest() = runScreenShotTest(
        testName = "ratingBarRatingTest",
        contents = listOf(
            DesignScreenshotTestContainer("Show Rating") {
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
            DesignScreenshotTestContainer("Unshow Rating") {
                BoxWithHorizontalPadding {
                    RatingBar(
                        rating = 3.5f,
                        size = TrendyolRatingBarSize.Small,
                        reviewCount = "277",
                        showRating = false,
                        showCameraIcon = false,
                    )
                }
            }
        )
    )
}