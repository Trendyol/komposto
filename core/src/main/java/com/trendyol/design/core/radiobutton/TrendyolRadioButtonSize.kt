package com.trendyol.design.core.radiobutton

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.theme.KPDesign

/**
 * Defining different sizes for RadioButton components specific to the [com.trendyol.theme.KPDesign] theme.
 *
 * This interface provides sealed classes representing different sizes for [KPRadioButton] components with customization options
 * tailored to the Trendyol design guidelines.
 */
public sealed interface KPRadioButtonSize : RadioButtonSize {

    public data object XSmall : KPRadioButtonSize {
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
            get() = KPDesign.typography.body1
    }

    public data object Small : KPRadioButtonSize {
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
            get() = KPDesign.typography.subtitle
    }

    public data object Medium : KPRadioButtonSize {
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
            get() = KPDesign.typography.subtitle
    }
}
