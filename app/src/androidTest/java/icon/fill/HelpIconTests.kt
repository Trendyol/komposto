package icon.fill

import com.trendyol.design.core.icon.KPIconSize
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import com.trendyol.design.core.icon.KPIcons.Fill;
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.icons.fill.Help
import org.junit.Test

internal class HelpIconTests : DesignScreenshotTest() {

    private val contents = listOf(
        DesignScreenshotTestContainer("Large") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = Fill.Help,
                    size = KPIconSize.Large
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = Fill.Help,
                    size = KPIconSize.Medium
                )
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = Fill.Help,
                    size = KPIconSize.Small
                )
            }
        },
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = Fill.Help,
                    size = KPIconSize.XSmall
                )
            }
        },
        DesignScreenshotTestContainer("XXSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = Fill.Help,
                    size = KPIconSize.XXSmall
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