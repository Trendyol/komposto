package com.trendyol.design.core.iconbutton.standard

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import com.trendyol.design.core.icon.IconSize

/**
 * Interface defining the size of an icon button.
 *
 * This interface specifies both the overall size of the button and the size of the icon it contains.
 */
@Stable
public interface IconButtonSize {

    /**
     * The size of the icon button, represented as a [Dp] value.
     */
    public val dp: Dp

    /**
     * The size of the icon within the button, represented as an [IconSize].
     */
    public val iconSize: IconSize
}
