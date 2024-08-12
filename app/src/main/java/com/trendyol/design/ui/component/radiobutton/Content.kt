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
import com.trendyol.design.core.radiobutton.TrendyolRadioButton
import com.trendyol.design.core.radiobutton.TrendyolRadioButtonContainerType
import com.trendyol.design.core.radiobutton.TrendyolRadioButtonSize
import com.trendyol.design.core.text.Text
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.TrendyolDesign

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
                color = TrendyolDesign.colors.colorBorder,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Row {
            Text(text = text)
        }
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_CONTENT, styleName = "1.XSmall")
@Composable
internal fun Radio_Button_3_Content_XSmall() = TrendyolTheme {
    Column {
        TrendyolRadioButton(
            selected = false,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[0])),
            size = TrendyolRadioButtonSize.XSmall,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[1])),
            size = TrendyolRadioButtonSize.XSmall,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = false,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[2])),
            size = TrendyolRadioButtonSize.XSmall,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[3])),
            size = TrendyolRadioButtonSize.XSmall,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[4])),
            size = TrendyolRadioButtonSize.XSmall,
            position = Alignment.Top,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[5])),
            size = TrendyolRadioButtonSize.XSmall,
            position = Alignment.Bottom,
            onClick = { /*TODO*/ }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_CONTENT, styleName = "2.Small")
@Composable
internal fun Radio_Button_3_Content_Small() = TrendyolTheme {
    Column {
        TrendyolRadioButton(
            selected = false,
            enabled = true,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[0])),
            size = TrendyolRadioButtonSize.Small,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[1])),
            size = TrendyolRadioButtonSize.Small,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = false,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[2])),
            size = TrendyolRadioButtonSize.Small,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[3])),
            size = TrendyolRadioButtonSize.Small,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[4])),
            size = TrendyolRadioButtonSize.Small,
            position = Alignment.Top,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[5])),
            size = TrendyolRadioButtonSize.Small,
            position = Alignment.Bottom,
            onClick = { /*TODO*/ }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_CONTENT, styleName = "3.Medium")
@Composable
internal fun Radio_Button_3_Content_Medium() = TrendyolTheme {
    Column {
        TrendyolRadioButton(
            selected = false,
            enabled = true,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[0])),
            size = TrendyolRadioButtonSize.Medium,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[1])),
            size = TrendyolRadioButtonSize.Medium,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = false,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[2])),
            size = TrendyolRadioButtonSize.Medium,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[3])),
            size = TrendyolRadioButtonSize.Medium,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[4])),
            size = TrendyolRadioButtonSize.Medium,
            position = Alignment.Top,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Content(content(radioButtonTexts[5])),
            size = TrendyolRadioButtonSize.Medium,
            position = Alignment.Bottom,
            onClick = { /*TODO*/ }
        )
    }
}
