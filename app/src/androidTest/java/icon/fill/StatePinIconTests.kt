package icon.fill

import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.StatePin
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class StatePinIconTests : DesignScreenshotTest(){

    private val contents = listOf(
        DesignScreenshotTestContainer("XXXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Fill.StatePin,
                    size = KPIconSize.XXXLarge
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