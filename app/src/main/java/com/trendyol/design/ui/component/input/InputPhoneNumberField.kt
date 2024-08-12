package com.trendyol.design.ui.component.input

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.inputfield.phone.InputPhoneNumberField
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

private const val LABEL = "Label"
private const val SELECT = "Select"
private const val NUMBER = "5551234567"

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_PHONE_NUMBER,
    styleName = "1.Unfocused"
)
@Composable
internal fun Input_Field_1_PhoneNumber_Unfocused() = TrendyolTheme {
    Column {
        var number by remember { mutableStateOf("") }
        InputPhoneNumberField(
            countryCode = "+90",
            number = SELECT,
            onCountryCodeClick = { /*TODO*/ },
            onValueChange = { number = it }
        )
        Spacer(modifier = Modifier.height(16.dp))
        InputPhoneNumberField(
            countryCode = "",
            number = number,
            onCountryCodeClick = { /*TODO*/ },
            onValueChange = { number = it },
            countryCodeLabel = LABEL,
            numberLabel = LABEL,
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_PHONE_NUMBER,
    styleName = "2.Filled"
)
@Composable
internal fun Input_Field_PhoneNumber_Filled() = TrendyolTheme {
    Column {
        var number by remember { mutableStateOf(NUMBER) }
        InputPhoneNumberField(
            countryCode = "+90",
            number = number,
            onCountryCodeClick = { /*TODO*/ },
            onValueChange = { number = it }
        )
        Spacer(modifier = Modifier.height(16.dp))
        InputPhoneNumberField(
            countryCode = "+90",
            number = number,
            onCountryCodeClick = { /*TODO*/ },
            onValueChange = { number = it },
            countryCodeLabel = LABEL,
            numberLabel = LABEL,
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_PHONE_NUMBER,
    styleName = "3.Disabled"
)
@Composable
internal fun Input_Field_PhoneNumber_Disabled() = TrendyolTheme {
    Column {
        var number by remember { mutableStateOf(NUMBER) }
        InputPhoneNumberField(
            countryCode = "+90",
            number = number,
            onCountryCodeClick = { /*TODO*/ },
            onValueChange = { number = it },
            enabled = false,
        )
        Spacer(modifier = Modifier.height(16.dp))
        InputPhoneNumberField(
            countryCode = "+90",
            number = number,
            onCountryCodeClick = { /*TODO*/ },
            onValueChange = { number = it },
            countryCodeLabel = LABEL,
            numberLabel = LABEL,
            enabled = false,
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_PHONE_NUMBER,
    styleName = "4.Error"
)
@Composable
internal fun Input_Field_PhoneNumber_Error() = TrendyolTheme {
    Column {
        var number by remember { mutableStateOf(NUMBER) }
        InputPhoneNumberField(
            countryCode = "+90",
            number = number,
            onCountryCodeClick = { /*TODO*/ },
            onValueChange = { number = it },
            error = "Error message goes here",
        )
        Spacer(modifier = Modifier.height(16.dp))
        InputPhoneNumberField(
            countryCode = "+90",
            number = number,
            onCountryCodeClick = { /*TODO*/ },
            onValueChange = { number = it },
            countryCodeLabel = LABEL,
            numberLabel = LABEL,
            error = "Error message goes here",
        )
    }
}
