package icon.fill

import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.StatePin
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class StatePinIconTests : DesignScreenshotTest(){

    private val contents = listOf(
        DesignScreenshotTestContainer("XXXLarge") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Fill.StatePin,
                    size = TrendyolIconSize.XXXLarge
                )
            }
        }
    )
    @Test
    fun statePinIconTests() = runScreenShotTest(
        testName = "State Pin Icon Tests",
        contents = contents
    )
}