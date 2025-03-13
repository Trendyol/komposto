package com.trendyol.design.ui.component.toolbar

import androidx.compose.runtime.Composable
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.icon.icons.fill.Trash
import com.trendyol.design.core.icon.icons.outline.Back
import com.trendyol.design.core.toolbar.KPToolbar
import com.trendyol.design.core.toolbar.KPToolbarStyle
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.KPDesign

@ShowkaseComposable(group = Group.TOOLBAR, name = Component.TOOLBAR_ICON_NONE, styleName = "Toolbar.Icon.None")
@Composable
internal fun Toolbar_Icon_None_Showkase() {
    TrendyolTheme {
        KPToolbar(
            title = "Title",
            style = KPToolbarStyle.Icon.None(
                icon = { Icon(imageVector = KPIcons.Fill.Help, onClick = { }) },
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.TOOLBAR,
    name = Component.TOOLBAR_ICON_TEXT_BUTTON,
    styleName = "Toolbar.Icon.TextButton"
)
@Composable
internal fun Toolbar_Icon_Text_Button_Showkase() {
    TrendyolTheme {
        KPToolbar(
            title = "Title",
            style = KPToolbarStyle.Icon.TextButton(
                icon = {
                    Icon(
                        imageVector = KPIcons.Outline.Back,
                        onClick = { },
                        tint = KPDesign.colors.colorOnSurfaceVariant3
                    )
                },
                textButton = { Text(text = "CTA Label", onClick = { }) }
            )
        )
    }
}

@ShowkaseComposable(group = Group.TOOLBAR, name = Component.TOOLBAR_ICON_END_ICON, styleName = "Toolbar.Icon.EndIcon")
@Composable
internal fun Toolbar_Icon_End_Icon_Showkase() {
    TrendyolTheme {
        KPToolbar(
            title = "Title",
            style = KPToolbarStyle.Icon.EndIcon(
                icon = {
                    Icon(
                        imageVector = KPIcons.Outline.Back,
                        onClick = { },
                        tint = KPDesign.colors.colorOnSurfaceVariant3
                    )
                },
                endIcon = {
                    Icon(imageVector = KPIcons.Fill.Trash, onClick = { })
                }
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.TOOLBAR,
    name = Component.TOOLBAR_ICON_END_TWO_ICON,
    styleName = "Toolbar.Icon.TwoEndIcon"
)
@Composable
internal fun Toolbar_Icon_End_Two_Icon_Showkase() {
    TrendyolTheme {
        KPToolbar(
            title = "Title",
            style = KPToolbarStyle.Icon.EndTwoIcons(
                icon = {
                    Icon(
                        imageVector = KPIcons.Outline.Back,
                        onClick = { },
                        tint = KPDesign.colors.colorOnSurfaceVariant3
                    )
                },
                firstIcon = { Icon(imageVector = KPIcons.Fill.Help, onClick = { }) },
                secondIcon = { Icon(imageVector = KPIcons.Fill.Trash, onClick = { }) }
            )
        )
    }
}
