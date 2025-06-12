@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.core.search

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.Cancel
import com.trendyol.design.core.icon.icons.fill.Search
import com.trendyol.design.core.inputfield.KPOutlinedTextField
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.KPText
import com.trendyol.design.core.text.Text
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign

/**
 * The [KPSearchBar] composable function creates a customizable search bar with various parameters.
 *
 * @param value the input to be shown in the search bar
 * @param style determines the style of the search bar.
 * It can be either [KPSearchBarStyle.Outline] or [KPSearchBarStyle.Filled]
 * @param size determines the size of the search bar.
 * It can be either [KPSearchBarSize.Small] or [KPSearchBarSize.Medium]
 * @param onValueChange the callback that is triggered when the input service updates values
 * @param onTrailingIconClick the callback that is triggered when the trailing icon clicked
 * in the search bar. An updated search bar value comes as a parameter of the callback
 * @param modifier a [Modifier] for this search bar
 * @param colors [TextFieldColors] that will be used to resolve color of the text and content
 * (including placeholder, leading and trailing icons, border) for this search bar
 * in different states. See [KPSearchBarStyle]
 * @param placeholder the optional placeholder to be displayed when the search bar is in focus
 * and the input text is empty. Default is "Ürün Ara"
 * @param radius the radius to be applied to the search bar corners. Default is [KPSearchBarRadius.Small]
 * @param keyboardOptions software keyboard options that contains configuration
 * @param keyboardActions when the input service emits an IME action, the corresponding callback
 * @param interactionSource the [MutableInteractionSource] representing the stream of
 * interactions for this OutlinedTextField. You can create and pass in your own remembered
 * [MutableInteractionSource] if you want to observe interactions and customize the
 * appearance / behavior of this KPSearchBar in different interactions.
 */
@ExperimentalKompostoApi
@Composable
public fun KPSearchBar(
    value: String,
    style: SearchBarStyle,
    size: SearchBarSize,
    onValueChange: (String) -> Unit,
    onTrailingIconClick: () -> Unit,
    modifier: Modifier = Modifier,
    colors: TextFieldColors = style.searchBarColors,
    placeholder: String? = SEARCH_BAR_PLACEHOLDER,
    radius: KPSearchBarRadius = KPSearchBarRadius.Small,
    keyboardOptions: KeyboardOptions = KeyboardOptions(
        keyboardType = KeyboardType.Text,
        imeAction = ImeAction.Search
    ),
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    KPOutlinedTextField(
        modifier = modifier,
        value = value,
        placeholder = if (!placeholder.isNullOrBlank()) {
            {
                KPText(
                    text = placeholder,
                    style = KPDesign.typography.subtitleColorOnSurfaceVariant2,
                )
            }
        } else null,
        onValueChange = onValueChange,
        leadingIcon = {
            KPIcon(
                modifier = Modifier.padding(start = 16.dp, end = 8.dp),
                imageVector = KPIcons.Fill.Search,
                size = KPIconSize.Small,
                tint = Color.Unspecified
            )
        },
        trailingIcon = {
            if (value.isNotBlank()) {
                KPIcon(
                    modifier = Modifier
                        .padding(size.trailingIconPadding)
                        .clickable {
                            onTrailingIconClick.invoke()
                        },
                    imageVector = KPIcons.Fill.Cancel,
                    size = KPIconSize.XSmall,
                    tint = Color.Unspecified
                )
            }
        },
        textStyle = KPDesign.typography.subtitle.copy(color = Color.Unspecified),
        colors = colors,
        isFilled = style is KPSearchBarStyle.Filled,
        singleLine = true,
        minHeight = size.barHeight,
        shape = RoundedCornerShape(radius.value),
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions,
        interactionSource = interactionSource,
    )
}

/**
 * The [SearchBar] composable function creates a customizable search bar with various parameters.
 *
 * @param value the input to be shown in the search bar
 * @param style determines the style of the search bar.
 * It can be either [TrendyolSearchBarStyle.Outline] or [TrendyolSearchBarStyle.Filled]
 * @param size determines the size of the search bar.
 * It can be either [TrendyolSearchBarSize.Small] or [TrendyolSearchBarSize.Medium]
 * @param onValueChange the callback that is triggered when the input service updates values
 * in the search bar. An updated search bar value comes as a parameter of the callback
 * @param modifier a [Modifier] for this search bar
 * @param colors [TextFieldColors] that will be used to resolve color of the text and content
 * (including placeholder, leading and trailing icons, border) for this search bar
 * in different states. See [TrendyolSearchBarStyle]
 * @param placeholder the optional placeholder to be displayed when the search bar is in focus
 * and the input text is empty. Default is "Ürün Ara"
 */
@Composable
@Deprecated(
    message = "Use KPSearchBar instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun SearchBar(
    value: String,
    style: SearchBarStyle,
    size: SearchBarSize,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    colors: TextFieldColors = style.searchBarColors,
    placeholder: String? = SEARCH_BAR_PLACEHOLDER,
) {
    KPOutlinedTextField(
        modifier = modifier,
        value = value,
        placeholder = if (!placeholder.isNullOrBlank()) {
            {
                Text(
                    text = placeholder,
                    style = TrendyolDesign.typography.subtitleColorOnSurfaceVariant2,
                )
            }
        } else null,
        onValueChange = onValueChange,
        leadingIcon = {
            Icon(
                modifier = Modifier.padding(start = 16.dp, end = 8.dp),
                imageVector = Icons.Fill.Search,
                size = TrendyolIconSize.Small,
                tint = Color.Unspecified
            )
        },
        trailingIcon = {
            if (value.isNotBlank()) {
                Icon(
                    modifier = Modifier
                        .padding(size.trailingIconPadding)
                        .clickable { onValueChange(EMPTY) },
                    imageVector = Icons.Fill.Cancel,
                    size = TrendyolIconSize.XSmall,
                    tint = Color.Unspecified
                )
            }
        },
        textStyle = TrendyolDesign.typography.subtitle.copy(color = Color.Unspecified),
        colors = colors,
        isFilled = style is TrendyolSearchBarStyle.Filled,
        singleLine = true,
        minHeight = size.barHeight,
        shape = RoundedCornerShape(8.dp),
    )
}

private const val SEARCH_BAR_PLACEHOLDER = "Ürün Ara"
private const val EMPTY = ""

@Preview(showBackground = true)
@Composable
private fun SmallOutlineSearchBarPreview() {
    PreviewTheme {
        KPSearchBar(
            modifier = Modifier.padding(8.dp),
            value = "",
            style = KPSearchBarStyle.Outline,
            size = KPSearchBarSize.Small,
            onValueChange = {},
            onTrailingIconClick = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SmallOutlineSearchBarLargeRadiusPreview() {
    PreviewTheme {
        KPSearchBar(
            modifier = Modifier.padding(8.dp),
            value = "",
            style = KPSearchBarStyle.Outline,
            radius = KPSearchBarRadius.Large,
            size = KPSearchBarSize.Small,
            onValueChange = {},
            onTrailingIconClick = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MediumOutlineSearchBarPreview() {
    PreviewTheme {
        KPSearchBar(
            modifier = Modifier.padding(8.dp),
            value = "",
            style = KPSearchBarStyle.Outline,
            size = KPSearchBarSize.Medium,
            onValueChange = {},
            onTrailingIconClick = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MediumOutlineSearchBarLargeRadiusPreview() {
    PreviewTheme {
        KPSearchBar(
            modifier = Modifier.padding(8.dp),
            value = "",
            style = KPSearchBarStyle.Outline,
            radius = KPSearchBarRadius.Large,
            size = KPSearchBarSize.Medium,
            onValueChange = {},
            onTrailingIconClick = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SmallFilledSearchBarPreview() {
    PreviewTheme {
        KPSearchBar(
            modifier = Modifier.padding(8.dp),
            value = "",
            style = KPSearchBarStyle.Filled,
            size = KPSearchBarSize.Small,
            onValueChange = {},
            onTrailingIconClick = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SmallFilledSearchBarLargeRadiusPreview() {
    PreviewTheme {
        KPSearchBar(
            modifier = Modifier.padding(8.dp),
            value = "",
            style = KPSearchBarStyle.Filled,
            radius = KPSearchBarRadius.Large,
            size = KPSearchBarSize.Small,
            onValueChange = {},
            onTrailingIconClick = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MediumFilledSearchBarPreview() {
    PreviewTheme {
        KPSearchBar(
            modifier = Modifier.padding(8.dp),
            value = "",
            style = KPSearchBarStyle.Filled,
            size = KPSearchBarSize.Medium,
            onValueChange = {},
            onTrailingIconClick = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MediumFilledSearchBarLargeRadiusPreview() {
    PreviewTheme {
        KPSearchBar(
            modifier = Modifier.padding(8.dp),
            value = "",
            style = KPSearchBarStyle.Filled,
            radius = KPSearchBarRadius.Large,
            size = KPSearchBarSize.Medium,
            onValueChange = {},
            onTrailingIconClick = {},
        )
    }
}
