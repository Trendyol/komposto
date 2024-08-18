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
    name = Component.BOX_BADGE_CUSTOM,
)
@Composable
internal fun BoxBadge_Single_Custom() = TrendyolTheme {
    val customBadge = BoxBadgeType.Custom(
        title = "Custom Badge",
        backgroundColor = TrendyolDesign.colors.colorPinkVariant2,
        icon = Icons.Fill.Help,
    )
    BoxBadge(customBadge)
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_COUPON,
)
@Composable
internal fun BoxBadge_Single_Coupon() = TrendyolTheme {
    BoxBadge(BoxBadgeType.Coupon)
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_FREE_DELIVERY,
)
@Composable
internal fun BoxBadge_Single_FreeDelivery() = TrendyolTheme {
    BoxBadge(BoxBadgeType.FreeDelivery)
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_FAST_DELIVERY,
)
@Composable
internal fun BoxBadge_Single_FastDelivery() = TrendyolTheme {
    BoxBadge(BoxBadgeType.FastDelivery)
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_BUY_MORE_PAY_LESS,
)
@Composable
internal fun BoxBadge_Single_BuyMorePayLess() = TrendyolTheme {
    BoxBadge(BoxBadgeType.BuyMorePayLess)
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_BUY_TOGETHER,
)
@Composable
internal fun BoxBadge_Single_BuyTogether() = TrendyolTheme {
    BoxBadge(BoxBadgeType.BuyTogether)
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_VIDEO,
)
@Composable
internal fun BoxBadge_Single_Video() = TrendyolTheme {
    BoxBadge(BoxBadgeType.Video)
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_TODAY_DELIVERY,
)
@Composable
internal fun BoxBadge_Single_TodayDelivery() = TrendyolTheme {
    BoxBadge(BoxBadgeType.TodayDelivery)
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_CREDIT,
)
@Composable
internal fun BoxBadge_Single_Credit() = TrendyolTheme {
    BoxBadge(BoxBadgeType.Credit)
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_INFLUENCER_CHOICE,
)
@Composable
internal fun BoxBadge_Single_InfluencerChoice() = TrendyolTheme {
    BoxBadge(BoxBadgeType.InfluencerChoice)
}
