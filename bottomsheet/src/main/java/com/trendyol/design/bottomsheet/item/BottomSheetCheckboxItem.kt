package com.trendyol.design.bottomsheet.item

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.checkbox.CheckboxContainerType
import com.trendyol.design.core.checkbox.TrendyolCheckBoxSize
import com.trendyol.design.core.checkbox.TrendyolCheckBoxStyle
import com.trendyol.design.core.checkbox.TrendyolCheckbox
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.IconSize
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.outline.Info
import com.trendyol.design.core.text.Text
import com.trendyol.design.bottomsheet.preview.PreviewTheme
import com.trendyol.theme.TrendyolDesign

/**
 * A composable function that creates a checkbox item with a text label and optional description for a bottom sheet.
 *
 * @param checked A boolean value that determines whether the checkbox is checked.
 * @param text The text label to be displayed next to the checkbox.
 * @param onCheckedChange A lambda function to be invoked when the checked state changes.
 * @param modifier A `Modifier` for styling and layout customization. Default is `Modifier`.
 * @param textStyle A `TextStyle` for customizing the appearance of the text label. Default is `TrendyolDesign.typography.titleMediumColorOnSurfaceVariant3`.
 * @param iconSize An `IconSize` for customizing the size of the info icon. Default is `TrendyolIconSize.XSmall`.
 * @param description An optional description text to be displayed below the label. Default is an empty string.
 * @param descriptionTextStyle A `TextStyle` for customizing the appearance of the description text. Default is `TrendyolDesign.typography.body1ColorOnSurfaceVariant1`.
 */
@Composable
fun BottomSheetCheckboxItem(
    checked: Boolean,
    text: String,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = TrendyolDesign.typography.titleMediumColorOnSurfaceVariant3,
    iconSize: IconSize = TrendyolIconSize.XSmall,
    description: String = "",
    descriptionTextStyle: TextStyle = TrendyolDesign.typography.body1ColorOnSurfaceVariant1,
) {
    TrendyolCheckbox(
        checked = checked,
        containerType = CheckboxContainerType.Content {
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(text = text, style = textStyle, maxLines = 1)
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(imageVector = Icons.Outline.Info, size = iconSize)
                }
                if (description.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = description,
                        style = descriptionTextStyle,
                        maxLines = 1,
                    )
                }
            }
        },
        style = TrendyolCheckBoxStyle.Primary,
        size = TrendyolCheckBoxSize.Medium,
        onCheckedChange = onCheckedChange,
        modifier = modifier
            .fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview() = PreviewTheme {
    BottomSheetCheckboxItem(
        checked = true,
        text = "Title",
        onCheckedChange = {},
    )
}

@Preview(showBackground = true)
@Composable
private fun BottomSheetCheckboxItemWithDescription() = PreviewTheme {
    BottomSheetCheckboxItem(
        checked = false,
        text = "Title",
        onCheckedChange = {},
        description = "description"
    )
}
