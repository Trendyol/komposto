package com.trendyol.design.core.icon

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

public sealed interface StateLayoutIconSize : IconSize {

    public data object WarningInfoStateLayoutSmallIcon : StateLayoutIconSize {
        override val dp: Dp
            get() = 68.dp
    }

    public data object WarningInfoStateLayoutMediumIcon : StateLayoutIconSize {
        override val dp: Dp
            get() = 104.dp
    }
}
