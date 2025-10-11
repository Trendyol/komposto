package icon.outline

import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.outline.SuccessState
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class SuccessStateIconTests : DesignScreenshotTest() {
    private val contents = listOf(
        DesignScreenshotTestContainer("XXSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SuccessState,
                    size = KPIconSize.XXSmall
                )
            }
        },
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SuccessState,
                    size = KPIconSize.XSmall
                )
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SuccessState,
                    size = KPIconSize.Small
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SuccessState,
                    size = KPIconSize.Medium
                )
            }
        },
        DesignScreenshotTestContainer("Large") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SuccessState,
                    size = KPIconSize.Large
                )
            }
        },
        DesignScreenshotTestContainer("XLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SuccessState,
                    size = KPIconSize.XLarge
                )
            }
        },
        DesignScreenshotTestContainer("XXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SuccessState,
                    size = KPIconSize.XXLarge
                )
            }
        },
        DesignScreenshotTestContainer("XXXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.SuccessState,
                    size = KPIconSize.XXXLarge
                )
            }
        }
    )

    @Test
    fun successStateIconTests() = runScreenShotTest(
        testName = "Success State Icon Tests",
        contents = contents
    )
}
