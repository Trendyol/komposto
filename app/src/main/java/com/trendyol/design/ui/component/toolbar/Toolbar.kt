package com.trendyol.design.ui.component.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.icon.icons.fill.Trash
import com.trendyol.design.core.toolbar.Toolbar
import com.trendyol.design.core.toolbar.TrendyolToolbarStyle
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.TOOLBAR, name = Component.TOOLBAR_NONE, styleName = "Toolbar.None")
@Composable
internal fun Toolbar_None_Showkase() {
    TrendyolTheme {
        Toolbar(
            title = "Title",
            style = TrendyolToolbarStyle.None
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.TOOLBAR, name = Component.TOOLBAR_TEXT_BUTTON, styleName = "Toolbar.TextButton")
@Composable
internal fun Toolbar_None_Text_Button_Showkase() {
    TrendyolTheme {
        Toolbar(
            title = "Title",
            style = TrendyolToolbarStyle.TextButton(
                textButton = { Text(text = "CTA Label", onClick = { /*TODO*/ }) }
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = Group.TOOLBAR, name = Component.TOOLBAR_END_ICON, styleName = "Toolbar.EndIcon")
@Composable
internal fun Toolbar_None_End_Icon_Showkase() {
    TrendyolTheme {
        Toolbar(
            title = "Title",
            style = TrendyolToolbarStyle.EndIcon(
                endIcon = {
                    Icon(imageVector = Icons.Fill.Trash, onClick = { /*TODO*/ })
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
        Toolbar(
            title = "Title",
            style = TrendyolToolbarStyle.EndTwoIcons(
                firstIcon = { Icon(imageVector = Icons.Fill.Help, onClick = { /*TODO*/ }) },
                secondIcon = { Icon(imageVector = Icons.Fill.Trash, onClick = { /*TODO*/ }) }
            )
        )
    }
}
