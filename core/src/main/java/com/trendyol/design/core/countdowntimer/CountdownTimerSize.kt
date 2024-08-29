package com.trendyol.design.core.countdowntimer

import androidx.compose.ui.unit.Dp

/**
 * Interface `CountdownTimerSize` defines the size configuration for a countdown timer.
 * It includes properties for vertical and horizontal padding that can be used to adjust the layout of the timer boxes.
 *
 * @property verticalPadding Represents the vertical padding of the countdown timer box.
 * @property horizontalPadding Represents the horizontal padding of the countdown timer box.
 */
interface CountdownTimerSize {

    /**
     * Retrieves the vertical padding for the countdown timer box.
     *
     * @return a `Dp` value representing the vertical padding.
     */
    val verticalPadding: Dp

    /**
     * Retrieves the horizontal padding for the countdown timer box.
     *
     * @return a `Dp` value representing the horizontal padding.
     */
    val horizontalPadding: Dp

    /**
     * Retrieves the horizontal padding for the countdown timer box and separator icon.
     *
     * @return a `Dp` value representing the horizontal padding.
     */
    val verticalBoxPadding: Dp
}
