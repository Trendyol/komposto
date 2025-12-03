package com.trendyol.design.core.statelayout.states.loading

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

/**
 * Style configuration for loading indicators.
 *
 * Implementations of this interface customize the color scheme and stroke width of loading indicators.
 *
 * @see KPLoadingIndicatorStyle
 */
@Immutable
public interface LoadingIndicatorStyle {

    /**
     * The color of loading indicator (spinner/progress)
     */
    public val indicatorColor: Color
        @Composable get

    /**
     * The background color of the loading indicator
     */
    public val backgroundColor: Color
        @Composable get

    /**
     * The thickness of loading indicator
     */
    public val strokeWidth: Dp
        @Composable get
}
