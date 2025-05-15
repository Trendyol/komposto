package com.trendyol.design.core.iconbutton.contained

import androidx.compose.material.ButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color

/**
 * Interface defining the colors used for a contained icon button.
 *
 * This interface extends [ButtonColors] and adds a function for obtaining the container color
 * depending on whether the button is enabled or disabled.
 */
@Stable
public interface ContainedIconButtonColors : ButtonColors {

    /**
     * Provides the container color for the button based on its enabled state.
     *
     * @param enabled `true` if the button is enabled, `false` if disabled.
     * @return A [State] object containing the appropriate [Color] for the container.
     */
    @Composable
    public fun containerColor(enabled: Boolean): State<Color>
}

/**
 * Default implementation of [ContainedIconButtonColors] used for providing colors for a
 * contained button's various states.
 *
 * @param backgroundColor The background color of the button when it is enabled.
 * @param contentColor The content (e.g., icon) color of the button when it is enabled.
 * @param containerColor The container color of the button when it is enabled.
 * @param disabledBackgroundColor The background color of the button when it is disabled.
 * @param disabledContentColor The content color of the button when it is disabled.
 * @param disabledContainerColor The container color of the button when it is disabled.
 */
@Stable
internal class KPDefaultContainedButtonColors(
    private val backgroundColor: Color,
    private val contentColor: Color,
    private val containerColor: Color,
    private val disabledBackgroundColor: Color,
    private val disabledContentColor: Color,
    private val disabledContainerColor: Color,
) : ContainedIconButtonColors {

    /**
     * Provides the container color based on the enabled state.
     *
     * @param enabled `true` if the button is enabled, `false` if disabled.
     * @return A [State] containing the appropriate [Color] for the container.
     */
    @Composable
    override fun containerColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) containerColor else disabledContainerColor)
    }

    /**
     * Provides the background color based on the enabled state.
     *
     * @param enabled `true` if the button is enabled, `false` if disabled.
     * @return A [State] containing the appropriate [Color] for the background.
     */
    @Composable
    override fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) backgroundColor else disabledBackgroundColor)
    }

    /**
     * Provides the content color based on the enabled state.
     *
     * @param enabled `true` if the button is enabled, `false` if disabled.
     * @return A [State] containing the appropriate [Color] for the content.
     */
    @Composable
    override fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) contentColor else disabledContentColor)
    }
}
