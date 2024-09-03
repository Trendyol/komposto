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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.badge.boxbadge.model.BoxBadgeAttributes
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.theme.TrendyolDesign
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.toPersistentList

/**
 * Represents a horizontal list of badges displayed.
 *
 * @param badges List of badges to be displayed.
 * @param modifier Modifier to be applied to the list.
 * BadgeGroup is rendered with its default width, but scales to the specified width
 * when a width-related modifier (e.g., fillMaxWidth, width, etc) is applied.
 * @param maxBadgeCount Specifies the maximum number of badges to display in the list.
 * @param space Determines the space between badges in the list, measured in Dp.
 * @param itemAttributes Defines the styling attributes for badge items, including
 * properties like padding, icon size, and border radius, etc.
 */
@Composable
fun BoxBadgeGroup(
    badges: PersistentList<BoxBadgeType>,
    modifier: Modifier = Modifier,
    itemAttributes: BoxBadgeAttributes = BoxBadgeAttributes(),
    maxBadgeCount: Int = 4,
    space: Dp = 4.dp,
) {
    val itemsToShow = remember(badges) { badges.take(maxBadgeCount) }
    val emptySlots = maxBadgeCount - itemsToShow.size
    val defaultWidth = (itemAttributes.boxWidth.value * maxBadgeCount) + (maxBadgeCount.dec() * space.value)

    Row(
        modifier = modifier.then(Modifier.width(defaultWidth.dp)),
        horizontalArrangement = Arrangement.spacedBy(space),
    ) {
        val ratio = itemAttributes.boxWidth.value / itemAttributes.boxHeight.value
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
private fun Default4BadgesPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Dynamic(
            title = "Dynamic Badge",
            backgroundColor = TrendyolDesign.colors.colorBlueVariant1,
            icon = Icons.Fill.Help,
        ),
        BoxBadgeType.Defaults.Coupon(),
        BoxBadgeType.Defaults.FreeDelivery(),
        BoxBadgeType.Defaults.FastDelivery(),
    )
    BoxBadgeGroup(
        badges = list.toPersistentList(),
    )
}

@Preview(showBackground = false)
@Composable
private fun Default3BadgesPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.BuyMorePayLess(),
        BoxBadgeType.Defaults.BuyTogether(),
        BoxBadgeType.Defaults.Video(),
    )
    BoxBadgeGroup(
        badges = list.toPersistentList()
    )
}

@Preview(showBackground = false)
@Composable
private fun Default2BadgesPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.TodayDelivery(),
        BoxBadgeType.Defaults.Credit(),
    )
    BoxBadgeGroup(
        badges = list.toPersistentList(),
    )
}

@Preview(showBackground = false)
@Composable
private fun Default1BadgesPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.InfluencerChoice(),
    )
    BoxBadgeGroup(
        badges = list.toPersistentList(),
    )
}

@Preview(showBackground = false)
@Composable
private fun Scaled4BadgesPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Dynamic(
            title = "Dynamic Badge",
            backgroundColor = TrendyolDesign.colors.colorBlueVariant1,
            icon = Icons.Fill.Help,
        ),
        BoxBadgeType.Defaults.Coupon(),
        BoxBadgeType.Defaults.FreeDelivery(),
        BoxBadgeType.Defaults.FastDelivery(),
    )
    BoxBadgeGroup(
        badges = list.toPersistentList(),
        modifier = Modifier.fillMaxWidth(),
    )
}

@Preview(showBackground = false)
@Composable
private fun Scaled3BadgesPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.BuyMorePayLess(),
        BoxBadgeType.Defaults.BuyTogether(),
        BoxBadgeType.Defaults.Video(),
    )
    BoxBadgeGroup(
        badges = list.toPersistentList(),
        modifier = Modifier.fillMaxWidth(),
    )
}

@Preview(showBackground = false)
@Composable
private fun Scaled2BadgesPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.TodayDelivery(),
        BoxBadgeType.Defaults.Credit(),
    )
    BoxBadgeGroup(
        badges = list.toPersistentList(),
        modifier = Modifier.fillMaxWidth(),
    )
}

@Preview(showBackground = false)
@Composable
private fun Scaled1BadgesPreview() = PreviewTheme {
    val list = listOf(
        BoxBadgeType.Defaults.InfluencerChoice(),
    )
    BoxBadgeGroup(
        badges = list.toPersistentList(),
        modifier = Modifier.fillMaxWidth(),
    )
}
