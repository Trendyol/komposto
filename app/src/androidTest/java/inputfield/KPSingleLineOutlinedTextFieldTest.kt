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
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = "asd",
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = "asd",
                        onValueChange = { },
                    )
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
                        label = "label",
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("FloatingLabelOutlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                        value = "asd",
                        label = "label",
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = "asd",
                        label = "label",
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = "asd",
                        label = "label",
                        onValueChange = { },
                    )
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
                        placeholder = "placeholder",
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = "",
                        placeholder = "placeholder",
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = "",
                        placeholder = "placeholder",
                        onValueChange = { },
                    )
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
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("SmallError|Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = "",
                        errorLabel = "errorLabel",
                        isError = true,
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("LongError|Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = "",
                        errorLabel = LoremIpsum().values.joinToString(),
                        isError = true,
                        onValueChange = { },
                    )
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
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("enabled=true|Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = "asd",
                        enabled = true,
                        onValueChange = { },
                    )
                }
            },

            DesignScreenshotTestContainer("enabled=false|Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = "asd",
                        enabled = false,
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("enabled=false|Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = "",
                        enabled = false,
                        onValueChange = { },
                    )
                }
            },
        )
    )
}
