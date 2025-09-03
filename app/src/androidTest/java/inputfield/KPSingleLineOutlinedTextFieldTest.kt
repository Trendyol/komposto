@file:OptIn(ExperimentalKompostoApi::class)

package inputfield

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Cancel
import com.trendyol.design.core.icon.icons.fill.Search
import com.trendyol.design.core.inputfield.KPSingleLineOutlinedTextField
import com.trendyol.design.core.inputfield.KPOutlinedTextFieldStyle
import com.trendyol.design.core.inputfield.container.TextFieldScope
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

class KPSingleLineOutlinedTextFieldTest : DesignScreenshotTest() {

    private val sampleText = "Sample text"
    private val measurementText = "175"
    private val shortTrailingText = "OK"
    private val longTrailingText = "Really long trailing text for test"
    
    // Custom visual transformation that adds unit suffix
    private class UnitVisualTransformation(private val unit: String) : VisualTransformation {
        override fun filter(text: AnnotatedString): TransformedText {
            val transformedText = if (text.text.isNotEmpty()) "${text.text} $unit" else text.text
            return TransformedText(
                AnnotatedString(transformedText),
                object : OffsetMapping {
                    override fun originalToTransformed(offset: Int): Int = offset
                    override fun transformedToOriginal(offset: Int): Int = 
                        minOf(offset, text.length)
                }
            )
        }
    }

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

    @Test
    fun kpSingleLineOutlinedTextFieldVisualTransformationTest() = runScreenShotTest(
        testName = "KPSingleLineOutlinedTextField VisualTransformation Test",
        contents = listOf(
            DesignScreenshotTestContainer("None|FloatingLabelOutlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                        value = sampleText,
                        visualTransformation = VisualTransformation.None,
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("None|Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = sampleText,
                        visualTransformation = VisualTransformation.None,
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("None|Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = sampleText,
                        visualTransformation = VisualTransformation.None,
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("UnitCm|FloatingLabelOutlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                        value = measurementText,
                        visualTransformation = UnitVisualTransformation("cm"),
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("UnitKg|Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = "75",
                        visualTransformation = UnitVisualTransformation("kg"),
                        onValueChange = { },
                    )
                }
            },
            DesignScreenshotTestContainer("UnitCm|Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = measurementText,
                        visualTransformation = UnitVisualTransformation("cm"),
                        onValueChange = { },
                    )
                }
            },
        )
    )

    @Test
    fun kpSingleLineOutlinedTextFieldTrailingContentTest() = runScreenShotTest(
        testName = "KPSingleLineOutlinedTextField TrailingContent Test",
        contents = listOf(
            DesignScreenshotTestContainer("ShortText|Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = sampleText,
                        onValueChange = { },
                        trailingContent = {
                            TextFieldScope.Text(
                                text = shortTrailingText,
                                onClick = { }
                            )
                        }
                    )
                }
            },
            DesignScreenshotTestContainer("LongText|Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = sampleText,
                        onValueChange = { },
                        trailingContent = {
                            TextFieldScope.Text(
                                text = longTrailingText,
                                onClick = { }
                            )
                        }
                    )
                }
            },
            DesignScreenshotTestContainer("LongText|Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = sampleText,
                        onValueChange = { },
                        trailingContent = {
                            TextFieldScope.Text(
                                text = longTrailingText,
                                onClick = { }
                            )
                        }
                    )
                }
            },
            DesignScreenshotTestContainer("Icon|Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = sampleText,
                        onValueChange = { },
                        trailingContent = {
                            TextFieldScope.Icon(
                                imageVector = KPIcons.Fill.Search,
                                onClick = { }
                            )
                        }
                    )
                }
            },
            DesignScreenshotTestContainer("Icon|Filled") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Filled,
                        value = sampleText,
                        onValueChange = { },
                        trailingContent = {
                            TextFieldScope.Icon(
                                imageVector = KPIcons.Fill.Cancel,
                                onClick = { }
                            )
                        }
                    )
                }
            },
            DesignScreenshotTestContainer("VeryLongTextFieldContent|Outlined") {
                BoxWithHorizontalPadding {
                    KPSingleLineOutlinedTextField(
                        style = KPOutlinedTextFieldStyle.Outlined,
                        value = "This is a very long text field content, so let's see how it behaves with trailing content",
                        onValueChange = { },
                        trailingContent = {
                            TextFieldScope.Text(
                                text = longTrailingText,
                                onClick = { }
                            )
                        }
                    )
                }
            },
        )
    )
}
