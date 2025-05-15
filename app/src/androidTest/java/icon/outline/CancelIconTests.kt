package icon.outline

import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.outline.Cancel
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class CancelIconTests : DesignScreenshotTest(){

    private val contents = listOf(
        DesignScreenshotTestContainer("Large") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.Cancel,
                    size = KPIconSize.Large
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.Cancel,
                    size = KPIconSize.Medium
                )
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.Cancel,
                    size = KPIconSize.Small
                )
            }
        },
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.Cancel,
                    size = KPIconSize.XSmall
                )
            }
        },
        DesignScreenshotTestContainer("XXSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.Cancel,
                    size = KPIconSize.XXSmall
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