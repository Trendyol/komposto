package icon.fill

import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.StateOrder
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class StateOrderIconTests : DesignScreenshotTest() {

    private val contents = listOf(
        DesignScreenshotTestContainer("XXXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.StateOrder,
                    size = KPIconSize.XXXLarge
                )
            }
        }
    )
        @Test
        fun stateOrderIconTests() = runScreenShotTest(
            testName = "State Order Icon Tests",
            contents = contents
        )
}