package com.trendyol.design.ui.component.inputfield

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.inputfield.otp.InputOTPField
import com.trendyol.design.core.inputfield.otp.TrendyolInputOTPFieldStyle
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_OTP,
    styleName = "1.Unfocused"
)
@Composable
internal fun Input_Field_7_OTP_1_Unfocused() = TrendyolTheme {
    Column {
        InputOTPField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = TrendyolInputOTPFieldStyle.Outline,
            otp = "",
            hint = LABEL,
            onValueChange = { }
        )
        Spacer(modifier = Modifier.height(8.dp))
        InputOTPField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = TrendyolInputOTPFieldStyle.Filled,
            otp = "",
            hint = LABEL,
            onValueChange = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_OTP,
    styleName = "2.Typed"
)
@Composable
internal fun Input_Field_7_OTP_2_Typed() = TrendyolTheme {
    Column {
        InputOTPField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = TrendyolInputOTPFieldStyle.Outline,
            otp = OTP,
            hint = LABEL,
            onValueChange = { }
        )
        Spacer(modifier = Modifier.height(8.dp))
        InputOTPField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = TrendyolInputOTPFieldStyle.Filled,
            otp = OTP,
            hint = LABEL,
            onValueChange = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_OTP,
    styleName = "3. Disabled"
)
@Composable
internal fun Input_Field_7_OTP_3_Disabled() = TrendyolTheme {
    Column {
        InputOTPField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = TrendyolInputOTPFieldStyle.Outline,
            otp = OTP,
            hint = DISABLED,
            enabled = false,
            onValueChange = { }
        )
        Spacer(modifier = Modifier.height(8.dp))
        InputOTPField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = TrendyolInputOTPFieldStyle.Filled,
            otp = OTP,
            hint = DISABLED,
            enabled = false,
            onValueChange = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_OTP,
    styleName = "4. Error"
)
@Composable
internal fun Input_Field_7_OTP_4_Error() = TrendyolTheme {
    Column {
        InputOTPField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = TrendyolInputOTPFieldStyle.Outline,
            otp = OTP,
            hint = LABEL,
            errorText = ERROR,
            onValueChange = { }
        )
        Spacer(modifier = Modifier.height(8.dp))
        InputOTPField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = TrendyolInputOTPFieldStyle.Outline,
            otp = OTP,
            hint = LABEL,
            errorText = ERROR,
            onValueChange = { }
        )
    }
}

private const val LABEL = "Helper text goes here"
private const val OTP = "1907"
private const val DISABLED = "Disabled"
private const val ERROR = "Error message goes here"
private const val MIN_WIDTH = 280
