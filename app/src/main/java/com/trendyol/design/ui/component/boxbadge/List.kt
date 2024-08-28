package com.trendyol.design.ui.component.boxbadge

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.badge.boxbadge.BoxBadgeList
import com.trendyol.design.core.badge.boxbadge.BoxBadgeType
import com.trendyol.design.core.badge.boxbadge.model.BoxBadgeListContent
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
    styleName = "Default"
)
@Composable
internal fun Default_BoxBadge_List_4() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.Dynamic(
            title = "Dynamic Badge",
            backgroundColor = TrendyolDesign.colors.colorBlueVariant1,
            icon = Icons.Fill.Help,
        ),
        BoxBadgeType.Defaults.Coupon,
        BoxBadgeType.Defaults.FreeDelivery,
        BoxBadgeType.Defaults.FastDelivery,
        BoxBadgeType.Defaults.FastDelivery,
    )
    BoxBadgeList(
        content = BoxBadgeListContent(list),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_LIST_4,
    styleName = "Scaled"
)
@Composable
internal fun Scaled_BoxBadge_List_4() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.Dynamic(
            title = "Dynamic Badge",
            backgroundColor = TrendyolDesign.colors.colorBlueVariant1,
            icon = Icons.Fill.Help,
        ),
        BoxBadgeType.Defaults.Coupon,
        BoxBadgeType.Defaults.FreeDelivery,
        BoxBadgeType.Defaults.FastDelivery,
        BoxBadgeType.Defaults.FastDelivery,
    )
    BoxBadgeList(
        content = BoxBadgeListContent(list),
        modifier = Modifier.fillMaxWidth(),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_LIST_3,
    styleName = "Default"
)
@Composable
internal fun Default_BoxBadge_List_3() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.Defaults.BuyMorePayLess,
        BoxBadgeType.Defaults.BuyTogether,
        BoxBadgeType.Defaults.Video,
    )
    BoxBadgeList(
        content = BoxBadgeListContent(list),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_LIST_3,
    styleName = "Scaled"
)
@Composable
internal fun Scaled_BoxBadge_List_3() = TrendyolTheme {
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

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_LIST_2,
    styleName = "Default"
)
@Composable
internal fun Default_BoxBadge_List_2() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.Defaults.TodayDelivery,
        BoxBadgeType.Defaults.Credit,
    )
    BoxBadgeList(
        content = BoxBadgeListContent(list),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_LIST_2,
    styleName = "Scaled"
)
@Composable
internal fun Scaled_BoxBadge_List_2() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.Defaults.TodayDelivery,
        BoxBadgeType.Defaults.Credit,
    )
    BoxBadgeList(
        content = BoxBadgeListContent(list),
        modifier = Modifier.fillMaxWidth(),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_LIST_1,
    styleName = "Default"
)
@Composable
internal fun Default_BoxBadge_List_1() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.Defaults.InfluencerChoice,
    )
    BoxBadgeList(
        content = BoxBadgeListContent(list),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_LIST_1,
    styleName = "Scaled"
)
@Composable
internal fun Scaled_BoxBadge_List_1() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.Defaults.InfluencerChoice,
    )
    BoxBadgeList(
        content = BoxBadgeListContent(list),
        modifier = Modifier.fillMaxWidth(),
    )
}
