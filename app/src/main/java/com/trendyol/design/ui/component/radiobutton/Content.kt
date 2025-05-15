@file:SuppressWarnings("MagicNumber")
package com.trendyol.design.ui.component.radiobutton

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.radiobutton.KPRadioButton
import com.trendyol.design.core.radiobutton.KPRadioButtonContainerType
import com.trendyol.design.core.radiobutton.KPRadioButtonSize
import com.trendyol.design.core.text.KPText
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.KPDesign

private val dividerPadding = 8.dp
internal val radioButtonTexts = listOf(
    "This is enable unselect radio button example with text usage",
    "This is selected radio button example with text usage",
    "This is disable unselect radio button example with text usage",
    "This is disable selected radio button example with text usage",
    "This is top aligned radio button example with text usage",
    "This is bottom aligned radio button example with text usage",
)
private fun content(text: String): @Composable () -> Unit = {
    Column(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = KPDesign.colors.colorBorder,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Row {
            KPText(text = text)
        }
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_CONTENT, styleName = "1.XSmall")
@Composable
internal fun Radio_Button_3_Content_XSmall() = TrendyolTheme {
    Column {
        KPRadioButton(
            selected = false,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[0])),
            size = KPRadioButtonSize.XSmall,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[1])),
            size = KPRadioButtonSize.XSmall,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = false,
            enabled = false,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[2])),
            size = KPRadioButtonSize.XSmall,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            enabled = false,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[3])),
            size = KPRadioButtonSize.XSmall,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[4])),
            size = KPRadioButtonSize.XSmall,
            position = Alignment.Top,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[5])),
            size = KPRadioButtonSize.XSmall,
            position = Alignment.Bottom,
            onClick = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_CONTENT, styleName = "2.Small")
@Composable
internal fun Radio_Button_3_Content_Small() = TrendyolTheme {
    Column {
        KPRadioButton(
            selected = false,
            enabled = true,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[0])),
            size = KPRadioButtonSize.Small,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[1])),
            size = KPRadioButtonSize.Small,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = false,
            enabled = false,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[2])),
            size = KPRadioButtonSize.Small,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            enabled = false,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[3])),
            size = KPRadioButtonSize.Small,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[4])),
            size = KPRadioButtonSize.Small,
            position = Alignment.Top,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[5])),
            size = KPRadioButtonSize.Small,
            position = Alignment.Bottom,
            onClick = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_CONTENT, styleName = "3.Medium")
@Composable
internal fun Radio_Button_3_Content_Medium() = TrendyolTheme {
    Column {
        KPRadioButton(
            selected = false,
            enabled = true,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[0])),
            size = KPRadioButtonSize.Medium,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[1])),
            size = KPRadioButtonSize.Medium,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = false,
            enabled = false,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[2])),
            size = KPRadioButtonSize.Medium,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            enabled = false,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[3])),
            size = KPRadioButtonSize.Medium,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[4])),
            size = KPRadioButtonSize.Medium,
            position = Alignment.Top,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Content(content(radioButtonTexts[5])),
            size = KPRadioButtonSize.Medium,
            position = Alignment.Bottom,
            onClick = { }
        )
    }
}
