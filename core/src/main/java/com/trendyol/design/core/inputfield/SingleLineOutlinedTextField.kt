package com.trendyol.design.core.inputfield

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.KPText
import com.trendyol.design.core.text.Text
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign

/**
 * Composable function to create a single-line text input field with an outlined style.
 *
 * @param style Style configuration for the TextField. This should be an object implementing the
 *              OutlinedTextFieldStyle interface.
 * @param value The initial value for the TextField.
 * @param modifier Modifier used to shape the TextField.
 * @param label The label text to display above the TextField.
 * @param errorLabel The error message to display below the TextField when there is an error.
 * @param isError Indicates whether the TextField is in an error state.
 * @param enabled Determines if the TextField is enabled for interaction.
 * @param colors The colors configuration for the TextField. This parameter allows configuring
 *               the colors of the TextField component, including the text color, background color,
 *               and colors for different states (such as selected, focused, disabled, etc.).
 * @param onValueChange Callback for when the value of the TextField changes.
 */
@Composable
public fun KPSingleLineOutlinedTextField(
    style: OutlinedTextFieldStyle,
    value: String,
    modifier: Modifier = Modifier,
    label: String? = null,
    placeholder: String? = null,
    errorLabel: String? = null,
    isError: Boolean = false,
    enabled: Boolean = true,
    colors: TextFieldColors = style.outlinedTextFieldColors,
    onValueChange: (String) -> Unit,
) {
    Column(modifier = modifier) {
        KPOutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = value,
            label = if (!label.isNullOrBlank()) {
                {
                    KPText(text = label)
                }
            } else null,
            placeholder = if (!placeholder.isNullOrBlank()) {
                {
                    KPText(
                        text = placeholder,
                        style = KPDesign.typography.subtitleMedium,
                    )
                }
            } else null,
            onValueChange = onValueChange,
            colors = colors,
            isError = isError,
            isFilled = style is KPOutlinedTextFieldStyle.Filled,
            enabled = enabled,
            singleLine = true,
        )

        if (enabled && isError && !errorLabel.isNullOrBlank()) {
            KPText(
                modifier = Modifier
                    .padding(
                        top = 8.dp,
                        start = 12.dp,
                        end = 12.dp,
                    )
                    .fillMaxWidth(),
                text = errorLabel,
                style = KPDesign.typography.body1ColorWarning,
            )
        }
    }
}

/**
 * Composable function to create a single-line text input field with an outlined style.
 *
 * @param style Style configuration for the TextField. This should be an object implementing the
 *              OutlinedTextFieldStyle interface.
 * @param value The initial value for the TextField.
 * @param modifier Modifier used to shape the TextField.
 * @param label The label text to display above the TextField.
 * @param errorLabel The error message to display below the TextField when there is an error.
 * @param isError Indicates whether the TextField is in an error state.
 * @param enabled Determines if the TextField is enabled for interaction.
 * @param colors The colors configuration for the TextField. This parameter allows configuring
 *               the colors of the TextField component, including the text color, background color,
 *               and colors for different states (such as selected, focused, disabled, etc.).
 * @param onValueChange Callback for when the value of the TextField changes.
 */
@Composable
@Deprecated(
    message = "Use KPSingleLineOutlinedTextField instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun SingleLineOutlinedTextField(
    style: OutlinedTextFieldStyle,
    value: String,
    modifier: Modifier = Modifier,
    label: String? = null,
    placeholder: String? = null,
    errorLabel: String? = null,
    isError: Boolean = false,
    enabled: Boolean = true,
    colors: TextFieldColors = style.outlinedTextFieldColors,
    onValueChange: (String) -> Unit,
) {
    Column(modifier = modifier) {
        KPOutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = value,
            label = if (!label.isNullOrBlank()) {
                {
                    Text(text = label)
                }
            } else null,
            placeholder = if (!placeholder.isNullOrBlank()) {
                {
                    Text(
                        text = placeholder,
                        style = TrendyolDesign.typography.subtitleMedium,
                    )
                }
            } else null,
            onValueChange = onValueChange,
            colors = colors,
            isError = isError,
            isFilled = style is TrendyolOutlinedTextFieldStyle.Filled,
            enabled = enabled,
            singleLine = true,
        )

        if (enabled && isError && !errorLabel.isNullOrBlank()) {
            Text(
                modifier = Modifier
                    .padding(
                        top = 8.dp,
                        start = 12.dp,
                        end = 12.dp,
                    )
                    .fillMaxWidth(),
                text = errorLabel,
                style = TrendyolDesign.typography.body1ColorWarning,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SingleLineOutlinedTextFieldPreview() {
    PreviewTheme {
        KPSingleLineOutlinedTextField(
            modifier = Modifier.padding(16.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = "Disabled",
            isError = false,
            enabled = false,
            onValueChange = {}
        )
    }
}
