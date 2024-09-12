package com.trendyol.design.core.badge.boxbadge.model

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.IconSize
import com.trendyol.theme.TrendyolDesign
import com.trendyol.design.core.badge.boxbadge.KPBoxBadge

/**
 * Customizable styling attributes of the [KPBoxBadge] component
 *
 * @param boxWidth The width of the card in Dp.
 * @param boxHeight The height of the card in Dp.
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
public data class BoxBadgeAttributes(
    val boxWidth: Dp = 34.dp,
    val boxHeight: Dp = 40.dp,
    val cornerRadius: Dp = 4.dp,
    val verticalPadding: Dp = 0.dp,
    val horizontalPadding: Dp = 0.dp,
    val elevation: Dp = 0.dp,
    val iconSize: IconSize = BoxBadgeIconSize,
    val line: Int = 2,
    val fontColor: Color? = null,
    val textStyle: TextStyle? = null,
) {
    @Composable
    public fun textStyle(): TextStyle {
        return textStyle ?: TrendyolDesign.typography.overLineMedium
    }

    @Composable
    public fun fontColor(): Color {
        return fontColor ?: TrendyolDesign.colors.colorOnSurfaceVariant3
    }
}
