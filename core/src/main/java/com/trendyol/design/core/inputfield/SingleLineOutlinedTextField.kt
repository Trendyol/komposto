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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.theme.TrendyolDesign

@Composable
fun SingleLineOutlinedTextField(
    modifier: Modifier,
    style: OutlinedTextFieldStyle,
    value: String,
    shouldShowLabel: Boolean = style.shouldShowLabel,
    label: String? = null,
    errorLabel: String? = null,
    isError: Boolean,
    enabled: Boolean = true,
    colors: TextFieldColors = style.outlinedTextFieldColors,
) {
    var text by rememberSaveable { mutableStateOf(value) }

    Column {
        TrendyolOutlinedTextField(
            modifier = modifier,
            value = text,
            textStyle = TrendyolDesign.typography.subtitleMediumColorOnSurfaceVariant3,
            label = if (shouldShowLabel && !label.isNullOrBlank()){
                {
                    Text(
                        text = label,
                        style = TrendyolDesign.typography.body2MediumColorPrimary,
                    )
                }
            } else null,
            onValueChange = {
                text = it
            },
            colors = colors,
            isError = isError,
            isFilled = style is TrendyolOutlinedTextFieldStyle.Filled,
            enabled = enabled,
            singleLine = true,
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
