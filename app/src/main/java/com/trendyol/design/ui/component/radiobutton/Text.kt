@file:SuppressWarnings("MagicNumber")
package com.trendyol.design.ui.component.radiobutton

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
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
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

private val dividerPadding = 8.dp

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_TEXT, styleName = "1.XSmall")
@Composable
internal fun Radio_Button_2_Text_XSmall() = TrendyolTheme {
    Column {
        TrendyolRadioButton(
            selected = false,
            enabled = true,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[0]),
            size = TrendyolRadioButtonSize.XSmall,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[1]),
            size = TrendyolRadioButtonSize.XSmall,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = false,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[2]),
            size = TrendyolRadioButtonSize.XSmall,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[3]),
            size = TrendyolRadioButtonSize.XSmall,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[4]),
            size = TrendyolRadioButtonSize.XSmall,
            position = Alignment.Top,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[5]),
            size = TrendyolRadioButtonSize.XSmall,
            position = Alignment.Bottom,
            onClick = { /*TODO*/ }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_TEXT, styleName = "2.Small")
@Composable
internal fun Radio_Button_2_Text_Small() = TrendyolTheme {
    Column {
        TrendyolRadioButton(
            selected = false,
            enabled = true,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[0]),
            size = TrendyolRadioButtonSize.Small,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[1]),
            size = TrendyolRadioButtonSize.Small,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = false,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[2]),
            size = TrendyolRadioButtonSize.Small,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[3]),
            size = TrendyolRadioButtonSize.Small,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[4]),
            size = TrendyolRadioButtonSize.Small,
            position = Alignment.Top,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[5]),
            size = TrendyolRadioButtonSize.Small,
            position = Alignment.Bottom,
            onClick = { /*TODO*/ }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_TEXT, styleName = "3.Medium")
@Composable
internal fun Radio_Button_2_Text_Medium() = TrendyolTheme {
    Column {
        TrendyolRadioButton(
            selected = false,
            enabled = true,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[0]),
            size = TrendyolRadioButtonSize.Medium,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[1]),
            size = TrendyolRadioButtonSize.Medium,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = false,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[2]),
            size = TrendyolRadioButtonSize.Medium,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[3]),
            size = TrendyolRadioButtonSize.Medium,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[4]),
            size = TrendyolRadioButtonSize.Medium,
            position = Alignment.Top,
            onClick = { /*TODO*/ }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.Text(radioButtonTexts[5]),
            size = TrendyolRadioButtonSize.Medium,
            position = Alignment.Bottom,
            onClick = { /*TODO*/ }
        )
    }
}
