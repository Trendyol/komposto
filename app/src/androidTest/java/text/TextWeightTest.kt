package text

import androidx.compose.foundation.layout.Column
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class TextWeightTest : DesignScreenshotTest() {

    private val contents = listOf(
        DesignScreenshotTestContainer("TitleColorOnSurfaceVariant3 weights") {
            BoxWithHorizontalPadding {
                Column {
                    Text(
                        text = "Text",
                        style = TrendyolDesign.typography.titleBoldColorOnSurfaceVariant3
                    )
                    Text(
                        text = "Text",
                        style = TrendyolDesign.typography.titleMediumColorOnSurfaceVariant3
                    )
                    Text(
                        text = "Text",
                        style = TrendyolDesign.typography.titleColorOnSurfaceVariant3
                    )
                }
            }
        },
        DesignScreenshotTestContainer("OverLineColorOnSurfaceVariant3 weights") {
            BoxWithHorizontalPadding {
                Column {
                    Text(
                        text = "Text",
                        style = TrendyolDesign.typography.overLineBoldColorOnSurfaceVariant3
                    )
                    Text(
                        text = "Text",
                        style = TrendyolDesign.typography.overLineMediumColorOnSurfaceVariant3
                    )
                    Text(
                        text = "Text",
                        style = TrendyolDesign.typography.overLineColorOnSurfaceVariant3
                    )
                }
            }
        },
    )

    @Test
    fun textWeightTests() = runScreenShotTest(
        testName = "Text weight test",
        contents = contents
    )
}
