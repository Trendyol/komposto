package com.trendyol.design.core.text

import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

object TrendyolTextDefaults {

    /**
     * @param letterSpacing Assigned to 0 in order to align with the sp values in design guide.
     */
    val letterSpacing: TextUnit = 0.sp

    /**
     * @param includeFontPadding Assigned to false in order to align with the dp values in design guide.
     */
    @Suppress("DEPRECATION")
    val platformStyle: PlatformTextStyle = PlatformTextStyle(
        includeFontPadding = false,
    )
}
