package checkbox;

import androidx.compose.foundation.layout.Column
import com.trendyol.design.core.checkbox.CheckboxContainerType
import com.trendyol.design.core.checkbox.KPCheckbox
import com.trendyol.design.core.checkbox.KPCheckboxSize
import com.trendyol.design.core.checkbox.KPCheckboxStyle
import com.trendyol.design.core.text.KPText
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
                    KPCheckbox(
                        style = KPCheckboxStyle.Primary,
                        size = KPCheckboxSize.Medium,
                        containerType = CheckboxContainerType.None,
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Primary Text") {
                BoxWithHorizontalPadding {
                    KPCheckbox(
                        style = KPCheckboxStyle.Primary,
                        size = KPCheckboxSize.Medium,
                        containerType = CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Primary Content") {
                BoxWithHorizontalPadding {
                    KPCheckbox(
                        style = KPCheckboxStyle.Primary,
                        size = KPCheckboxSize.Medium,
                        containerType = CheckboxContainerType.Content {
                            Column {
                                KPText(text)
                            }
                        },
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Secondary None") {
                BoxWithHorizontalPadding {
                    KPCheckbox(
                        style = KPCheckboxStyle.Secondary,
                        size = KPCheckboxSize.Medium,
                        containerType = CheckboxContainerType.None,
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Secondary Text") {
                BoxWithHorizontalPadding {
                    KPCheckbox(
                        style = KPCheckboxStyle.Secondary,
                        size = KPCheckboxSize.Medium,
                        containerType = CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Secondary Content") {
                BoxWithHorizontalPadding {
                    KPCheckbox(
                        style = KPCheckboxStyle.Secondary,
                        size = KPCheckboxSize.Medium,
                        containerType = CheckboxContainerType.Content {
                            Column {
                                KPText(text)
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
                    KPCheckbox(
                        style = KPCheckboxStyle.Primary,
                        size = KPCheckboxSize.Medium,
                        containerType = CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Primary Small") {
                BoxWithHorizontalPadding {
                    KPCheckbox(
                        style = KPCheckboxStyle.Primary,
                        size = KPCheckboxSize.Small,
                        containerType = CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Primary XSmall") {
                BoxWithHorizontalPadding {
                    KPCheckbox(
                        style = KPCheckboxStyle.Primary,
                        size = KPCheckboxSize.XSmall,
                        containerType =CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Secondary Medium") {
                BoxWithHorizontalPadding {
                    KPCheckbox(
                        style = KPCheckboxStyle.Secondary,
                        size = KPCheckboxSize.Medium,
                        containerType = CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Secondary Small") {
                BoxWithHorizontalPadding {
                    KPCheckbox(
                        style = KPCheckboxStyle.Secondary,
                        size = KPCheckboxSize.Small,
                        containerType = CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Secondary XSmall") {
                BoxWithHorizontalPadding {
                    KPCheckbox(
                        style = KPCheckboxStyle.Secondary,
                        size = KPCheckboxSize.XSmall,
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
                    KPCheckbox(
                        style = KPCheckboxStyle.Primary,
                        size = KPCheckboxSize.Medium,
                        containerType = CheckboxContainerType.Text(text),
                        checked = true,
                        onCheckedChange = {}
                    )
                }
            },
            DesignScreenshotTestContainer("Unchecked") {
                BoxWithHorizontalPadding {
                    KPCheckbox(
                        style = KPCheckboxStyle.Primary,
                        size = KPCheckboxSize.Medium,
                        containerType = CheckboxContainerType.Text(text),
                        checked = false,
                        onCheckedChange = {}
                    )
                }
            }
        )
    )
}