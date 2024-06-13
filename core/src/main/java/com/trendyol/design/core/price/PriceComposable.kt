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
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.Basket
import com.trendyol.design.core.icon.icons.fill.DownArrow
import com.trendyol.design.core.previewtheme.PreviewTheme
import com.trendyol.design.core.previewtheme.TrendyolColor
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

@Composable
fun PriceComposable(
    modifier: Modifier = Modifier,
    style: PriceStyle
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
            if (model.campaignText.isNullOrBlank().not() && model.campaignTextStyle != null) {
                Text(
                    text = model.campaignText!!,
                    style = model.campaignTextStyle
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
        if (model.unitPriceText.isNullOrBlank().not() && model.unitPriceTextStyle != null) {
            Text(
                modifier = Modifier.padding(top = 2.dp),
                text = model.unitPriceText!!,
                style = model.unitPriceTextStyle
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SinglePriceStylePreview() {
    PreviewTheme {
        PriceComposable(
            style = TrendyolPriceStyle.SinglePrice(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DualPriceStylePreview() {
    PreviewTheme {
        PriceComposable(
            style = TrendyolPriceStyle.DualPrice(
                salePriceText = "999999.90 TL",
                marketPriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SingleUnitPriceStylePreview() {
    PreviewTheme {
        PriceComposable(
            style = TrendyolPriceStyle.SingleUnitPrice(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                unitPriceText = "(99.90 TL / Kapsül)",
                unitPriceTextStyle = TrendyolDesign.typography.body2ColorPrimary
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DualUnitPriceStylePreview() {
    PreviewTheme {
        PriceComposable(
            style = TrendyolPriceStyle.DualUnitPrice(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                unitPriceText = "(99.90 TL / Kapsül)",
                unitPriceTextStyle = TrendyolDesign.typography.body2ColorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SinglePriceWithCampaignStyleBasketPreview() {
    PreviewTheme {
        PriceComposable(
            style = TrendyolPriceStyle.SinglePriceWithCampaign(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                campaignTextStyle = TrendyolDesign.typography.body2MediumColorPrimary,
                campaignText = "9999 TL’ye 999 TL İndirim",
                icon = Icons.Fill.Basket,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolColor.themeColor.colorPrimary
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SinglePriceWithCampaignStyleLowestPricePreview() {
    PreviewTheme {
        PriceComposable(
            style = TrendyolPriceStyle.SinglePriceWithCampaign(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorWarning,
                campaignTextStyle = TrendyolDesign.typography.body2MediumColorWarning,
                campaignText = "Son 30 Günün En Düşük Fiyatı",
                icon = Icons.Fill.DownArrow,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolColor.themeColor.colorWarning
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DualPriceWithCampaignStyleBasketPreview() {
    PreviewTheme {
        PriceComposable(
            style = TrendyolPriceStyle.DualPriceWithCampaign(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                campaignTextStyle = TrendyolDesign.typography.body2MediumColorPrimary,
                campaignText = "9999 TL’ye 999 TL İndirim",
                icon = Icons.Fill.Basket,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolColor.themeColor.colorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DualPriceWithCampaignStyleLowestPricePreview() {
    PreviewTheme {
        PriceComposable(
            style = TrendyolPriceStyle.DualPriceWithCampaign(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorWarning,
                campaignTextStyle = TrendyolDesign.typography.body2MediumColorWarning,
                campaignText = "Son 30 Günün En Düşük Fiyatı",
                icon = Icons.Fill.DownArrow,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolColor.themeColor.colorWarning,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SingleUnitPriceWithCampaignStyleBasketPreview() {
    PreviewTheme {
        PriceComposable(
            style = TrendyolPriceStyle.SingleUnitPriceWithCampaign(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                campaignTextStyle = TrendyolDesign.typography.body2MediumColorPrimary,
                campaignText = "9999 TL’ye 999 TL İndirim",
                icon = Icons.Fill.Basket,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolColor.themeColor.colorPrimary,
                unitPriceText = "(99.90 TL / Kapsül)",
                unitPriceTextStyle = TrendyolDesign.typography.body2ColorPrimary,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SingleUnitPriceWithCampaignStyleLowestPricePreview() {
    PreviewTheme {
        PriceComposable(
            style = TrendyolPriceStyle.SingleUnitPriceWithCampaign(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorWarning,
                campaignTextStyle = TrendyolDesign.typography.body2MediumColorWarning,
                campaignText = "9999 TL’ye 999 TL İndirim",
                icon = Icons.Fill.DownArrow,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolColor.themeColor.colorWarning,
                unitPriceText = "(99.90 TL / Kapsül)",
                unitPriceTextStyle = TrendyolDesign.typography.body2ColorWarning,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DualUnitPriceWithCampaignStyleBasketPreview() {
    PreviewTheme {
        PriceComposable(
            style = TrendyolPriceStyle.DualUnitPriceWithCampaign(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorPrimary,
                campaignTextStyle = TrendyolDesign.typography.body2MediumColorPrimary,
                campaignText = "9999 TL’ye 999 TL İndirim",
                icon = Icons.Fill.Basket,
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolColor.themeColor.colorPrimary,
                unitPriceText = "(99.90 TL / Kapsül)",
                unitPriceTextStyle = TrendyolDesign.typography.body2ColorPrimary,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DualUnitPriceWithCampaignStyleLowestPricePreview() {
    PreviewTheme {
        PriceComposable(
            style = TrendyolPriceStyle.DualUnitPriceWithCampaign(
                salePriceText = "999999.90 TL",
                salePriceTextStyle = TrendyolDesign.typography.subtitleMediumColorWarning,
                campaignTextStyle = TrendyolDesign.typography.body2MediumColorWarning,
                campaignText = "9999 TL’ye 999 TL İndirim",
                iconSize = TrendyolIconSize.XXSmall,
                iconTint = TrendyolColor.themeColor.colorWarning,
                unitPriceText = "(99.90 TL / Kapsül)",
                unitPriceTextStyle = TrendyolDesign.typography.body2ColorWarning,
                marketPriceText = "999999.90 TL",
                marketPriceTextStyle = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1,
            )
        )
    }
}
