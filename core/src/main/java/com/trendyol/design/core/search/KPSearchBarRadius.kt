package com.trendyol.design.core.search

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Sealed interface defining allowed radius values for KPSearchBar component.
 * * This ensures type safety and prevents arbitrary radius values that could
 * break the design system consistency.
 */
public sealed interface KPSearchBarRadius {

    public val value: Dp

    /**
     * Standard small radius for search bar corners (8dp)
     */
    public data object Small : KPSearchBarRadius {
        override val value: Dp = 8.dp
    }

    /**
     * Standard large radius for search bar corners (18dp)
     */
    public data object Large : KPSearchBarRadius {
        override val value: Dp = 18.dp
    }
}
