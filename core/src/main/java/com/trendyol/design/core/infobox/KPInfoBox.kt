@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.core.infobox

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.KPCustomFilteredColorIcon
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.CircleIcon
import com.trendyol.design.core.icon.icons.fill.InfoIcon
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.KPText
import com.trendyol.design.core.util.customBorder
import com.trendyol.theme.KPDesign

/**
 * [KPInfoBox] is a composable function that displays an information box with a specified style, text, and optional icon.
 * Optionally, it can display an icon and a border.
 *
 * @param style An [InfoBoxStyle] instance that defines the style of the info box.
 * @param text A single text content that will be displayed if the `multiText` parameter is not used.
 * @param modifier A [Modifier] instance to modify the component. The default value is `Modifier`.
 * @param iconPosition Determines the position of the icon, which can be `Arrangement.Start` or `Arrangement.End`.
 * @param showBorder A boolean value to enable border display. The default value is `false`.
 * @param showDashedBorder A boolean value to enable dashed border display. The default value is `false`.
 */
@ExperimentalKompostoApi
@Composable
public fun KPInfoBox(
    style: InfoBoxStyle,
    text: String,
    modifier: Modifier = Modifier,
    iconPosition: Arrangement.Horizontal? = null,
    showBorder: Boolean = false,
    showDashedBorder: Boolean = false,
) {
    val rootModifier = modifier
        .then(
            if (showBorder) {
                modifier.customBorder(
                    color = style.borderColor,
                    shape = RoundedCornerShape(8.dp)
                )
            } else if (showDashedBorder) {
                modifier.customBorder(
                    color = style.borderColor,
                    shape = RoundedCornerShape(8.dp),
                    dashWidth = style.dashedBorderDashWidth,
                    gapWidth = style.dashedBorderGapWidth
                )
            } else {
                modifier
            }
        )
        .background(color = style.backgroundColor, shape = RoundedCornerShape(8.dp))
        .padding(12.dp)

    Row(
        modifier = rootModifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (iconPosition == Arrangement.Start) {
            KPCustomFilteredColorIcon(
                modifier = Modifier.align(Alignment.CenterVertically),
                outerIcon = KPIcons.Fill.CircleIcon,
                outerTint = style.iconTint,
                innerIcon = KPIcons.Fill.InfoIcon,
            )
        }

        Column(modifier = Modifier.weight(1f)) {
            KPText(
                text = text,
                style = KPDesign.typography.body1,
                color = style.textColor,
            )
        }

        if (iconPosition == Arrangement.End) {
            KPCustomFilteredColorIcon(
                modifier = Modifier.align(Alignment.CenterVertically),
                outerIcon = KPIcons.Fill.CircleIcon,
                outerTint = style.iconTint,
                innerIcon = KPIcons.Fill.InfoIcon,
            )
        }
    }
}

/**
 * [KPInfoBox] is a composable function that displays an information box with a specified style and customizable multi-line text.
 * Optionally, it can display an icon and a border.
 *
 * @param style An [InfoBoxStyle] instance that defines the style of the info box.
 * @param modifier A [Modifier] instance to modify the component. The default value is `Modifier`.
 * @param iconPosition Determines the position of the icon, which can be `Arrangement.Start` or `Arrangement.End`.
 * @param showBorder A boolean value to enable border display. The default value is `false`.
 * @param showDashedBorder A boolean value to enable dashed border display. The default value is `false`.
 *
 * @param multiText A composable lambda that allows for custom text content in a `ColumnScope`.
 *  *        Use this to provide multiple lines of text or custom text elements.
 */
@Composable
public fun KPInfoBox(
    style: InfoBoxStyle,
    modifier: Modifier = Modifier,
    iconPosition: Arrangement.Horizontal? = null,
    showBorder: Boolean = false,
    showDashedBorder: Boolean = false,
    multiText: @Composable ColumnScope.() -> Unit,
) {
    val rootModifier = modifier
        .then(
            if (showBorder) {
                modifier.customBorder(
                    color = style.borderColor,
                    shape = RoundedCornerShape(8.dp)
                )
            } else if (showDashedBorder) {
                modifier.customBorder(
                    color = style.borderColor,
                    shape = RoundedCornerShape(8.dp),
                    dashWidth = style.dashedBorderDashWidth,
                    gapWidth = style.dashedBorderGapWidth
                )
            } else {
                modifier
            }
        )
        .background(color = style.backgroundColor, shape = RoundedCornerShape(8.dp))
        .padding(12.dp)

    Row(
        modifier = rootModifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (iconPosition == Arrangement.Start) {
            KPCustomFilteredColorIcon(
                modifier = Modifier.align(Alignment.CenterVertically),
                outerIcon = KPIcons.Fill.CircleIcon,
                outerTint = style.iconTint,
                innerIcon = KPIcons.Fill.InfoIcon,
            )
        }

        Column(modifier = Modifier.weight(1f)) {
            CompositionLocalProvider(
                LocalTextStyle provides KPDesign.typography.body1.copy(color = style.textColor)
            ) {
                multiText()
            }
        }

        if (iconPosition == Arrangement.End) {
            KPCustomFilteredColorIcon(
                modifier = Modifier.align(Alignment.CenterVertically),
                outerIcon = KPIcons.Fill.CircleIcon,
                outerTint = style.iconTint,
                innerIcon = KPIcons.Fill.InfoIcon,
            )
        }
    }
}

@Preview
@Composable
private fun OrangeInfoBoxLeftIconPreview() {
    PreviewTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Orange,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start,
        )
    }
}

@Preview
@Composable
private fun OrangeInfoBoxRightIconPreview() {
    PreviewTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Orange,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.End,
        )
    }
}

@Preview
@Composable
private fun OrangeInfoBoxNoIconPreview() {
    PreviewTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Orange,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun OrangeInfoBoxLeftIconWithBorderPreview() {
    PreviewTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Orange,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start,
            showBorder = true
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun OrangeInfoBoxLeftIconWithDashBorderPreview() {
    PreviewTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Orange,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start,
            showDashedBorder = true
        )
    }
}

@Preview
@Composable
private fun OrangeInfoBoxLeftIconWithTwoTextsPreview() {
    PreviewTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Orange,
            iconPosition = Arrangement.Start,
            showBorder = false
        ) {
            KPText(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            )
            KPText(
                modifier = Modifier.padding(top = 8.dp),
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
                color = Color.Red
            )
        }
    }
}

@Preview
@Composable
private fun WhiteInfoBoxLeftIconPreview() {
    PreviewTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.White,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun GrayInfoBoxLeftIconPreview() {
    PreviewTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Gray,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start
        )
    }
}

@Preview
@Composable
private fun RedInfoBoxLeftIconPreview() {
    PreviewTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Red,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start
        )
    }
}

@Preview
@Composable
private fun BlueInfoBoxLeftIconPreview() {
    PreviewTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Blue,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start
        )
    }
}

@Preview
@Composable
private fun GreenInfoBoxLeftIconPreview() {
    PreviewTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Green,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start
        )
    }
}

@Preview
@Composable
private fun PinkInfoBoxLeftIconPreview() {
    PreviewTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Pink,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun OrangeInfoBoxLeftIconRTLPreview() {
    PreviewTheme {
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            KPInfoBox(
                style = KPInfoBoxStyle.Orange,
                text = "لوريم إيبسوم دولور سيت أميت، كونسيكتيتور أديبيسينغ",
                iconPosition = Arrangement.Start,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun OrangeInfoBoxRightIconRTLPreview() {
    PreviewTheme {
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            KPInfoBox(
                style = KPInfoBoxStyle.Orange,
                text = "لوريم إيبسوم دولور سيت أميت، كونسيكتيتور أديبيسينغ",
                iconPosition = Arrangement.End,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BlueInfoBoxLeftIconWithBorderRTLPreview() {
    PreviewTheme {
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            KPInfoBox(
                style = KPInfoBoxStyle.Blue,
                text = "لوريم إيبسوم دولور سيت أميت، كونسيكتيتور أديبيسينغ",
                iconPosition = Arrangement.Start,
                showBorder = true
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BlueInfoBoxLeftIconWithDashedBorderRTLPreview() {
    PreviewTheme {
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            KPInfoBox(
                style = KPInfoBoxStyle.Blue,
                text = "لوريم إيبسوم دولور سيت أميت، كونسيكتيتور أديبيسينغ",
                iconPosition = Arrangement.Start,
                showDashedBorder = true
            )
        }
    }
}
