package icon.outline

import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.outline.Back
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class BackIconTests : DesignScreenshotTest() {
    private val contents = listOf(
        DesignScreenshotTestContainer("Large") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.Back,
                    size = KPIconSize.Large
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.Back,
                    size = KPIconSize.Medium
                )
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.Back,
                    size = KPIconSize.Small
                )
            }
        },
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.Back,
                    size = KPIconSize.XSmall
                )
            }
        },
        DesignScreenshotTestContainer("XXSmall") {
            BoxWithHorizontalPadding {
                KPIcon(
                    imageVector = KPIcons.Outline.Back,
                    size = KPIconSize.XXSmall
                )
            }
        }
    )

    @Test
    fun backIconTests() = runScreenShotTest(
        testName = "Back Icon Tests",
        contents = contents
    )

    @Test
    fun backIconRTLTest() = runScreenShotTest(
        testName = "Back Icon RTL Tests",
        contents = listOf(
            DesignScreenshotTestContainer("Large") {
                BoxWithHorizontalPadding {
                    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                        KPIcon(
                            imageVector = KPIcons.Outline.Back,
                            size = KPIconSize.Large
                        )
                    }
                }
            },
        )
    )
}