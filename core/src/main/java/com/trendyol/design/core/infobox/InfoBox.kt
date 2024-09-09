package com.trendyol.design.core.infobox

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.CustomFilteredColorIcon
import com.trendyol.design.core.icon.icons.fill.CircleIcon
import com.trendyol.design.core.icon.icons.fill.InfoIcon
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.theme.TrendyolDesign

@Composable
fun InfoBox(
    modifier: Modifier = Modifier,
    style: InfoBoxStyle
) {
    val model = style.infoBoxModel

    Row(
        modifier = modifier
            .background(color = model.backgroundColor, shape = RoundedCornerShape(8.dp))
            .border(
                border = BorderStroke(width = 1.dp, color = model.borderColor ?: model.backgroundColor),
                shape = RoundedCornerShape(8.dp)
            )
            .padding(12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (model.iconPosition == IconPosition.START) {
            CustomFilteredColorIcon(
                modifier = Modifier.align(Alignment.CenterVertically),
                outerIcon = Icons.Fill.CircleIcon,
                outerTint = model.icon.outerTint,
                innerIcon = Icons.Fill.InfoIcon,
            )
        }


        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = model.textModel.text,
                textAlign = TextAlign.Start,
                style = TrendyolDesign.typography.body1,
                color = model.textModel.textTint
            )

            if (model.textModel.secondText.isNullOrEmpty().not()) {
                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = model.textModel.text,
                    textAlign = TextAlign.Start,
                    style = TrendyolDesign.typography.body1,
                    color = model.textModel.textTint
                )
            }
        }

        if (model.iconPosition == IconPosition.END) {
            CustomFilteredColorIcon(
                modifier = Modifier.align(Alignment.CenterVertically),
                outerIcon = Icons.Fill.CircleIcon,
                outerTint = model.icon.outerTint,
                innerIcon = Icons.Fill.InfoIcon,
            )
        }
    }
}

@Preview
@Composable
private fun DefaultInfoBoxLeftIconPreview() {
    PreviewTheme {
        InfoBox(
            style = TrendyolInfoBoxStyle.DefaultInfoBox(
                textModel = ContentTextModel(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eget metus commodo.",
                    textTint = TrendyolDesign.colors.colorPrimary,
                ),
                icon = IconModel(
                    outerIcon = Icons.Fill.CircleIcon,
                    outerTint = TrendyolDesign.colors.colorPrimary,
                    innerIcon = Icons.Fill.InfoIcon,
                    innerTint = Color.White
                ),
                backgroundColor = TrendyolDesign.colors.colorPrimaryVariant1,
                iconPosition = IconPosition.START
            )
        )
    }
}

@Preview
@Composable
private fun DefaultInfoBoxRightIconPreview() {
    PreviewTheme {
        InfoBox(
            style = TrendyolInfoBoxStyle.DefaultInfoBoxWithBorder(
                textModel = ContentTextModel(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
                    textTint = TrendyolDesign.colors.colorPrimary,
                ),
                icon = IconModel(
                    outerIcon = Icons.Fill.CircleIcon,
                    outerTint = TrendyolDesign.colors.colorPrimary,
                    innerIcon = Icons.Fill.InfoIcon,
                    innerTint = Color.White
                ),
                backgroundColor = TrendyolDesign.colors.colorPrimaryVariant1,
                iconPosition = IconPosition.END
            )
        )
    }
}

@Preview
@Composable
private fun DefaultInfoBoxNoIconPreview() {
    PreviewTheme {
        InfoBox(
            style = TrendyolInfoBoxStyle.DefaultInfoBoxWithBorder(
                textModel = ContentTextModel(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
                ),
                icon = IconModel(
                    outerIcon = Icons.Fill.CircleIcon,
                    outerTint = TrendyolDesign.colors.colorPrimary,
                    innerIcon = Icons.Fill.InfoIcon,
                    innerTint = Color.White
                ),
                backgroundColor = Color.White,
                iconPosition = IconPosition.NONE
            )
        )
    }
}

@Preview
@Composable
private fun DefaultInfoBoxLeftIconWithBorderPreview() {
    PreviewTheme {
        InfoBox(
            style = TrendyolInfoBoxStyle.DefaultInfoBoxWithBorder(
                textModel = ContentTextModel(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eget metus commodo.",
                    textTint = TrendyolDesign.colors.colorPrimary,
                ),
                icon = IconModel(
                    outerIcon = Icons.Fill.CircleIcon,
                    outerTint = TrendyolDesign.colors.colorPrimary,
                    innerIcon = Icons.Fill.InfoIcon,
                    innerTint = Color.White
                ),
                backgroundColor = TrendyolDesign.colors.colorPrimaryVariant1,
                iconPosition = IconPosition.START,
                borderColor = Color.Red
            )
        )
    }
}

@Preview
@Composable
private fun DoubleLineInfoBoxLeftIconPreview() {
    PreviewTheme {
        InfoBox(
            style = TrendyolInfoBoxStyle.DefaultInfoBox(
                textModel = ContentTextModel(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eget metus commodo.",
                    textTint = TrendyolDesign.colors.colorPrimary,
                    secondText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eget metus commodo.",
                ),
                icon = IconModel(
                    outerIcon = Icons.Fill.CircleIcon,
                    outerTint = TrendyolDesign.colors.colorPrimary,
                    innerIcon = Icons.Fill.InfoIcon,
                    innerTint = Color.White
                ),
                backgroundColor = TrendyolDesign.colors.colorPrimaryVariant1,
                iconPosition = IconPosition.START
            )
        )
    }
}