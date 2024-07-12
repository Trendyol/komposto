package checkbox;

import androidx.compose.foundation.layout.Column
import com.trendyol.design.core.checkbox.CheckboxContainerType
import com.trendyol.design.core.checkbox.TrendyolCheckBoxSize
import com.trendyol.design.core.checkbox.TrendyolCheckBoxStyle
import com.trendyol.design.core.checkbox.TrendyolCheckbox
import com.trendyol.design.core.text.Text
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class CheckboxTests : DesignScreenshotTest() {

    private val text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod"

    @Test
    fun styleTest() = runScreenShotTest(
        testName = "styleTest",
        contents = listOf(
            DesignScreenshotTestContainer("Primary None") {
                BoxWithHorizontalPadding {
                    TrendyolCheckbox(
                        style = TrendyolCheckBoxStyle.Primary,
                        size = TrendyolCheckBoxSize.Medium,
                        containerType = CheckboxContainerType.None,
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Primary Text") {
                BoxWithHorizontalPadding {
                    TrendyolCheckbox(
                        style = TrendyolCheckBoxStyle.Primary,
                        size = TrendyolCheckBoxSize.Medium,
                        containerType = CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Primary Content") {
                BoxWithHorizontalPadding {
                    TrendyolCheckbox(
                        style = TrendyolCheckBoxStyle.Primary,
                        size = TrendyolCheckBoxSize.Medium,
                        containerType = CheckboxContainerType.Content {
                            Column {
                                Text(text)
                            }
                        },
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Secondary None") {
                BoxWithHorizontalPadding {
                    TrendyolCheckbox(
                        style = TrendyolCheckBoxStyle.Secondary,
                        size = TrendyolCheckBoxSize.Medium,
                        containerType = CheckboxContainerType.None,
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Secondary Text") {
                BoxWithHorizontalPadding {
                    TrendyolCheckbox(
                        style = TrendyolCheckBoxStyle.Secondary,
                        size = TrendyolCheckBoxSize.Medium,
                        containerType = CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Secondary Content") {
                BoxWithHorizontalPadding {
                    TrendyolCheckbox(
                        style = TrendyolCheckBoxStyle.Secondary,
                        size = TrendyolCheckBoxSize.Medium,
                        containerType = CheckboxContainerType.Content {
                            Column {
                                Text(text)
                            }
                        },
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            }
        )
    )

    @Test
    fun sizeTest() = runScreenShotTest(
        testName = "sizeTest",
        contents = listOf(
            DesignScreenshotTestContainer("Primary Medium") {
                BoxWithHorizontalPadding {
                    TrendyolCheckbox(
                        style = TrendyolCheckBoxStyle.Primary,
                        size = TrendyolCheckBoxSize.Medium,
                        containerType = CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Primary Small") {
                BoxWithHorizontalPadding {
                    TrendyolCheckbox(
                        style = TrendyolCheckBoxStyle.Primary,
                        size = TrendyolCheckBoxSize.Small,
                        containerType = CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Primary XSmall") {
                BoxWithHorizontalPadding {
                    TrendyolCheckbox(
                        style = TrendyolCheckBoxStyle.Primary,
                        size = TrendyolCheckBoxSize.XSmall,
                        containerType =CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Secondary Medium") {
                BoxWithHorizontalPadding {
                    TrendyolCheckbox(
                        style = TrendyolCheckBoxStyle.Secondary,
                        size = TrendyolCheckBoxSize.Medium,
                        containerType = CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Secondary Small") {
                BoxWithHorizontalPadding {
                    TrendyolCheckbox(
                        style = TrendyolCheckBoxStyle.Secondary,
                        size = TrendyolCheckBoxSize.Small,
                        containerType = CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Secondary XSmall") {
                BoxWithHorizontalPadding {
                    TrendyolCheckbox(
                        style = TrendyolCheckBoxStyle.Secondary,
                        size = TrendyolCheckBoxSize.XSmall,
                        containerType =CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            }
        )
    )

    @Test
    fun checkedTest() = runScreenShotTest(
        testName = "checkedTest",
        contents = listOf(
            DesignScreenshotTestContainer("Checked") {
                BoxWithHorizontalPadding {
                    TrendyolCheckbox(
                        style = TrendyolCheckBoxStyle.Primary,
                        size = TrendyolCheckBoxSize.Medium,
                        containerType = CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Unchecked") {
                BoxWithHorizontalPadding {
                    TrendyolCheckbox(
                        style = TrendyolCheckBoxStyle.Primary,
                        size = TrendyolCheckBoxSize.Medium,
                        containerType = CheckboxContainerType.Text(text),
                        checked = false,
                        onCheckedChange = {}
                    )
                }
            }
        )
    )
}