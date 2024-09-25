package icon.outline

import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.outline.Back
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class BackIconTests : DesignScreenshotTest() {
    private val contents = listOf(
        DesignScreenshotTestContainer("Large") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.Back,
                    size = TrendyolIconSize.Large
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.Back,
                    size = TrendyolIconSize.Medium
                )
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.Back,
                    size = TrendyolIconSize.Small
                )
            }
        },
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.Back,
                    size = TrendyolIconSize.XSmall
                )
            }
        },
        DesignScreenshotTestContainer("XXSmall") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Outline.Back,
                    size = TrendyolIconSize.XXSmall
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
                        Icon(
                            imageVector = Icons.Outline.Back,
                            size = TrendyolIconSize.Large
                        )
                    }
                }
            },
        )
    )
}