package com.trendyol.design.core.countdowntimer

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

/**
 * Immutable interface `CountdownTimerStyle` defines the styling configuration for a countdown timer.
 * It includes properties such as background color, separator text style, and a function to get the text style based on the countdown timer's size.
 *
 * @property backgroundColor Represents the background color of the countdown timer. This value is retrieved from a `@Composable` function.
 * @property separatorTextStyle Represents the text style for separators (e.g., between hours, minutes, and seconds) in the countdown timer. This value is retrieved from a `@Composable` function.
 */
@Immutable
interface CountdownTimerStyle {

    /**
     * Retrieves the background color for the countdown timer.
     *
     * @return A `Color` representing the background color.
     */
    val backgroundColor: Color
        @Composable get

    /**
     * Retrieves the text style used for separators in the countdown timer.
     *
     * @return A `TextStyle` representing the style of the separator text.
     */
    val separatorTextStyle: TextStyle
        @Composable get

    /**
     * Retrieves the text style based on the size of the countdown timer.
     *
     * @param size The size of the countdown timer, specified by `CountdownTimerSize`.
     * @return A `TextStyle` representing the style of the countdown text for the given size.
     */
    @ReadOnlyComposable
    @Composable
    fun textStyle(size: CountdownTimerSize): TextStyle
}
