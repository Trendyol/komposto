package com.trendyol.design.core.countdowntimer

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.trendyol.theme.KPDesign

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
            @Composable get() = KPDesign.colors.colorSurface

        override val separatorTextStyle: TextStyle
            @Composable get() = KPDesign.typography.titleBold

        @Composable
        override fun textStyle(size: CountdownTimerSize): TextStyle {
            return when (size) {
                is KPCountdownTimerSize.Large ->
                    KPDesign.typography.subtitleBoldColorOnSurfaceVariant3

                is KPCountdownTimerSize.Medium ->
                    KPDesign.typography.subtitleMediumColorOnSurfaceVariant3

                is KPCountdownTimerSize.Small ->
                    KPDesign.typography.body1BoldColorOnSurfaceVariant3

                else -> KPDesign.typography.subtitleMediumColorOnSurfaceVariant3
            }
        }
    }
}
