package com.trendyol.design.ui.component.inputfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.search.SearchBar
import com.trendyol.design.core.search.TrendyolSearchBarSize
import com.trendyol.design.core.search.TrendyolSearchBarStyle
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

private const val SEARCH = "Search"

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_SEARCH_BAR,
    styleName = "1.Default"
)
@Composable
internal fun Input_Field_4_SearchBar_1_Default() = TrendyolTheme {
    var value by remember { mutableStateOf("") }
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        SearchBar(
            value = value,
            style = TrendyolSearchBarStyle.Outline,
            size = TrendyolSearchBarSize.Small,
            onValueChange = {
                value = it
            }
        )
        SearchBar(
            value = value,
            style = TrendyolSearchBarStyle.Outline,
            size = TrendyolSearchBarSize.Medium,
            onValueChange = {
                value = it
            }
        )
        SearchBar(
            value = value,
            style = TrendyolSearchBarStyle.Filled,
            size = TrendyolSearchBarSize.Small,
            onValueChange = {
                value = it
            }
        )
        SearchBar(
            value = value,
            style = TrendyolSearchBarStyle.Filled,
            size = TrendyolSearchBarSize.Medium,
            onValueChange = {
                value = it
            }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_SEARCH_BAR,
    styleName = "2.Typed"
)
@Composable
internal fun Input_Field_4_SearchBar_2_Typed() = TrendyolTheme {
    var value by remember { mutableStateOf(SEARCH) }
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        SearchBar(
            value = value,
            style = TrendyolSearchBarStyle.Filled,
            size = TrendyolSearchBarSize.Small,
            onValueChange = {
                value = it
            }
        )
        SearchBar(
            value = value,
            style = TrendyolSearchBarStyle.Filled,
            size = TrendyolSearchBarSize.Small,
            onValueChange = {
                value = it
            }
        )
        SearchBar(
            value = value,
            style = TrendyolSearchBarStyle.Filled,
            size = TrendyolSearchBarSize.Small,
            onValueChange = {
                value = it
            }
        )
        SearchBar(
            value = value,
            style = TrendyolSearchBarStyle.Filled,
            size = TrendyolSearchBarSize.Medium,
            onValueChange = {
                value = it
            }
        )
    }
}
