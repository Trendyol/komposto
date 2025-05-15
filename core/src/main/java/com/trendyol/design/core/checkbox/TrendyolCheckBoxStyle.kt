package com.trendyol.design.core.checkbox

import androidx.compose.material.ContentAlpha
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign

public sealed interface KPCheckboxStyle {

    public data object Primary : CheckboxStyle {

        override val colors: KPCheckboxColors
            @Composable get() = KPCheckboxDefaults.colors(
                checkedColor = KPDesign.colors.colorPrimary,
                uncheckedColor = KPDesign.colors.colorOnSurfaceVariant1,

                checkmarkColor = KPDesign.colors.colorSurface,
                disabledCheckmarkColor = KPDesign.colors.colorSurface,

                disabledColor = KPDesign.colors.colorOnSurfaceVariant1,
                checkBoxColor = KPDesign.colors.colorPrimary,
                disabledBoxColor = KPDesign.colors.colorOnSurfaceVariant1,

                disabledIndeterminateColor = KPDesign.colors.colorPrimary.copy(
                    alpha = ContentAlpha.disabled
                )
            )

        override val innerPadding: Dp
            get() = 0.dp
    }

    public data object Secondary : CheckboxStyle {

        override val colors: KPCheckboxColors
            @Composable get() = KPCheckboxDefaults.colors(
                checkedColor = KPDesign.colors.colorPrimary,
                uncheckedColor = KPDesign.colors.colorBorder,

                checkmarkColor = KPDesign.colors.colorPrimary,
                disabledCheckmarkColor = KPDesign.colors.colorOnSurfaceVariant1,

                disabledColor = KPDesign.colors.colorOnSurfaceVariant1,
                checkBoxColor = KPDesign.colors.colorSurface,
                disabledBoxColor = KPDesign.colors.colorSurface,

                disabledIndeterminateColor = KPDesign.colors.colorPrimary.copy(
                    alpha = ContentAlpha.disabled
                )
            )

        override val innerPadding: Dp
            get() = 2.dp
    }
}

/**
 * This sealed interface defines different styles for Trendyol checkboxes.
 * CheckboxStyle provides options for specifying colors, padding,
 * stroke width, and different styles for checkbox labels or contents.
 */
@Deprecated(
    message = "Use KPCheckBoxStyle instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPCheckBoxStyle",
    ),
    level = DeprecationLevel.WARNING
)
public sealed interface TrendyolCheckBoxStyle {

    public data object Primary : CheckboxStyle {

        override val colors: TrendyolCheckboxColors
            @Composable get() = TrendyolCheckboxDefaults.colors(
                checkedColor = TrendyolDesign.colors.colorPrimary,
                uncheckedColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                checkmarkColor = TrendyolDesign.colors.colorSurface,
                disabledCheckmarkColor = TrendyolDesign.colors.colorSurface,

                disabledColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                checkBoxColor = TrendyolDesign.colors.colorPrimary,
                disabledBoxColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                disabledIndeterminateColor = TrendyolDesign.colors.colorPrimary.copy(
                    alpha = ContentAlpha.disabled
                )
            )

        override val innerPadding: Dp
            get() = 0.dp
    }

    public data object Secondary : CheckboxStyle {

        override val colors: TrendyolCheckboxColors
            @Composable get() = TrendyolCheckboxDefaults.colors(
                checkedColor = TrendyolDesign.colors.colorPrimary,
                uncheckedColor = TrendyolDesign.colors.colorBorder,

                checkmarkColor = TrendyolDesign.colors.colorPrimary,
                disabledCheckmarkColor = TrendyolDesign.colors.colorOnSurfaceVariant1,

                disabledColor = TrendyolDesign.colors.colorOnSurfaceVariant1,
                checkBoxColor = TrendyolDesign.colors.colorSurface,
                disabledBoxColor = TrendyolDesign.colors.colorSurface,

                disabledIndeterminateColor = TrendyolDesign.colors.colorPrimary.copy(
                    alpha = ContentAlpha.disabled
                )
            )

        override val innerPadding: Dp
            get() = 2.dp
    }
}
