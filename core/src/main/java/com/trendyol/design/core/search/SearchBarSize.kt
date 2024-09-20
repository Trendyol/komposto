package com.trendyol.design.core.search

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp

/**
 * Size configuration for a [SearchBar].
 *
 * @property barHeight Height of the search bar.
 * @property trailingIconPadding Icon padding of the search bar trailing icon.
 */
public interface SearchBarSize {

    @get:Composable
    public val barHeight: Dp

    @get:Composable
    public val trailingIconPadding: PaddingValues
}
