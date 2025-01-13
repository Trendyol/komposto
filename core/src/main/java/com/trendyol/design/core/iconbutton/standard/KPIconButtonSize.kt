package com.trendyol.design.core.iconbutton.standard

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.IconSize
import com.trendyol.design.core.icon.KPIconSize

public sealed class KPIconButtonSize : IconButtonSize {
    public data object XSmall : KPIconButtonSize() {
        override val dp: Dp = 20.dp
        override val iconSize: IconSize = KPIconSize.XSmall
    }

    public data object Small : KPIconButtonSize() {
        override val dp: Dp = 24.dp
        override val iconSize: IconSize = KPIconSize.Small
    }

    public data object Medium : KPIconButtonSize() {
        override val dp: Dp = 24.dp
        override val iconSize: IconSize = KPIconSize.Medium
    }

    public data object Large : KPIconButtonSize() {
        override val dp: Dp = 32.dp
        override val iconSize: IconSize = KPIconSize.Large
    }

    public data object XLarge : KPIconButtonSize() {
        override val dp: Dp = 48.dp
        override val iconSize: IconSize = KPIconSize.XLarge
    }
}
