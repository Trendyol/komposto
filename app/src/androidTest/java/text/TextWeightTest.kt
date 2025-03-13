package text

import androidx.compose.foundation.layout.Column
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class TextWeightTest : DesignScreenshotTest() {

    private val contents = listOf(
        DesignScreenshotTestContainer("TitleColorOnSurfaceVariant3 weights") {
            BoxWithHorizontalPadding {
                Column {
                    KPText(
                        text = "Text",
                        style = KPDesign.typography.titleBoldColorOnSurfaceVariant3
                    )
                    KPText(
                        text = "Text",
                        style = KPDesign.typography.titleMediumColorOnSurfaceVariant3
                    )
                    KPText(
                        text = "Text",
                        style = KPDesign.typography.titleColorOnSurfaceVariant3
                    )
                }
            }
        },
        DesignScreenshotTestContainer("OverLineColorOnSurfaceVariant3 weights") {
            BoxWithHorizontalPadding {
                Column {
                    KPText(
                        text = "Text",
                        style = KPDesign.typography.overLineBoldColorOnSurfaceVariant3
                    )
                    KPText(
                        text = "Text",
                        style = KPDesign.typography.overLineMediumColorOnSurfaceVariant3
                    )
                    KPText(
                        text = "Text",
                        style = KPDesign.typography.overLineColorOnSurfaceVariant3
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
