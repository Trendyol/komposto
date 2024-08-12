package com.trendyol.design.ui.component.inputfield

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.inputfield.TrendyolOutlinedTextFieldStyle
import com.trendyol.design.core.inputfield.password.InputPasswordField
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_PASSWORD,
    styleName = "1.Unfocused"
)
@Composable
internal fun Input_Field_6_Password_1_Unfocused() = TrendyolTheme {
    Column {
        InputPasswordField(
            style = TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined,
            password = "",
            label = LABEL,
            onValueChange = { }
        )
        Spacer(modifier = Modifier.height(8.dp))
        InputPasswordField(
            style = TrendyolOutlinedTextFieldStyle.Outlined,
            password = "",
            placeHolder = LABEL,
            onValueChange = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_PASSWORD,
    styleName = "2.Typed"
)
@Composable
internal fun Input_Field_6_Password_2_Typed() = TrendyolTheme {
    Column {
        InputPasswordField(
            style = TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined,
            password = TEXT,
            label = LABEL,
            onValueChange = { }
        )
        Spacer(modifier = Modifier.height(8.dp))
        InputPasswordField(
            style = TrendyolOutlinedTextFieldStyle.Outlined,
            password = TEXT,
            placeHolder = LABEL,
            onValueChange = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_PASSWORD,
    styleName = "3. Disabled"
)
@Composable
internal fun Input_Field_6_Password_3_Disabled() = TrendyolTheme {
    Column {
        InputPasswordField(
            style = TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined,
            password = DISABLED,
            label = LABEL,
            enabled = false,
            onValueChange = { }
        )
        Spacer(modifier = Modifier.height(8.dp))
        InputPasswordField(
            style = TrendyolOutlinedTextFieldStyle.Outlined,
            password = DISABLED,
            placeHolder = LABEL,
            enabled = false,
            onValueChange = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_PASSWORD,
    styleName = "4. Error"
)
@Composable
internal fun Input_Field_6_Password_4_Error() = TrendyolTheme {
    Column {
        InputPasswordField(
            style = TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined,
            password = TEXT,
            label = LABEL,
            errorText = ERROR,
            onValueChange = { }
        )
        Spacer(modifier = Modifier.height(8.dp))
        InputPasswordField(
            style = TrendyolOutlinedTextFieldStyle.Outlined,
            password = TEXT,
            placeHolder = LABEL,
            errorText = ERROR,
            onValueChange = { }
        )
    }
}

private const val LABEL = "Label"
private const val TEXT = "Text"
private const val DISABLED = "Disabled"
private const val ERROR = "Error message goes here"
