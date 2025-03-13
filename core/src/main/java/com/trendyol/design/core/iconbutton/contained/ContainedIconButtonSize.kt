package com.trendyol.design.core.iconbutton.contained

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import com.trendyol.design.core.iconbutton.standard.IconButtonSize

/**
 * Interface defining the sizes used for a [KPContainedIconButton].
 *
 * This interface specifies the size of the icon button and its container.
 */
@Stable
public interface ContainedIconButtonSize {

    /**
     * The size of the icon button, represented as an [IconButtonSize].
     */
    public val iconButtonSize: IconButtonSize

    /**
     * The size of the container surrounding the icon button, represented as a [Dp] value.
     */
    public val containerSize: Dp
}
