package com.trendyol.design.core.inputfield

import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable

/**
 * Interface representing the style configuration for a dropdown component.
 *
 * @property shouldShowLabel Determines whether the dropdown should display a label.
 * @property outlinedTextFieldColors Colors configuration for the outlined text field used in the dropdown.
 */
interface DropdownStyle {

    /** Determines whether the dropdown should display a label. */
    val shouldShowLabel: Boolean

    /** Colors configuration for the outlined text field used in the dropdown. */
    @get:Composable
    val outlinedTextFieldColors: TextFieldColors
}
