package com.trendyol.design.core.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.trendyol.theme.KPDesign

public sealed interface KPButtonSize {

    public data object Large : ButtonSize {
        override val contentPadding: PaddingValues
            get() = PaddingValues(vertical = (10.5).dp, horizontal = 20.dp)
        override val font: TextStyle
            @Composable
            get() = KPDesign.typography.titleBold
    }

    public data object Medium : ButtonSize {
        override val contentPadding: PaddingValues
            get() = PaddingValues(vertical = 8.dp, horizontal = 10.dp)
        override val font: TextStyle
            @Composable
            get() = KPDesign.typography.body1Medium
    }

    public data object Small : ButtonSize {
        override val contentPadding: PaddingValues
            get() = PaddingValues(vertical = 5.dp, horizontal = 10.dp)
        override val font: TextStyle
            @Composable
            get() = KPDesign.typography.body1Medium
    }

    public data object XSmall : ButtonSize {
        override val contentPadding: PaddingValues
            get() = PaddingValues(vertical = 4.dp, horizontal = 10.dp)
        override val font: TextStyle
            @Composable
            get() = KPDesign.typography.body2Medium
    }
}
