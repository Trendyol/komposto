package com.trendyol.design.core.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp

/**
 * This interface is used to define the dimensions of a checkbox.
 * The dimensions provided by the application are used to determine
 * the width, height, and other dimensions of various elements of a
 * checkbox component.
 */
@Immutable
interface CheckBoxSize {

    /**
     * Represents the size of the container in which the checkbox component resides.
     * This value typically determines the perimeter of the checkbox component.
     */
    val containerSize: Dp

    /**
     * Represents the size of the checkbox component.
     * This value determines the width and height of the checkbox.
     */
    val checkboxSize: Dp

    /**
     * Represents the border corner radius of the checkbox.
     * This value determines the degree of rounding of the checkbox corners.
     */
    val borderCornerRadius: Dp

    /**
     * Represents the ripple radius of the checkbox.
     * This value determines the radius of the ripple effect when the checkbox is clicked.
     */
    val rippleRadius: Dp

    /**
     * Represents the style of the checkbox text.
     * This value determines the font family, text size of the check box.
     */
    val textStyle: TextStyle
        @Composable get
}
