package com.trendyol.design.core.iconbutton.contained

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.IconSize
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.iconbutton.standard.IconButtonSize

public sealed class KPContainedIconButtonSize : ContainedIconButtonSize {
    public data object Large : KPContainedIconButtonSize() {
        override val iconButtonSize: IconButtonSize = object : IconButtonSize {
            override val dp: Dp = 36.dp
            override val iconSize: IconSize = TrendyolIconSize.Medium
        }
        override val containerSize: Dp = 32.dp
    }

    public data object Medium : KPContainedIconButtonSize() {
        override val iconButtonSize: IconButtonSize = object : IconButtonSize {
            override val dp: Dp = 32.dp
            override val iconSize: IconSize = TrendyolIconSize.Small
        }
        override val containerSize: Dp = 28.dp
    }

    public data object Small : KPContainedIconButtonSize() {
        override val iconButtonSize: IconButtonSize = object : IconButtonSize {
            override val dp: Dp = 28.dp
            override val iconSize: IconSize = TrendyolIconSize.XSmall
        }
        override val containerSize: Dp = 24.dp
    }
}
