package com.trendyol.design.core.countdowntimer

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.trendyol.theme.TrendyolDesign

/**
 * Sealed interface `TrendyolCountdownTimerStyle` defines specific styles for the countdown timer
 * used in the Trendyol design system. It can have different implementations for various styling needs.
 *
 * This sealed interface allows defining a limited set of styles that conform to the `CountdownTimerStyle` interface.
 */
public sealed interface KPCountdownTimerStyle {

    /**
     * `Primary` provides the primary style for the Trendyol countdown timer.
     * It includes specific design elements such as background color, separator text style,
     * and text styles for different countdown timer sizes.
     */
    public data object Primary : CountdownTimerStyle {
        override val backgroundColor: Color
            @Composable get() = TrendyolDesign.colors.colorSurface

        override val separatorTintColor: Color
            @Composable get() = TrendyolDesign.colors.colorSurface

        @Composable
        override fun textStyle(size: CountdownTimerSize): TextStyle {
            return when (size) {
                is KPCountdownTimerSize.Large ->
                    TrendyolDesign.typography.subtitleBoldColorOnSurfaceVariant3

                is KPCountdownTimerSize.Medium ->
                    TrendyolDesign.typography.subtitleMediumColorOnSurfaceVariant3

                is KPCountdownTimerSize.Small ->
                    TrendyolDesign.typography.body1BoldColorOnSurfaceVariant3

                else -> TrendyolDesign.typography.subtitleMediumColorOnSurfaceVariant3
            }
        }
    }
}
