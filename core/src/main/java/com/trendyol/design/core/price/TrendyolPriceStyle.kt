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

    data class SinglePriceWithBottomInfo(
        val salePriceText: String,
        val salePriceTextStyle: TextStyle,
        val bottomInfoText: String,
        val bottomInfoTextStyle: TextStyle,
    ) : PriceStyle {
        override val priceModel: PriceModel
            get() = PriceModel(
                salePriceText = salePriceText,
                salePriceTextStyle = salePriceTextStyle,
                bottomInfoText = bottomInfoText,
                bottomInfoTextStyle = bottomInfoTextStyle
            )
    }

    data class DualPriceWithBottomInfo(
        val salePriceText: String,
        val salePriceTextStyle: TextStyle,
        val marketPriceText: String,
        val marketPriceTextStyle: TextStyle,
        val bottomInfoText: String,
        val bottomInfoTextStyle: TextStyle,
    ) : PriceStyle {
        override val priceModel: PriceModel
            get() = PriceModel(
                salePriceText = salePriceText,
                salePriceTextStyle = salePriceTextStyle,
                marketPriceText = marketPriceText,
                marketPriceTextStyle = marketPriceTextStyle,
                bottomInfoText = bottomInfoText,
                bottomInfoTextStyle = bottomInfoTextStyle,
            )
    }

    data class SinglePriceWithUpperInfo(
        val icon: ImageVector? = null,
        val iconSize: IconSize = TrendyolIconSize.XXSmall,
        val iconTint: Color? = null,
        val upperInfoText: String,
        val upperInfoTextStyle: TextStyle,
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
                upperInfoText = upperInfoText,
                upperInfoTextStyle = upperInfoTextStyle
            )
    }

    data class DualPriceWithUpperInfo(
        val icon: ImageVector? = null,
        val iconSize: IconSize,
        val iconTint: Color? = null,
        val upperInfoText: String,
        val upperInfoTextStyle: TextStyle,
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
                upperInfoText = upperInfoText,
                upperInfoTextStyle = upperInfoTextStyle,
                marketPriceText = marketPriceText,
                marketPriceTextStyle = marketPriceTextStyle
            )
    }

    data class SinglePriceWithUpperAndBottomInfo(
        val icon: ImageVector? = null,
        val iconSize: IconSize,
        val iconTint: Color? = null,
        val upperInfoText: String,
        val upperInfoTextStyle: TextStyle,
        val salePriceText: String,
        val salePriceTextStyle: TextStyle,
        val bottomInfoText: String,
        val bottomInfoTextStyle: TextStyle,
    ) : PriceStyle {
        override val priceModel: PriceModel
            get() = PriceModel(
                icon = icon,
                iconSize = iconSize,
                iconTint = iconTint,
                salePriceText = salePriceText,
                salePriceTextStyle = salePriceTextStyle,
                upperInfoText = upperInfoText,
                upperInfoTextStyle = upperInfoTextStyle,
                bottomInfoText = bottomInfoText,
                bottomInfoTextStyle = bottomInfoTextStyle
            )
    }

    data class DualPriceWithUpperAndBottomInfo(
        val icon: ImageVector? = null,
        val iconSize: IconSize,
        val iconTint: Color? = null,
        val upperInfoText: String,
        val upperInfoTextStyle: TextStyle,
        val salePriceText: String,
        val salePriceTextStyle: TextStyle,
        val marketPriceText: String,
        val marketPriceTextStyle: TextStyle,
        val bottomInfoText: String,
        val bottomInfoTextStyle: TextStyle,
    ) : PriceStyle {
        override val priceModel: PriceModel
            get() = PriceModel(
                icon = icon,
                iconSize = iconSize,
                iconTint = iconTint,
                salePriceText = salePriceText,
                salePriceTextStyle = salePriceTextStyle,
                upperInfoText = upperInfoText,
                upperInfoTextStyle = upperInfoTextStyle,
                bottomInfoText = bottomInfoText,
                bottomInfoTextStyle = bottomInfoTextStyle,
                marketPriceText = marketPriceText,
                marketPriceTextStyle = marketPriceTextStyle
            )
    }
}
