package com.trendyol.design.core.badge.boxbadge.attributes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.trendyol.design.core.icon.IconSize


/**
 * Interface defining the attributes for [BoxBadge] components.
 */
@Immutable
interface BoxBadgeAttributes {

    /**
     * The width of the card
     */
    val boxWidth: Dp

    /**
     * The height of the card
     */
    val boxHeight: Dp

    /**
     * The border radius of the card
     */
    val borderRadius: Dp

    /**
     * The vertical padding of the card
     */
    val verticalPadding: Dp

    /**
     * The horizontal padding of the card
     */
    val horizontalPadding: Dp

    /**
     * The icon width and height
     */
    val iconSize: IconSize

    /**
     * The line count of the badge title
     */
    val line: Int

    /**
     * The font color of the badge title
     */
    val fontColor: Color

    /**
     * The text style of the badge title
     */
    @get:Composable
    val textStyle: TextStyle
}
