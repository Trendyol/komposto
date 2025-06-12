@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.ui.component.inputfield

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.inputfield.KPSingleLineOutlinedTextField
import com.trendyol.design.core.inputfield.KPOutlinedTextFieldStyle
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

private const val LABEL = "Label"
private const val WRITE_HERE = "Write here"
private const val MIN_WIDTH = 280

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_SINGLE_LINE,
    styleName = "1.Unfocused"
)
@Composable
internal fun Input_Field_1_SingleLine_1_Unfocused() = TrendyolTheme {
    Column {
        var value by remember { mutableStateOf("") }
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            label = LABEL,
            value = value,
            onValueChange = {
                value = it
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Outlined,
            value = value,
            placeholder = WRITE_HERE,
            onValueChange = {
                value = it
            },
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = value,
            placeholder = WRITE_HERE,
            onValueChange = {
                value = it
            },
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_SINGLE_LINE,
    styleName = "2.Typed"
)
@Composable
internal fun Input_Field_1_SingleLine_2_Typed() = TrendyolTheme {
    Column {
        var value by remember { mutableStateOf("Filled") }
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            label = LABEL,
            value = value,
            onValueChange = {
                value = it
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Outlined,
            value = value,
            placeholder = WRITE_HERE,
            onValueChange = {
                value = it
            },
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = value,
            placeholder = WRITE_HERE,
            onValueChange = {
                value = it
            },
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_SINGLE_LINE,
    styleName = "3.Disabled"
)
@Composable
internal fun Input_Field_1_SingleLine_3_Disabled() = TrendyolTheme {
    Column {
        var value by remember { mutableStateOf("Disabled") }
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            value = value,
            onValueChange = {
                value = it
            },
            enabled = false,
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Outlined,
            value = value,
            onValueChange = {
                value = it
            },
            enabled = false,
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = value,
            onValueChange = {
                value = it
            },
            enabled = false,
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_SINGLE_LINE,
    styleName = "4.Error"
)
@Composable
internal fun Input_Field_1_SingleLine_4_Error() = TrendyolTheme {
    Column {
        var value by remember { mutableStateOf("Error") }
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            label = LABEL,
            value = value,
            onValueChange = {
                value = it
            },
            isError = true,
            errorLabel = "Error message goes here",
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            value = value,
            onValueChange = {
                value = it
            },
            isError = true,
            errorLabel = "Error message goes here",
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = value,
            onValueChange = {
                value = it
            },
            isError = true,
            errorLabel = "Error message goes here",
        )
    }
}
