package com.trendyol.design.core.countdowntimer

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Sealed interface `TrendyolCountdownTimerSize` defines the size options for the countdown timer
 * in the Trendyol design system. It allows for specific configurations for different sizes,
 * each with its own vertical and horizontal padding values.
 *
 * This sealed interface restricts the set of possible sizes to the predefined options.
 */
public sealed interface KPCountdownTimerSize {

    /**
     * `Large` provides the large size configuration for the Trendyol countdown timer.
     * It includes larger padding values for both vertical and horizontal padding.
     */
    public data object Large : CountdownTimerSize {
        override val verticalPadding: Dp
            get() = 6.dp
        override val horizontalPadding: Dp
            get() = 8.dp
        override val verticalBoxPadding: Dp
            get() = 2.dp
    }

    /**
     * `Medium` provides the medium size configuration for the Trendyol countdown timer.
     * It includes moderate padding values for both vertical and horizontal padding.
     */
    public data object Medium : CountdownTimerSize {
        override val verticalPadding: Dp
            get() = 2.dp
        override val horizontalPadding: Dp
            get() = 4.dp
        override val verticalBoxPadding: Dp
            get() = 1.dp
    }

    /**
     * `Small` provides the small size configuration for the Trendyol countdown timer.
     * It includes smaller padding values for both vertical and horizontal padding.
     */
    public data object Small : CountdownTimerSize {
        override val verticalPadding: Dp
            get() = 1.dp
        override val horizontalPadding: Dp
            get() = 5.dp
        override val verticalBoxPadding: Dp
            get() = 0.dp
    }
}
