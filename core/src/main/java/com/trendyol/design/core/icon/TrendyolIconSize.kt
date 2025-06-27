package com.trendyol.design.core.icon

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

public sealed interface KPIconSize {

    public data object XXSmall : IconSize {
        override val dp: Dp
            get() = 12.dp
    }

    public data object XSmall : IconSize {
        override val dp: Dp
            get() = 16.dp
    }

    public data object Small : IconSize {
        override val dp: Dp
            get() = 20.dp
    }

    public data object Medium : IconSize {
        override val dp: Dp
            get() = 24.dp
    }

    public data object Large : IconSize {
        override val dp: Dp
            get() = 32.dp
    }

    public data object XLarge : IconSize {
        override val dp: Dp
            get() = 48.dp
    }

    public data object XXLarge : IconSize {
        override val dp: Dp
            get() = 56.dp
    }

    public data object XXXLarge : IconSize {
        override val dp: Dp
            get() = 64.dp
    }
}
