package com.trendyol.design.ui.component.icons.outline

import androidx.compose.runtime.Composable
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.outline.Back
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group

@ShowkaseComposable(group = Group.ICON, name = Component.BACK_ICON, styleName = "1.Outline.XXSmall")
@Composable
internal fun Back_Outline_XXSmall() {
    KPIcon(imageVector = KPIcons.Outline.Back, size = KPIconSize.XXSmall)
}

@ShowkaseComposable(group = Group.ICON, name = Component.BACK_ICON, styleName = "2.Outline.XSmall")
@Composable
internal fun Back_Outline_XSmall() {
    KPIcon(imageVector = KPIcons.Outline.Back, size = KPIconSize.XSmall)
}

@ShowkaseComposable(group = Group.ICON, name = Component.BACK_ICON, styleName = "3.Outline.Small")
@Composable
internal fun Back_Outline_Small() {
    KPIcon(imageVector = KPIcons.Outline.Back, size = KPIconSize.Small)
}

@ShowkaseComposable(group = Group.ICON, name = Component.BACK_ICON, styleName = "4.Outline.Medium")
@Composable
internal fun Back_Outline_Medium() {
    KPIcon(imageVector = KPIcons.Outline.Back, size = KPIconSize.Medium)
}

@ShowkaseComposable(group = Group.ICON, name = Component.BACK_ICON, styleName = "5.Outline.Large")
@Composable
internal fun Back_Outline_Large() {
    KPIcon(imageVector = KPIcons.Outline.Back, size = KPIconSize.Large)
}
