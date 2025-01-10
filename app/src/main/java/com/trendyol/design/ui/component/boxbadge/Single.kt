package com.trendyol.design.ui.component.boxbadge

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.badge.boxbadge.KPBoxBadge
import com.trendyol.design.core.badge.boxbadge.KPBoxBadgeType
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.theme.KPDesign

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_CUSTOM,
)
@Composable
internal fun BoxBadge_Single_A_Custom() = TrendyolTheme {
    val customBadge = KPBoxBadgeType.Custom(
        title = "Custom Badge",
        backgroundColor = KPDesign.colors.colorPinkVariant2,
        icon = KPIcons.Fill.Help,
    )
    KPBoxBadge(customBadge)
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_COUPON,
)
@Composable
internal fun BoxBadge_Single_Coupon() = TrendyolTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.Coupon())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_FREE_DELIVERY,
)
@Composable
internal fun BoxBadge_Single_FreeDelivery() = TrendyolTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.FreeDelivery())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_FAST_DELIVERY,
)
@Composable
internal fun BoxBadge_Single_FastDelivery() = TrendyolTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.FastDelivery())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_BUY_MORE_PAY_LESS,
)
@Composable
internal fun BoxBadge_Single_BuyMorePayLess() = TrendyolTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.BuyMorePayLess())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_BUY_TOGETHER,
)
@Composable
internal fun BoxBadge_Single_BuyTogether() = TrendyolTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.BuyTogether())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_VIDEO,
)
@Composable
internal fun BoxBadge_Single_Video() = TrendyolTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.Video())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_TODAY_DELIVERY,
)
@Composable
internal fun BoxBadge_Single_TodayDelivery() = TrendyolTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.TodayDelivery())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_CREDIT,
)
@Composable
internal fun BoxBadge_Single_Credit() = TrendyolTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.Credit())
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_INFLUENCER_CHOICE,
)
@Composable
internal fun BoxBadge_Single_InfluencerChoice() = TrendyolTheme {
    KPBoxBadge(KPBoxBadgeType.Defaults.InfluencerChoice())
}
