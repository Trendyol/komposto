package com.trendyol.design.core.badge.boxbadge

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.badge.boxbadge.model.BoxBadgeAttributes
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.theme.TrendyolDesign

@Composable
fun BoxBadgeList(
    list: List<BoxBadgeType>,
    modifier: Modifier = Modifier,
    visibleBadgeCount: Int = 4,
    attributes: BoxBadgeAttributes = BoxBadgeAttributes(),
) {
    val itemsToShow = remember(list) { list.take(visibleBadgeCount) }
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        items(itemsToShow, key = { it.badge.title }) { item ->
            BoxBadge(boxBadgeType = item, attributes = attributes)
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun FourItemListPreview() {
    PreviewTheme {
        val list = listOf(
            BoxBadgeType.Custom(
                title = "Custom Badge",
                backgroundColor = TrendyolDesign.colors.colorBlueVariant1,
                icon = Icons.Fill.Help,
            ),
            BoxBadgeType.Coupon,
            BoxBadgeType.FreeDelivery,
            BoxBadgeType.FastDelivery,
        )
        BoxBadgeList(list)
    }
}

@Preview(showBackground = false)
@Composable
private fun ThreeItemListPreview() {
    PreviewTheme {
        val list = listOf(
            BoxBadgeType.BuyMorePayLess,
            BoxBadgeType.BuyTogether,
            BoxBadgeType.Video,
        )
        BoxBadgeList(list)
    }
}

@Preview(showBackground = false)
@Composable
private fun TwoItemListPreview() {
    PreviewTheme {
        val list = listOf(
            BoxBadgeType.TodayDelivery,
            BoxBadgeType.Credit,
        )
        BoxBadgeList(list)
    }
}

@Preview(showBackground = false)
@Composable
private fun OneItemListPreview() {
    PreviewTheme {
        val list = listOf(
            BoxBadgeType.InfluencerChoice,
        )
        BoxBadgeList(list)
    }
}
