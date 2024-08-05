package radiobutton;

import androidx.compose.foundation.layout.Column
import com.trendyol.design.core.radiobutton.TrendyolRadioButton
import com.trendyol.design.core.radiobutton.TrendyolRadioButtonContainerType
import com.trendyol.design.core.radiobutton.TrendyolRadioButtonSize
import com.trendyol.design.core.text.Text
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class RadioButtonTests : DesignScreenshotTest() {

    private val text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod"

    @Test
    fun styleTest() = runScreenShotTest(
        testName = "styleTest",
        contents = listOf(
            DesignScreenshotTestContainer("None") {
                BoxWithHorizontalPadding {
                    TrendyolRadioButton(
                        selected = true,
                        containerType = TrendyolRadioButtonContainerType.None,
                        size = TrendyolRadioButtonSize.Medium,
                        onClick = { }
                    )
                }
            },
            DesignScreenshotTestContainer("Text") {
                BoxWithHorizontalPadding {
                    TrendyolRadioButton(
                        selected = false,
                        containerType = TrendyolRadioButtonContainerType.Text(text),
                        size = TrendyolRadioButtonSize.Medium,
                        onClick = { }
                    )
                }
            },
            DesignScreenshotTestContainer("Content") {
                BoxWithHorizontalPadding {
                    TrendyolRadioButton(
                        selected = false,
                        containerType = TrendyolRadioButtonContainerType.Content{
                            Column {
                                Text(text)
                            }
                        },
                        size = TrendyolRadioButtonSize.Medium,
                        onClick = { }
                    )
                }
            }
        )
    )

    @Test
    fun sizeTEst() = runScreenShotTest(
        testName = "sizeTest",
        contents = listOf(
            DesignScreenshotTestContainer("XSmall") {
                BoxWithHorizontalPadding {
                    TrendyolRadioButton(
                        selected = true,
                        containerType = TrendyolRadioButtonContainerType.Text(text),
                        size = TrendyolRadioButtonSize.XSmall,
                        onClick = { }
                    )
                }
            },
            DesignScreenshotTestContainer("Small") {
                BoxWithHorizontalPadding {
                    TrendyolRadioButton(
                        selected = false,
                        containerType = TrendyolRadioButtonContainerType.Text(text),
                        size = TrendyolRadioButtonSize.Small,
                        onClick = { }
                    )
                }
            },
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    TrendyolRadioButton(
                        selected = false,
                        containerType = TrendyolRadioButtonContainerType.Text(text),
                        size = TrendyolRadioButtonSize.Medium,
                        onClick = { }
                    )
                }
            }
        )
    )

    @Test
    fun selectedTest() = runScreenShotTest(
        testName = "selectedTest",
        contents = listOf(
            DesignScreenshotTestContainer("Selected") {
                BoxWithHorizontalPadding {
                    TrendyolRadioButton(
                        selected = true,
                        containerType = TrendyolRadioButtonContainerType.None,
                        size = TrendyolRadioButtonSize.Medium,
                        onClick = { }
                    )
                }
            },
            DesignScreenshotTestContainer("Unselected") {
                BoxWithHorizontalPadding {
                    TrendyolRadioButton(
                        selected = false,
                        containerType = TrendyolRadioButtonContainerType.None,
                        size = TrendyolRadioButtonSize.Medium,
                        onClick = { }
                    )
                }
            }
        )
    )
}