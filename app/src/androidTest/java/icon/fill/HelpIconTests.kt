package icon.fill

import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.TrendyolIconSize
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import com.trendyol.design.core.icon.Icons.Fill;
import com.trendyol.design.core.icon.icons.fill.Help
import org.junit.Test

internal class HelpIconTests : DesignScreenshotTest() {

    private val contents = listOf(
        DesignScreenshotTestContainer("Large") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Fill.Help,
                    size = TrendyolIconSize.Large
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Fill.Help,
                    size = TrendyolIconSize.Medium
                )
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Fill.Help,
                    size = TrendyolIconSize.Small
                )
            }
        },
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Fill.Help,
                    size = TrendyolIconSize.XSmall
                )
            }
        },
        DesignScreenshotTestContainer("XXSmall") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Fill.Help,
                    size = TrendyolIconSize.XXSmall
                )
            }
        }
    )

    @Test
    fun helpIconTests() = runScreenShotTest(
        testName = "Help Icon Tests",
        contents = contents
    )
}