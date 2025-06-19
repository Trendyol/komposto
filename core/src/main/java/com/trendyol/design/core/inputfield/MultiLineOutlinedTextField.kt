@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.core.inputfield

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign

/**
 * Composable function to create a multi-line text input field with an outlined style.
 *
 * @param style Style configuration for the TextField. This should be an object implementing the
 *              OutlinedTextFieldStyle interface.
 * @param value The initial value for the TextField.
 * @param modifier Modifier used to shape the TextField.
 * @param maxChar Maximum number of characters allowed in the TextField.
 * @param label The label text to display above the TextField.
 * @param errorLabel The error message to display below the TextField when there is an error.
 * @param isError Indicates whether the TextField is in an error state.
 * @param enabled Determines if the TextField is enabled for interaction.
 * @param colors The colors configuration for the TextField. This parameter allows configuring
 *               the colors of the TextField component, including the text color, background color,
 *               and colors for different states (such as selected, focused, disabled, etc.).
 * @param onValueChange Callback for when the value of the TextField changes.
 */
@ExperimentalKompostoApi
@Composable
public fun KPMultiLineOutlineTextField(
    style: OutlinedTextFieldStyle,
    value: String,
    modifier: Modifier = Modifier,
    maxChar: Int? = null,
    label: String? = null,
    placeholder: String? = null,
    errorLabel: String? = null,
    isError: Boolean = false,
    enabled: Boolean = true,
    colors: TextFieldColors = style.outlinedTextFieldColors,
    onValueChange: (String) -> Unit,
) {
    Column(modifier = modifier.width(IntrinsicSize.Max)) {
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
            singleLine = false,
            maxLines = 4,
            minLines = 4,
            contentPadding = PaddingValues(
                top = 14.dp,
                bottom = 14.dp,
                start = 12.dp,
                end = 12.dp
            )
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 4.dp,
                    start = 12.dp,
                    end = 12.dp,
                    bottom = 4.dp,
                )
        ) {
            if (enabled && isError && !errorLabel.isNullOrBlank()) {
                KPText(
                    modifier = Modifier.weight(1f),
                    text = errorLabel,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    style = KPDesign.typography.body1ColorWarning,
                )
            } else {
                Spacer(modifier = Modifier.weight(1f))
            }

            if (maxChar != null) {
                KPText(
                    text = "${value.length} / $maxChar",
                    style = if (isError) KPDesign.typography.body1ColorWarning
                    else KPDesign.typography.body1ColorOnSurfaceVariant1
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MultiLineOutlineTextFieldPreview() {
    PreviewTheme {
        KPMultiLineOutlineTextField(
            modifier = Modifier.padding(16.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = "Disabled",
            isError = false,
            enabled = false,
            maxChar = 2000,
            onValueChange = {}
        )
    }
}
