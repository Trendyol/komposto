package com.trendyol.design.core.search

import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable

/**
 * Interface representing the style configuration for [SearchBar].
 *
 * @property searchBarColors Color configuration for the search bar.
 */
public interface SearchBarStyle {

    @get:Composable
    public val searchBarColors: TextFieldColors
}
