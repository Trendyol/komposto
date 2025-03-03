package inputfield

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.trendyol.design.core.inputfield.otp.KPInputOTPField
import com.trendyol.design.core.inputfield.otp.KPInputOTPFieldStyle
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

class KPInputOTPFieldTest : DesignScreenshotTest() {

    @Test
    fun kpInputOTPFieldStyleTest() = runScreenShotTest(
        testName = "KPInputOTPField Style Test",
        contents = listOf(
            DesignScreenshotTestContainer("KPInputOTPFieldStyle.Filled") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Filled,
                        otp = "",
                        onValueChange = {},
                    )
                }
            },
            DesignScreenshotTestContainer("KPInputOTPFieldStyle.Outline") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Outline,
                        otp = "",
                        onValueChange = {},
                    )
                }
            },
        )
    )

    @Test
    fun kpInputOTPFieldOTPTextTest() = runScreenShotTest(
        testName = "KPInputOTPField OTPText Test",
        contents = listOf(
            DesignScreenshotTestContainer("Empty") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Outline,
                        otp = "",
                        onValueChange = {},
                    )
                }
            },
            DesignScreenshotTestContainer("Half filled") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Outline,
                        otp = "123",
                        onValueChange = {},
                    )
                }
            },
            DesignScreenshotTestContainer("Full filled") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Outline,
                        otp = "123456",
                        onValueChange = {},
                    )
                }
            },
        )
    )

    @Test
    fun kpInputOTPFieldOTPLengthTest() = runScreenShotTest(
        testName = "KPInputOTPField OTPLength Test",
        contents = listOf(
            DesignScreenshotTestContainer("otpLength=1 Empty") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Outline,
                        otp = "",
                        onValueChange = {},
                        otpLength = 1,
                    )
                }
            },
            DesignScreenshotTestContainer("otpLength=1 Full") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Outline,
                        otp = "1",
                        onValueChange = {},
                        otpLength = 1,
                    )
                }
            },
            DesignScreenshotTestContainer("otpLength=8 Full") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Outline,
                        otp = "12345678",
                        onValueChange = {},
                        otpLength = 8,
                    )
                }
            },
        )
    )

    @Test
    fun kpInputOTPFieldEnabledTest() = runScreenShotTest(
        testName = "KPInputOTPField Enabled Test",
        contents = listOf(
            DesignScreenshotTestContainer("KPInputOTPFieldStyle.Filled|enabled=true") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Filled,
                        otp = "",
                        onValueChange = {},
                        enabled = true,
                    )
                }
            },
            DesignScreenshotTestContainer("KPInputOTPFieldStyle.Outline|enabled=true") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Outline,
                        otp = "",
                        onValueChange = {},
                        enabled = true,
                    )
                }
            },
            DesignScreenshotTestContainer("KPInputOTPFieldStyle.Filled|enabled=false") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Filled,
                        otp = "123456",
                        onValueChange = {},
                        enabled = false,
                    )
                }
            },
            DesignScreenshotTestContainer("KPInputOTPFieldStyle.Outline|enabled=false") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Outline,
                        otp = "123456",
                        onValueChange = {},
                        enabled = false,
                    )
                }
            },
        )
    )

    @Test
    fun kpInputOTPFieldHintTest() = runScreenShotTest(
        testName = "KPInputOTPField Hint Test",
        contents = listOf(
            DesignScreenshotTestContainer("SmallHint") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Filled,
                        otp = "",
                        onValueChange = {},
                        hint = "hint",
                    )
                }
            },
            DesignScreenshotTestContainer("LongHint") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Outline,
                        otp = "123456",
                        onValueChange = {},
                        hint = LoremIpsum().values.joinToString(),
                    )
                }
            },
        )
    )

    @Test
    fun kpInputOTPFieldErrorTest() = runScreenShotTest(
        testName = "KPInputOTPField Error Test",
        contents = listOf(
            DesignScreenshotTestContainer("SmallError") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Outline,
                        otp = "",
                        onValueChange = {},
                        errorText = "error",
                    )
                }
            },
            DesignScreenshotTestContainer("LongError") {
                BoxWithHorizontalPadding {
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Filled,
                        otp = "123456",
                        onValueChange = {},
                        errorText = LoremIpsum().values.joinToString(),
                    )
                }
            },
        )
    )

    @Test
    fun kpInputOTPFieldFocusEmptyTest() = runScreenShotTest(
        testName = "KPInputOTPField Focus Empty Test",
        contents = listOf(
            DesignScreenshotTestContainer("Empty Focus") {
                BoxWithHorizontalPadding {
                    val focusRequester = remember { FocusRequester() }
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Outline,
                        otp = "",
                        onValueChange = {},
                        modifier = Modifier
                            .focusRequester(focusRequester)
                    )

                    LaunchedEffect(Unit) {
                        focusRequester.requestFocus()
                    }
                }
            },
        )
    )

    @Test
    fun kpInputOTPFieldFocusHalfTest() = runScreenShotTest(
        testName = "KPInputOTPField Focus Half Test",
        contents = listOf(
            DesignScreenshotTestContainer("Half filled Focus") {
                BoxWithHorizontalPadding {
                    val focusRequester = remember { FocusRequester() }
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Outline,
                        otp = "123",
                        onValueChange = {},
                        modifier = Modifier.focusRequester(focusRequester)
                    )

                    LaunchedEffect(Unit) {
                        focusRequester.requestFocus()
                    }
                }
            },
        )
    )

    @Test
    fun kpInputOTPFieldFocusFullTest() = runScreenShotTest(
        testName = "KPInputOTPField Focus Full Test",
        contents = listOf(
            DesignScreenshotTestContainer("Full filled Focus") {
                BoxWithHorizontalPadding {
                    val focusRequester = remember { FocusRequester() }
                    KPInputOTPField(
                        style = KPInputOTPFieldStyle.Outline,
                        otp = "123456",
                        onValueChange = {},
                        modifier = Modifier.focusRequester(focusRequester)
                    )

                    LaunchedEffect(Unit) {
                        focusRequester.requestFocus()
                    }
                }
            },
        )
    )
}