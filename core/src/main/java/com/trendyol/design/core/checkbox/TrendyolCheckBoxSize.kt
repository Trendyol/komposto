package com.trendyol.design.core.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign

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
            if (style is KPCheckBoxStyle.Secondary) 1.2.dp else 2.dp
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
            if (style is KPCheckBoxStyle.Secondary) 1.2.dp else 1.75.dp
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
            if (style is KPCheckBoxStyle.Secondary) 1.dp else 1.25.dp
    }
}

/**
 * This sealed interface defines the size variations for Trendyol checkboxes.
 * Different size options are provided as sealed data objects.
 */
@Deprecated(
    message = "Use KPCheckboxSize instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPCheckboxSize",
    ),
    level = DeprecationLevel.WARNING
)
public sealed interface TrendyolCheckBoxSize {

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
            @Composable get() = TrendyolDesign.typography.subtitle

        override fun strokeWidth(style: CheckboxStyle): Dp =
            if (style is TrendyolCheckBoxStyle.Secondary) 1.2.dp else 2.dp
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
            @Composable get() = TrendyolDesign.typography.subtitle

        override fun strokeWidth(style: CheckboxStyle): Dp =
            if (style is TrendyolCheckBoxStyle.Secondary) 1.2.dp else 1.75.dp
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
            @Composable get() = TrendyolDesign.typography.body1

        override fun strokeWidth(style: CheckboxStyle): Dp =
            if (style is TrendyolCheckBoxStyle.Secondary) 1.dp else 1.25.dp
    }
}
