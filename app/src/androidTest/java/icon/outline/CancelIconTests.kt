package icon.outline

import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.outline.Cancel
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class CancelIconTests : DesignScreenshotTest(){

    private val contents = listOf(
        DesignScreenshotTestContainer("Large") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.Cancel,
                    size = TrendyolIconSize.Large
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.Cancel,
                    size = TrendyolIconSize.Medium
                )
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.Cancel,
                    size = TrendyolIconSize.Small
                )
            }
        },
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.Cancel,
                    size = TrendyolIconSize.XSmall
                )
            }
        },
        DesignScreenshotTestContainer("XXSmall") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.Cancel,
                    size = TrendyolIconSize.XXSmall
                )
            }
        }
    )

    @Test
    fun cancelIconTests() = runScreenShotTest(
        testName = "Cancel Icon Tests",
        contents = contents
    )
}