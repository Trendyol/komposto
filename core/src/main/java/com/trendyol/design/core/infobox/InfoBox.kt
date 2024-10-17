package com.trendyol.design.core.infobox

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
    style: InfoBoxStyle,
    text: String,
    modifier: Modifier = Modifier,
    iconPosition: Arrangement.Horizontal? = null,
    showBorder: Boolean = false,
) {
    val rootModifier = modifier
        .then(
            if (showBorder) {
                modifier.border(
                    border = BorderStroke(width = 1.dp, color = style.borderColor),
                    shape = RoundedCornerShape(8.dp)
                )
            } else {
                modifier
            }
        )
        .background(color = style.backgroundColor, shape = RoundedCornerShape(8.dp))
        .padding(12.dp)


    Row(
        modifier = rootModifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (iconPosition == Arrangement.Start) {
            CustomFilteredColorIcon(
                modifier = Modifier.align(Alignment.CenterVertically),
                outerIcon = Icons.Fill.CircleIcon,
                outerTint = style.iconTint,
                innerIcon = Icons.Fill.InfoIcon,
            )
        }

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = text,
                style = TrendyolDesign.typography.body1.copy(color = style.textColor),
            )
        }

        if (iconPosition == Arrangement.End) {
            CustomFilteredColorIcon(
                modifier = Modifier.align(Alignment.CenterVertically),
                outerIcon = Icons.Fill.CircleIcon,
                outerTint = style.iconTint,
                innerIcon = Icons.Fill.InfoIcon,
            )
        }
    }
}

@Composable
fun InfoBox(
    style: InfoBoxStyle,
    modifier: Modifier = Modifier,
    iconPosition: Arrangement.Horizontal? = null,
    showBorder: Boolean = false,
    multiText: @Composable ColumnScope.() -> Unit,
) {


    val rootModifier = modifier
        .then(
            if (showBorder) {
                modifier.border(
                    border = BorderStroke(width = 1.dp, color = style.borderColor),
                    shape = RoundedCornerShape(8.dp)
                )
            } else {
                modifier
            }
        )
        .background(color = style.backgroundColor, shape = RoundedCornerShape(8.dp))
        .padding(12.dp)


    Row(
        modifier = rootModifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (iconPosition == Arrangement.Start) {
            CustomFilteredColorIcon(
                modifier = Modifier.align(Alignment.CenterVertically),
                outerIcon = Icons.Fill.CircleIcon,
                outerTint = style.iconTint,
                innerIcon = Icons.Fill.InfoIcon,
            )
        }


        Column(modifier = Modifier.weight(1f)) {
            CompositionLocalProvider(
                LocalTextStyle provides TrendyolDesign.typography.body1.copy(color = style.textColor)
            ) {
                multiText()
            }
        }

        if (iconPosition == Arrangement.End) {
            CustomFilteredColorIcon(
                modifier = Modifier.align(Alignment.CenterVertically),
                outerIcon = Icons.Fill.CircleIcon,
                outerTint = style.iconTint,
                innerIcon = Icons.Fill.InfoIcon,
            )
        }
    }
}

@Preview
@Composable
private fun OrangeInfoBoxLeftIconPreview() {
    PreviewTheme {
        InfoBox(
            style = KPInfoBoxStyle.Orange,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start,
        )
    }
}

@Preview
@Composable
private fun OrangeInfoBoxRightIconPreview() {
    PreviewTheme {
        InfoBox(
            style = KPInfoBoxStyle.Orange,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.End,
        )
    }
}

@Preview
@Composable
private fun OrangeInfoBoxNoIconPreview() {
    PreviewTheme {
        InfoBox(
            style = KPInfoBoxStyle.Orange,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun OrangeInfoBoxLeftIconWithBorderPreview() {
    PreviewTheme {
        InfoBox(
            style = KPInfoBoxStyle.Orange,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start,
            showBorder = true
        )
    }
}

@Preview
@Composable
private fun OrangeInfoBoxLeftIconWithTwoTextsPreview() {
    PreviewTheme {
        InfoBox(
            style = KPInfoBoxStyle.Orange,
            iconPosition = Arrangement.Start,
            showBorder = false
        ) {
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            )
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
                color = Color.Red
            )
        }
    }
}

@Preview
@Composable
private fun WhiteInfoBoxLeftIconPreview() {
    PreviewTheme {
        InfoBox(
            style = KPInfoBoxStyle.White,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun GrayInfoBoxLeftIconPreview() {
    PreviewTheme {
        InfoBox(
            style = KPInfoBoxStyle.Gray,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start
        )
    }
}

@Preview
@Composable
private fun RedInfoBoxLeftIconPreview() {
    PreviewTheme {
        InfoBox(
            style = KPInfoBoxStyle.Red,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start
        )
    }
}

@Preview
@Composable
private fun BlueInfoBoxLeftIconPreview() {
    PreviewTheme {
        InfoBox(
            style = KPInfoBoxStyle.Blue,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start
        )
    }
}

@Preview
@Composable
private fun GreenInfoBoxLeftIconPreview() {
    PreviewTheme {
        InfoBox(
            style = KPInfoBoxStyle.Green,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start
        )
    }
}

@Preview
@Composable
private fun PinkInfoBoxLeftIconPreview() {
    PreviewTheme {
        InfoBox(
            style = KPInfoBoxStyle.Pink,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phas ellus eget metus commodo.",
            iconPosition = Arrangement.Start
        )
    }
}
