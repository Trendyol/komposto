package com.trendyol.design.core.price

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import com.trendyol.design.core.icon.IconSize
import com.trendyol.design.core.icon.KPIconSize

public sealed interface KPPriceStyle {
    public data class SinglePrice(
        val salePriceText: String,
        val salePriceTextStyle: TextStyle
    ) : PriceStyle {
        override val priceModel: PriceModel
            get() = PriceModel(
                salePriceText = salePriceText,
                salePriceTextStyle = salePriceTextStyle
            )
    }

    public data class DualPrice(
        val salePriceText: String,
        val salePriceTextStyle: TextStyle,
        val marketPriceText: String,
        val marketPriceTextStyle: TextStyle,
        val isPriceViewVertical: Boolean
    ) : PriceStyle {
        override val priceModel: PriceModel
            get() = PriceModel(
                salePriceText = salePriceText,
                salePriceTextStyle = salePriceTextStyle,
                marketPriceText = marketPriceText,
                marketPriceTextStyle = marketPriceTextStyle,
                isPriceViewVertical = isPriceViewVertical
            )
    }

    public data class SinglePriceWithBottomInfo(
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

    public data class DualPriceWithBottomInfo(
        val salePriceText: String,
        val salePriceTextStyle: TextStyle,
        val marketPriceText: String,
        val marketPriceTextStyle: TextStyle,
        val bottomInfoText: String,
        val bottomInfoTextStyle: TextStyle,
        val isPriceViewVertical: Boolean
    ) : PriceStyle {
        override val priceModel: PriceModel
            get() = PriceModel(
                salePriceText = salePriceText,
                salePriceTextStyle = salePriceTextStyle,
                marketPriceText = marketPriceText,
                marketPriceTextStyle = marketPriceTextStyle,
                bottomInfoText = bottomInfoText,
                bottomInfoTextStyle = bottomInfoTextStyle,
                isPriceViewVertical = isPriceViewVertical
            )
    }

    public data class SinglePriceWithUpperInfo(
        val icon: ImageVector? = null,
        val iconSize: IconSize = KPIconSize.XXSmall,
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

    public data class DualPriceWithUpperInfo(
        val icon: ImageVector? = null,
        val iconSize: IconSize,
        val iconTint: Color? = null,
        val upperInfoText: String,
        val upperInfoTextStyle: TextStyle,
        val salePriceText: String,
        val salePriceTextStyle: TextStyle,
        val marketPriceText: String,
        val marketPriceTextStyle: TextStyle,
        val isPriceViewVertical: Boolean
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
                marketPriceTextStyle = marketPriceTextStyle,
                isPriceViewVertical = isPriceViewVertical
            )
    }

    public data class SinglePriceWithUpperAndBottomInfo(
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

    public data class DualPriceWithUpperAndBottomInfo(
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
        val isPriceViewVertical: Boolean
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
                marketPriceTextStyle = marketPriceTextStyle,
                isPriceViewVertical = isPriceViewVertical
            )
    }
}
