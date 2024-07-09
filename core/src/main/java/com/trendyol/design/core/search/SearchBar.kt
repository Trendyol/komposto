package com.trendyol.design.core.search

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.Cancel
import com.trendyol.design.core.icon.icons.fill.Search
import com.trendyol.design.core.inputfield.TrendyolOutlinedTextField
import com.trendyol.design.core.previewtheme.PreviewTheme
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

/**
 * The [SearchBar] composable function creates a customizable search bar with various parameters.
 *
 * @param value the input to be shown in the search bar
 * @param style determines the style of the search bar.
 * It can be either [TrendyolSearchBarStyle.Outline] or [TrendyolSearchBarStyle.Filled]
 * @param size determines the size of the search bar.
 * It can be either [TrendyolSearchBarSize.Small] or [TrendyolSearchBarSize.Large]
 * @param onValueChange the callback that is triggered when the input service updates values
 * in the search bar. An updated search bar value comes as a parameter of the callback
 * @param modifier a [Modifier] for this search bar
 * @param colors [TextFieldColors] that will be used to resolve color of the text and content
 * (including placeholder, leading and trailing icons, border) for this search bar
 * in different states. See [TextFieldDefaults.textFieldColors]
 * @param placeholder the optional placeholder to be displayed when the search bar is in focus
 * and the input text is empty. Default is "Ürün Ara"
 */
@Composable
fun SearchBar(
    value: String,
    style: SearchBarStyle,
    size: SearchBarSize,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    colors: TextFieldColors = style.searchBarColors,
    placeholder: String? = SEARCH_BAR_PLACEHOLDER,
) {
    var text by rememberSaveable { mutableStateOf(value) }

    TrendyolOutlinedTextField(
        modifier = modifier,
        value = text,
        placeholder = if (!placeholder.isNullOrBlank()) {
            {
                Text(
                    text = placeholder,
                    style = TrendyolDesign.typography.subtitleColorOnSurfaceVariant2,
                )
            }
        } else null,
        onValueChange = { changedValue ->
            text = changedValue
            onValueChange(changedValue)
        },
        leadingIcon = {
            Icon(
                modifier = Modifier.padding(size.leadingIconPadding),
                imageVector = Icons.Fill.Search,
                size = TrendyolIconSize.Small,
                tint = Color.Unspecified
            )
        },
        trailingIcon = {
            if (text.isNotBlank()) {
                Icon(
                    modifier = Modifier
                        .padding(size.trailingIconPadding)
                        .clickable { text = "" },
                    imageVector = Icons.Fill.Cancel,
                    size = TrendyolIconSize.XSmall,
                    tint = Color.Unspecified
                )
            }
        },
        colors = colors,
        isFilled = style is TrendyolSearchBarStyle.Filled,
        singleLine = true,
        minHeight = size.barHeight,
        shape = RoundedCornerShape(size.barRadius),
    )
}

private const val SEARCH_BAR_PLACEHOLDER = "Ürün Ara"

@Preview(showBackground = true)
@Composable
private fun SmallOutlineSearchBarPreview() {
    PreviewTheme {
        SearchBar(
            modifier = Modifier.padding(8.dp),
            value = "",
            style = TrendyolSearchBarStyle.Outline,
            size = TrendyolSearchBarSize.Small,
            onValueChange = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun LargeOutlineSearchBarPreview() {
    PreviewTheme {
        SearchBar(
            modifier = Modifier.padding(8.dp),
            value = "",
            style = TrendyolSearchBarStyle.Outline,
            size = TrendyolSearchBarSize.Large,
            onValueChange = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SmallFilledSearchBarPreview() {
    PreviewTheme {
        SearchBar(
            modifier = Modifier.padding(8.dp),
            value = "",
            style = TrendyolSearchBarStyle.Filled,
            size = TrendyolSearchBarSize.Small,
            onValueChange = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun LargeFilledSearchBarPreview() {
    PreviewTheme {
        SearchBar(
            modifier = Modifier.padding(8.dp),
            value = "",
            style = TrendyolSearchBarStyle.Filled,
            size = TrendyolSearchBarSize.Large,
            onValueChange = {},
        )
    }
}
