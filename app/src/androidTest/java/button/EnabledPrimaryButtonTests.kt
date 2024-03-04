package button

import com.trendyol.design.core.button.Button
import com.trendyol.design.core.button.TrendyolButtonSize
import com.trendyol.design.core.button.TrendyolButtonStyle
import com.trendyol.design.core.text.Text
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class EnabledPrimaryButtonTests : DesignScreenshotTest() {

    private val contents = listOf(
        DesignScreenshotTestContainer("Large") {
            BoxWithHorizontalPadding {
                Button(
                    onClick = { },
                    style = TrendyolButtonStyle.Primary,
                    size = TrendyolButtonSize.Large
                ) {
                    Text(text = "CTA Label")
                }
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                Button(
                    onClick = { },
                    style = TrendyolButtonStyle.Primary,
                    size = TrendyolButtonSize.Medium
                ) {
                    Text(text = "CTA Label")
                }
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                Button(
                    onClick = { },
                    style = TrendyolButtonStyle.Primary,
                    size = TrendyolButtonSize.Small
                ) {
                    Text(text = "CTA Label")
                }
            }
        },
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                Button(
                    onClick = { },
                    style = TrendyolButtonStyle.Primary,
                    size = TrendyolButtonSize.XSmall
                ) {
                    Text(text = "CTA Label")
                }
            }
        },
    )

    @Test
    fun buttonTests() = runScreenShotTest(
        testName = "Enabled Primary Button Tests",
        contents = contents
    )
}