package com.trendyol.design.ui.component.icons.fill

import androidx.compose.runtime.Composable
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group

@ShowkaseComposable(group = Group.ICON, name = Component.HELP_ICON, styleName = "1.Fill.XXSmall")
@Composable
internal fun Help_Fill_XXSmall() {
    KPIcon(imageVector = KPIcons.Fill.Help, size = KPIconSize.XXSmall)
}

@ShowkaseComposable(group = Group.ICON, name = Component.HELP_ICON, styleName = "2.Fill.XSmall")
@Composable
internal fun Help_Fill_XSmall() {
    KPIcon(imageVector = KPIcons.Fill.Help, size = KPIconSize.XSmall)
}

@ShowkaseComposable(group = Group.ICON, name = Component.HELP_ICON, styleName = "3.Fill.Small")
@Composable
internal fun Help_Fill_Small() {
    KPIcon(imageVector = KPIcons.Fill.Help, size = KPIconSize.Small)
}

@ShowkaseComposable(group = Group.ICON, name = Component.HELP_ICON, styleName = "4.Fill.Medium")
@Composable
internal fun Help_Fill_Medium() {
    KPIcon(imageVector = KPIcons.Fill.Help, size = KPIconSize.Medium)
}

@ShowkaseComposable(group = Group.ICON, name = Component.HELP_ICON, styleName = "5.Fill.Large")
@Composable
internal fun Help_Fill_Large() {
    KPIcon(imageVector = KPIcons.Fill.Help, size = KPIconSize.Large)
}
