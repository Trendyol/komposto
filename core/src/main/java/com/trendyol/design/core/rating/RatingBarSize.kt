package com.trendyol.design.core.rating

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize

/**
 * An interface defining the styling options for the `RatingBar` composable function.
 *
 * `RatingBarSize` provides customizable attributes for the appearance of the rating bar, including
 * the size of the star icons, the size of the camera icon (if displayed), and the text style used
 * for the rating and review count text.
 *
 * @property starIconSize The size of each star icon in the rating bar.
 * @property cameraIconSize The size of the camera icon, if displayed, defined as a DpSize.
 * @property textSize The text style to be applied to the rating value and review count text.
 */
public interface RatingBarSize {

    /**
     * The size of each star icon in the rating bar.
     */
    public val starIconSize: Dp

    /**
     * The size of the camera icon, if displayed, defined as a DpSize.
     */
    @get:Composable
    public val cameraIconSize: DpSize

    /**
     * The text style to be applied to the rating value and review count text.
     */
    @get:Composable
    public val textSize: TextStyle
}
