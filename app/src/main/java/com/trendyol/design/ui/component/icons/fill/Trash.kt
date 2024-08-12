package com.trendyol.design.ui.component.icons.fill

import androidx.compose.runtime.Composable
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.Trash
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group

@ShowkaseComposable(group = Group.ICON, name = Component.TRASH_ICON, styleName = "1.Fill.XXSmall")
@Composable
internal fun Trash_Fill_XXSmall() {
    Icon(imageVector = Icons.Fill.Trash, size = TrendyolIconSize.XXSmall)
}

@ShowkaseComposable(group = Group.ICON, name = Component.TRASH_ICON, styleName = "2.Fill.XSmall")
@Composable
internal fun Trash_Fill_XSmall() {
    Icon(imageVector = Icons.Fill.Trash, size = TrendyolIconSize.XSmall)
}

@ShowkaseComposable(group = Group.ICON, name = Component.TRASH_ICON, styleName = "3.Fill.Small")
@Composable
internal fun Trash_Fill_Small() {
    Icon(imageVector = Icons.Fill.Trash, size = TrendyolIconSize.Small)
}

@ShowkaseComposable(group = Group.ICON, name = Component.TRASH_ICON, styleName = "4.Fill.Medium")
@Composable
internal fun Trash_Fill_Medium() {
    Icon(imageVector = Icons.Fill.Trash, size = TrendyolIconSize.Medium)
}

@ShowkaseComposable(group = Group.ICON, name = Component.TRASH_ICON, styleName = "5.Fill.Large")
@Composable
internal fun Trash_Fill_Large() {
    Icon(imageVector = Icons.Fill.Trash, size = TrendyolIconSize.Large)
}
