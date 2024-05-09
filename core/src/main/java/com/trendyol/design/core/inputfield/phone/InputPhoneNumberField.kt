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
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import com.trendyol.design.core.inputfield.Dropdown
import com.trendyol.design.core.inputfield.TrendyolDropdownStyle
import com.trendyol.design.core.inputfield.TrendyolOutlinedTextField
import com.trendyol.design.core.inputfield.TrendyolOutlinedTextFieldStyle
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun InputPhoneNumberField(
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
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = MaterialTheme.shapes.small,
    maxPhoneNumberLength: Int = 10,
) {
    Column(
        modifier = modifier.height(44.dp)
    ) {
        Row {
            Dropdown(
                style = TrendyolDropdownStyle.Outlined,
                value = countryCode,
                label = countryCodeLabel,
                isError = error != null,
                enabled = enabled,
                onClicked = onCountryCodeClick,
                modifier = Modifier.width(90.dp),
            )
            Spacer(modifier = Modifier.width(8.dp))

            val focusManager = LocalFocusManager.current
            val actionsOfKeyboard = if (keyboardActions == KeyboardActions.Default) {
                KeyboardActions(
                    onAny = { focusManager.clearFocus() }
                )
            } else keyboardActions
            TrendyolOutlinedTextField(
                value = number,
                onValueChange = { value ->
                    if (value.isDigitsOnly() && value.digitsOnly().length <= maxPhoneNumberLength) {
                        onValueChange?.invoke(value)
                    }
                },
                enabled = enabled,
                textStyle = TrendyolDesign.typography.subtitleMedium,
                label = if (numberLabel.isNotBlank()) {
                    {
                        Text(
                            text = numberLabel,
                            style = TrendyolDesign.typography.body2MediumColorPrimary,
                        )
                    }
                } else null,
                isError = error != null,
                visualTransformation = visualTransformation,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                keyboardActions = actionsOfKeyboard,
                singleLine = true,
                interactionSource = interactionSource,
                shape = shape,
                colors = TrendyolOutlinedTextFieldStyle.Outlined.outlinedTextFieldColors,
                contentPadding = TextFieldDefaults.outlinedTextFieldPadding(
                    top = 14.dp,
                    bottom = 14.dp,
                    start = 12.dp,
                    end = 12.dp
                ),
            )
        }

        if (enabled && error != null) {
            Text(
                modifier = Modifier
                    .padding(
                        top = 8.dp,
                        start = 12.dp,
                        end = 12.dp,
                    ),
                text = error,
                style = TrendyolDesign.typography.body1ColorWarning,
            )
        }
    }
}

internal fun String.digitsOnly(): String {
    return Regex("[^0-9]").replace(this, "")
}
