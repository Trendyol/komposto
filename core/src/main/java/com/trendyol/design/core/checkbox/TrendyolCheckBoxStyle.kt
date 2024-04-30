package com.trendyol.design.core.checkbox

import androidx.compose.material.ContentAlpha
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.theme.TrendyolDesign

/**
 * This sealed interface defines different styles for Trendyol checkboxes.
 * CheckboxStyle provides options for specifying colors, padding,
 * stroke width, and different styles for checkbox labels or contents.
 */
sealed interface TrendyolCheckBoxStyle {

    data object Primary : CheckboxStyle {

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

        override val padding: Dp
            get() = 0.dp

        override val strokeWith: Dp
            get() = 2.dp
    }

    data class PrimaryWithText(override val text: String) : CheckboxStyle.Text {

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

        override val padding: Dp
            get() = 0.dp

        override val strokeWith: Dp
            get() = 2.dp
    }

    data class PrimaryWithContent(
        override val content: @Composable () -> Unit
    ) : CheckboxStyle.Content {
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

        override val padding: Dp
            get() = 0.dp

        override val strokeWith: Dp
            get() = 2.dp
    }

    data object Secondary : CheckboxStyle {

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

        override val padding: Dp
            get() = 2.dp

        override val strokeWith: Dp
            get() = 1.dp
    }

    data class SecondaryWithText(override val text: String) : CheckboxStyle.Text {

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

        override val padding: Dp
            get() = 2.dp

        override val strokeWith: Dp
            get() = 1.dp
    }

    data class SecondaryWithContent(
        override val content: @Composable () -> Unit
    ) : CheckboxStyle.Content {
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

        override val padding: Dp
            get() = 2.dp

        override val strokeWith: Dp
            get() = 1.dp
    }
}
