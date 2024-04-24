package com.trendyol.design.core.inputfield

import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable

/**
 * Interface representing the style configuration for an outlined text field.
 *
 * @property shouldShowLabel Determines whether the text field should display a label.
 * @property outlinedTextFieldColors Colors configuration for the outlined text field.
 */
interface OutlinedTextFieldStyle {

    /** Determines whether the text field should display a label. */
    val shouldShowLabel: Boolean

    /** Colors configuration for the outlined text field. */
    @get:Composable
    val outlinedTextFieldColors: TextFieldColors
}
