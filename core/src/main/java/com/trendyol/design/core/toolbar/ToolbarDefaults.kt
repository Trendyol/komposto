package com.trendyol.design.core.toolbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.TrendyolIconSize

@Stable
object ToolbarDefaults {

    /**
     * Default elevation used for TrendyolToolbar
     */
    val Elevation = 1.dp

    /**
     * Default padding used for TrendyolToolbar
     */
    val ContentPadding = PaddingValues(
        horizontal = TrendyolTopAppBarHorizontalPadding
    )

    /**
     * Default icon size used for TrendyolToolbar
     */
    val IconSize = TrendyolIconSize.Medium
}

private val TrendyolTopAppBarHorizontalPadding = 16.dp
