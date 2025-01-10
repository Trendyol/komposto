package icon.outline

import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.outline.StateCaution
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class StateCaution : DesignScreenshotTest() {
    private val contents = listOf(
        DesignScreenshotTestContainer("XXXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.StateCaution,
                    size = KPIconSize.XXXLarge
                )
            }
        },
        DesignScreenshotTestContainer("XXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.StateCaution,
                    size = KPIconSize.XXLarge
                )
            }
        },
        DesignScreenshotTestContainer("XLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.StateCaution,
                    size = KPIconSize.XLarge
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