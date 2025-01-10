package com.trendyol.design.ui.component.icons.fill

import androidx.compose.runtime.Composable
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.StatePin
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group

@ShowkaseComposable(group = Group.ICON, name = Component.STATE_PIN_ICON, styleName = "1.Fill.XXXLarge")
@Composable
internal fun StatePin_Fill_XXXLarge() {
    KPIcon(imageVector = KPIcons.Fill.StatePin, size = KPIconSize.XXXLarge)
}
