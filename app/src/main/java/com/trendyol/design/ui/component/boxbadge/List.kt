package com.trendyol.design.ui.component.boxbadge

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.badge.boxbadge.BoxBadgeList
import com.trendyol.design.core.badge.boxbadge.BoxBadgeType
import com.trendyol.design.core.badge.boxbadge.model.BoxBadgeListAttributes
import com.trendyol.design.core.badge.boxbadge.model.BoxBadgeListDisplayMode
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.theme.TrendyolDesign


@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_LIST_4,
    styleName = "BoxBadgeListDisplayMode.FIXED"
)
@Composable
internal fun Fixed_BoxBadge_List_4() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.Custom(
            title = "Custom Badge",
            backgroundColor = TrendyolDesign.colors.colorBlueVariant1,
            icon = Icons.Fill.Help,
        ),
        BoxBadgeType.Coupon,
        BoxBadgeType.FreeDelivery,
        BoxBadgeType.FastDelivery,
        BoxBadgeType.FastDelivery,
    )
    BoxBadgeList(
        list = list,
        attributes = BoxBadgeListAttributes().copy(
            displayMode = BoxBadgeListDisplayMode.FIXED
        ),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_LIST_4,
    styleName = "BoxBadgeListDisplayMode.SPREAD"
)
@Composable
internal fun Spread_BoxBadge_List_4() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.Custom(
            title = "Custom Badge",
            backgroundColor = TrendyolDesign.colors.colorBlueVariant1,
            icon = Icons.Fill.Help,
        ),
        BoxBadgeType.Coupon,
        BoxBadgeType.FreeDelivery,
        BoxBadgeType.FastDelivery,
        BoxBadgeType.FastDelivery,
    )
    BoxBadgeList(
        list = list,
        attributes = BoxBadgeListAttributes().copy(
            displayMode = BoxBadgeListDisplayMode.SPREAD
        ),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_LIST_3,
    styleName = "BoxBadgeListDisplayMode.FIXED"
)
@Composable
internal fun Fixed_BoxBadge_List_3() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.BuyMorePayLess,
        BoxBadgeType.BuyTogether,
        BoxBadgeType.Video,
    )
    BoxBadgeList(
        list = list,
        attributes = BoxBadgeListAttributes().copy(
            displayMode = BoxBadgeListDisplayMode.FIXED
        ),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_LIST_3,
    styleName = "BoxBadgeListDisplayMode.SPREAD"
)
@Composable
internal fun Spread_BoxBadge_List_3() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.BuyMorePayLess,
        BoxBadgeType.BuyTogether,
        BoxBadgeType.Video,
    )
    BoxBadgeList(
        list = list,
        attributes = BoxBadgeListAttributes().copy(
            displayMode = BoxBadgeListDisplayMode.SPREAD
        ),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_LIST_2,
    styleName = "BoxBadgeListDisplayMode.FIXED"
)
@Composable
internal fun Fixed_BoxBadge_List_2() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.TodayDelivery,
        BoxBadgeType.Credit,
    )
    BoxBadgeList(
        list = list,
        attributes = BoxBadgeListAttributes().copy(
            displayMode = BoxBadgeListDisplayMode.FIXED
        ),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_LIST_2,
    styleName = "BoxBadgeListDisplayMode.SPREAD"
)
@Composable
internal fun Spread_BoxBadge_List_2() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.TodayDelivery,
        BoxBadgeType.Credit,
    )
    BoxBadgeList(
        list = list,
        attributes = BoxBadgeListAttributes().copy(
            displayMode = BoxBadgeListDisplayMode.SPREAD
        ),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_LIST_1,
    styleName = "BoxBadgeListDisplayMode.FIXED"
)
@Composable
internal fun Fixed_BoxBadge_List_1() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.InfluencerChoice,
    )
    BoxBadgeList(
        list = list,
        attributes = BoxBadgeListAttributes().copy(
            displayMode = BoxBadgeListDisplayMode.FIXED
        ),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_LIST_1,
    styleName = "BoxBadgeListDisplayMode.SPREAD"
)
@Composable
internal fun Spread_BoxBadge_List_1() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.InfluencerChoice,
    )
    BoxBadgeList(
        list = list,
        attributes = BoxBadgeListAttributes().copy(
            displayMode = BoxBadgeListDisplayMode.SPREAD
        ),
    )
}