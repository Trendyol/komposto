package com.trendyol.design.ui.component.price

import androidx.compose.runtime.Composable
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.theme.KPDesign
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.icons.fill.Basket
import com.trendyol.design.core.icon.icons.fill.CampaignDownArrow
import com.trendyol.design.core.price.KPPrice
import com.trendyol.design.core.price.KPPriceStyle

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_SINGLE,
    styleName = "Single Price"
)
@Composable
internal fun Single_Price() {
    TrendyolTheme {
        KPPrice(
            style = KPPriceStyle.SinglePrice(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary
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
        KPPrice(
            style = KPPriceStyle.SinglePriceWithBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary
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
        KPPrice(
            style = KPPriceStyle.SinglePriceWithUpperInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                icon = KPIcons.Fill.Basket,
                iconSize = KPIconSize.XXSmall,
                iconTint = KPDesign.colors.colorPrimary
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
        KPPrice(
            style = KPPriceStyle.SinglePriceWithUpperInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                upperInfoText = "Son 30 Günün En Düşük Fiyatı",
                icon = KPIcons.Fill.CampaignDownArrow,
                iconSize = KPIconSize.XXSmall,
                iconTint = KPDesign.colors.colorWarning
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
        KPPrice(
            style = KPPriceStyle.SinglePriceWithUpperAndBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                icon = KPIcons.Fill.Basket,
                iconSize = KPIconSize.XXSmall,
                iconTint = KPDesign.colors.colorPrimary,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary,
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
        KPPrice(
            style = KPPriceStyle.SinglePriceWithUpperAndBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                icon = KPIcons.Fill.CampaignDownArrow,
                iconSize = KPIconSize.XXSmall,
                iconTint = KPDesign.colors.colorWarning,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = KPDesign.typography.body2ColorWarning,
            )
        )
    }
}
