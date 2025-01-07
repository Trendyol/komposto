package com.trendyol.design.core.price

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Basket
import com.trendyol.design.core.icon.icons.fill.CampaignDownArrow
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.KPText
import com.trendyol.design.core.text.Text
import com.trendyol.theme.KPDesign

/**
 * Composable function for vertical price custom view
 * This function includes sale price, market price, bottom info like unit price and upper info like campaign text.
 * It allows you to draw a custom price view by choosing the style that suits your design.
 *
 * @param modifier Optional parameter to specify the modifier for this composable.
 * @param style PriceStyle configuration for the price view, specifying its appearance and behavior.
 */
@Composable
public fun KPPrice(
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
                KPIcon(
                    modifier = Modifier.padding(end = 2.dp),
                    imageVector = model.icon,
                    size = model.iconSize,
                    tint = model.iconTint
                )
            }
            if (model.upperInfoText.isNullOrBlank().not() && model.upperInfoTextStyle != null) {
                KPText(
                    text = model.upperInfoText!!,
                    style = model.upperInfoTextStyle
                )
            }
        }
        if (model.marketPriceText.isNullOrBlank().not() && model.marketPriceTextStyle != null) {
            KPText(
                modifier = Modifier.padding(top = 2.dp),
                text = model.marketPriceText!!,
                style = model.marketPriceTextStyle,
                textDecoration = TextDecoration.LineThrough
            )
        }
        if (model.salePriceText.isNullOrBlank().not() && model.salePriceTextStyle != null) {
            KPText(
                modifier = Modifier
                    .padding(top = 2.dp),
                text = model.salePriceText!!,
                style = model.salePriceTextStyle,
            )
        }
        if (model.bottomInfoText.isNullOrBlank().not() && model.bottomInfoTextStyle != null) {
            KPText(
                modifier = Modifier.padding(top = 2.dp),
                text = model.bottomInfoText!!,
                style = model.bottomInfoTextStyle
            )
        }
    }
}

/**
 * Composable function for vertical price custom view
 * This function includes sale price, market price, bottom info like unit price and upper info like campaign text.
 * It allows you to draw a custom price view by choosing the style that suits your design.
 *
 * @param modifier Optional parameter to specify the modifier for this composable.
 * @param style PriceStyle configuration for the price view, specifying its appearance and behavior.
 */

@Composable
@Deprecated(
    message = "Use KPPrice instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
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
        if (model.bottomInfoText.isNullOrBlank().not() && model.bottomInfoTextStyle != null) {
            Text(
                modifier = Modifier.padding(top = 2.dp),
                text = model.bottomInfoText!!,
                style = model.bottomInfoTextStyle
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SinglePriceStylePreview() {
    PreviewTheme {
        KPPrice(
            style = KPPriceStyle.SinglePrice(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DualPriceStylePreview() {
    PreviewTheme {
        KPPrice(
            style = KPPriceStyle.DualPrice(
                salePriceText = "999999.90 TL",
                marketPriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SinglePriceWithBottomInfoStylePreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun DualPriceWithBottomInfoStylePreview() {
    PreviewTheme {
        KPPrice(
            style = KPPriceStyle.DualPriceWithBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SinglePriceWithUpperInfoStyleBasketPreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun SinglePriceWithUpperInfoStyleLowestPricePreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun DualPriceWithUpperInfoStyleBasketPreview() {
    PreviewTheme {
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
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DualPriceWithUpperInfoStyleLowestPricePreview() {
    PreviewTheme {
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
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SinglePriceWithUpperAndBottomInfoStyleBasketPreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun SinglePriceWithUpperAndBottomInfoStyleLowestPricePreview() {
    PreviewTheme {
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

@Preview(showBackground = true)
@Composable
private fun DualPriceWithUpperAndBottomInfoStyleBasketPreview() {
    PreviewTheme {
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
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DualPriceWithUpperAndBottomInfoStyleLowestPricePreview() {
    PreviewTheme {
        KPPrice(
            style = KPPriceStyle.DualPriceWithUpperAndBottomInfo(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                upperInfoText = "9999 TL’ye 999 TL İndirim",
                iconSize = KPIconSize.XXSmall,
                iconTint = KPDesign.colors.colorWarning,
                bottomInfoText = "(99.90 TL / Kapsül)",
                bottomInfoTextStyle = KPDesign.typography.body2ColorWarning,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
            )
        )
    }
}
