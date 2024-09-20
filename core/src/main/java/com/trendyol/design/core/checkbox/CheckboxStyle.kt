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
public interface CheckboxStyle {

    /**
     * Returns the colors used for rendering the checkbox.
     * This includes the colors for the checkboxes various states
     * such as checked, unchecked, disabled, etc.
     */
    public val colors: TrendyolCheckboxColors
        @Composable get

    /**
     * Returns the inner padding for the checkbox.
     */
    public val innerPadding: Dp
}
