package com.trendyol.design.core.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp

/**
 * This interface defines the style properties for a checkbox.
 * CheckboxStyle provides options for specifying colors, padding,
 * stroke width, and different styles for checkbox labels or contents.
 */
@Immutable
interface CheckboxStyle {

    /**
     * Returns the colors used for rendering the checkbox.
     * This includes the colors for the checkboxes various states
     * such as checked, unchecked, disabled, etc.
     */
    val colors: TrendyolCheckboxColors
        @Composable get

    /**
     * Returns the padding around the checkbox.
     * Padding determines the space between the checkbox and its
     * surrounding elements.
     */
    val padding: Dp

    /**
     * Returns the stroke width of the checkbox.
     * Stroke width determines the thickness of the checkbox border.
     */
    val strokeWith: Dp

    interface Text : CheckboxStyle {
        /**
         * The text label for checkbox.
         */
        val text: String
    }

    interface Content : CheckboxStyle {
        /**
         * The custom Composable content to be displayed within the checkbox.
         */
        val content: @Composable () -> Unit
    }
}
