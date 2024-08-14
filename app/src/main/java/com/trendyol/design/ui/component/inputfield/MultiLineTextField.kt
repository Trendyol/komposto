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
import com.trendyol.design.core.inputfield.MultiLineOutlineTextField
import com.trendyol.design.core.inputfield.TrendyolOutlinedTextFieldStyle
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

private const val LABEL = "Label"
private const val WRITE_HERE = "Write here"
private const val MIN_WIDTH = 280

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_MULTI_LINE,
    styleName = "1.Unfocused"
)
@Composable
internal fun Input_Field_2_MultiLine_1_Unfocused() = TrendyolTheme {
    Column {
        var value by remember { mutableStateOf("") }
        MultiLineOutlineTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined,
            label = LABEL,
            value = value,
            maxChar = 2000,
            onValueChange = {
                value = it
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        MultiLineOutlineTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = TrendyolOutlinedTextFieldStyle.Outlined,
            placeholder = WRITE_HERE,
            value = value,
            maxChar = 2000,
            onValueChange = {
                value = it
            },
        )
        Spacer(modifier = Modifier.height(8.dp))
        MultiLineOutlineTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = TrendyolOutlinedTextFieldStyle.Filled,
            placeholder = WRITE_HERE,
            value = value,
            maxChar = 2000,
            onValueChange = {
                value = it
            },
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_MULTI_LINE,
    styleName = "2.Typed"
)
@Composable
internal fun Input_Field_2_MultiLine_2_Typed() = TrendyolTheme {
    Column {
        var value by remember { mutableStateOf("Filled") }
        MultiLineOutlineTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined,
            label = LABEL,
            value = value,
            maxChar = 2000,
            onValueChange = {
                value = it
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        MultiLineOutlineTextField(
            style = TrendyolOutlinedTextFieldStyle.Outlined,
            placeholder = WRITE_HERE,
            value = value,
            maxChar = 2000,
            onValueChange = {
                value = it
            },
        )
        Spacer(modifier = Modifier.height(8.dp))
        MultiLineOutlineTextField(
            style = TrendyolOutlinedTextFieldStyle.Filled,
            placeholder = WRITE_HERE,
            value = value,
            maxChar = 2000,
            onValueChange = {
                value = it
            },
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_MULTI_LINE,
    styleName = "3.Disabled"
)
@Composable
internal fun Input_Field_2_MultiLine_3_Disabled() = TrendyolTheme {
    Column {
        var value by remember { mutableStateOf("Disabled") }
        MultiLineOutlineTextField(
            style = TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined,
            value = value,
            maxChar = 2000,
            onValueChange = {
                value = it
            },
            enabled = false,
        )
        Spacer(modifier = Modifier.height(8.dp))
        MultiLineOutlineTextField(
            style = TrendyolOutlinedTextFieldStyle.Outlined,
            value = value,
            maxChar = 2000,
            onValueChange = {
                value = it
            },
            enabled = false,
        )
        Spacer(modifier = Modifier.height(8.dp))
        MultiLineOutlineTextField(
            style = TrendyolOutlinedTextFieldStyle.Filled,
            value = value,
            maxChar = 2000,
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
    name = Component.INPUT_FIELD_MULTI_LINE,
    styleName = "4.Error"
)
@Composable
internal fun Input_Field_2_MultiLine_4_Error() = TrendyolTheme {
    Column {
        var value by remember { mutableStateOf("Error") }
        MultiLineOutlineTextField(
            style = TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined,
            label = LABEL,
            value = value,
            maxChar = 2000,
            onValueChange = {
                value = it
            },
            isError = true,
            errorLabel = "Error message goes here",
        )
        Spacer(modifier = Modifier.height(8.dp))
        MultiLineOutlineTextField(
            style = TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined,
            value = value,
            maxChar = 2000,
            onValueChange = {
                value = it
            },
            isError = true,
            errorLabel = "Error message goes here",
        )
        Spacer(modifier = Modifier.height(8.dp))
        MultiLineOutlineTextField(
            style = TrendyolOutlinedTextFieldStyle.Filled,
            value = value,
            maxChar = 2000,
            onValueChange = {
                value = it
            },
            isError = true,
            errorLabel = "Error message goes here",
        )
    }
}
