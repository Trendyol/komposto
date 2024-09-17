package com.trendyol.design.core.inputfield

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.ArrowDown
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

/**
 * A Composable function to render a dropdown UI component.
 *
 * @param style Style configuration for the Dropdown. It should implement the DropdownStyle interface.
 *              This parameter determines the appearance of the dropdown, including the shape of the outer frame,
 *              the visibility of the label, and other style properties. For example, the styles defined within
 *              TrendyolDropdownStyle represent the customized dropdown styles.
 * @param value The currently selected value in the dropdown.
 * @param modifier Modifier to apply to the Dropdown.
 * @param label The label text to display above the dropdown.
 * @param errorLabel The error message to display below the dropdown when an error occurs.
 * @param isError Indicates whether the dropdown is in an error state.
 * @param enabled Determines if the dropdown is enabled for interaction.
 * @param colors The colors configuration for the dropdown. This parameter allows configuring the colors of the
 *               dropdown component, including the text color, background color, and colors for different states
 *               (such as selected, focused, disabled, etc.). TextFieldColors provides the means to customize
 *               these colors according to the desired visual appearance.
 * @param onClicked Callback for when the dropdown is clicked.
 */
@Composable
public fun Dropdown(
    style: DropdownStyle,
    value: String,
    modifier: Modifier = Modifier,
    label: String? = null,
    errorLabel: String? = null,
    isError: Boolean = false,
    enabled: Boolean = true,
    colors: TextFieldColors = style.outlinedTextFieldColors,
    onClicked: () -> Unit,
) {
    Column(modifier = modifier) {
        TrendyolOutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(
                    enabled = enabled,
                    onClick = onClicked,
                ),
            value = value,
            label = if (!label.isNullOrBlank()) {
                {
                    Text(
                        text = label,
                        overflow = TextOverflow.Ellipsis,
                        softWrap = false,
                    )
                }
            } else null,
            onValueChange = {},
            colors = colors,
            isError = isError,
            isFilled = style is TrendyolDropdownStyle.Filled,
            enabled = enabled,
            singleLine = true,
            readOnly = true,
            trailingIcon = {
                Icon(
                    modifier = Modifier.padding(
                        top = 16.dp,
                        bottom = 16.dp,
                        start = 8.dp,
                        end = 12.dp
                    ),
                    imageVector = Icons.Fill.ArrowDown,
                    size = TrendyolIconSize.XXSmall,
                    tint = if (!enabled && style is TrendyolDropdownStyle.Filled)
                        TrendyolDesign.colors.colorBorder else Color.Unspecified
                )
            }
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
private fun DropdownPreview() {
    PreviewTheme {
        Dropdown(
            modifier = Modifier.padding(16.dp),
            style = TrendyolDropdownStyle.Filled,
            value = "Filled",
            isError = false,
            enabled = true,
            onClicked = {},
        )
    }
}
