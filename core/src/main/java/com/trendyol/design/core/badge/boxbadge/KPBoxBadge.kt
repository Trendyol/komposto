package com.trendyol.design.core.badge.boxbadge

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.trendyol.design.core.badge.boxbadge.model.BoxBadgeAttributes
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign

/**
 * Represents a single badge based on the provided badge type and attributes.
 *
 * @param badge The type of badge to display, which determines the icon, title, and background.
 * @param modifier Modifier to be applied to the badge.
 * @param attributes Configuration options for the badge's appearance,
 * including size, padding, and text style.
 */
@Composable
public fun KPBoxBadge(
    badge: BoxBadge,
    modifier: Modifier = Modifier,
    attributes: BoxBadgeAttributes = BoxBadgeAttributes(),
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(attributes.cornerRadius),
        elevation = attributes.elevation,
    ) {
        Column(
            modifier = Modifier
                .width(attributes.boxWidth)
                .height(attributes.boxHeight)
                .background(color = badge.boxBackgroundColor)
                .padding(
                    vertical = attributes.verticalPadding,
                    horizontal = attributes.horizontalPadding,
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            KPIcon(
                imageVector = badge.icon,
                size = attributes.iconSize,
                tint = badge.iconTintColor,
            )
            KPText(
                modifier = Modifier.fillMaxWidth(),
                text = badge.title,
                style = attributes.textStyle(),
                color = attributes.fontColor(),
                textAlign = TextAlign.Center,
                minLines = attributes.line,
                maxLines = attributes.line,
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun CustomBoxBadgePreview() = PreviewTheme {
    KPBoxBadge(
        KPBoxBadgeType.Custom(
            title = "Custom Badge",
            backgroundColor = KPDesign.colors.colorPinkVariant2,
            icon = KPIcons.Fill.Help,
        )
    )
}

@Preview(showBackground = false)
@Composable
private fun CouponBoxBadgePreview() = PreviewTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.Coupon())
}

@Preview(showBackground = false)
@Composable
private fun CargoFreeBoxBadgePreview() = PreviewTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.FreeDelivery())
}

@Preview(showBackground = false)
@Composable
private fun FastDeliveryBoxBadgePreview() = PreviewTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.FastDelivery())
}

@Preview(showBackground = false)
@Composable
private fun BuyMorePayLessBoxBadgePreview() = PreviewTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.BuyMorePayLess())
}

@Preview(showBackground = false)
@Composable
private fun BuyTogetherBoxBadgePreview() = PreviewTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.BuyTogether())
}

@Preview(showBackground = false)
@Composable
private fun VideoBoxBadgePreview() = PreviewTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.Video())
}

@Preview(showBackground = false)
@Composable
private fun TodayDeliveryBoxBadgePreview() = PreviewTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.TodayDelivery())
}

@Preview(showBackground = false)
@Composable
private fun CreditBoxBadgePreview() = PreviewTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.Credit())
}

@Preview(showBackground = false)
@Composable
private fun InfluencerChoiceBoxBadgePreview() = PreviewTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.InfluencerChoice())
}
