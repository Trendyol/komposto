package icon.fill

import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Credit
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class CreditIconTests : DesignScreenshotTest() {
    private val contents = listOf(
        DesignScreenshotTestContainer("XXSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Credit,
                    size = KPIconSize.XXSmall
                )
            }
        },
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Credit,
                    size = KPIconSize.XSmall
                )
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Credit,
                    size = KPIconSize.Small
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Credit,
                    size = KPIconSize.Medium
                )
            }
        },
        DesignScreenshotTestContainer("Large") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Credit,
                    size = KPIconSize.Large
                )
            }
        },
        DesignScreenshotTestContainer("XLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Credit,
                    size = KPIconSize.XLarge
                )
            }
        },
        DesignScreenshotTestContainer("XXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Credit,
                    size = KPIconSize.XXLarge
                )
            }
        },
        DesignScreenshotTestContainer("XXXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Credit,
                    size = KPIconSize.XXXLarge
                )
            }
        }
    )

    @Test
    fun creditIconTests() = runScreenShotTest(
        testName = "Credit Icon Tests",
        contents = contents
    )
}
