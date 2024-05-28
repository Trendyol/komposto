package com.trendyol.design.core.price

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import com.trendyol.design.core.icon.IconSize
import com.trendyol.design.core.icon.TrendyolIconSize

sealed interface TrendyolPriceStyle {
    data class SinglePrice(
        val salePriceText: String,
        val salePriceTextStyle: TextStyle
    ) : PriceStyle {
        override val priceModel: PriceModel
            get() = PriceModel(
                salePriceText = salePriceText,
                salePriceTextStyle = salePriceTextStyle
            )
    }

    data class DualPrice(
        val salePriceText: String,
        val salePriceTextStyle: TextStyle,
        val marketPriceText: String,
        val marketPriceTextStyle: TextStyle,
    ) : PriceStyle {
        override val priceModel: PriceModel
            get() = PriceModel(
                salePriceText = salePriceText,
                salePriceTextStyle = salePriceTextStyle,
                marketPriceText = marketPriceText,
                marketPriceTextStyle = marketPriceTextStyle
            )
    }

    data class SingleUnitPrice(
        val salePriceText: String,
        val salePriceTextStyle: TextStyle,
        val unitPriceText: String,
        val unitPriceTextStyle: TextStyle,
    ) : PriceStyle {
        override val priceModel: PriceModel
            get() = PriceModel(
                salePriceText = salePriceText,
                salePriceTextStyle = salePriceTextStyle,
                unitPriceText = unitPriceText,
                unitPriceTextStyle = unitPriceTextStyle
            )
    }

    data class DualUnitPrice(
        val salePriceText: String,
        val salePriceTextStyle: TextStyle,
        val unitPriceText: String,
        val unitPriceTextStyle: TextStyle,
        val marketPriceText: String,
        val marketPriceTextStyle: TextStyle,
    ) : PriceStyle {
        override val priceModel: PriceModel
            get() = PriceModel(
                salePriceText = salePriceText,
                salePriceTextStyle = salePriceTextStyle,
                unitPriceText = unitPriceText,
                unitPriceTextStyle = unitPriceTextStyle,
                marketPriceText = marketPriceText,
                marketPriceTextStyle = marketPriceTextStyle
            )
    }

    data class SinglePriceWithCampaign(
        val icon: ImageVector? = null,
        val iconSize: IconSize = TrendyolIconSize.XXSmall,
        val iconTint: Color? = null,
        val campaignText: String,
        val campaignTextStyle: TextStyle,
        val salePriceText: String,
        val salePriceTextStyle: TextStyle
    ) : PriceStyle {
        override val priceModel: PriceModel
            get() = PriceModel(
                icon = icon,
                iconSize = iconSize,
                iconTint = iconTint,
                salePriceText = salePriceText,
                salePriceTextStyle = salePriceTextStyle,
                campaignText = campaignText,
                campaignTextStyle = campaignTextStyle
            )
    }

    data class DualPriceWithCampaign(
        val icon: ImageVector? = null,
        val iconSize: IconSize,
        val iconTint: Color? = null,
        val campaignText: String,
        val campaignTextStyle: TextStyle,
        val salePriceText: String,
        val salePriceTextStyle: TextStyle,
        val marketPriceText: String,
        val marketPriceTextStyle: TextStyle,
    ) : PriceStyle {
        override val priceModel: PriceModel
            get() = PriceModel(
                icon = icon,
                iconSize = iconSize,
                iconTint = iconTint,
                salePriceText = salePriceText,
                salePriceTextStyle = salePriceTextStyle,
                campaignText = campaignText,
                campaignTextStyle = campaignTextStyle,
                marketPriceText = marketPriceText,
                marketPriceTextStyle = marketPriceTextStyle
            )
    }

    data class SingleUnitPriceWithCampaign(
        val icon: ImageVector? = null,
        val iconSize: IconSize,
        val iconTint: Color? = null,
        val campaignText: String,
        val campaignTextStyle: TextStyle,
        val salePriceText: String,
        val salePriceTextStyle: TextStyle,
        val unitPriceText: String,
        val unitPriceTextStyle: TextStyle,
    ) : PriceStyle {
        override val priceModel: PriceModel
            get() = PriceModel(
                icon = icon,
                iconSize = iconSize,
                iconTint = iconTint,
                salePriceText = salePriceText,
                salePriceTextStyle = salePriceTextStyle,
                campaignText = campaignText,
                campaignTextStyle = campaignTextStyle,
                unitPriceText = unitPriceText,
                unitPriceTextStyle = unitPriceTextStyle
            )
    }

    data class DualUnitPriceWithCampaign(
        val icon: ImageVector? = null,
        val iconSize: IconSize,
        val iconTint: Color? = null,
        val campaignText: String,
        val campaignTextStyle: TextStyle,
        val salePriceText: String,
        val salePriceTextStyle: TextStyle,
        val marketPriceText: String,
        val marketPriceTextStyle: TextStyle,
        val unitPriceText: String,
        val unitPriceTextStyle: TextStyle,
    ) : PriceStyle {
        override val priceModel: PriceModel
            get() = PriceModel(
                icon = icon,
                iconSize = iconSize,
                iconTint = iconTint,
                salePriceText = salePriceText,
                salePriceTextStyle = salePriceTextStyle,
                campaignText = campaignText,
                campaignTextStyle = campaignTextStyle,
                unitPriceText = unitPriceText,
                unitPriceTextStyle = unitPriceTextStyle,
                marketPriceText = marketPriceText,
                marketPriceTextStyle = marketPriceTextStyle
            )
    }
}
