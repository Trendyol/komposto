package com.trendyol.design.core.badge.boxbadge

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import com.trendyol.design.core.icon.Icon
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.badge.boxbadge.model.BoxBadgeAttributes
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.preview.PreviewTheme

/**
 * Represents a single badge based on the provided badge type and attributes.
 *
 * @param boxBadgeType The type of badge to display, which determines the icon, title, and background.
 * @param modifier Modifier to be applied to the badge.
 * @param attributes Configuration options for the badge's appearance,
 * including size, padding, and text style.
 */
@Composable
fun BoxBadge(
    boxBadgeType: BoxBadgeType,
    modifier: Modifier = Modifier,
    attributes: BoxBadgeAttributes = BoxBadgeAttributes(),
) = with(boxBadgeType) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(attributes.cornerRadius),
        elevation = attributes.elevation,
    ) {
        Column(
            modifier = modifier
                .width(attributes.boxWidth.dp)
                .height(attributes.boxHeight.dp)
                .background(color = badge.backgroundColor)
                .padding(
                    vertical = attributes.verticalPadding,
                    horizontal = attributes.horizontalPadding,
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Icon(
                imageVector = badge.icon,
                size = attributes.iconSize,
                tint = badge.iconTint,
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = badge.title,
                style = attributes.textStyle ?: attributes.defaultTextStyle,
                color = attributes.fontColor,
                textAlign = TextAlign.Center,
                minLines = attributes.line,
                maxLines = attributes.line,
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun DynamicBoxBadgePreview() = PreviewTheme {
    BoxBadge(
        BoxBadgeType.Dynamic(
            title = "Dynamic Badge",
            backgroundColor = TrendyolDesign.colors.colorPinkVariant2,
            icon = Icons.Fill.Help,
        )
    )
}

@Preview(showBackground = false)
@Composable
private fun CouponBoxBadgePreview() = PreviewTheme {
    BoxBadge(BoxBadgeType.Defaults.Coupon())
}

@Preview(showBackground = false)
@Composable
private fun CargoFreeBoxBadgePreview() = PreviewTheme {
    BoxBadge(BoxBadgeType.Defaults.FreeDelivery())
}

@Preview(showBackground = false)
@Composable
private fun FastDeliveryBoxBadgePreview() = PreviewTheme {
    BoxBadge(BoxBadgeType.Defaults.FastDelivery())
}

@Preview(showBackground = false)
@Composable
private fun BuyMorePayLessBoxBadgePreview() = PreviewTheme {
    BoxBadge(BoxBadgeType.Defaults.BuyMorePayLess())
}

@Preview(showBackground = false)
@Composable
private fun BuyTogetherBoxBadgePreview() = PreviewTheme {
    BoxBadge(BoxBadgeType.Defaults.BuyTogether())
}

@Preview(showBackground = false)
@Composable
private fun VideoBoxBadgePreview() = PreviewTheme {
    BoxBadge(BoxBadgeType.Defaults.Video())
}

@Preview(showBackground = false)
@Composable
private fun TodayDeliveryBoxBadgePreview() = PreviewTheme {
    BoxBadge(BoxBadgeType.Defaults.TodayDelivery())
}

@Preview(showBackground = false)
@Composable
private fun CreditBoxBadgePreview() = PreviewTheme {
    BoxBadge(BoxBadgeType.Defaults.Credit())
}

@Preview(showBackground = false)
@Composable
private fun InfluencerChoiceBoxBadgePreview() = PreviewTheme {
    BoxBadge(BoxBadgeType.Defaults.InfluencerChoice())
}
