package icon.outline

import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.outline.StateCaution
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class StateCaution : DesignScreenshotTest() {
    private val contents = listOf(
        DesignScreenshotTestContainer("XXXLarge") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.StateCaution,
                    size = TrendyolIconSize.XXXLarge
                )
            }
        },
        DesignScreenshotTestContainer("XXLarge") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.StateCaution,
                    size = TrendyolIconSize.XXLarge
                )
            }
        },
        DesignScreenshotTestContainer("XLarge") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.StateCaution,
                    size = TrendyolIconSize.XLarge
                )
            }
        }
    )

    @Test
    fun stateCautionIconTests() = runScreenShotTest(
        testName = "State Caution Icon Tests",
        contents = contents
    )
}