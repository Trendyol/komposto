package icon.fill

import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Delivery
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class DeliveryIconTests : DesignScreenshotTest() {
    private val contents = listOf(
        DesignScreenshotTestContainer("XXSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Delivery,
                    size = KPIconSize.XXSmall
                )
            }
        },
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Delivery,
                    size = KPIconSize.XSmall
                )
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Delivery,
                    size = KPIconSize.Small
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Delivery,
                    size = KPIconSize.Medium
                )
            }
        },
        DesignScreenshotTestContainer("Large") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Delivery,
                    size = KPIconSize.Large
                )
            }
        },
        DesignScreenshotTestContainer("XLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Delivery,
                    size = KPIconSize.XLarge
                )
            }
        },
        DesignScreenshotTestContainer("XXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Delivery,
                    size = KPIconSize.XXLarge
                )
            }
        },
        DesignScreenshotTestContainer("XXXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.Delivery,
                    size = KPIconSize.XXXLarge
                )
            }
        }
    )

    @Test
    fun deliveryIconTests() = runScreenShotTest(
        testName = "Delivery Icon Tests",
        contents = contents
    )
}
