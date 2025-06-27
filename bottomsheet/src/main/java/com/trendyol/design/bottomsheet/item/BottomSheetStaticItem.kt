@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.bottomsheet.item

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.icons.fill.Bullet
import com.trendyol.design.core.icon.icons.outline.Union
import com.trendyol.design.bottomsheet.preview.PreviewTheme
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign

/**
 * A composable function that creates a static item with a text label, optional description, and optional icon for a bottom sheet.
 *
 * @param text The text label to be displayed for the item.
 * @param onClick A lambda function to be invoked when the item is clicked.
 * @param modifier A `Modifier` for styling and layout customization. Default is `Modifier`.
 * @param icon An optional `ImageVector` for the icon to be displayed next to the text. Default is `null`.
 * @param iconPosition An `Alignment.Vertical` value to position the icon vertically. Default is `Alignment.CenterVertically`.
 * @param textStyle A `TextStyle` for customizing the appearance of the text label. Default is `KPDesign.typography.subtitleMediumColorOnSurfaceVariant3`.
 * @param description An optional description text to be displayed below the label. Default is an empty string.
 * @param descriptionTextStyle A `TextStyle` for customizing the appearance of the description text. Default is `KPDesign.typography.body1ColorOnSurfaceVariant1`.
 */
@ExperimentalKompostoApi
@Composable
public fun KPBottomSheetStaticItem(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    iconPosition: Alignment.Vertical = Alignment.CenterVertically,
    textStyle: TextStyle = KPDesign.typography.subtitleMediumColorOnSurfaceVariant3,
    description: String = "",
    descriptionTextStyle: TextStyle = KPDesign.typography.body1ColorOnSurfaceVariant1,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        verticalAlignment = iconPosition,
    ) {
        if (icon != null) {
            KPIcon(imageVector = icon, size = KPIconSize.XSmall)
            if (icon != KPIcons.Fill.Bullet) {
                Spacer(modifier = Modifier.width(4.dp))
            }
        }
        Column {
            KPText(
                text = text,
                style = textStyle,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            if (description.isNotEmpty()) {
                Spacer(modifier = Modifier.height(4.dp))
                KPText(
                    text = description,
                    style = descriptionTextStyle,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() = PreviewTheme {
    KPBottomSheetStaticItem(
        text = "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
        onClick = {},
        icon = KPIcons.Outline.Union,
        description = "DescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescription",
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview1() = PreviewTheme {
    KPBottomSheetStaticItem(
        text = "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
        onClick = {},
        icon = KPIcons.Fill.Bullet,
        description = "DescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescription",
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview2() = PreviewTheme {
    KPBottomSheetStaticItem(
        text = "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
        onClick = {},
        icon = KPIcons.Fill.Bullet,
        iconPosition = Alignment.Top,
        description = "DescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescription",
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview3() = PreviewTheme {
    KPBottomSheetStaticItem(
        text = "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle",
        onClick = {},
        icon = null,
        description = "DescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescription",
    )
}
