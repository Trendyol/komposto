package com.trendyol.design.core.badge.boxbadge

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.trendyol.design.core.badge.boxbadge.model.BoxBadgeModel
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Cargo
import com.trendyol.design.core.icon.icons.fill.Coupon
import com.trendyol.design.core.icon.icons.fill.Credit
import com.trendyol.design.core.icon.icons.fill.Delivery
import com.trendyol.design.core.icon.icons.fill.FenomenGradient
import com.trendyol.design.core.icon.icons.fill.Campaign
import com.trendyol.design.core.icon.icons.fill.Percentage
import com.trendyol.design.core.icon.icons.fill.PlayGradient

sealed class BoxBadgeType(val badge: BoxBadgeModel) {

    data class Dynamic(
        val title: String,
        val icon: ImageVector,
        val backgroundColor: Color,
        val iconTint: Color = Color.Unspecified
    ) : BoxBadgeType(
        BoxBadgeModel(
            title = title,
            backgroundColor = backgroundColor,
            icon = icon,
            iconTint = iconTint,
        )
    )

    object Defaults {

        data class Coupon(val title: String = "Kupon Fırsatı") : BoxBadgeType(
            BoxBadgeModel(
                title = title,
                backgroundColor = Color(color = 0xFFFFF0F5),
                icon = Icons.Fill.Coupon,
                iconTint = Color(color = 0xFFFF4988)
            )
        )

        data class FreeDelivery(val title: String = "Kargo Bedava") : BoxBadgeType(
            BoxBadgeModel(
                title = "Kargo Bedava",
                backgroundColor = Color(color = 0xFFF7F7F7),
                icon = Icons.Fill.Cargo,
                iconTint = Color(color = 0xFF666666)
            )
        )

        data class FastDelivery(val title: String = "Hızlı Teslimat") : BoxBadgeType(
            BoxBadgeModel(
                title = title,
                backgroundColor = Color(color = 0xFFEBFAF2),
                icon = Icons.Fill.Delivery,
                iconTint = Color(color = 0xFF0BC15C)
            )
        )

        data class BuyMorePayLess(val title: String = "Çok Al Az Öde") : BoxBadgeType(
            BoxBadgeModel(
                title = title,
                backgroundColor = Color(color = 0xFFFEF4ED),
                icon = Icons.Fill.Campaign,
                iconTint = Color(color = 0xFFF27A1A)
            )
        )

        data class BuyTogether(val title: String = "Birlikte Al Kazan") : BoxBadgeType(
            BoxBadgeModel(
                title = title,
                backgroundColor = Color(color = 0xFFFEF4ED),
                icon = Icons.Fill.Percentage,
                iconTint = Color(color = 0xFFF27A1A)
            )
        )

        data class Video(val title: String = "Videolu Ürün") : BoxBadgeType(
            BoxBadgeModel(
                title = title,
                backgroundColor = Color(color = 0xFFF6EFFF),
                icon = Icons.Fill.PlayGradient,
            )
        )

        data class TodayDelivery(val title: String = "Bugün Kargoda") : BoxBadgeType(
            BoxBadgeModel(
                title = title,
                backgroundColor = Color(color = 0xFFCFFFE4),
                icon = Icons.Fill.Delivery,
                iconTint = Color(color = 0xFF159F52),
            )
        )

        data class Credit(val title: String = "Krediye Uygun") : BoxBadgeType(
            BoxBadgeModel(
                title = title,
                backgroundColor = Color(color = 0xFFFFF9E5),
                icon = Icons.Fill.Credit,
                iconTint = Color(color = 0xFFFFC000),
            )
        )

        data class InfluencerChoice(val title: String = "Fenomen Seçimi") : BoxBadgeType(
            BoxBadgeModel(
                title = title,
                backgroundColor = Color(color = 0xFFFEF5ED),
                icon = Icons.Fill.FenomenGradient,
            )
        )
    }
}
