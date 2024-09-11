package com.trendyol.design.core.badge.boxbadge

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Cargo
import com.trendyol.design.core.icon.icons.fill.Coupon
import com.trendyol.design.core.icon.icons.fill.Credit
import com.trendyol.design.core.icon.icons.fill.Delivery
import com.trendyol.design.core.icon.icons.fill.FenomenGradient
import com.trendyol.design.core.icon.icons.fill.Campaign
import com.trendyol.design.core.icon.icons.fill.Percentage
import com.trendyol.design.core.icon.icons.fill.PlayGradient
import com.trendyol.theme.TrendyolDesign

sealed class KPBoxBadgeType {

    data class Custom(
        override val title: String,
        override val icon: ImageVector,
        val iconTint: Color = Color.Unspecified,
        val backgroundColor: Color,
    ) : BoxBadge {

        override val iconTintColor: Color
            @Composable get() = iconTint

        override val boxBackgroundColor: Color
            @Composable get() = backgroundColor
    }

    object Defaults {

        data class Coupon(override val title: String = "Kupon Fırsatı") : BoxBadge {

            override val icon: ImageVector = Icons.Fill.Coupon

            override val iconTintColor: Color
                @Composable get() = TrendyolDesign.colors.colorPink

            override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFFFF0F5)
        }

        data class FreeDelivery(override val title: String = "Kargo Bedava") : BoxBadge {

            override val icon: ImageVector = Icons.Fill.Cargo

            override val iconTintColor: Color
                @Composable get() = TrendyolDesign.colors.colorOnSurfaceVariant2

            override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFF7F7F7)
        }

        data class FastDelivery(override val title: String = "Hızlı Teslimat") : BoxBadge {

            override val icon: ImageVector = Icons.Fill.Delivery

            override val iconTintColor: Color
                @Composable get() = Color(color = 0xFF0BC15C)

            override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFEBFAF2)
        }

        data class BuyMorePayLess(override val title: String = "Çok Al Az Öde") : BoxBadge {

            override val icon: ImageVector = Icons.Fill.Campaign

            override val iconTintColor: Color
                @Composable get() = TrendyolDesign.colors.colorPrimary

            override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFFEF4ED)
        }

        data class BuyTogether(override val title: String = "Birlikte Al Kazan") : BoxBadge {

            override val icon: ImageVector = Icons.Fill.Percentage

            override val iconTintColor: Color
                @Composable get() = TrendyolDesign.colors.colorPrimary

            override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFFEF4ED)
        }

        data class Video(override val title: String = "Videolu Ürün") : BoxBadge {

            override val icon: ImageVector = Icons.Fill.PlayGradient

            override val iconTintColor: Color
                @Composable get() = Color.Unspecified

            override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFF6EFFF)
        }

        data class TodayDelivery(override val title: String = "Bugün Kargoda") : BoxBadge {

            override val icon: ImageVector = Icons.Fill.Delivery

            override val iconTintColor: Color
                @Composable get() = Color(color = 0xFF159F52)

            override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFCFFFE4)
        }

        data class Credit(override val title: String = "Krediye Uygun") : BoxBadge {

            override val icon: ImageVector = Icons.Fill.Credit

            override val iconTintColor: Color
                @Composable get() = TrendyolDesign.colors.colorStar

            override val boxBackgroundColor: Color
                @Composable get() = TrendyolDesign.colors.colorStarVariant1
        }

        data class InfluencerChoice(override val title: String = "Fenomen Seçimi") : BoxBadge {

            override val icon: ImageVector = Icons.Fill.FenomenGradient

            override val iconTintColor: Color
                @Composable get() = Color.Unspecified

            override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFFEF5ED)
        }
    }
}
