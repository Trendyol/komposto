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
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.IconSize
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.outline.Info
import com.trendyol.design.core.radiobutton.TrendyolRadioButton
import com.trendyol.design.core.radiobutton.TrendyolRadioButtonContainerType
import com.trendyol.design.core.radiobutton.TrendyolRadioButtonSize
import com.trendyol.design.core.text.Text
import com.trendyol.design.bottomsheet.preview.PreviewTheme
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.radiobutton.KPRadioButton
import com.trendyol.design.core.radiobutton.KPRadioButtonContainerType
import com.trendyol.design.core.radiobutton.KPRadioButtonSize
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign

/**
 * A composable function that creates a radio button item with a text label and optional description for a bottom sheet.
 *
 * @param selected A boolean value that determines whether the radio button is selected.
 * @param text The text label to be displayed next to the radio button.
 * @param onClick A lambda function to be invoked when the radio button is clicked.
 * @param modifier A `Modifier` for styling and layout customization. Default is `Modifier`.
 * @param isIconVisible A boolean value indicating whether an icon should be displayed next to the text. Default is `false`.
 * @param textStyle A `TextStyle` for customizing the appearance of the text label. Default is `KPDesign.typography.titleMediumColorOnSurfaceVariant3`.
 * @param iconSize An `IconSize` for customizing the size of the info icon. Default is `KPIconSize.XSmall`.
 * @param description An optional description text to be displayed below the label. Default is an empty string.
 * @param descriptionTextStyle A `TextStyle` for customizing the appearance of the description text. Default is `KPDesign.typography.body1ColorOnSurfaceVariant1`.
 */
@Composable
public fun KPBottomSheetRadioItem(
    selected: Boolean,
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isIconVisible: Boolean = false,
    textStyle: TextStyle = KPDesign.typography.titleMediumColorOnSurfaceVariant3,
    iconSize: IconSize = KPIconSize.XSmall,
    description: String = "",
    descriptionTextStyle: TextStyle = KPDesign.typography.body1ColorOnSurfaceVariant1,
) {
    KPRadioButton(
        selected = selected,
        containerType = KPRadioButtonContainerType.Content {
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    KPText(text = text, style = textStyle, maxLines = 1)
                    if (isIconVisible) {
                        Spacer(modifier = Modifier.width(4.dp))
                        KPIcon(imageVector = KPIcons.Outline.Info, size = iconSize)
                    }
                }
                if (description.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(4.dp))
                    KPText(
                        text = description,
                        style = descriptionTextStyle,
                        maxLines = 1
                    )
                }
            }
        },
        size = KPRadioButtonSize.Medium,
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
    )
}

/**
 * A composable function that creates a radio button item with a text label and optional description for a bottom sheet.
 *
 * @param selected A boolean value that determines whether the radio button is selected.
 * @param text The text label to be displayed next to the radio button.
 * @param onClick A lambda function to be invoked when the radio button is clicked.
 * @param modifier A `Modifier` for styling and layout customization. Default is `Modifier`.
 * @param isIconVisible A boolean value indicating whether an icon should be displayed next to the text. Default is `false`.
 * @param textStyle A `TextStyle` for customizing the appearance of the text label. Default is `TrendyolDesign.typography.titleMediumColorOnSurfaceVariant3`.
 * @param iconSize An `IconSize` for customizing the size of the info icon. Default is `TrendyolIconSize.XSmall`.
 * @param description An optional description text to be displayed below the label. Default is an empty string.
 * @param descriptionTextStyle A `TextStyle` for customizing the appearance of the description text. Default is `TrendyolDesign.typography.body1ColorOnSurfaceVariant1`.
 */
@Composable
@Deprecated(
    message = "Use KPBottomSheetRadioItem instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun BottomSheetRadioItem(
    selected: Boolean,
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isIconVisible: Boolean = false,
    textStyle: TextStyle = TrendyolDesign.typography.titleMediumColorOnSurfaceVariant3,
    iconSize: IconSize = TrendyolIconSize.XSmall,
    description: String = "",
    descriptionTextStyle: TextStyle = TrendyolDesign.typography.body1ColorOnSurfaceVariant1,
) {
    TrendyolRadioButton(
        selected = selected,
        containerType = TrendyolRadioButtonContainerType.Content {
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(text = text, style = textStyle, maxLines = 1)
                    if (isIconVisible) {
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(imageVector = Icons.Outline.Info, size = iconSize)
                    }
                }
                if (description.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = description,
                        style = descriptionTextStyle,
                        maxLines = 1
                    )
                }
            }
        },
        size = TrendyolRadioButtonSize.Medium,
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview() = PreviewTheme {
    KPBottomSheetRadioItem(selected = true, text = "Title", onClick = { })
}

@Preview(showBackground = true)
@Composable
private fun BottomSheetRadioItemWithDescription() = PreviewTheme {
    KPBottomSheetRadioItem(selected = true, text = "Title", onClick = { }, description = "description")
}
