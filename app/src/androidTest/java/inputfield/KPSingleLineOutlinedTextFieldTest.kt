package inputfield

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.trendyol.design.core.inputfield.KPSingleLineOutlinedTextField
import com.trendyol.design.core.inputfield.KPOutlinedTextFieldStyle
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

class KPSingleLineOutlinedTextFieldTest : DesignScreenshotTest() {

    @Test
    fun kpSingleLineOutlinedTextFieldStyleTest() = runScreenShotTest(
        testName = "KPSingleLineOutlinedTextField Style Test",
        contents = listOf(
            DesignScreenshotTestContainer("FloatingLabelOutlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                        value = "asd",
                    ) { }
                }
            },
            DesignScreenshotTestContainer("Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = "asd",
                    ) { }
                }
            },
            DesignScreenshotTestContainer("Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = "asd",
                    ) { }
                }
            },
        )
    )

    @Test
    fun kpSingleLineOutlinedTextFieldLabelTest() = runScreenShotTest(
        testName = "KPSingleLineOutlinedTextField Label Test",
        contents = listOf(
            DesignScreenshotTestContainer("FloatingLabelOutlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                        value = "",
                        label = "label"
                    ) { }
                }
            },
            DesignScreenshotTestContainer("FloatingLabelOutlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                        value = "asd",
                        label = "label",
                    ) { }
                }
            },
            DesignScreenshotTestContainer("Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = "asd",
                        label = "label",
                    ) { }
                }
            },
            DesignScreenshotTestContainer("Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = "asd",
                        label = "label",
                    ) { }
                }
            },
        )
    )

    @Test
    fun kpSingleLineOutlinedTextFieldPlaceholderTest() = runScreenShotTest(
        testName = "KPSingleLineOutlinedTextField Placeholder Test",
        contents = listOf(
            DesignScreenshotTestContainer("FloatingLabelOutlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                        value = "",
                        placeholder = "placeholder"
                    ) { }
                }
            },
            DesignScreenshotTestContainer("Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = "",
                        placeholder = "placeholder",
                    ) { }
                }
            },
            DesignScreenshotTestContainer("Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = "",
                        placeholder = "placeholder",
                    ) { }
                }
            },
        )
    )

    @Test
    fun kpSingleLineOutlinedTextFieldErrorLabelTest() = runScreenShotTest(
        testName = "KPSingleLineOutlinedTextField ErrorLabel Test",
        contents = listOf(
            DesignScreenshotTestContainer("Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = "",
                        errorLabel = "errorLabel",
                        isError = true,
                    ) { }
                }
            },
            DesignScreenshotTestContainer("SmallError|Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = "",
                        errorLabel = "errorLabel",
                        isError = true,
                    ) { }
                }
            },
            DesignScreenshotTestContainer("LongError|Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = "",
                        errorLabel = LoremIpsum().values.joinToString(),
                        isError = true,
                    ) { }
                }
            },
        )
    )

    @Test
    fun kpSingleLineOutlinedTextFieldEnabledTest() = runScreenShotTest(
        testName = "KPSingleLineOutlinedTextField Enabled Test",
        contents = listOf(
            DesignScreenshotTestContainer("enabled=true|Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = "",
                        enabled = true,
                    ) { }
                }
            },
            DesignScreenshotTestContainer("enabled=true|Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = "asd",
                        enabled = true,
                    ) { }
                }
            },

            DesignScreenshotTestContainer("enabled=false|Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = "asd",
                        enabled = false,
                    ) { }
                }
            },
            DesignScreenshotTestContainer("enabled=false|Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = "",
                        enabled = false,
                    ) { }
                }
            },
        )
    )
}
