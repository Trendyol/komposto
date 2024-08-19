package com.trendyol.design.core.badge.boxbadge

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.badge.boxbadge.model.BoxBadgeListAttributes
import com.trendyol.design.core.badge.boxbadge.model.BoxBadgeListDisplayMode
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.theme.TrendyolDesign

/**
 * Represents a list of badges displayed in either a spread or fixed mode.
 *
 * @param list List of badges to be displayed.
 * @param modifier Modifier to be applied to the list.
 * @param attributes Configuration options for the badge list,
 * including display mode, spacing, and item attributes.
 */
@Composable
fun BoxBadgeList(
    list: List<BoxBadgeType>,
    modifier: Modifier = Modifier,
    attributes: BoxBadgeListAttributes = BoxBadgeListAttributes(),
) {
    val visibleBadgeCount = attributes.visibleBadgeCount
    val itemsToShow = remember(list) { list.take(visibleBadgeCount) }
    val emptySlots = visibleBadgeCount - itemsToShow.size
    val itemAttributes = attributes.itemAttributes

    Row(
        modifier = when (attributes.displayMode) {
            BoxBadgeListDisplayMode.SPREAD -> modifier.fillMaxWidth()
            BoxBadgeListDisplayMode.FIXED -> modifier
        },
        horizontalArrangement = Arrangement.spacedBy(attributes.space),
    ) {
        val itemModifier = when (attributes.displayMode) {

            BoxBadgeListDisplayMode.SPREAD -> {
                val ratio = itemAttributes.boxWidth.toFloat() / itemAttributes.boxHeight.toFloat()
                Modifier
                    .weight(1f)
                    .aspectRatio(ratio)
            }

            BoxBadgeListDisplayMode.FIXED -> {
                Modifier
                    .width(itemAttributes.boxWidth.dp)
                    .height(itemAttributes.boxHeight.dp)
            }
        }

        itemsToShow.forEach { item ->
            BoxBadge(
                boxBadgeType = item,
                modifier = itemModifier,
                attributes = attributes.itemAttributes,
            )
        }

        repeat(emptySlots) {
            Spacer(modifier = itemModifier)
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun Fixed4BadgesListPreview() = PreviewTheme {
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
        list = list,
        attributes = BoxBadgeListAttributes().copy(
            displayMode = BoxBadgeListDisplayMode.FIXED
        ),
    )
}

@Preview(showBackground = false)
@Composable
private fun Fixed3BadgesListPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.BuyMorePayLess,
        BoxBadgeType.Defaults.BuyTogether,
        BoxBadgeType.Defaults.Video,
    )
    BoxBadgeList(
        list = list,
        attributes = BoxBadgeListAttributes().copy(
            displayMode = BoxBadgeListDisplayMode.FIXED
        ),
    )
}

@Preview(showBackground = false)
@Composable
private fun Fixed2BadgesListPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.TodayDelivery,
        BoxBadgeType.Defaults.Credit,
    )
    BoxBadgeList(
        list = list,
        attributes = BoxBadgeListAttributes().copy(
            displayMode = BoxBadgeListDisplayMode.FIXED
        ),
    )
}

@Preview(showBackground = false)
@Composable
private fun Fixed1BadgeListPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.InfluencerChoice,
    )
    BoxBadgeList(
        list = list,
        attributes = BoxBadgeListAttributes().copy(
            displayMode = BoxBadgeListDisplayMode.FIXED
        ),
    )
}


@Preview(showBackground = false)
@Composable
private fun Spread4BadgesListPreview() = PreviewTheme {
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
    Row(modifier = Modifier.width(200.dp)) {
        BoxBadgeList(
            list = list,
            attributes = BoxBadgeListAttributes().copy(
                displayMode = BoxBadgeListDisplayMode.SPREAD
            ),
        )
    }
}

@Preview(showBackground = false)
@Composable
private fun Spread3BadgesListPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.BuyMorePayLess,
        BoxBadgeType.Defaults.BuyTogether,
        BoxBadgeType.Defaults.Video,
    )
    Row(modifier = Modifier.width(200.dp)) {
        BoxBadgeList(
            list = list,
            attributes = BoxBadgeListAttributes().copy(
                displayMode = BoxBadgeListDisplayMode.SPREAD
            ),
        )
    }
}


@Preview(showBackground = false)
@Composable
private fun Spread2BadgesListPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.TodayDelivery,
        BoxBadgeType.Defaults.Credit,
    )
    Row(modifier = Modifier.width(200.dp)) {
        BoxBadgeList(
            list = list,
            attributes = BoxBadgeListAttributes().copy(
                displayMode = BoxBadgeListDisplayMode.SPREAD
            ),
        )
    }
}

@Preview(showBackground = false)
@Composable
private fun Spread1BadgeListPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.InfluencerChoice,
    )
    Row(modifier = Modifier.width(200.dp)) {
        BoxBadgeList(
            list = list,
            attributes = BoxBadgeListAttributes().copy(
                displayMode = BoxBadgeListDisplayMode.SPREAD
            ),
        )
    }
}
