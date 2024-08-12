package com.trendyol.design.ui.component.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.core.button.Button
import com.trendyol.design.core.button.TrendyolButtonSize
import com.trendyol.design.core.button.TrendyolButtonStyle
import com.trendyol.design.core.text.Text
import com.trendyol.design.ui.theme.TrendyolTheme

@ShowkaseComposable(group = Group.BUTTON, name = Component.SECONDARY_BUTTON, styleName = "4.Large.Enabled")
@Composable
internal fun Secondary_Button_Large_Enabled_Showkase() {
    TrendyolTheme {
        Button(
            onClick = { /*TODO*/ },
            style = TrendyolButtonStyle.Secondary,
            size = TrendyolButtonSize.Large,
        ) {
            Text(text = BUTTON_TEXT)
        }
    }
}

@ShowkaseComposable(group = Group.BUTTON, name = Component.SECONDARY_BUTTON, styleName = "3.Medium.Enabled")
@Composable
internal fun Secondary_Button_Medium_Enabled_Showkase() {
    TrendyolTheme {
        Button(
            onClick = { /*TODO*/ },
            style = TrendyolButtonStyle.Secondary,
            size = TrendyolButtonSize.Medium,
        ) {
            Text(text = BUTTON_TEXT)
        }
    }
}

@ShowkaseComposable(group = Group.BUTTON, name = Component.SECONDARY_BUTTON, styleName = "2.Small.Enabled")
@Composable
internal fun Secondary_Button_Small_Enabled_Showkase() {
    TrendyolTheme {
        Button(
            onClick = { /*TODO*/ },
            style = TrendyolButtonStyle.Secondary,
            size = TrendyolButtonSize.Small,
        ) {
            Text(text = BUTTON_TEXT)
        }
    }
}

@ShowkaseComposable(group = Group.BUTTON, name = Component.SECONDARY_BUTTON, styleName = "1.XSmall.Enabled")
@Composable
internal fun Secondary_Button_XSmall_Enabled_Showkase() {
    TrendyolTheme {
        Button(
            onClick = { /*TODO*/ },
            style = TrendyolButtonStyle.Secondary,
            size = TrendyolButtonSize.XSmall,
        ) {
            Text(text = BUTTON_TEXT)
        }
    }
}

@ShowkaseComposable(group = Group.BUTTON, name = Component.SECONDARY_BUTTON, styleName = "5.Large.Disabled")
@Composable
internal fun Z_Secondary_Button_Large_Disabled_Showkase() {
    TrendyolTheme {
        Button(
            onClick = { /*TODO*/ },
            style = TrendyolButtonStyle.Secondary,
            size = TrendyolButtonSize.Large,
            enabled = false,
        ) {
            Text(text = BUTTON_TEXT)
        }
    }
}

@ShowkaseComposable(group = Group.BUTTON, name = Component.SECONDARY_BUTTON, styleName = "6.Large.Enabled.TwoLine")
@Composable
internal fun Secondary_Button_Large_Enabled_TwoLine_Showkase() {
    TrendyolTheme {
        Button(
            onClick = { /*TODO*/ },
            style = TrendyolButtonStyle.Secondary,
            size = TrendyolButtonSize.Large,
        ) {
            Text(
                text = "Long Title example\n is like that",
                textAlign = TextAlign.Center,
            )
        }
    }
}
