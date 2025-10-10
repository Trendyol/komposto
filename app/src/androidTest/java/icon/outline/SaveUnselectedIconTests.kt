package icon.outline

import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.outline.SaveUnselected
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class SaveUnselectedIconTests : DesignScreenshotTest() {
    private val contents = listOf(
        DesignScreenshotTestContainer("XXSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SaveUnselected,
                    size = KPIconSize.XXSmall
                )
            }
        },
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SaveUnselected,
                    size = KPIconSize.XSmall
                )
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SaveUnselected,
                    size = KPIconSize.Small
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SaveUnselected,
                    size = KPIconSize.Medium
                )
            }
        },
        DesignScreenshotTestContainer("Large") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SaveUnselected,
                    size = KPIconSize.Large
                )
            }
        },
        DesignScreenshotTestContainer("XLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SaveUnselected,
                    size = KPIconSize.XLarge
                )
            }
        },
        DesignScreenshotTestContainer("XXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SaveUnselected,
                    size = KPIconSize.XXLarge
                )
            }
        },
        DesignScreenshotTestContainer("XXXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SaveUnselected,
                    size = KPIconSize.XXXLarge
                )
            }
        }
    )

    @Test
    fun saveUnselectedIconTests() = runScreenShotTest(
        testName = "Save Unselected Icon Tests",
        contents = contents
    )
}
