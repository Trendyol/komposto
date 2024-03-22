package com.trendyol.design.core.icon

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed interface StateLayoutIconSize : IconSize {

    data object WarningInfoStateLayoutSmallIcon : StateLayoutIconSize {
        override val dp: Dp
            get() = 68.dp
    }

    data object WarningInfoStateLayoutMediumIcon : StateLayoutIconSize {
        override val dp: Dp
            get() = 104.dp
    }
}
