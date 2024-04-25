package com.trendyol.design.core.inputfield

import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable

/**
 * Interface representing the style configuration for a dropdown component.
 *
 * @property outlinedTextFieldColors Colors configuration for the outlined text field used in the dropdown.
 */
interface DropdownStyle {

    /** Colors configuration for the outlined text field used in the dropdown. */
    @get:Composable
    val outlinedTextFieldColors: TextFieldColors
}
