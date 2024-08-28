package com.trendyol.design.core.badge.boxbadge

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.badge.boxbadge.model.BoxBadgeListAttributes
import com.trendyol.design.core.badge.boxbadge.model.BoxBadgeListContent
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.theme.TrendyolDesign

/**
 * Represents a list of badges displayed in either a spread or fixed mode.
 *
 * @param content List of badges to be displayed.
 * @param modifier Modifier to be applied to the list.
 * @param attributes Configuration options for the badge list,
 * including badge count, spacing, and item attributes.
 */
@Composable
fun BoxBadgeList(
    content: BoxBadgeListContent,
    modifier: Modifier = Modifier,
    attributes: BoxBadgeListAttributes = BoxBadgeListAttributes(),
) = with(attributes) {

    val itemsToShow = remember(content) { content.list.take(maxBadgeCount) }
    val emptySlots = maxBadgeCount - itemsToShow.size
    val defaultWidth = (itemAttributes.boxWidth * maxBadgeCount) +
            (maxBadgeCount.dec() * attributes.space)

    Row(
        modifier = modifier.then(Modifier.width(defaultWidth.dp)),
        horizontalArrangement = Arrangement.spacedBy(attributes.space.dp),
    ) {
        val ratio = itemAttributes.boxWidth.toFloat() / itemAttributes.boxHeight.toFloat()
        val itemModifier = Modifier
            .weight(1f)
            .aspectRatio(ratio)

        itemsToShow.forEach { item ->
            BoxBadge(
                boxBadgeType = item,
                modifier = itemModifier,
                attributes = itemAttributes,
            )
        }

        repeat(emptySlots) {
            Spacer(modifier = itemModifier)
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun Default4BadgesListPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Dynamic(
            title = "Dynamic Badge",
            backgroundColor = TrendyolDesign.colors.colorBlueVariant1,
            icon = Icons.Fill.Help,
        ),
        BoxBadgeType.Defaults.Coupon,
        BoxBadgeType.Defaults.FreeDelivery,
        BoxBadgeType.Defaults.FastDelivery,
    )
    BoxBadgeList(
        content = BoxBadgeListContent(list),
    )
}

@Preview(showBackground = false)
@Composable
private fun Default3BadgesListPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.BuyMorePayLess,
        BoxBadgeType.Defaults.BuyTogether,
        BoxBadgeType.Defaults.Video,
    )
    BoxBadgeList(
        content = BoxBadgeListContent(list)
    )
}

@Preview(showBackground = false)
@Composable
private fun Default2BadgesListPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.TodayDelivery,
        BoxBadgeType.Defaults.Credit,
    )
    BoxBadgeList(
        content = BoxBadgeListContent(list),
    )
}

@Preview(showBackground = false)
@Composable
private fun Default1BadgeListPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.InfluencerChoice,
    )
    BoxBadgeList(
        content = BoxBadgeListContent(list),
    )
}

@Preview(showBackground = false)
@Composable
private fun Scaled4BadgesListPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Dynamic(
            title = "Dynamic Badge",
            backgroundColor = TrendyolDesign.colors.colorBlueVariant1,
            icon = Icons.Fill.Help,
        ),
        BoxBadgeType.Defaults.Coupon,
        BoxBadgeType.Defaults.FreeDelivery,
        BoxBadgeType.Defaults.FastDelivery,
    )
    BoxBadgeList(
        content = BoxBadgeListContent(list),
        modifier = Modifier.fillMaxWidth(),
    )
}

@Preview(showBackground = false)
@Composable
private fun Scaled3BadgesListPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.BuyMorePayLess,
        BoxBadgeType.Defaults.BuyTogether,
        BoxBadgeType.Defaults.Video,
    )
    BoxBadgeList(
        content = BoxBadgeListContent(list),
        modifier = Modifier.fillMaxWidth(),
    )
}

@Preview(showBackground = false)
@Composable
private fun Scaled2BadgesListPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.TodayDelivery,
        BoxBadgeType.Defaults.Credit,
    )
    BoxBadgeList(
        content = BoxBadgeListContent(list),
        modifier = Modifier.fillMaxWidth(),
    )
}

@Preview(showBackground = false)
@Composable
private fun Scaled1BadgeListPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.InfluencerChoice,
    )
    BoxBadgeList(
        content = BoxBadgeListContent(list),
        modifier = Modifier.fillMaxWidth(),
    )
}
