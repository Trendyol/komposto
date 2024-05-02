package com.trendyol.design.core.radiobutton

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.theme.TrendyolDesign

sealed interface TrendyolRadioButtonSize : RadioButtonSize {

    data object XSmall : TrendyolRadioButtonSize {
        override val rippleRadius: Dp
            get() = 14.dp
        override val buttonSize: Dp
            get() = 12.dp
        override val dotSize: Dp
            get() = 6.dp
        override val strokeWidth: Dp
            get() = (1.2).dp
        override val textSize: TextStyle
            @Composable
            get() = TrendyolDesign.typography.body1
    }

    data object Small : TrendyolRadioButtonSize {
        override val rippleRadius: Dp
            get() = 19.dp
        override val buttonSize: Dp
            get() = 16.dp
        override val dotSize: Dp
            get() = 8.dp
        override val strokeWidth: Dp
            get() = (1.6).dp
        override val textSize: TextStyle
            @Composable
            get() = TrendyolDesign.typography.subtitle
    }

    data object Medium : TrendyolRadioButtonSize {
        override val rippleRadius: Dp
            get() = 24.dp
        override val buttonSize: Dp
            get() = 20.dp
        override val dotSize: Dp
            get() = 10.dp
        override val strokeWidth: Dp
            get() = 2.dp
        override val textSize: TextStyle
            @Composable
            get() = TrendyolDesign.typography.subtitle
    }
}
