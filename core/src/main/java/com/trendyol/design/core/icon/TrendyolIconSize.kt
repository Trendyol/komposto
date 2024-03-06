package com.trendyol.design.core.icon

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed interface TrendyolIconSize {

    data object XXSmall : IconSize {
        override val dp: Dp
            get() = 12.dp
    }

    data object XSmall : IconSize {
        override val dp: Dp
            get() = 16.dp
    }

    data object Small : IconSize {
        override val dp: Dp
            get() = 20.dp
    }

    data object Medium : IconSize {
        override val dp: Dp
            get() = 24.dp
    }

    data object Large : IconSize {
        override val dp: Dp
            get() = 32.dp
    }

    data object XLarge : IconSize {
        override val dp: Dp
            get() = 48.dp
    }

    data object XXLarge : IconSize {
        override val dp: Dp
            get() = 56.dp
    }

    data object XXXLarge : IconSize {
        override val dp: Dp
            get() = 64.dp
    }
}
