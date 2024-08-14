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
 * Attributes of the [BoxBadge] components
 *
 * @param boxWidth The width of the card
 * @param boxHeight The height of the card
 * @param borderRadius The border radius of the card
 * @param verticalPadding The vertical padding of the card
 * @param horizontalPadding The horizontal padding of the card
 * @param elevation The elevation padding of the card
 * @param iconSize The icon width and height
 * @param line The line count of the badge title
 * @param fontColor The font color of the badge title
 * @property textStyle The text style of the badge title
 */
@Immutable
data class BoxBadgeAttributes(
    val boxWidth: Dp = 34.dp,
    val boxHeight: Dp = 40.dp,
    val borderRadius: Dp = 4.dp,
    val verticalPadding: Dp = 4.dp,
    val horizontalPadding: Dp = 0.dp,
    val elevation: Dp = 0.dp,
    val iconSize: IconSize = BoxBadgeIconSize,
    val line: Int = 2,
    val fontColor: Color = Color(color = 0xFF333333)
) {
    val textStyle: TextStyle
        @Composable
        get() = TrendyolDesign.typography.overLineMedium
}
