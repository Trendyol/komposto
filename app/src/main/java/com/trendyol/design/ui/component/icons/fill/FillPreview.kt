package com.trendyol.design.ui.component.icons.fill

import WarningInfoStateDefaultIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
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
            Icons.Fill.ArrowDown,
            Icons.Fill.Basket,
            Icons.Fill.Bullet,
            Icons.Fill.Campaign,
            Icons.Fill.CampaignDownArrow,
            Icons.Fill.Cancel,
            Icons.Fill.Cargo,
            Icons.Fill.CircleIcon,
            Icons.Fill.Colon,
            Icons.Fill.Coupon,
            Icons.Fill.Credit,
            Icons.Fill.Delivery,
            Icons.Fill.FenomenGradient,
            Icons.Fill.Help,
            Icons.Fill.InfoIcon,
            Icons.Fill.Percentage,
            Icons.Fill.PlayGradient,
            Icons.Fill.RunningOut,
            Icons.Fill.Search,
            Icons.Fill.Star,
            Icons.Fill.StateOrder,
            Icons.Fill.StatePin,
            Icons.Fill.StateRefresh,
            Icons.Fill.Tick,
            Icons.Fill.Trash,
            WarningInfoStateDefaultIcon,
        )
}

@Preview
@Composable
private fun Preview_Icon(
    @PreviewParameter(TrendyolIconParameterProvider::class) icon: ImageVector,
) = TrendyolTheme {
    Icon(
        imageVector = icon,
        size = TrendyolIconSize.Medium,
    )
}
