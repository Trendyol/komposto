@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.core.inputfield.phone

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.inputfield.KPDropdown
import com.trendyol.design.core.inputfield.KPDropdownStyle
import com.trendyol.design.core.inputfield.KPOutlinedTextField
import com.trendyol.design.core.inputfield.KPOutlinedTextFieldStyle
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign

/**
 * Composable function representing a phone number input field with customizable appearance and behavior tailored for
 * the Komposto theme.
 *
 * @param countryCode The current value of the country code input field.
 * @param number The current value of the phone number input field.
 * @param onCountryCodeClick Callback invoked when the country code input field is clicked.
 * @param onValueChange Callback invoked when the value of the phone number input field changes.
 * @param modifier Optional [Modifier] that can be applied to the input field.
 * @param enabled Indicates whether the input field is enabled for user interaction.
 * @param countryCodeLabel Optional label for the country code input field.
 * @param numberLabel Optional label for the phone number input field.
 * @param error Optional error message displayed below the input fields if there is an error. If it's null no error
 * will be displayed.
 * @param visualTransformation [VisualTransformation] applied to the phone number input field.
 * @param keyboardActions [KeyboardActions] defining keyboard actions for the phone number input field. If you don't
 * provide one it will clear keyboard after any action.
 * @param interactionSource [MutableInteractionSource] representing the source of user interactions.
 * @param shape Shape of the only phone number input field.
 * @param maxPhoneNumberLength Maximum length allowed for the phone number.
 */
@ExperimentalKompostoApi
@Composable
public fun KPInputPhoneNumberField(
    countryCode: String,
    number: String,
    onCountryCodeClick: () -> Unit,
    onValueChange: ((String) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    countryCodeLabel: String = "",
    numberLabel: String = "",
    error: String? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Phone),
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = MaterialTheme.shapes.small,
    maxPhoneNumberLength: Int = 10,
) {
    Column(
        modifier = modifier,
    ) {
        Row(
            modifier = Modifier.height(44.dp)
        ) {
            KPDropdown(
                style = KPDropdownStyle.FloatingLabelOutlined,
                value = countryCode,
                label = countryCodeLabel,
                isError = error != null,
                enabled = enabled,
                onClick = onCountryCodeClick,
                modifier = Modifier.width(90.dp),
            )
            Spacer(modifier = Modifier.width(8.dp))

            val focusManager = LocalFocusManager.current
            val actionsOfKeyboard = if (keyboardActions == KeyboardActions.Default) {
                KeyboardActions(
                    onAny = { focusManager.clearFocus() }
                )
            } else keyboardActions
            KPOutlinedTextField(
                value = number,
                onValueChange = { value ->
                    if (value.isDigitsOnly() && value.digitsOnly().length <= maxPhoneNumberLength) {
                        onValueChange?.invoke(value)
                    }
                },
                enabled = enabled,
                label = if (numberLabel.isNotBlank()) {
                    {
                        KPText(text = numberLabel)
                    }
                } else null,
                isError = error != null,
                visualTransformation = visualTransformation,
                keyboardOptions = keyboardOptions,
                keyboardActions = actionsOfKeyboard,
                singleLine = true,
                interactionSource = interactionSource,
                shape = shape,
                colors = KPOutlinedTextFieldStyle.Outlined.outlinedTextFieldColors,
            )
        }

        if (enabled && error != null) {
            KPText(
                modifier = Modifier
                    .padding(
                        top = 8.dp,
                        start = 12.dp,
                        end = 12.dp,
                    ),
                text = error,
                style = KPDesign.typography.body1ColorWarning,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

internal fun String.digitsOnly(): String {
    return Regex("[^0-9]").replace(this, "")
}

@Preview(showBackground = true)
@Composable
private fun InputPhoneNumberFieldRTLPreview() {
    PreviewTheme(layoutDirection = LayoutDirection.Rtl) {
        KPInputPhoneNumberField(
            modifier = Modifier.padding(16.dp),
            countryCode = "+٩٦٦",
            number = "٥١٢٣٤٥٦٧٨٩",
            onCountryCodeClick = { },
            onValueChange = { },
            countryCodeLabel = "الرمز",
            numberLabel = "الهاتف"
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DisabledInputPhoneNumberFieldRTLPreview() {
    PreviewTheme(layoutDirection = LayoutDirection.Rtl) {
        KPInputPhoneNumberField(
            modifier = Modifier.padding(16.dp),
            countryCode = "+٩٦٦",
            number = "٥١٢٣٤٥٦٧٨٩",
            onCountryCodeClick = { },
            onValueChange = { },
            countryCodeLabel = "الرمز",
            numberLabel = "الهاتف",
            enabled = false
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ErrorInputPhoneNumberFieldRTLPreview() {
    PreviewTheme(layoutDirection = LayoutDirection.Rtl) {
        KPInputPhoneNumberField(
            modifier = Modifier.padding(16.dp),
            countryCode = "+٩٦٦",
            number = "٥١٢٣٤٥٦٧٨٩",
            onCountryCodeClick = { },
            onValueChange = { },
            countryCodeLabel = "الرمز",
            numberLabel = "الهاتف",
            error = "رقم الهاتف غير صحيح"
        )
    }
}
