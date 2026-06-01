package com.trendyol.design.core.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

public sealed interface KPCheckboxStyle {

    public data object Primary : CheckboxStyle {

        override val colors: KPCheckboxColors
            @Composable get() = KPCheckboxDefaults.primaryColors()

        override val innerPadding: Dp
            get() = 0.dp
    }

    public data object Secondary : CheckboxStyle {

        override val colors: KPCheckboxColors
            @Composable get() = KPCheckboxDefaults.secondaryColors()

        override val innerPadding: Dp
            get() = 2.dp
    }

    public companion object {

        public fun primary(
            uncheckedBoxColor: Color,
        ): CheckboxStyle = CustomCheckboxStyle(
            colorProvider = {
                KPCheckboxDefaults.primaryColors(
                    uncheckedBoxColor = uncheckedBoxColor,
                )
            },
            innerPadding = 0.dp,
        )
    }
}

private class CustomCheckboxStyle(
    private val colorProvider: @Composable () -> KPCheckboxColors,
    override val innerPadding: Dp,
) : CheckboxStyle {

    override val colors: KPCheckboxColors
        @Composable get() = colorProvider()
}
