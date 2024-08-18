package com.trendyol.design.core.badge.boxbadge.model

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.IconSize
import com.trendyol.theme.TrendyolDesign
import com.trendyol.design.core.badge.boxbadge.BoxBadge

/**
 * Customizable styling attributes of the [BoxBadge] component
 *
 * @param boxWidth The width of the card.
 * @param boxHeight The height of the card.
 * @param cornerRadius The corner radius of the card, which determines how rounded the corners will be.
 * @param verticalPadding The amount of vertical padding inside the card, adding space above and below the content.
 * @param horizontalPadding The amount of horizontal padding inside the card, adding space to the sides of the content.
 * @param elevation The elevation of the card, affecting its shadow depth and positioning on the z-axis.
 * @param iconSize The size of the icon displayed inside the badge, controlling both its width and height.
 * @param line The exact number of lines (min and max) allowed for the badge title text.
 * @param fontColor The color of the badge title text.
 * @property textStyle The text style of the badge title, such as font size, weight, and letter spacing.
 */
@Immutable
data class BoxBadgeAttributes(
    val boxWidth: Int = 34,
    val boxHeight: Int = 40,
    val cornerRadius: Dp = 4.dp,
    val verticalPadding: Dp = 0.dp,
    val horizontalPadding: Dp = 0.dp,
    val elevation: Dp = 0.dp,
    val iconSize: IconSize = BoxBadgeIconSize,
    val line: Int = 2,
    val fontColor: Color = Color(color = 0xFF333333),
    val textStyle: TextStyle? = null,
) {
    val defaultTextStyle: TextStyle
        @Composable
        get() = TrendyolDesign.typography.overLineMedium
}
