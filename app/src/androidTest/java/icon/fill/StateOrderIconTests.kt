package icon.fill

import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.StateOrder
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class StateOrderIconTests : DesignScreenshotTest() {

    private val contents = listOf(
        DesignScreenshotTestContainer("XXXLarge") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Fill.StateOrder,
                    size = TrendyolIconSize.XXXLarge
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