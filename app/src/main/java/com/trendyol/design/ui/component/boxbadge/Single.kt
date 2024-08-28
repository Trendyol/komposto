package com.trendyol.design.ui.component.boxbadge

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.badge.boxbadge.BoxBadge
import com.trendyol.design.core.badge.boxbadge.BoxBadgeType
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.theme.TrendyolDesign

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_DYNAMIC,
)
@Composable
internal fun BoxBadge_Single_Dynamic() = TrendyolTheme {
    val dynamicBadge = BoxBadgeType.Dynamic(
        title = "Dynamic Badge",
        backgroundColor = TrendyolDesign.colors.colorPinkVariant2,
        icon = Icons.Fill.Help,
    )
    BoxBadge(dynamicBadge)
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_COUPON,
)
@Composable
internal fun BoxBadge_Single_Coupon() = TrendyolTheme {
    BoxBadge(BoxBadgeType.Defaults.Coupon())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_FREE_DELIVERY,
)
@Composable
internal fun BoxBadge_Single_FreeDelivery() = TrendyolTheme {
    BoxBadge(BoxBadgeType.Defaults.FreeDelivery())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_FAST_DELIVERY,
)
@Composable
internal fun BoxBadge_Single_FastDelivery() = TrendyolTheme {
    BoxBadge(BoxBadgeType.Defaults.FastDelivery())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_BUY_MORE_PAY_LESS,
)
@Composable
internal fun BoxBadge_Single_BuyMorePayLess() = TrendyolTheme {
    BoxBadge(BoxBadgeType.Defaults.BuyMorePayLess())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_BUY_TOGETHER,
)
@Composable
internal fun BoxBadge_Single_BuyTogether() = TrendyolTheme {
    BoxBadge(BoxBadgeType.Defaults.BuyTogether())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_VIDEO,
)
@Composable
internal fun BoxBadge_Single_Video() = TrendyolTheme {
    BoxBadge(BoxBadgeType.Defaults.Video())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_TODAY_DELIVERY,
)
@Composable
internal fun BoxBadge_Single_TodayDelivery() = TrendyolTheme {
    BoxBadge(BoxBadgeType.Defaults.TodayDelivery())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_CREDIT,
)
@Composable
internal fun BoxBadge_Single_Credit() = TrendyolTheme {
    BoxBadge(BoxBadgeType.Defaults.Credit())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_INFLUENCER_CHOICE,
)
@Composable
internal fun BoxBadge_Single_InfluencerChoice() = TrendyolTheme {
    BoxBadge(BoxBadgeType.Defaults.InfluencerChoice())
}
