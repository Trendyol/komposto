package com.trendyol.design.bottomsheet.item

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.Tick
import com.trendyol.design.core.icon.icons.outline.Info
import com.trendyol.design.core.text.Text
import com.trendyol.design.bottomsheet.preview.PreviewTheme
import com.trendyol.theme.TrendyolDesign

/**
 * A composable function that creates a single-select item with a text label, optional description, helper text, and icon for a bottom sheet.
 *
 * @param selected A boolean value that determines whether the item is selected.
 * @param text The text label to be displayed for the item.
 * @param onClick A lambda function to be invoked when the item is clicked.
 * @param modifier A `Modifier` for styling and layout customization. Default is `Modifier`.
 * @param isIconVisible A boolean value that determines whether the icon is visible. Default is `true`.
 * @param textStyle A `TextStyle` for customizing the appearance of the text label. Default is `TrendyolDesign.typography.titleMediumColorOnSurfaceVariant3`.
 * @param helperText An optional helper text to be displayed next to the item. Default is an empty string.
 * @param helperTextStyle A `TextStyle` for customizing the appearance of the helper text. Default is `TrendyolDesign.typography.body2MediumColorWarning`.
 * @param description An optional description text to be displayed below the label. Default is an empty string.
 * @param descriptionTextStyle A `TextStyle` for customizing the appearance of the description text. Default is `TrendyolDesign.typography.body1ColorOnSurfaceVariant1`.
 */
@Composable
fun BottomSheetSingleSelectItem(
    selected: Boolean,
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isIconVisible: Boolean = true,
    textStyle: TextStyle = TrendyolDesign.typography.titleMediumColorOnSurfaceVariant3,
    helperText: String = "",
    helperTextStyle: TextStyle = TrendyolDesign.typography.body2MediumColorWarning,
    description: String = "",
    descriptionTextStyle: TextStyle = TrendyolDesign.typography.body1ColorOnSurfaceVariant1,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        if (isIconVisible) {
            Icon(imageVector = Icons.Outline.Info, size = TrendyolIconSize.Small)
            Spacer(modifier = Modifier.width(8.dp))
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(1f),
        ) {
            Column(
                modifier = Modifier.weight(1f),
            ) {
                val textColor = if (selected) {
                    TrendyolDesign.colors.colorPrimary
                } else {
                    textStyle.color
                }
                Text(
                    text = text,
                    style = textStyle.copy(color = textColor),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                if (description.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = description,
                        style = descriptionTextStyle,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
            if (helperText.isNotEmpty()) {
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = helperText,
                    style = helperTextStyle,
                    maxLines = 1,
                )
            }
        }
        if (selected) {
            Spacer(modifier = Modifier.width(16.dp))
            Icon(
                imageVector = Icons.Fill.Tick,
                size = TrendyolIconSize.Small,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() = PreviewTheme {
    BottomSheetSingleSelectItem(
        selected = true,
        text = "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
        onClick = { },
        description = "DescriptionDescriptionDescriptionDescriptionDescriptionDescription",
        helperText = "Helper Text"
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview1() = PreviewTheme {
    BottomSheetSingleSelectItem(
        selected = true,
        text = "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
        onClick = { },
        description = "DescriptionDescriptionDescriptionDescriptionDescriptionDescription",
        helperText = ""
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview2() = PreviewTheme {
    BottomSheetSingleSelectItem(
        selected = true,
        text = "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
        onClick = { },
        description = "DescriptionDescriptionDescriptionDescriptionDescriptionDescription",
        helperText = ""
    )
}
@Preview(showBackground = true)
@Composable
private fun Preview3() = PreviewTheme {
    BottomSheetSingleSelectItem(
        selected = true,
        text = "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
        isIconVisible = false,
        onClick = { },
        description = "DescriptionDescriptionDescriptionDescriptionDescriptionDescription",
        helperText = ""
    )
}
