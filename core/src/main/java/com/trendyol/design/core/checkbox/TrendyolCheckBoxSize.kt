package com.trendyol.design.core.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.theme.KPDesign

public sealed interface KPCheckboxSize {

    public data object Medium : CheckboxSize {
        override val containerSize: Dp
            get() = 24.dp
        override val checkboxSize: Dp
            get() = 20.dp
        override val borderCornerRadius: Dp
            get() = 2.5.dp
        override val rippleRadius: Dp
            get() = 24.dp
        override val textStyle: TextStyle
            @Composable get() = KPDesign.typography.subtitle

        override fun strokeWidth(style: CheckboxStyle): Dp =
            if (style is KPCheckboxStyle.Secondary) 1.2.dp else 2.dp
    }

    public data object Small : CheckboxSize {
        override val containerSize: Dp
            get() = 20.dp
        override val checkboxSize: Dp
            get() = 16.dp
        override val borderCornerRadius: Dp
            get() = 2.5.dp
        override val rippleRadius: Dp
            get() = 16.dp
        override val textStyle: TextStyle
            @Composable get() = KPDesign.typography.subtitle

        override fun strokeWidth(style: CheckboxStyle): Dp =
            if (style is KPCheckboxStyle.Secondary) 1.2.dp else 1.75.dp
    }

    public data object XSmall : CheckboxSize {
        override val containerSize: Dp
            get() = 16.dp
        override val checkboxSize: Dp
            get() = 12.dp
        override val borderCornerRadius: Dp
            get() = 2.5.dp
        override val rippleRadius: Dp
            get() = 13.dp
        override val textStyle: TextStyle
            @Composable get() = KPDesign.typography.body1

        override fun strokeWidth(style: CheckboxStyle): Dp =
            if (style is KPCheckboxStyle.Secondary) 1.dp else 1.25.dp
    }
}
