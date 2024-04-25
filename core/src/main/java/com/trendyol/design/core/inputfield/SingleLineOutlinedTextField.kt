package com.trendyol.design.core.inputfield

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.theme.TrendyolDesign

/**
 * Composable function to create a single-line text input field with an outlined style.
 *
 * @param modifier Modifier used to shape the TextField.
 * @param style Style configuration for the TextField. This should be an object implementing the
 *              OutlinedTextFieldStyle interface.
 * @param value The initial value for the TextField.
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
fun SingleLineOutlinedTextField(
    modifier: Modifier = Modifier,
    style: OutlinedTextFieldStyle,
    value: String,
    label: String? = null,
    placeholder: String? = null,
    errorLabel: String? = null,
    isError: Boolean = false,
    enabled: Boolean = true,
    colors: TextFieldColors = style.outlinedTextFieldColors,
    onValueChange: (String) -> Unit,
) {
    var text by rememberSaveable { mutableStateOf(value) }

    Column {
        TrendyolOutlinedTextField(
            modifier = modifier.fillMaxWidth().align(Alignment.CenterHorizontally),
            value = text,
            textStyle = TrendyolDesign.typography.subtitleMediumColorOnSurfaceVariant3,
            label = if (!label.isNullOrBlank()) {
                {
                    Text(
                        text = label,
                        style = TrendyolDesign.typography.body2MediumColorPrimary,
                    )
                }
            } else null,
            placeholder = if (!placeholder.isNullOrBlank()) {
                { Text(text = placeholder) }
            } else null,
            onValueChange = { changedValue ->
                text = changedValue
                onValueChange(changedValue)
            },
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
