package com.trendyol.design.core.toolbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.IconSize
import com.trendyol.design.core.icon.KPIconSize

@Stable
public object KPToolbarDefaults {

    /**
     * Default elevation used for TrendyolToolbar
     */
    public val Elevation: Dp = 2.dp

    /**
     * Default padding used for TrendyolToolbar
     */
    public val ContentPadding: PaddingValues = PaddingValues(
        horizontal = KPTopAppBarHorizontalPadding
    )

    /**
     * Default icon size used for TrendyolToolbar
     */
    public val IconSize: IconSize = KPIconSize.Medium
}

private val KPTopAppBarHorizontalPadding = 16.dp
