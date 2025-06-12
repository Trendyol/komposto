@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.ui.component.price

import androidx.compose.runtime.Composable
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Basket
import com.trendyol.design.core.icon.icons.fill.CampaignDownArrow
import com.trendyol.design.core.price.KPPrice
import com.trendyol.design.core.price.KPPriceStyle
import com.trendyol.theme.KPDesign

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_DUAL,
    styleName = "1 Vertical Dual Price"
)
@Composable
internal fun Vertical_Dual_Price() {
    TrendyolTheme {
        KPPrice(
            style = KPPriceStyle.DualPrice(
                salePriceText = "999999.90 TL",
                marketPriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                isPriceViewVertical = true
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_DUAL,
    styleName = "1 Horizontal Dual Price"
)
@Composable
internal fun Horizontal_Dual_Price() {
    TrendyolTheme {
        KPPrice(
            style = KPPriceStyle.DualPrice(
                salePriceText = "999999.90 TL",
                marketPriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                isPriceViewVertical = false
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_DUAL,
    styleName = "2 Vertical Dual Price With Bottom Info"
)
@Composable
internal fun Vertical_Dual_Price_With_Bottom_Info() {
    TrendyolTheme {
        KPPrice(
            style = KPPriceStyle.DualPriceWithBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                isPriceViewVertical = true
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_DUAL,
    styleName = "2 Horizontal Dual Price With Bottom Info"
)
@Composable
internal fun Horizontal_Dual_Price_With_Bottom_Info() {
    TrendyolTheme {
        KPPrice(
            style = KPPriceStyle.DualPriceWithBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                isPriceViewVertical = false
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_DUAL,
    styleName = "3 Vertical Dual Price With Upper Info-Basket Campaign"
)
@Composable
internal fun Vertical_Dual_Price_With_Upper_Info_Basket() {
    TrendyolTheme {
        KPPrice(
            style = KPPriceStyle.DualPriceWithUpperInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                icon = KPIcons.Fill.Basket,
                iconSize = KPIconSize.XXSmall,
                iconTint = KPDesign.colors.colorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                isPriceViewVertical = true
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_DUAL,
    styleName = "3 Horizontal Dual Price With Upper Info-Basket Campaign"
)
@Composable
internal fun Horizontal_Dual_Price_With_Upper_Info_Basket() {
    TrendyolTheme {
        KPPrice(
            style = KPPriceStyle.DualPriceWithUpperInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                icon = KPIcons.Fill.Basket,
                iconSize = KPIconSize.XXSmall,
                iconTint = KPDesign.colors.colorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                isPriceViewVertical = false
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_DUAL,
    styleName = "4 Vertical Dual Price With Upper Info-Lowest Price Campaign"
)
@Composable
internal fun Vertical_Dual_Price_With_Upper_Info_Lowest_Price_Campaign() {
    TrendyolTheme {
        KPPrice(
            style = KPPriceStyle.DualPriceWithUpperInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                upperInfoText = "Son 30 Günün En Düşük Fiyatı",
                icon = KPIcons.Fill.CampaignDownArrow,
                iconSize = KPIconSize.XXSmall,
                iconTint = KPDesign.colors.colorWarning,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                isPriceViewVertical = true
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_DUAL,
    styleName = "4 Horizontal Dual Price With Upper Info-Lowest Price Campaign"
)
@Composable
internal fun Horizontal_Dual_Price_With_Upper_Info_Lowest_Price_Campaign() {
    TrendyolTheme {
        KPPrice(
            style = KPPriceStyle.DualPriceWithUpperInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                upperInfoText = "Son 30 Günün En Düşük Fiyatı",
                icon = KPIcons.Fill.CampaignDownArrow,
                iconSize = KPIconSize.XXSmall,
                iconTint = KPDesign.colors.colorWarning,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                isPriceViewVertical = false
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_DUAL,
    styleName = "5 Vertical_Dual Price With Upper And Bottom Info-Basket Campaign"
)
@Composable
internal fun Vertical_Dual_Price_With_Upper_And_Bottom_Info_Basket_Campaign() {
    TrendyolTheme {
        KPPrice(
            style = KPPriceStyle.DualPriceWithUpperAndBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                icon = KPIcons.Fill.Basket,
                iconSize = KPIconSize.XXSmall,
                iconTint = KPDesign.colors.colorPrimary,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                isPriceViewVertical = true
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_DUAL,
    styleName = "5 Horizontal Dual Price With Upper And Bottom Info-Basket Campaign"
)
@Composable
internal fun Horizontal_Dual_Price_With_Upper_And_Bottom_Info_Basket_Campaign() {
    TrendyolTheme {
        KPPrice(
            style = KPPriceStyle.DualPriceWithUpperAndBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                icon = KPIcons.Fill.Basket,
                iconSize = KPIconSize.XXSmall,
                iconTint = KPDesign.colors.colorPrimary,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                isPriceViewVertical = false
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_DUAL,
    styleName = "6 Vertical Dual Price With Upper And Bottom Info-Lowest Price Campaign"
)
@Composable
internal fun Vertical_Dual_Price_With_Upper_And_Bottom_Info_Lowest_Price_Campaign() {
    TrendyolTheme {
        KPPrice(
            style = KPPriceStyle.DualPriceWithUpperAndBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                iconSize = KPIconSize.XXSmall,
                iconTint = KPDesign.colors.colorWarning,
                icon = KPIcons.Fill.CampaignDownArrow,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = KPDesign.typography.body2ColorWarning,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                isPriceViewVertical = true
            )
        )
    }
}

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_DUAL,
    styleName = "6 Horizontal Dual Price With Upper And Bottom Info-Lowest Price Campaign"
)
@Composable
internal fun Horizontal_Dual_Price_With_Upper_And_Bottom_Info_Lowest_Price_Campaign() {
    TrendyolTheme {
        KPPrice(
            style = KPPriceStyle.DualPriceWithUpperAndBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                iconSize = KPIconSize.XXSmall,
                iconTint = KPDesign.colors.colorWarning,
                icon = KPIcons.Fill.CampaignDownArrow,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = KPDesign.typography.body2ColorWarning,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                isPriceViewVertical = false
            )
        )
    }
}
