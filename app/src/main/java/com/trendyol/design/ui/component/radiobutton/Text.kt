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
import com.trendyol.design.core.radiobutton.KPRadioButton
import com.trendyol.design.core.radiobutton.KPRadioButtonContainerType
import com.trendyol.design.core.radiobutton.KPRadioButtonSize
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

private val dividerPadding = 8.dp

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_TEXT, styleName = "1.XSmall")
@Composable
internal fun Radio_Button_2_Text_XSmall() = TrendyolTheme {
    Column {
        KPRadioButton(
            selected = false,
            enabled = true,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[0]),
            size = KPRadioButtonSize.XSmall,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[1]),
            size = KPRadioButtonSize.XSmall,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = false,
            enabled = false,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[2]),
            size = KPRadioButtonSize.XSmall,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            enabled = false,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[3]),
            size = KPRadioButtonSize.XSmall,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[4]),
            size = KPRadioButtonSize.XSmall,
            position = Alignment.Top,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[5]),
            size = KPRadioButtonSize.XSmall,
            position = Alignment.Bottom,
            onClick = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_TEXT, styleName = "2.Small")
@Composable
internal fun Radio_Button_2_Text_Small() = TrendyolTheme {
    Column {
        KPRadioButton(
            selected = false,
            enabled = true,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[0]),
            size = KPRadioButtonSize.Small,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[1]),
            size = KPRadioButtonSize.Small,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = false,
            enabled = false,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[2]),
            size = KPRadioButtonSize.Small,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            enabled = false,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[3]),
            size = KPRadioButtonSize.Small,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[4]),
            size = KPRadioButtonSize.Small,
            position = Alignment.Top,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[5]),
            size = KPRadioButtonSize.Small,
            position = Alignment.Bottom,
            onClick = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_TEXT, styleName = "3.Medium")
@Composable
internal fun Radio_Button_2_Text_Medium() = TrendyolTheme {
    Column {
        KPRadioButton(
            selected = false,
            enabled = true,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[0]),
            size = KPRadioButtonSize.Medium,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[1]),
            size = KPRadioButtonSize.Medium,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = false,
            enabled = false,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[2]),
            size = KPRadioButtonSize.Medium,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            enabled = false,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[3]),
            size = KPRadioButtonSize.Medium,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[4]),
            size = KPRadioButtonSize.Medium,
            position = Alignment.Top,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.Text(radioButtonTexts[5]),
            size = KPRadioButtonSize.Medium,
            position = Alignment.Bottom,
            onClick = { }
        )
    }
}
