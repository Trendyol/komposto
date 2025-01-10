package com.trendyol.design.ui.component.input

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
import com.trendyol.design.core.inputfield.email.KPInputEmailField
import com.trendyol.design.core.text.KPText
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.KPDesign

private const val LABEL = "Label"
private const val ENTER = "Write here"
private const val MIN_WIDTH = 280

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_EMAIL,
    styleName = "1.Unfocused"
)
@Composable
internal fun Input_Field_1_Email_Unfocused() = TrendyolTheme {
    Column {
        var email by remember { mutableStateOf("") }
        KPInputEmailField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            email = email,
            placeholder = {
                KPText(
                    text = ENTER,
                    style = KPDesign.typography.subtitleMedium,
                )
            },
            onValueChange = {
                email = it
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPInputEmailField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            email = email,
            onValueChange = {
                email = it
            },
            label = {
                KPText(text = LABEL)
            }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_EMAIL,
    styleName = "2.Filled"
)
@Composable
internal fun Input_Field_Email_Filled() = TrendyolTheme {
    Column {
        var email by remember { mutableStateOf("Text") }
        KPInputEmailField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            email = email,
            onValueChange = {
                email = it
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPInputEmailField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            email = email,
            onValueChange = {
                email = it
            },
            label = {
                KPText(text = LABEL)
            },
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_EMAIL,
    styleName = "3.Disabled"
)
@Composable
internal fun Input_Field_Email_Disabled() = TrendyolTheme {
    Column {
        var email by remember { mutableStateOf("Text") }
        KPInputEmailField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            email = email,
            onValueChange = {
                email = it
            },
            enabled = false,
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPInputEmailField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            email = email,
            onValueChange = {
                email = it
            },
            label = {
                KPText(text = LABEL)
            },
            enabled = false,
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_EMAIL,
    styleName = "4.Error"
)
@Composable
internal fun Input_Field_Email_Error() = TrendyolTheme {
    Column {
        var email by remember { mutableStateOf("Text") }
        KPInputEmailField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            email = email,
            onValueChange = {
                email = it
            },
            error = "Error message goes here"
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPInputEmailField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            email = email,
            onValueChange = {
                email = it
            },
            label = {
                KPText(text = LABEL)
            },
            error = "Error message goes here"
        )
    }
}
