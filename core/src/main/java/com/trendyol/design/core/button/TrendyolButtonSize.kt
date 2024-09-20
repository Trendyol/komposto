package com.trendyol.design.core.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.trendyol.theme.TrendyolDesign

public sealed interface TrendyolButtonSize {

    public data object Large : ButtonSize {
        override val contentPadding: PaddingValues
            get() = PaddingValues(vertical = (10.5).dp, horizontal = 20.dp)
        override val font: TextStyle
            @Composable
            get() = TrendyolDesign.typography.titleBold
    }

    public data object Medium : ButtonSize {
        override val contentPadding: PaddingValues
            get() = PaddingValues(vertical = 8.dp, horizontal = 10.dp)
        override val font: TextStyle
            @Composable
            get() = TrendyolDesign.typography.body1Medium
    }

    public data object Small : ButtonSize {
        override val contentPadding: PaddingValues
            get() = PaddingValues(vertical = 5.dp, horizontal = 10.dp)
        override val font: TextStyle
            @Composable
            get() = TrendyolDesign.typography.body1Medium
    }

    public data object XSmall : ButtonSize {
        override val contentPadding: PaddingValues
            get() = PaddingValues(vertical = 4.dp, horizontal = 10.dp)
        override val font: TextStyle
            @Composable
            get() = TrendyolDesign.typography.body2Medium
    }
}
