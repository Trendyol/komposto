package com.trendyol.design.ui.component.inputfield

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.inputfield.KPOutlinedTextFieldStyle
import com.trendyol.design.core.inputfield.password.KPInputPasswordField
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
        KPInputPasswordField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            password = "",
            label = LABEL,
            onValueChange = { }
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPInputPasswordField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Outlined,
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
        KPInputPasswordField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            password = TEXT,
            label = LABEL,
            onValueChange = { }
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPInputPasswordField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Outlined,
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
        KPInputPasswordField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            password = DISABLED,
            label = LABEL,
            enabled = false,
            onValueChange = { }
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPInputPasswordField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Outlined,
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
        KPInputPasswordField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            password = TEXT,
            label = LABEL,
            errorText = ERROR,
            onValueChange = { }
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPInputPasswordField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Outlined,
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
private const val MIN_WIDTH = 280
