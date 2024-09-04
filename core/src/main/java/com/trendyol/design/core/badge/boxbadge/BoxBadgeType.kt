package com.trendyol.design.core.badge.boxbadge

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Represents the basic properties needed to create a [KPBoxBadge], including
 * a title, an icon, and colors for the background and icon tint.
 */
interface BoxBadgeType {

    /**
     * The title text to be displayed in the badge.
     */
    val title: String

    /**
     * The icon to be displayed in the badge.
     */
    val icon: ImageVector

    /**
     * The background color of the box containing the badge.
     */
    val boxBackgroundColor: Color
        @Composable get

    /**
     * The tint color to be applied to the icon.
     */
    val iconTintColor: Color
        @Composable get
}
