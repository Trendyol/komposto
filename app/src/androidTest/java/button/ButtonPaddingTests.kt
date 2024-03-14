package button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.button.Button
import com.trendyol.design.core.button.TrendyolButtonSize
import com.trendyol.design.core.button.TrendyolButtonStyle
import com.trendyol.design.core.text.Text
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class ButtonPaddingTests : DesignScreenshotTest() {

    private val contents = listOf(
        DesignScreenshotTestContainer("XSmall buttons with 8dp padding space") {
            BoxWithHorizontalPadding {
                Column {
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.XSmall
                    ) {
                        Text(text = "CTA Label")
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.XSmall
                    ) {
                        Text(text = "CTA Label")
                    }
                }
            }
        },
        DesignScreenshotTestContainer("Medium buttons with 8dp padding space") {
            BoxWithHorizontalPadding {
                Column {
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.Medium
                    ) {
                        Text(text = "CTA Label")
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.Medium
                    ) {
                        Text(text = "CTA Label")
                    }
                }
            }
        },
    )

    @Test
    fun buttonTests() = runScreenShotTest(
        testName = "Multiple buttons stacked one on top of the other",
        contents = contents
    )
}