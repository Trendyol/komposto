package icon.outline

import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.outline.Back
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class BackIconTests : DesignScreenshotTest() {
    private val contents = listOf(
        DesignScreenshotTestContainer("Large") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.Back,
                    size = TrendyolIconSize.Large
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.Back,
                    size = TrendyolIconSize.Medium
                )
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.Back,
                    size = TrendyolIconSize.Small
                )
            }
        },
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.Back,
                    size = TrendyolIconSize.XSmall
                )
            }
        },
        DesignScreenshotTestContainer("XXSmall") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.Back,
                    size = TrendyolIconSize.XXSmall
                )
            }
        }
    )

    @Test
    fun backIconTests() = runScreenShotTest(
        testName = "Back Icon Tests",
        contents = contents
    )
}