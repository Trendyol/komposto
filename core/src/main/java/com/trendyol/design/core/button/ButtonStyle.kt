package com.trendyol.design.core.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp

/**
 * Style configuration for a [Button], including [buttonColors] and border settings.
 * Implementations of this interface customize the visual appearance of [Button].
 */
public interface ButtonStyle {

    /**
     * Providing the button colors configuration.
     */
    @get:Composable
    public val buttonColors: KPButtonColors

    /**
     * Retrieves the border stroke configuration for the button based on the specified parameters.
     *
     * @param width The width of the border stroke. Default is `1.dp`.
     * @param enabled Indicates whether the button is enabled or disabled.
     * @return The border stroke configuration for the button. Returns `null` if no border color is provided.
     */
    @Composable
    public fun getBorder(
        width: Dp,
        enabled: Boolean,
    ): BorderStroke? {
        return buttonColors.borderColor(enabled = enabled).value?.let { borderColor ->
            BorderStroke(width = width, color = borderColor)
        }
    }
}
