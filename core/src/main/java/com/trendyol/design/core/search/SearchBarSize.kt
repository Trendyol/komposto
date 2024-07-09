package com.trendyol.design.core.search

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp

/**
 * Size configuration for a [SearchBar].
 *
 * @property barHeight Height of the search bar.
 * @property barRadius Corner radius of the search bar.
 * @property leadingIconPadding Icon padding of the search bar leading icon.
 * @property trailingIconPadding Icon padding of the search bar trailing icon.
 */
interface SearchBarSize {

    @get:Composable
    val barHeight: Dp

    @get:Composable
    val barRadius: Dp

    @get:Composable
    val leadingIconPadding: PaddingValues

    @get:Composable
    val trailingIconPadding: PaddingValues
}
