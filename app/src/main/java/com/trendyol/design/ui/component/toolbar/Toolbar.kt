package com.trendyol.design.ui.component.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.icon.icons.fill.Trash
import com.trendyol.design.core.toolbar.KPToolbar
import com.trendyol.design.core.toolbar.KPToolbarStyle
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.TOOLBAR, name = Component.TOOLBAR_NONE, styleName = "Toolbar.None")
@Composable
internal fun Toolbar_None_Showkase() {
    TrendyolTheme {
        KPToolbar(
            title = "Title",
            style = KPToolbarStyle.None
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.TOOLBAR, name = Component.TOOLBAR_TEXT_BUTTON, styleName = "Toolbar.TextButton")
@Composable
internal fun Toolbar_None_Text_Button_Showkase() {
    TrendyolTheme {
        KPToolbar(
            title = "Title",
            style = KPToolbarStyle.TextButton(
                textButton = { Text(text = "CTA Label", onClick = { }) }
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.TOOLBAR, name = Component.TOOLBAR_END_ICON, styleName = "Toolbar.EndIcon")
@Composable
internal fun Toolbar_None_End_Icon_Showkase() {
    TrendyolTheme {
        KPToolbar(
            title = "Title",
            style = KPToolbarStyle.EndIcon(
                endIcon = {
                    Icon(imageVector = KPIcons.Fill.Trash, onClick = { })
                }
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.TOOLBAR, name = Component.TOOLBAR_END_TWO_ICON, styleName = "Toolbar.TwoEndIcon")
@Composable
internal fun Toolbar_None_End_Two_Icon_Showkase() {
    TrendyolTheme {
        KPToolbar(
            title = "Title",
            style = KPToolbarStyle.EndTwoIcons(
                firstIcon = { Icon(imageVector = KPIcons.Fill.Help, onClick = { }) },
                secondIcon = { Icon(imageVector = KPIcons.Fill.Trash, onClick = { }) }
            )
        )
    }
}
