package com.trendyol.design.ui.component.icons.fill

import StateWarningInfoDefault
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.ArrowDown
import com.trendyol.design.core.icon.icons.fill.Basket
import com.trendyol.design.core.icon.icons.fill.Bullet
import com.trendyol.design.core.icon.icons.fill.Campaign
import com.trendyol.design.core.icon.icons.fill.CampaignDownArrow
import com.trendyol.design.core.icon.icons.fill.Cancel
import com.trendyol.design.core.icon.icons.fill.Cargo
import com.trendyol.design.core.icon.icons.fill.CircleIcon
import com.trendyol.design.core.icon.icons.fill.Colon
import com.trendyol.design.core.icon.icons.fill.Coupon
import com.trendyol.design.core.icon.icons.fill.Credit
import com.trendyol.design.core.icon.icons.fill.Delivery
import com.trendyol.design.core.icon.icons.fill.FenomenGradient
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.icon.icons.fill.InfoIcon
import com.trendyol.design.core.icon.icons.fill.Percentage
import com.trendyol.design.core.icon.icons.fill.PlayGradient
import com.trendyol.design.core.icon.icons.fill.RunningOut
import com.trendyol.design.core.icon.icons.fill.Search
import com.trendyol.design.core.icon.icons.fill.Star
import com.trendyol.design.core.icon.icons.fill.StateOrder
import com.trendyol.design.core.icon.icons.fill.StatePin
import com.trendyol.design.core.icon.icons.fill.StateRefresh
import com.trendyol.design.core.icon.icons.fill.Tick
import com.trendyol.design.core.icon.icons.fill.Trash
import com.trendyol.design.ui.theme.TrendyolTheme

private class TrendyolIconParameterProvider : PreviewParameterProvider<ImageVector> {
    override val values: Sequence<ImageVector>
        get() = sequenceOf(
            KPIcons.Fill.ArrowDown,
            KPIcons.Fill.Basket,
            KPIcons.Fill.Bullet,
            KPIcons.Fill.Campaign,
            KPIcons.Fill.CampaignDownArrow,
            KPIcons.Fill.Cancel,
            KPIcons.Fill.Cargo,
            KPIcons.Fill.CircleIcon,
            KPIcons.Fill.Colon,
            KPIcons.Fill.Coupon,
            KPIcons.Fill.Credit,
            KPIcons.Fill.Delivery,
            KPIcons.Fill.FenomenGradient,
            KPIcons.Fill.Help,
            KPIcons.Fill.InfoIcon,
            KPIcons.Fill.Percentage,
            KPIcons.Fill.PlayGradient,
            KPIcons.Fill.RunningOut,
            KPIcons.Fill.Search,
            KPIcons.Fill.Star,
            KPIcons.Fill.StateOrder,
            KPIcons.Fill.StatePin,
            KPIcons.Fill.StateRefresh,
            KPIcons.Fill.Tick,
            KPIcons.Fill.Trash,
            KPIcons.Fill.StateWarningInfoDefault,
        )
}

@Preview
@Composable
private fun Preview_KPIcon(
    @PreviewParameter(TrendyolIconParameterProvider::class) icon: ImageVector,
) = TrendyolTheme {
    KPIcon(
        imageVector = icon,
        size = KPIconSize.Medium,
    )
}
