package com.trendyol.design.core.util

import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.LayoutDirection

/**
 * An extension function for the `Modifier` class that mirrors the content horizontally based on the layout direction.
 *
 * @param layoutDirection The `LayoutDirection` which determines the mirroring. If the direction is `LayoutDirection.Rtl`, the content is mirrored.
 * @return A modified `Modifier` with horizontal mirroring applied if the layout direction is `LayoutDirection.Rtl`.
 */
@Stable
public fun Modifier.mirror(layoutDirection: LayoutDirection): Modifier {
    return if (layoutDirection == LayoutDirection.Rtl)
        this.scale(scaleX = -1f, scaleY = 1f)
    else
        this
}
