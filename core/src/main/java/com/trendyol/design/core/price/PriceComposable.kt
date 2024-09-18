package com.trendyol.design.core.price

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.Basket
import com.trendyol.design.core.icon.icons.fill.CampaignDownArrow
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

/**
 * Composable function for vertical and horizontal price custom view
 * This function includes sale price, market price, bottom info like unit price and upper info like campaign text.
 * It allows you to draw a custom price view by choosing the style that suits your design.
 * In styles where the isPriceViewVertical value is sent as true, market price and sale price are drawn vertically, and when false is sent, they are aligned horizontally.
 *
 * @param modifier Optional parameter to specify the modifier for this composable.
 * @param style PriceStyle configuration for the price view, specifying its appearance and behavior.
 */

@Composable
public fun Price(
    style: PriceStyle,
    modifier: Modifier = Modifier
) {
    val model = style.priceModel

    Column(
        modifier = modifier.wrapContentSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (model.icon != null && model.iconTint != null) {
                Icon(
                    modifier = Modifier.padding(end = 2.dp),
                    imageVector = model.icon,
                    size = model.iconSize,
                    tint = model.iconTint
                )
            }
            if (model.upperInfoText.isNullOrBlank().not() && model.upperInfoTextStyle != null) {
                Text(
                    text = model.upperInfoText!!,
                    style = model.upperInfoTextStyle
                )
            }
        }
        if (model.isPriceViewVertical) {
            VerticalPriceView(model)
        } else {
            HorizontalPriceView(model)
        }

        if (model.bottomInfoText.isNullOrBlank().not() && model.bottomInfoTextStyle != null) {
            Text(
                modifier = Modifier.padding(top = 2.dp),
                text = model.bottomInfoText!!,
                style = model.bottomInfoTextStyle
            )
        }
    }
}

@Composable
private fun VerticalPriceView(model: PriceModel) {
    Column {
        if (model.marketPriceText.isNullOrBlank().not() && model.marketPriceTextStyle != null) {
            Text(
                modifier = Modifier.padding(top = 2.dp),
                text = model.marketPriceText!!,
                style = model.marketPriceTextStyle,
                textDecoration = TextDecoration.LineThrough
            )
        }
        if (model.salePriceText.isNullOrBlank().not() && model.salePriceTextStyle != null) {
            Text(
                modifier = Modifier
                    .padding(top = 2.dp),
                text = model.salePriceText!!,
                style = model.salePriceTextStyle,
            )
        }
    }
}

@Composable
private fun HorizontalPriceView(model: PriceModel) {
    Row {
        if (model.marketPriceText.isNullOrBlank().not() && model.marketPriceTextStyle != null) {
            Text(
                modifier = Modifier.padding(top = 2.dp),
                text = model.marketPriceText!!,
                style = model.marketPriceTextStyle,
                textDecoration = TextDecoration.LineThrough
            )
            Spacer(modifier = Modifier.width(4.dp))
        }
        if (model.salePriceText.isNullOrBlank().not() && model.salePriceTextStyle != null) {
            Text(
                modifier = Modifier
                    .padding(top = 2.dp),
                text = model.salePriceText!!,
                style = model.salePriceTextStyle,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SinglePriceStylePreview() {
    PreviewTheme {
        Price(
            style = TrendyolPriceStyle.SinglePrice(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SinglePriceWithBottomInfoStylePreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun SinglePriceWithUpperInfoStyleBasketPreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun SinglePriceWithUpperInfoStyleLowestPricePreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun SinglePriceWithUpperAndBottomInfoStyleBasketPreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun SinglePriceWithUpperAndBottomInfoStyleLowestPricePreview() {
    PreviewTheme {
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


@Preview(showBackground = true)
@Composable
private fun HorizontalDualPriceStylePreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun VerticalDualPriceStylePreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun HorizontalDualPriceWithBottomInfoStylePreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun VerticalDualPriceWithBottomInfoStylePreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun HorizontalDualPriceWithUpperInfoStyleBasketPreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun VerticalDualPriceWithUpperInfoStyleBasketPreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun HorizontalDualPriceWithUpperInfoStyleLowestPricePreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun VerticalDualPriceWithUpperInfoStyleLowestPricePreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun HorizontalDualPriceWithUpperAndBottomInfoStyleBasketPreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun VerticalDualPriceWithUpperAndBottomInfoStyleBasketPreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun HorizontalDualPriceWithUpperAndBottomInfoStyleLowestPricePreview() {
    PreviewTheme {
        Price(
            style = TrendyolPriceStyle.DualPriceWithUpperAndBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorWarning,
                upperInfoTextStyle = TrendyolDesign.typography.body2MediumColorWarning,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolDesign.colors.colorWarning,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = TrendyolDesign.typography.body2ColorWarning,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
                isPriceViewVertical = false
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun VerticalDualPriceWithUpperAndBottomInfoStyleLowestPricePreview() {
    PreviewTheme {
        Price(
            style = TrendyolPriceStyle.DualPriceWithUpperAndBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorWarning,
                upperInfoTextStyle = TrendyolDesign.typography.body2MediumColorWarning,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolDesign.colors.colorWarning,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = TrendyolDesign.typography.body2ColorWarning,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
                isPriceViewVertical = true
            )
        )
    }
}
