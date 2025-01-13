package com.trendyol.design.core.text

import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

public object KPTextDefaults {

    /**
     * @param letterSpacing Assigned to 0 in order to align with the sp values in design guide.
     */
    public val letterSpacing: TextUnit = 0.sp

    /**
     * @param includeFontPadding Assigned to false in order to align with the dp values in design guide.
     */
    public val platformStyle: PlatformTextStyle = PlatformTextStyle(
        includeFontPadding = false,
    )
}

@Deprecated(
    message = "Use KPTextDefaults instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPTextDefaults"
    ),
    level = DeprecationLevel.WARNING
)
public object TrendyolTextDefaults {

    /**
     * @param letterSpacing Assigned to 0 in order to align with the sp values in design guide.
     */
    public val letterSpacing: TextUnit = 0.sp

    /**
     * @param includeFontPadding Assigned to false in order to align with the dp values in design guide.
     */
    @Suppress("DEPRECATION")
    public val platformStyle: PlatformTextStyle = PlatformTextStyle(
        includeFontPadding = false,
    )
}
