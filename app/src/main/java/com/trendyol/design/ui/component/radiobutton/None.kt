package com.trendyol.design.ui.component.radiobutton

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
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
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_NONE, styleName = "1.XSmall")
@Composable
internal fun Radio_Button_1_None_XSmall() = TrendyolTheme {
    Column {
        KPRadioButton(
            selected = false,
            enabled = true,
            containerType = KPRadioButtonContainerType.None,
            size = KPRadioButtonSize.XSmall,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.None,
            size = KPRadioButtonSize.XSmall,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = false,
            enabled = false,
            containerType = KPRadioButtonContainerType.None,
            size = KPRadioButtonSize.XSmall,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            enabled = false,
            containerType = KPRadioButtonContainerType.None,
            size = KPRadioButtonSize.XSmall,
            onClick = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_NONE, styleName = "2.Small")
@Composable
internal fun Radio_Button_1_None_Small() = TrendyolTheme {
    Column {
        KPRadioButton(
            selected = false,
            enabled = true,
            containerType = KPRadioButtonContainerType.None,
            size = KPRadioButtonSize.Small,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.None,
            size = KPRadioButtonSize.Small,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = false,
            enabled = false,
            containerType = KPRadioButtonContainerType.None,
            size = KPRadioButtonSize.Small,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            enabled = false,
            containerType = KPRadioButtonContainerType.None,
            size = KPRadioButtonSize.Small,
            onClick = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.RADIO_BUTTON, name = Component.RADIO_BUTTON_NONE, styleName = "3.Medium")
@Composable
internal fun Radio_Button_1_None_Medium() = TrendyolTheme {
    Column {
        KPRadioButton(
            selected = false,
            enabled = true,
            containerType = KPRadioButtonContainerType.None,
            size = KPRadioButtonSize.Medium,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            containerType = KPRadioButtonContainerType.None,
            size = KPRadioButtonSize.Medium,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = false,
            enabled = false,
            containerType = KPRadioButtonContainerType.None,
            size = KPRadioButtonSize.Medium,
            onClick = { }
        )
        Divider(modifier = Modifier.padding(vertical = dividerPadding))
        KPRadioButton(
            selected = true,
            enabled = false,
            containerType = KPRadioButtonContainerType.None,
            size = KPRadioButtonSize.Medium,
            onClick = { }
        )
    }
}
