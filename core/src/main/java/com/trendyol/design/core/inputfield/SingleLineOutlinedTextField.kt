package com.trendyol.design.core.inputfield

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Cancel
import com.trendyol.design.core.icon.icons.fill.Search
import com.trendyol.design.core.inputfield.container.CheckTextFieldLayoutIds
import com.trendyol.design.core.inputfield.container.TrailingIconLayoutId
import com.trendyol.design.core.inputfield.container.TextFieldScope
import com.trendyol.design.core.inputfield.container.TrailingTextLayoutId
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.KPText
import com.trendyol.design.core.text.Text
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign
import kotlinx.collections.immutable.persistentSetOf

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
 * @param trailingContent Optional trailing container that can be either a KPIcon or KPText.
 *                         The container will be placed at the end of the TextField.
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
    trailingContent: (@Composable TextFieldScope.() -> Unit)? = null,
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
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            } else null,
            onValueChange = onValueChange,
            colors = colors,
            isError = isError,
            isFilled = style is KPOutlinedTextFieldStyle.Filled,
            enabled = enabled,
            singleLine = true,
            trailingIcon = if (trailingContent != null) {
                {
                    Box(
                        modifier = Modifier
                            .widthIn(max = 110.dp)
                            .padding(horizontal = 12.dp)
                            .heightIn(max = 44.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        CheckTextFieldLayoutIds(
                            persistentSetOf(TrailingIconLayoutId, TrailingTextLayoutId),
                            isSingleChildRequired = true,
                            errorMessage = "Trailing content should be instance of KPIcon or KPText"
                        ) {
                            trailingContent(TextFieldScope)
                        }
                        trailingContent(TextFieldScope)
                    }
                }
            } else null
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
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
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

@Preview(showBackground = true)
@Composable
private fun SingleLineOutlinedTextFieldWithTrailingIconPreview() {
    PreviewTheme {
        KPSingleLineOutlinedTextField(
            modifier = Modifier.padding(16.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = "Arama yapın",
            onValueChange = {},
            trailingContent = {
                TrailingIcon(
                    imageVector = KPIcons.Fill.Search,
                    onClick = {},
                    size = KPIconSize.Small
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SingleLineOutlinedTextFieldWithTrailingTextPreview() {
    PreviewTheme {
        KPSingleLineOutlinedTextField(
            modifier = Modifier.padding(16.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = "",
            placeholder = "Kullanıcı Kimliği",
            onValueChange = {},
            trailingContent = {
                TrailingText(
                    text = "Nasıl Alınır?",
                    style = KPDesign.typography.body1MediumColorOnSurfaceVariant2,
                    onClick = {}
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SingleLineOutlinedTextFieldWithErrorAndTrailingIconPreview() {
    PreviewTheme {
        KPSingleLineOutlinedTextField(
            modifier = Modifier.padding(16.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = "Hatalı değer",
            onValueChange = {},
            isError = true,
            errorLabel = "Lütfen geçerli bir değer girin",
            trailingContent = {
                TrailingIcon(
                    imageVector = KPIcons.Fill.Cancel,
                    onClick = {},
                    size = KPIconSize.Small,
                    tint = KPDesign.colors.colorWarning
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SingleLineOutlinedTextFieldWithErrorAndTrailingTextPreview() {
    PreviewTheme {
        KPSingleLineOutlinedTextField(
            modifier = Modifier.padding(16.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = "Hatalı değer",
            onValueChange = {},
            isError = true,
            errorLabel = "Lütfen geçerli bir değer girin",
            trailingContent = {
                TrailingText(
                    text = "TL",
                    onClick = {},
                    style = KPDesign.typography.subtitleMediumColorWarning
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SingleLineOutlinedTextFieldDisabledWithTrailingIconPreview() {
    PreviewTheme {
        KPSingleLineOutlinedTextField(
            modifier = Modifier.padding(16.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = "Disabled",
            enabled = false,
            onValueChange = {},
            trailingContent = {
                TrailingIcon(
                    imageVector = KPIcons.Fill.Search,
                    onClick = {},
                    size = KPIconSize.Small,
                    tint = KPDesign.colors.colorOnSurfaceVariant3
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SingleLineOutlinedTextFieldDisabledWithTrailingTextPreview() {
    PreviewTheme {
        KPSingleLineOutlinedTextField(
            modifier = Modifier.padding(16.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = "Disabled",
            enabled = false,
            onValueChange = {},
            trailingContent = {
                TrailingText(
                    text = "TL",
                    onClick = {},
                    style = KPDesign.typography.subtitleMediumColorOnSurfaceVariant2
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SingleLineOutlinedTextFieldWithLabelAndTrailingIconPreview() {
    PreviewTheme {
        KPSingleLineOutlinedTextField(
            modifier = Modifier.padding(16.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = "Değer",
            label = "Label",
            onValueChange = {},
            trailingContent = {
                TrailingIcon(
                    imageVector = KPIcons.Fill.Search,
                    onClick = {},
                    size = KPIconSize.Small
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SingleLineOutlinedTextFieldWithLabelAndTrailingTextPreview() {
    PreviewTheme {
        KPSingleLineOutlinedTextField(
            modifier = Modifier.padding(16.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = "Değer",
            label = "Label",
            onValueChange = {},
            trailingContent = {
                TrailingText(
                    text = "TL",
                    onClick = {}
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SingleLineOutlinedTextFieldWithPlaceholderAndTrailingIconPreview() {
    PreviewTheme {
        KPSingleLineOutlinedTextField(
            modifier = Modifier.padding(16.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = "",
            placeholder = "Placeholder",
            onValueChange = {},
            trailingContent = {
                TrailingIcon(
                    imageVector = KPIcons.Fill.Search,
                    onClick = {},
                    size = KPIconSize.Small
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SingleLineOutlinedTextFieldWithPlaceholderAndTrailingTextPreview() {
    PreviewTheme {
        KPSingleLineOutlinedTextField(
            modifier = Modifier.padding(16.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = "",
            placeholder = "PlaceholderPlaceholderPlaceholdePlaceholderPlaceholderPlaceholde",
            onValueChange = {},
            trailingContent = {
                TrailingText(
                    text = "TrailingTrailingTrailing",
                    style = KPDesign.typography.body1Medium,
                    onClick = {}
                )
            }
        )
    }
}
