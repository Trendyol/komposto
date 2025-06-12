@file:OptIn(ExperimentalKompostoApi::class)

package inputfield

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.inputfield.KPDropdown
import com.trendyol.design.core.inputfield.KPDropdownStyle
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

class KPDropdownTest : DesignScreenshotTest() {

    @Test
    fun kpDropdownStyleTest() = runScreenShotTest(
        testName = "KPDropdown Style Test",
        contents = listOf(
            DesignScreenshotTestContainer("FloatingLabelOutlined") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.FloatingLabelOutlined,
                        value = "abc"
                    ) { }
                }
            },
            DesignScreenshotTestContainer("Outlined") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.Outlined,
                        value = "abc"
                    ) { }
                }
            },
            DesignScreenshotTestContainer("Filled") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.Filled,
                        value = "abc"
                    ) { }
                }
            },
        )
    )

    @Test
    fun kpDropdownLabelTest() = runScreenShotTest(
        testName = "KPDropdown Label Test",
        contents = listOf(
            DesignScreenshotTestContainer("FloatingLabelOutlined") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.FloatingLabelOutlined,
                        value = "",
                        label = "label",
                    ) { }
                }
            },
            DesignScreenshotTestContainer("FloatingLabelOutlined") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.FloatingLabelOutlined,
                        value = "abc",
                        label = "label",
                    ) { }
                }
            },
            DesignScreenshotTestContainer("Outlined") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.Outlined,
                        value = "abc",
                        label = "label",
                    ) { }
                }
            },
            DesignScreenshotTestContainer("Filled") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.Filled,
                        value = "abc",
                        label = "label",
                    ) { }
                }
            },
        )
    )

    @Test
    fun kpDropdownPlaceholderTest() = runScreenShotTest(
        testName = "KPDropdown Placeholder Test",
        contents = listOf(
            DesignScreenshotTestContainer("FloatingLabelOutlined") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.FloatingLabelOutlined,
                        value = "",
                        placeholder = "placeholder",
                    ) { }
                }
            },
            DesignScreenshotTestContainer("Outlined") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.Outlined,
                        value = "",
                        placeholder = "placeholder",
                    ) { }
                }
            },
            DesignScreenshotTestContainer("Filled") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.Filled,
                        value = "",
                        placeholder = "placeholder",
                    ) { }
                }
            },
        )
    )

    @Test
    fun kpDropdownErrorLabelTest() = runScreenShotTest(
        testName = "KPDropdown ErrorLabel Test",
        contents = listOf(
            DesignScreenshotTestContainer("FloatingLabelOutlined") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.FloatingLabelOutlined,
                        value = "",
                        errorLabel = "errorLabel",
                        isError = true,
                    ) { }
                }
            },
            DesignScreenshotTestContainer("Outlined") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.Outlined,
                        value = "",
                        errorLabel = "errorLabel",
                        isError = true,
                    ) { }
                }
            },
            DesignScreenshotTestContainer("SmallError|Filled") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.Filled,
                        value = "",
                        errorLabel = "errorLabel",
                        isError = true,
                    ) { }
                }
            },
            DesignScreenshotTestContainer("LongError|Filled") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.Filled,
                        value = "",
                        errorLabel = LoremIpsum().values.joinToString(),
                        isError = true,
                    ) { }
                }
            },
        )
    )

    @Test
    fun kpDropdownEnabledTest() = runScreenShotTest(
        testName = "KPDropdown Enabled Test",
        contents = listOf(
            DesignScreenshotTestContainer("enabled=true|Outlined") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.Outlined,
                        value = "",
                        enabled = true,
                    ) { }
                }
            },
            DesignScreenshotTestContainer("enabled=true|Filled") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.Filled,
                        value = "123",
                        enabled = true,
                    ) { }
                }
            },
            DesignScreenshotTestContainer("enabled=false|Outlined") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.Outlined,
                        value = "123",
                        enabled = false,
                    ) { }
                }
            },
            DesignScreenshotTestContainer("enabled=false|Filled") {
                BoxWithHorizontalPadding {
                    KPDropdown(
                        style = KPDropdownStyle.Filled,
                        value = "",
                        enabled = false,
                    ) { }
                }
            },
        )
    )
}
