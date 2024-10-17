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

public sealed class KPBoxBadgeType {

    public data class Custom(
        override val title: String,
        override val icon: ImageVector,
        val iconTint: Color = Color.Unspecified,
        val backgroundColor: Color,
    ) : BoxBadge {

        public override val iconTintColor: Color
            @Composable get() = iconTint

        public override val boxBackgroundColor: Color
            @Composable get() = backgroundColor
    }

    public object Defaults {

        public data class Coupon(override val title: String = "Kupon Fırsatı") : BoxBadge {

            public override val icon: ImageVector = Icons.Fill.Coupon

            public override val iconTintColor: Color
                @Composable get() = TrendyolDesign.colors.colorPink

            public override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFFFF0F5)
        }

        public data class FreeDelivery(override val title: String = "Kargo Bedava") : BoxBadge {

            public override val icon: ImageVector = Icons.Fill.Cargo

            public override val iconTintColor: Color
                @Composable get() = TrendyolDesign.colors.colorOnSurfaceVariant2

            public override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFF7F7F7)
        }

        public data class FastDelivery(override val title: String = "Hızlı Teslimat") : BoxBadge {

            public override val icon: ImageVector = Icons.Fill.Delivery

            public override val iconTintColor: Color
                @Composable get() = Color(color = 0xFF0BC15C)

            public override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFEBFAF2)
        }

        public data class BuyMorePayLess(override val title: String = "Çok Al Az Öde") : BoxBadge {

            public override val icon: ImageVector = Icons.Fill.Campaign

            public override val iconTintColor: Color
                @Composable get() = TrendyolDesign.colors.colorPrimary

            public override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFFEF4ED)
        }

        public data class BuyTogether(override val title: String = "Birlikte Al Kazan") : BoxBadge {

            public override val icon: ImageVector = Icons.Fill.Percentage

            public override val iconTintColor: Color
                @Composable get() = TrendyolDesign.colors.colorPrimary

            public override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFFEF4ED)
        }

        public data class Video(override val title: String = "Videolu Ürün") : BoxBadge {

            public override val icon: ImageVector = Icons.Fill.PlayGradient

            public override val iconTintColor: Color
                @Composable get() = Color.Unspecified

            public override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFF6EFFF)
        }

        public data class TodayDelivery(override val title: String = "Bugün Kargoda") : BoxBadge {

            public override val icon: ImageVector = Icons.Fill.Delivery

            public override val iconTintColor: Color
                @Composable get() = Color(color = 0xFF159F52)

            public override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFCFFFE4)
        }

        public data class Credit(override val title: String = "Krediye Uygun") : BoxBadge {

            public override val icon: ImageVector = Icons.Fill.Credit

            public override val iconTintColor: Color
                @Composable get() = TrendyolDesign.colors.colorStar

            public override val boxBackgroundColor: Color
                @Composable get() = TrendyolDesign.colors.colorStarVariant1
        }

        public data class InfluencerChoice(
            override val title: String = "Fenomen Seçimi"
        ) : BoxBadge {

            public override val icon: ImageVector = Icons.Fill.FenomenGradient

            public override val iconTintColor: Color
                @Composable get() = Color.Unspecified

            public override val boxBackgroundColor: Color
                @Composable get() = Color(color = 0xFFFEF5ED)
        }
    }
}
