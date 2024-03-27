package text

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import com.trendyol.design.core.text.Text
import com.trendyol.design.ui.theme.Fonts
import com.trendyol.design.ui.theme.TrendyolColor
import com.trendyol.theme.TrendyolDesign
import com.trendyol.theme.TrendyolDesignFontFamily
import com.trendyol.theme.TrendyolDesignTheme
import com.trendyol.theme.TrendyolDesignTypography
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
    )

    @Test
    fun textWeightTests() = runScreenShotTest(
        testName = "Text weight test",
        contents = contents
    )
}
