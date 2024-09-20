package com.trendyol.design.ui.component.icons.fill

import androidx.compose.runtime.Composable
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.StatePin
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group

@ShowkaseComposable(group = Group.ICON, name = Component.STATE_PIN_ICON, styleName = "1.Fill.XXXLarge")
@Composable
internal fun StatePin_Fill_XXXLarge() {
    Icon(imageVector = Icons.Fill.StatePin, size = TrendyolIconSize.XXXLarge)
}
