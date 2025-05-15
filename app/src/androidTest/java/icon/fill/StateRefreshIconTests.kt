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
