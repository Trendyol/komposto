package com.trendyol.design.core.statelayout.states.loading

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.theme.KPDesign

/**
 * Loading indicator styles for Komposto.
 *
 * Provides the default color scheme for loading indicators using Komposto's design tokens.
 *
 * @see LoadingIndicatorStyle
 */
@ExperimentalKompostoApi
public data object KPLoadingIndicatorStyle : LoadingIndicatorStyle {

    /**
     * Default loading indicator color for Komposto.
     */
    override val indicatorColor: Color
        @Composable
        get() = KPDesign.colors.colorPrimary

    /**
     * Default loading indicator background color for Komposto.
     */
    override val backgroundColor: Color
        @Composable
        get() = KPDesign.colors.colorBackground

    /**
     * Default loading indicator thickness value for Komposto.
     */
    override val strokeWidth: Dp
        @Composable
        get() = 4.dp
}
