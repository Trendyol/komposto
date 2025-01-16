package com.trendyol.design.core.iconbutton.standard

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.IconSize
import com.trendyol.design.core.icon.KPIconSize

public sealed class KPStandardIconButtonSize : IconButtonSize {
    public data object XSmall : KPStandardIconButtonSize() {
        override val dp: Dp = 20.dp
        override val iconSize: IconSize = KPIconSize.XSmall
    }

    public data object Small : KPStandardIconButtonSize() {
        override val dp: Dp = 24.dp
        override val iconSize: IconSize = KPIconSize.Small
    }

    public data object Medium : KPStandardIconButtonSize() {
        override val dp: Dp = 24.dp
        override val iconSize: IconSize = KPIconSize.Medium
    }

    public data object Large : KPStandardIconButtonSize() {
        override val dp: Dp = 32.dp
        override val iconSize: IconSize = KPIconSize.Large
    }

    public data object XLarge : KPStandardIconButtonSize() {
        override val dp: Dp = 48.dp
        override val iconSize: IconSize = KPIconSize.XLarge
    }
}
