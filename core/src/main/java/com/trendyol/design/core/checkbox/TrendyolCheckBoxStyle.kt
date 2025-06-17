package com.trendyol.design.core.checkbox

import androidx.compose.material.ContentAlpha
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.theme.KPDesign

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
