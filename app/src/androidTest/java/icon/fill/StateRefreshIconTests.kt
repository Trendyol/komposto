package icon.fill

import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.StateRefresh
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class StateRefreshIconTests: DesignScreenshotTest() {

    private val contents = listOf(
        DesignScreenshotTestContainer("XXSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.StateRefresh,
                    size = KPIconSize.XXSmall
                )
            }
        },
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.StateRefresh,
                    size = KPIconSize.XSmall
                )
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.StateRefresh,
                    size = KPIconSize.Small
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.StateRefresh,
                    size = KPIconSize.Medium
                )
            }
        },
        DesignScreenshotTestContainer("Large") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.StateRefresh,
                    size = KPIconSize.Large
                )
            }
        },
        DesignScreenshotTestContainer("XLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.StateRefresh,
                    size = KPIconSize.XLarge
                )
            }
        },
        DesignScreenshotTestContainer("XXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.StateRefresh,
                    size = KPIconSize.XXLarge
                )
            }
        },
        DesignScreenshotTestContainer("XXXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.StateRefresh,
                    size = KPIconSize.XXXLarge
                )
            }
        }
    )
    @Test
    fun stateRefreshIconTests() = runScreenShotTest(
        testName = "State Refresh Icon Tests",
        contents = contents
    )
}
