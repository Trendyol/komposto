package com.trendyol.design.ui.component.icons.outline

import androidx.compose.runtime.Composable
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.outline.StateCaution
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group

@ShowkaseComposable(group = Group.ICON, name = Component.STATE_CAUTION_ICON, styleName = "1.Outline.XLarge")
@Composable
internal fun StateCaution_Outline_XLarge() {
    Icon(imageVector = Icons.Outline.StateCaution, size = TrendyolIconSize.XLarge)
}

@ShowkaseComposable(group = Group.ICON, name = Component.STATE_CAUTION_ICON, styleName = "2.Outline.XXLarge")
@Composable
internal fun StateCaution_Outline_XXLarge() {
    Icon(imageVector = Icons.Outline.StateCaution, size = TrendyolIconSize.XXLarge)
}

@ShowkaseComposable(group = Group.ICON, name = Component.STATE_CAUTION_ICON, styleName = "3.Outline.XXXLarge")
@Composable
internal fun StateCaution_Outline_XXXLarge() {
    Icon(imageVector = Icons.Outline.StateCaution, size = TrendyolIconSize.XXXLarge)
}
