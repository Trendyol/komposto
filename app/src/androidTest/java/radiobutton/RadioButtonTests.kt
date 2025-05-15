package radiobutton;

import androidx.compose.foundation.layout.Column
import com.trendyol.design.core.radiobutton.KPRadioButton
import com.trendyol.design.core.radiobutton.KPRadioButtonContainerType
import com.trendyol.design.core.radiobutton.KPRadioButtonSize
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
                    KPRadioButton(
                        selected = true,
                        containerType = KPRadioButtonContainerType.None,
                        size = KPRadioButtonSize.Medium,
                        onClick = { }
                    )
                }
            },
            DesignScreenshotTestContainer("Text") {
                BoxWithHorizontalPadding {
                    KPRadioButton(
                        selected = false,
                        containerType = KPRadioButtonContainerType.Text(text),
                        size = KPRadioButtonSize.Medium,
                        onClick = { }
                    )
                }
            },
            DesignScreenshotTestContainer("Content") {
                BoxWithHorizontalPadding {
                    KPRadioButton(
                        selected = false,
                        containerType = KPRadioButtonContainerType.Content{
                            Column {
                                Text(text)
                            }
                        },
                        size = KPRadioButtonSize.Medium,
                        onClick = { }
                    )
                }
            }
        )
    )

    @Test
    fun sizeTest() = runScreenShotTest(
        testName = "sizeTest",
        contents = listOf(
            DesignScreenshotTestContainer("XSmall") {
                BoxWithHorizontalPadding {
                    KPRadioButton(
                        selected = true,
                        containerType = KPRadioButtonContainerType.Text(text),
                        size = KPRadioButtonSize.XSmall,
                        onClick = { }
                    )
                }
            },
            DesignScreenshotTestContainer("Small") {
                BoxWithHorizontalPadding {
                    KPRadioButton(
                        selected = false,
                        containerType = KPRadioButtonContainerType.Text(text),
                        size = KPRadioButtonSize.Small,
                        onClick = { }
                    )
                }
            },
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    KPRadioButton(
                        selected = false,
                        containerType = KPRadioButtonContainerType.Text(text),
                        size = KPRadioButtonSize.Medium,
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
                    KPRadioButton(
                        selected = true,
                        containerType = KPRadioButtonContainerType.None,
                        size = KPRadioButtonSize.Medium,
                        onClick = { }
                    )
                }
            },
            DesignScreenshotTestContainer("Unselected") {
                BoxWithHorizontalPadding {
                    KPRadioButton(
                        selected = false,
                        containerType = KPRadioButtonContainerType.None,
                        size = KPRadioButtonSize.Medium,
                        onClick = { }
                    )
                }
            }
        )
    )
}