package com.trendyol.design.core.search

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * The [TrendyolSearchBarSize] sealed interface defines the possible sizes for the search bar.
 * It includes two predefined sizes: [Small] and [Medium].
 */
public sealed interface TrendyolSearchBarSize {

    public data object Small : SearchBarSize {
        override val barHeight: Dp
            @Composable
            get() = 32.dp
        override val trailingIconPadding: PaddingValues
            @Composable
            get() = PaddingValues(horizontal = 16.dp)
    }

    public data object Medium : SearchBarSize {
        override val barHeight: Dp
            @Composable
            get() = 40.dp
        override val trailingIconPadding: PaddingValues
            @Composable
            get() = PaddingValues(horizontal = 16.dp)
    }
}
