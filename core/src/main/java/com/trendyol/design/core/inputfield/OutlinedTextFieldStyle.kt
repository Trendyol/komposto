package com.trendyol.design.core.inputfield

import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable

/**
 * Interface representing the style configuration for an outlined text field.
 *
 * @property outlinedTextFieldColors Colors configuration for the outlined text field.
 */
public interface OutlinedTextFieldStyle {

    /** Colors configuration for the outlined text field. */
    @get:Composable
    public val outlinedTextFieldColors: TextFieldColors
}
