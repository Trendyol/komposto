@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.core.inputfield.password

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.R
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.inputfield.OutlinedTextFieldStyle
import com.trendyol.design.core.inputfield.KPOutlinedTextField
import com.trendyol.design.core.inputfield.KPOutlinedTextFieldStyle
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign

/**
 * A Composable function for creating a password input field with various customization options.
 * The field allows for toggling between hidden and visible password states.
 *
 * @param style The style to apply to the OutlinedTextField.
 *              This includes properties like colors and label behavior.
 *              Suggested styles: FloatingLabelOutlined, Outlined.
 * @param password The initial password value to be displayed in the input field.
 *                 This is also used to initialize the internal state of the component.
 * @param onValueChange A callback invoked whenever the password value changes.
 *                      This function receives the updated password as a parameter.
 * @param modifier Modifier to apply to the root container of the input field.
 *                 This is optional and defaults to an empty Modifier.
 * @param placeHolder Optional placeholder text displayed when the input field is empty.
 *                    If null or blank, no placeholder will be shown.
 * @param label Optional label text displayed inside the input field.
 *              This is used only when the style is FloatingLabelOutlined.
 * @param errorText Optional error message displayed below the input field.
 *                  This is shown only when the field is enabled and the errorText is not blank.
 * @param enabled A boolean flag indicating whether the input field is enabled or disabled.
 *                When disabled, the input field is not interactive.
 *                This parameter defaults to true.
 * @param mask The character used to mask the password. This defaults to PASSWORD_MASK_CHAR.
 *             The mask is applied only when the password is hidden.
 */
@ExperimentalKompostoApi
@Composable
public fun KPInputPasswordField(
    style: OutlinedTextFieldStyle,
    password: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeHolder: String? = null,
    label: String? = null,
    errorText: String? = null,
    enabled: Boolean = true,
    mask: Char = PASSWORD_MASK_CHAR
) {
    var text by remember { mutableStateOf(password) }
    var checked by remember { mutableStateOf(false) }
    val focusManager = LocalFocusManager.current

    Column(modifier = modifier) {
        KPOutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = text,
            onValueChange = { updatedText ->
                text = updatedText
                onValueChange(updatedText)
            },
            placeholder = if (!placeHolder.isNullOrBlank()) {
                { KPText(text = placeHolder, style = KPDesign.typography.subtitleMedium) }
            } else null,
            label = if (!label.isNullOrBlank() &&
                style is KPOutlinedTextFieldStyle.FloatingLabelOutlined
            ) {
                { KPText(text = label) }
            } else null,
            visualTransformation = if (checked) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation(mask = mask)
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            keyboardActions = KeyboardActions(onDone = { focusManager.clearFocus(force = true) }),
            trailingIcon = {
                IconToggleButton(
                    checked = checked,
                    enabled = enabled,
                    onCheckedChange = { checked = it }
                ) {
                    val vectorRes = if (checked) {
                        R.drawable.ic_password_toggle_shown
                    } else {
                        R.drawable.ic_password_toggle_hidden
                    }

                    KPIcon(
                        imageVector = ImageVector.vectorResource(id = vectorRes),
                        size = KPIconSize.XSmall
                    )
                }
            },
            isError = !errorText.isNullOrBlank(),
            colors = style.outlinedTextFieldColors,
            singleLine = true,
            enabled = enabled,
            textStyle = KPDesign.typography.subtitleMedium
        )

        if (enabled && !errorText.isNullOrBlank()) {
            KPText(
                modifier = Modifier
                    .padding(top = 8.dp, start = 12.dp)
                    .fillMaxWidth(),
                text = errorText,
                style = KPDesign.typography.body1ColorWarning,
                maxLines = 1
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun InputPasswordFieldPreview() {
    PreviewTheme {
        KPInputPasswordField(
            modifier = Modifier.padding(16.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            password = "1234567",
            onValueChange = { }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DisabledInputPasswordFieldPreview() {
    PreviewTheme {
        KPInputPasswordField(
            modifier = Modifier.padding(16.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            password = "1234567",
            enabled = false,
            onValueChange = { }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ErrorInputPasswordFieldPreview() {
    PreviewTheme {
        KPInputPasswordField(
            modifier = Modifier.padding(16.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            password = "1234567",
            errorText = "Unexpected error occured.",
            onValueChange = { }
        )
    }
}

private const val PASSWORD_MASK_CHAR = '\u25CF'
