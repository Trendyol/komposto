package com.trendyol.design.core.inputfield

import androidx.compose.foundation.clickable
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.ArrowDown
import com.trendyol.theme.TrendyolDesign

/**
 * A Composable function to render a dropdown UI component.
 *
 * @param modifier Modifier to apply to the Dropdown.
 * @param style Style configuration for the Dropdown. It should implement the DropdownStyle interface.
 *              This parameter determines the appearance of the dropdown, including the shape of the outer frame,
 *              the visibility of the label, and other style properties. For example, the styles defined within
 *              TrendyolDropdownStyle represent the customized dropdown styles.
 * @param value The currently selected value in the dropdown.
 * @param shouldShowLabel Determines whether the label should be displayed above the dropdown.
 * @param label The label text to display above the dropdown.
 * @param errorLabel The error message to display below the dropdown when an error occurs.
 * @param isError Indicates whether the dropdown is in an error state.
 * @param enabled Determines if the dropdown is enabled for interaction.
 * @param colors The colors configuration for the dropdown. This parameter allows configuring the colors of the
 *               dropdown component, including the text color, background color, and colors for different states
 *               (such as selected, focused, disabled, etc.). TextFieldColors provides the means to customize
 *               these colors according to the desired visual appearance.
 * @param onClicked Callback for when the dropdown is clicked.
 * @param onValueChange Callback for when the selected value changes.
 */
@Composable
fun Dropdown(
    modifier: Modifier = Modifier,
    style: DropdownStyle,
    value: String,
    shouldShowLabel: Boolean = style.shouldShowLabel,
    label: String? = null,
    errorLabel: String? = null,
    isError: Boolean,
    enabled: Boolean = true,
    colors: TextFieldColors = style.outlinedTextFieldColors,
    onClicked: () -> Unit,
    onValueChange: (String) -> Unit,
) {
    var text by rememberSaveable { mutableStateOf(value) }

    Column {
        TrendyolOutlinedTextField(
            modifier = modifier
                .clickable(
                    enabled = enabled,
                    onClick = onClicked,
                ),
            value = text,
            textStyle = TrendyolDesign.typography.subtitleMediumColorOnSurfaceVariant3,
            label = if (shouldShowLabel && !label.isNullOrBlank()) {
                {
                    Text(
                        text = label,
                        style = TrendyolDesign.typography.body2MediumColorPrimary,
                    )
                }
            } else null,
            onValueChange = { selected ->
                text = selected
                onValueChange(selected)
            },
            colors = colors,
            isError = isError,
            isFilled = style is TrendyolDropdownStyle.Filled,
            enabled = enabled,
            singleLine = true,
            readOnly = true,
            trailingIcon = {
                Icon(
                    imageVector = Icons.Fill.ArrowDown,
                    size = TrendyolIconSize.Large,
                )
            }
        )

        if (isError && !errorLabel.isNullOrBlank()) {
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
