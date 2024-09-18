package com.trendyol.design.ui.component.price

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.runtime.traceEventEnd
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.Basket
import com.trendyol.design.core.icon.icons.fill.CampaignDownArrow
import com.trendyol.design.core.price.Price
import com.trendyol.design.core.price.TrendyolPriceStyle
import com.trendyol.theme.TrendyolDesign

@ShowkaseComposable(
    group = Group.PRICE,
    name = Component.PRICE_DUAL,
    styleName = "1 Vertical Dual Price"
)
@Composable
internal fun Vertical_Dual_Price() {
    TrendyolTheme {
        Price(
            style = TrendyolPriceStyle.DualPrice(
                salePriceText = "999999.90 TL",
                marketPriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
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
        Price(
            style = TrendyolPriceStyle.DualPrice(
                salePriceText = "999999.90 TL",
                marketPriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
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
        Price(
            style = TrendyolPriceStyle.DualPriceWithBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = TrendyolDesign.typography.body2ColorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
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
        Price(
            style = TrendyolPriceStyle.DualPriceWithBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = TrendyolDesign.typography.body2ColorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
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
        Price(
            style = TrendyolPriceStyle.DualPriceWithUpperInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                upperInfoTextStyle = TrendyolDesign.typography.body2MediumColorPrimary,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                icon = Icons.Fill.Basket,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolDesign.colors.colorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
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
        Price(
            style = TrendyolPriceStyle.DualPriceWithUpperInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                upperInfoTextStyle = TrendyolDesign.typography.body2MediumColorPrimary,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                icon = Icons.Fill.Basket,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolDesign.colors.colorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
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
        Price(
            style = TrendyolPriceStyle.DualPriceWithUpperInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorWarning,
                upperInfoTextStyle = TrendyolDesign.typography.body2MediumColorWarning,
                upperInfoText = "Son 30 Günün En Düşük Fiyatı",
                icon = Icons.Fill.CampaignDownArrow,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolDesign.colors.colorWarning,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
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
        Price(
            style = TrendyolPriceStyle.DualPriceWithUpperInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorWarning,
                upperInfoTextStyle = TrendyolDesign.typography.body2MediumColorWarning,
                upperInfoText = "Son 30 Günün En Düşük Fiyatı",
                icon = Icons.Fill.CampaignDownArrow,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolDesign.colors.colorWarning,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
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
        Price(
            style = TrendyolPriceStyle.DualPriceWithUpperAndBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                upperInfoTextStyle = TrendyolDesign.typography.body2MediumColorPrimary,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                icon = Icons.Fill.Basket,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolDesign.colors.colorPrimary,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = TrendyolDesign.typography.body2ColorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
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
        Price(
            style = TrendyolPriceStyle.DualPriceWithUpperAndBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                upperInfoTextStyle = TrendyolDesign.typography.body2MediumColorPrimary,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                icon = Icons.Fill.Basket,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolDesign.colors.colorPrimary,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = TrendyolDesign.typography.body2ColorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
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
        Price(
            style = TrendyolPriceStyle.DualPriceWithUpperAndBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorWarning,
                upperInfoTextStyle = TrendyolDesign.typography.body2MediumColorWarning,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolDesign.colors.colorWarning,
                icon = Icons.Fill.CampaignDownArrow,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = TrendyolDesign.typography.body2ColorWarning,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
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
        Price(
            style = TrendyolPriceStyle.DualPriceWithUpperAndBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorWarning,
                upperInfoTextStyle = TrendyolDesign.typography.body2MediumColorWarning,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolDesign.colors.colorWarning,
                icon = Icons.Fill.CampaignDownArrow,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = TrendyolDesign.typography.body2ColorWarning,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
                isPriceViewVertical = false
            )
        )
    }
}
