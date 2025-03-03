package inputfield

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.inputfield.KPOutlinedTextFieldStyle
import com.trendyol.design.core.inputfield.password.KPInputPasswordField
import com.trendyol.design.core.inputfield.phone.KPInputPhoneNumberField
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

class KPInputPhoneNumberFieldTest : DesignScreenshotTest() {

    @Test
    fun kpInputPhoneNumberFieldCountryCodeTest() = runScreenShotTest(
        testName = "KPInputPhoneNumberField CountryCode Test",
        contents = listOf(
            DesignScreenshotTestContainer("2 Chars") {
                BoxWithHorizontalPadding {
                    KPInputPhoneNumberField(
                        countryCode = "12",
                        number = "5551112233",
                        onCountryCodeClick = {},
                        onValueChange = {},
                    )
                }
            },
            DesignScreenshotTestContainer("3 Chars") {
                BoxWithHorizontalPadding {
                    KPInputPhoneNumberField(
                        countryCode = "123",
                        number = "555111223",
                        onCountryCodeClick = {},
                        onValueChange = {},
                    )
                }
            },
        )
    )

    @Test
    fun kpInputPhoneNumberFieldEnabledTest() = runScreenShotTest(
        testName = "KPInputPhoneNumberField Enabled Test",
        contents = listOf(
            DesignScreenshotTestContainer("enabled=true") {
                BoxWithHorizontalPadding {
                    KPInputPhoneNumberField(
                        countryCode = "12",
                        number = "5551112233",
                        onCountryCodeClick = {},
                        onValueChange = {},
                        enabled = true,
                    )
                }
            },
            DesignScreenshotTestContainer("enabled=false") {
                BoxWithHorizontalPadding {
                    KPInputPhoneNumberField(
                        countryCode = "12",
                        number = "5551112233",
                        onCountryCodeClick = {},
                        onValueChange = {},
                        enabled = false,
                    )
                }
            },
        )
    )

    @Test
    fun kpInputPhoneNumberFieldCountryCodeLabelTest() = runScreenShotTest(
        testName = "KPInputPhoneNumberField CountryCodeLabel Test",
        contents = listOf(
            DesignScreenshotTestContainer("CountryCodeLabel") {
                BoxWithHorizontalPadding {
                    KPInputPhoneNumberField(
                        countryCode = "12",
                        number = "5551112233",
                        onCountryCodeClick = {},
                        onValueChange = {},
                        countryCodeLabel = "CountryCodeLabel"
                    )
                }
            },
        )
    )

    @Test
    fun kpInputPhoneNumberFieldNumberLabelTest() = runScreenShotTest(
        testName = "KPInputPhoneNumberField NumberLabel Test",
        contents = listOf(
            DesignScreenshotTestContainer("NumberLabel") {
                BoxWithHorizontalPadding {
                    KPInputPhoneNumberField(
                        countryCode = "12",
                        number = "5551112233",
                        onCountryCodeClick = {},
                        onValueChange = {},
                        numberLabel = "NumberLabel"
                    )
                }
            },
        )
    )

    @Test
    fun kpInputPhoneNumberFieldErrorTest() = runScreenShotTest(
        testName = "KPInputPhoneNumberField Error Test",
        contents = listOf(
            DesignScreenshotTestContainer("SmallError") {
                BoxWithHorizontalPadding {
                    KPInputPhoneNumberField(
                        countryCode = "12",
                        number = "5551112233",
                        onCountryCodeClick = {},
                        onValueChange = {},
                        error = "error"
                    )
                }
            },
            DesignScreenshotTestContainer("LongError") {
                BoxWithHorizontalPadding {
                    KPInputPhoneNumberField(
                        countryCode = "12",
                        number = "5551112233",
                        onCountryCodeClick = {},
                        onValueChange = {},
                        error = LoremIpsum().values.joinToString(),
                    )
                }
            },
        )
    )

    @Test
    fun kpInputPhoneNumberFieldShapeTest() = runScreenShotTest(
        testName = "KPInputPhoneNumberField Shape Test",
        contents = listOf(
            DesignScreenshotTestContainer("RoundedCornerShape") {
                BoxWithHorizontalPadding {
                    KPInputPhoneNumberField(
                        countryCode = "12",
                        number = "5551112233",
                        onCountryCodeClick = {},
                        onValueChange = {},
                        shape = RoundedCornerShape(16.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("RectangleShape") {
                BoxWithHorizontalPadding {
                    KPInputPhoneNumberField(
                        countryCode = "12",
                        number = "5551112233",
                        onCountryCodeClick = {},
                        onValueChange = {},
                        shape = RectangleShape,
                    )
                }
            },
            DesignScreenshotTestContainer("CutCornerShape") {
                BoxWithHorizontalPadding {
                    KPInputPhoneNumberField(
                        countryCode = "12",
                        number = "5551112233",
                        onCountryCodeClick = {},
                        onValueChange = {},
                        shape = CutCornerShape(8.dp),
                    )
                }
            },
        )
    )

    @Test
    fun kpInputPhoneNumberFieldMaxNumberLengthTest() = runScreenShotTest(
        testName = "KPInputPhoneNumberField MaxNumberLength Test",
        contents = listOf(
            DesignScreenshotTestContainer("maxPhoneNumberLength=6") {
                BoxWithHorizontalPadding {
                    KPInputPhoneNumberField(
                        countryCode = "12",
                        number = "123456",
                        onCountryCodeClick = {},
                        onValueChange = {},
                        maxPhoneNumberLength = 6,
                    )
                }
            },
        )
    )
}