package com.trendyol.design.core.search

import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import com.trendyol.theme.TrendyolDesign

/**
 * The [TrendyolSearchBarStyle] sealed interface defines the possible styles for the search bar.
 * It includes two predefined styles: [Outline] and [Filled].
 */
sealed interface TrendyolSearchBarStyle {

    data object Outline : SearchBarStyle {
        override val searchBarColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = TrendyolDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = TrendyolDesign.colors.colorSurface,
                unfocusedBorderColor = TrendyolDesign.colors.colorBorder,
                focusedBorderColor = TrendyolDesign.colors.colorBorder,
                cursorColor = TrendyolDesign.colors.colorPrimary,
            )
    }

    data object Filled : SearchBarStyle {
        override val searchBarColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = TrendyolDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = TrendyolDesign.colors.colorBackground,
                unfocusedBorderColor = TrendyolDesign.colors.colorBorder,
                focusedBorderColor = TrendyolDesign.colors.colorBorder,
                cursorColor = TrendyolDesign.colors.colorPrimary,
            )
    }
}