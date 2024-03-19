package com.trendyol.design.core.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Size configuration for a [Button], including [contentPadding], [font],
 * and [minHeight]. Implementations of this interface customize the appearance and dimensions
 * of [Button].
 */
interface ButtonSize {

    /**
     * Padding values defining the spacing around the content of the button.
     */
    val contentPadding: PaddingValues

    /**
     * Text style for the button content.
     */
    @get:Composable
    val font: TextStyle

    /**
     * Minimum height required for the button to ensure proper visibility and touchability.
     * By default, it calculates the height based on the [font] and [contentPadding].
     */
    val minHeight: Dp
        @Composable
        get() = (
            font.fontSize.value +
                contentPadding.calculateTopPadding().value +
                contentPadding.calculateBottomPadding().value
            ).dp
}
