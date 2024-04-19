package icon.fill

import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.Trash
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class TrashIconTests : DesignScreenshotTest() {
    private val contents = listOf(
        DesignScreenshotTestContainer("Large") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Fill.Trash,
                    size = TrendyolIconSize.Large
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Fill.Trash,
                    size = TrendyolIconSize.Medium
                )
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Fill.Trash,
                    size = TrendyolIconSize.Small
                )
            }
        },
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Fill.Trash,
                    size = TrendyolIconSize.XSmall
                )
            }
        },
        DesignScreenshotTestContainer("XXSmall") {
            BoxWithHorizontalPadding {
                Icon(
                    imageVector = Icons.Fill.Trash,
                    size = TrendyolIconSize.XXSmall
                )
            }
        }
    )

    @Test
    fun trashIconTests() = runScreenShotTest(
        testName = "Trash Icon Tests",
        contents = contents
    )
}