package com.trendyol.design.core.iconbutton

import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.trendyol.design.core.iconbutton.contained.ContainedIconButtonColors
import com.trendyol.design.core.iconbutton.contained.KPDefaultContainedButtonColors
import com.trendyol.theme.KPDesign

public object IconButtonDefaults {

    /**
     * Creates a [ButtonColors] instance to define the background and content colors for an icon button.
     *
     * @param backgroundColor The background color of the button when it is enabled. Defaults to [Color.Unspecified].
     * @param contentColor The content (e.g., icon) color of the button when it is enabled. Defaults to [Color.Unspecified].
     * @param disabledBackgroundColor The background color of the button when it is disabled. Defaults to [Color.Unspecified].
     * @param disabledContentColor The content color of the button when it is disabled. Defaults to [Color.Unspecified].
     * @return A [ButtonColors] instance with the specified colors.
     */
    @Composable
    public fun buttonColors(
        backgroundColor: Color = Color.Unspecified,
        contentColor: Color = Color.Unspecified,
        disabledBackgroundColor: Color = Color.Unspecified,
        disabledContentColor: Color = Color.Unspecified,
    ): ButtonColors {
        return ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor,
            disabledBackgroundColor = disabledBackgroundColor,
            disabledContentColor = disabledContentColor,
        )
    }

    /**
     * Creates a [ContainedIconButtonColors] instance to define the background, content, and container colors
     * for a contained icon button.
     *
     * @param backgroundColor The background color of the button when it is enabled. Defaults to [Color.Unspecified].
     * @param contentColor The content (e.g., icon) color of the button when it is enabled. Defaults to [Color.Unspecified].
     * @param containerColor The container color of the button when it is enabled.
     * Defaults to `KPDesign.colors.colorSurface`.
     * @param disabledBackgroundColor The background color of the button when it is disabled. Defaults to [Color.Unspecified].
     * @param disabledContentColor The content color of the button when it is disabled.
     * Defaults to `KPDesign.colors.colorOnSurfaceVariant1`.
     * @param disabledContainerColor The container color of the button when it is disabled.
     * Defaults to `KPDesign.colors.colorBackground`.
     * @return A [ContainedIconButtonColors] instance with the specified colors.
     */
    @Composable
    public fun containedButtonColors(
        backgroundColor: Color = Color.Unspecified,
        contentColor: Color = Color.Unspecified,
        containerColor: Color = KPDesign.colors.colorSurface,
        disabledBackgroundColor: Color = Color.Unspecified,
        disabledContentColor: Color = KPDesign.colors.colorOnSurfaceVariant1,
        disabledContainerColor: Color = KPDesign.colors.colorBackground,
    ): ContainedIconButtonColors {
        return KPDefaultContainedButtonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor,
            containerColor = containerColor,
            disabledBackgroundColor = disabledBackgroundColor,
            disabledContentColor = disabledContentColor,
            disabledContainerColor = disabledContainerColor,
        )
    }
}
