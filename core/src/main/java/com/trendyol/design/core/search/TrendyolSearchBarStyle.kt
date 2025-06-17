package com.trendyol.design.core.search

import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import com.trendyol.theme.KPDesign

public sealed interface KPSearchBarStyle : SearchBarStyle {

    public data object Outline : KPSearchBarStyle {
        override val searchBarColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = KPDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = KPDesign.colors.colorSurface,
                unfocusedBorderColor = KPDesign.colors.colorBorder,
                focusedBorderColor = KPDesign.colors.colorBorder,
                cursorColor = KPDesign.colors.colorPrimary,
            )
    }

    public data object Filled : KPSearchBarStyle {
        override val searchBarColors: TextFieldColors
            @Composable
            get() = TextFieldDefaults.outlinedTextFieldColors(
                textColor = KPDesign.colors.colorOnSurfaceVariant3,
                backgroundColor = KPDesign.colors.colorBackground,
                unfocusedBorderColor = KPDesign.colors.colorBorder,
                focusedBorderColor = KPDesign.colors.colorBorder,
                cursorColor = KPDesign.colors.colorPrimary,
            )
    }
}
