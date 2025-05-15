package com.trendyol.design.core.search

import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign

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

/**
 * The [TrendyolSearchBarStyle] sealed interface defines the possible styles for the search bar.
 * It includes two predefined styles: [Outline] and [Filled].
 */
@Deprecated(
    message = "Use KPSearchBarStyle instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPSearchBarStyle"
    ),
    level = DeprecationLevel.WARNING
)
public sealed interface TrendyolSearchBarStyle {

    public data object Outline : SearchBarStyle {
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

    public data object Filled : SearchBarStyle {
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
