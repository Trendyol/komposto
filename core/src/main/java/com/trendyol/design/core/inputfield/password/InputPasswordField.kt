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
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.inputfield.OutlinedTextFieldStyle
import com.trendyol.design.core.inputfield.TrendyolOutlinedTextField
import com.trendyol.design.core.inputfield.TrendyolOutlinedTextFieldStyle
import com.trendyol.design.core.previewtheme.PreviewTheme
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

@Composable
fun InputPasswordField(
    style: OutlinedTextFieldStyle,
    password: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeHolder: String? = null,
    label: String? = null,
    errorMessage: String? = null,
    enabled: Boolean = true,
    mask: Char = PASSWORD_MASK_CHAR
) {
    var text by remember { mutableStateOf(password) }
    var checked by remember { mutableStateOf(false) }
    val focusManager = LocalFocusManager.current

    Column(modifier = modifier) {
        TrendyolOutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = text,
            onValueChange = { updatedText ->
                text = updatedText
                onValueChange(updatedText)
            },
            placeholder = if (!placeHolder.isNullOrBlank()) {
                { Text(text = placeHolder, style = TrendyolDesign.typography.subtitleMedium) }
            } else null,
            label = if (!label.isNullOrBlank() &&
                style is TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined
            ) {
                { Text(text = label) }
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

                    Icon(
                        imageVector = ImageVector.vectorResource(id = vectorRes),
                        size = TrendyolIconSize.XSmall
                    )
                }
            },
            isError = !errorMessage.isNullOrBlank(),
            colors = style.outlinedTextFieldColors,
            singleLine = true,
            enabled = enabled,
            textStyle = TrendyolDesign.typography.subtitleMedium
        )

        if (enabled && !errorMessage.isNullOrBlank()) {
            Text(
                modifier = Modifier
                    .padding(top = 8.dp, start = 12.dp)
                    .fillMaxWidth(),
                text = errorMessage,
                style = TrendyolDesign.typography.body1ColorWarning,
                maxLines = 1
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun InputPasswordFieldPreview() {
    PreviewTheme {
        InputPasswordField(
            modifier = Modifier.padding(16.dp),
            style = TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined,
            password = "1234567",
            onValueChange = { }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DisabledInputPasswordFieldPreview() {
    PreviewTheme {
        InputPasswordField(
            modifier = Modifier.padding(16.dp),
            style = TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined,
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
        InputPasswordField(
            modifier = Modifier.padding(16.dp),
            style = TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined,
            password = "1234567",
            errorMessage = "Unexpected error occured.",
            onValueChange = { }
        )
    }
}

private const val PASSWORD_MASK_CHAR = '\u25CF'