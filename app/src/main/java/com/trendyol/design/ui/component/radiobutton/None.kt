package com.trendyol.design.ui.component.radiobutton

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
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
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_NONE, styleName = "1.XSmall")
@Composable
internal fun Radio_Button_1_None_XSmall() = TrendyolTheme {
    Column {
        TrendyolRadioButton(
            selected = false,
            enabled = true,
            containerType = TrendyolRadioButtonContainerType.None,
            size = TrendyolRadioButtonSize.XSmall,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.None,
            size = TrendyolRadioButtonSize.XSmall,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = false,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.None,
            size = TrendyolRadioButtonSize.XSmall,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.None,
            size = TrendyolRadioButtonSize.XSmall,
            onClick = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_NONE, styleName = "2.Small")
@Composable
internal fun Radio_Button_1_None_Small() = TrendyolTheme {
    Column {
        TrendyolRadioButton(
            selected = false,
            enabled = true,
            containerType = TrendyolRadioButtonContainerType.None,
            size = TrendyolRadioButtonSize.Small,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.None,
            size = TrendyolRadioButtonSize.Small,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = false,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.None,
            size = TrendyolRadioButtonSize.Small,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.None,
            size = TrendyolRadioButtonSize.Small,
            onClick = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_NONE, styleName = "3.Medium")
@Composable
internal fun Radio_Button_1_None_Medium() = TrendyolTheme {
    Column {
        TrendyolRadioButton(
            selected = false,
            enabled = true,
            containerType = TrendyolRadioButtonContainerType.None,
            size = TrendyolRadioButtonSize.Medium,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            containerType = TrendyolRadioButtonContainerType.None,
            size = TrendyolRadioButtonSize.Medium,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = false,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.None,
            size = TrendyolRadioButtonSize.Medium,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        TrendyolRadioButton(
            selected = true,
            enabled = false,
            containerType = TrendyolRadioButtonContainerType.None,
            size = TrendyolRadioButtonSize.Medium,
            onClick = { }
        )
    }
}
