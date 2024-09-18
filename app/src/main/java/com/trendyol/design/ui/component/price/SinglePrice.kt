package com.trendyol.design.ui.component.price

import androidx.compose.runtime.Composable
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.theme.TrendyolDesign
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.Basket
import com.trendyol.design.core.icon.icons.fill.CampaignDownArrow
import com.trendyol.design.core.price.Price
import com.trendyol.design.core.price.TrendyolPriceStyle

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_SINGLE,
    styleName = "Single Price"
)
@Composable
internal fun Single_Price() {
    TrendyolTheme {
        Price(
            style = TrendyolPriceStyle.SinglePrice(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_SINGLE,
    styleName = "Single Price With Bottom Info"
)
@Composable
internal fun Single_Price_With_Bottom_Info() {
    TrendyolTheme {
        Price(
            style = TrendyolPriceStyle.SinglePriceWithBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = TrendyolDesign.typography.body2ColorPrimary
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_SINGLE,
    styleName = "Single Price With Upper Info-Basket Campaign"
)
@Composable
internal fun Single_Price_With_Upper_Info_Basket_Campaign() {
    TrendyolTheme {
        Price(
            style = TrendyolPriceStyle.SinglePriceWithUpperInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                upperInfoTextStyle = TrendyolDesign.typography.body2MediumColorPrimary,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                icon = Icons.Fill.Basket,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolDesign.colors.colorPrimary
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_SINGLE,
    styleName = "Single Price With Upper Info-Lowest Price Campaign"
)
@Composable
internal fun Single_Price_With_Upper_Info_Lowest_Price_Campaign() {
    TrendyolTheme {
        Price(
            style = TrendyolPriceStyle.SinglePriceWithUpperInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorWarning,
                upperInfoTextStyle = TrendyolDesign.typography.body2MediumColorWarning,
                upperInfoText = "Son 30 Günün En Düşük Fiyatı",
                icon = Icons.Fill.CampaignDownArrow,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolDesign.colors.colorWarning
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_SINGLE,
    styleName = "Single Price With Upper And Bottom Info-Basket Campaign"
)
@Composable
internal fun Single_Price_With_Upper_And_Bottom_Info_Basket_Campaign() {
    TrendyolTheme {
        Price(
            style = TrendyolPriceStyle.SinglePriceWithUpperAndBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                upperInfoTextStyle = TrendyolDesign.typography.body2MediumColorPrimary,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                icon = Icons.Fill.Basket,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolDesign.colors.colorPrimary,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = TrendyolDesign.typography.body2ColorPrimary,
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_SINGLE,
    styleName = "Single Price With Upper And Bottom Info-Lowest Price Campaign"
)
@Composable
internal fun Single_Price_With_Upper_And_Bottom_Info_Lowest_Price_Campaign() {
    TrendyolTheme {
        Price(
            style = TrendyolPriceStyle.SinglePriceWithUpperAndBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorWarning,
                upperInfoTextStyle = TrendyolDesign.typography.body2MediumColorWarning,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                icon = Icons.Fill.CampaignDownArrow,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolDesign.colors.colorWarning,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = TrendyolDesign.typography.body2ColorWarning,
            )
        )
    }
}
