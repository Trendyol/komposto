package com.trendyol.design.ui.component.inputfield

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.inputfield.Dropdown
import com.trendyol.design.core.inputfield.TrendyolDropdownStyle
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

private const val LABEL = "Label"
private const val SELECT = "Select"

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_DROPDOWN,
    styleName = "1.Unfocused"
)
@Composable
internal fun Input_Field_3_Dropdown_1_Unfocused() = TrendyolTheme {
    Column {
        Dropdown(
            style = TrendyolDropdownStyle.FloatingLabelOutlined,
            label = LABEL,
            value = "",
            onClicked = {},
        )
        Spacer(modifier = Modifier.height(8.dp))
        Dropdown(
            style = TrendyolDropdownStyle.Outlined,
            value = "",
            onClicked = {},
        )
        Spacer(modifier = Modifier.height(8.dp))
        Dropdown(
            style = TrendyolDropdownStyle.Filled,
            value = "",
            onClicked = {},
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_DROPDOWN,
    styleName = "2.Typed"
)
@Composable
internal fun Input_Field_3_Dropdown_2_Typed() = TrendyolTheme {
    Column {
        Dropdown(
            style = TrendyolDropdownStyle.FloatingLabelOutlined,
            label = LABEL,
            value = SELECT,
            onClicked = {},
        )
        Spacer(modifier = Modifier.height(8.dp))
        Dropdown(
            style = TrendyolDropdownStyle.Outlined,
            value = SELECT,
            onClicked = {},
        )
        Spacer(modifier = Modifier.height(8.dp))
        Dropdown(
            style = TrendyolDropdownStyle.Filled,
            value = SELECT,
            onClicked = {},
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_DROPDOWN,
    styleName = "3.Disabled"
)
@Composable
internal fun Input_Field_3_Dropdown_3_Disabled() = TrendyolTheme {
    Column {
        val value by remember { mutableStateOf("Disabled") }
        Dropdown(
            style = TrendyolDropdownStyle.FloatingLabelOutlined,
            value = value,
            onClicked = {},
            enabled = false,
        )
        Spacer(modifier = Modifier.height(8.dp))
        Dropdown(
            style = TrendyolDropdownStyle.Outlined,
            value = value,
            onClicked = {},
            enabled = false,
        )
        Spacer(modifier = Modifier.height(8.dp))
        Dropdown(
            style = TrendyolDropdownStyle.Filled,
            value = value,
            onClicked = {},
            enabled = false,
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_DROPDOWN,
    styleName = "4.Error"
)
@Composable
internal fun Input_Field_3_Dropdown_4_Error() = TrendyolTheme {
    Column {
        val value by remember { mutableStateOf("Error") }
        Dropdown(
            style = TrendyolDropdownStyle.FloatingLabelOutlined,
            label = LABEL,
            value = value,
            onClicked = {},
            isError = true,
            errorLabel = "Error message goes here",
        )
        Spacer(modifier = Modifier.height(8.dp))
        Dropdown(
            style = TrendyolDropdownStyle.FloatingLabelOutlined,
            value = value,
            onClicked = {},
            isError = true,
            errorLabel = "Error message goes here",
        )
        Spacer(modifier = Modifier.height(8.dp))
        Dropdown(
            style = TrendyolDropdownStyle.Filled,
            value = value,
            onClicked = {},
            isError = true,
            errorLabel = "Error message goes here",
        )
    }
}
