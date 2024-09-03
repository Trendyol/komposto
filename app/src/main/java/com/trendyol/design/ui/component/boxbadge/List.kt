package com.trendyol.design.ui.component.boxbadge

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.badge.boxbadge.BoxBadgeGroup
import com.trendyol.design.core.badge.boxbadge.BoxBadgeType
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.theme.TrendyolDesign
import kotlinx.collections.immutable.toPersistentList

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_GROUP_4_ITEM,
    styleName = "Default"
)
@Composable
internal fun Default_BoxBadgeGroup_4() = TrendyolTheme {
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

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_GROUP_4_ITEM,
    styleName = "Scaled"
)
@Composable
internal fun Scaled_BoxBadgeGroup_4() = TrendyolTheme {
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

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_GROUP_3_ITEM,
    styleName = "Default"
)
@Composable
internal fun Default_BoxBadgeGroup_3() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.Defaults.BuyMorePayLess(),
        BoxBadgeType.Defaults.BuyTogether(),
        BoxBadgeType.Defaults.Video(),
    )
    BoxBadgeGroup(
        badges = list.toPersistentList(),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_GROUP_3_ITEM,
    styleName = "Scaled"
)
@Composable
internal fun Scaled_BoxBadgeGroup_3() = TrendyolTheme {
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

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_GROUP_2_ITEM,
    styleName = "Default"
)
@Composable
internal fun Default_BoxBadgeGroup_2() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.Defaults.TodayDelivery(),
        BoxBadgeType.Defaults.Credit(),
    )
    BoxBadgeGroup(
        badges = list.toPersistentList(),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_GROUP_2_ITEM,
    styleName = "Scaled"
)
@Composable
internal fun Scaled_BoxBadgeGroup_2() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.Defaults.TodayDelivery(),
        BoxBadgeType.Defaults.Credit(),
    )
    BoxBadgeGroup(
        badges = list.toPersistentList(),
        modifier = Modifier.fillMaxWidth(),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_GROUP_1_ITEM,
    styleName = "Default"
)
@Composable
internal fun Default_BoxBadgeGroup_1() = TrendyolTheme {
    val list = listOf(
        BoxBadgeType.Defaults.InfluencerChoice(),
    )
    BoxBadgeGroup(
        badges = list.toPersistentList(),
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.BOX_BADGE,
    name = Component.BOX_BADGE_GROUP_1_ITEM,
    styleName = "Scaled"
)
@Composable
internal fun Scaled_BoxBadgeGroup_1() = TrendyolTheme {
    val list = listOf<BoxBadgeType>(
        BoxBadgeType.Defaults.InfluencerChoice(),
    )

    BoxBadgeGroup(
        badges = list.toPersistentList(),
        modifier = Modifier.fillMaxWidth(),
    )
}
