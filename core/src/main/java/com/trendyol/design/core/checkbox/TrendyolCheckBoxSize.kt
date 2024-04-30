package com.trendyol.design.core.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.theme.TrendyolDesign

/**
 * This sealed interface defines the size variations for Trendyol checkboxes.
 * Different size options are provided as sealed data objects.
 */
sealed interface TrendyolCheckBoxSize {

    data object Medium : CheckboxSize {
        override val containerSize: Dp
            get() = 24.dp
        override val checkboxSize: Dp
            get() = 20.dp
        override val borderCornerRadius: Dp
            get() = 2.5.dp
        override val rippleRadius: Dp
            get() = 24.dp
        override val textStyle: TextStyle
            @Composable get() = TrendyolDesign.typography.subtitle
    }

    data object Small : CheckboxSize {
        override val containerSize: Dp
            get() = 20.dp
        override val checkboxSize: Dp
            get() = 16.dp
        override val borderCornerRadius: Dp
            get() = 2.5.dp
        override val rippleRadius: Dp
            get() = 16.dp
        override val textStyle: TextStyle
            @Composable get() = TrendyolDesign.typography.subtitle
    }

    data object XSmall : CheckboxSize {
        override val containerSize: Dp
            get() = 16.dp
        override val checkboxSize: Dp
            get() = 12.dp
        override val borderCornerRadius: Dp
            get() = 2.5.dp
        override val rippleRadius: Dp
            get() = 13.dp
        override val textStyle: TextStyle
            @Composable get() = TrendyolDesign.typography.body1
    }
}
