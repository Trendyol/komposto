package com.trendyol.design.core.badge.boxbadge.model

import androidx.compose.runtime.Immutable
import com.trendyol.design.core.badge.boxbadge.BoxBadgeGroup

/**
 * Customizable styling attributes of the [BoxBadgeGroup] component
 *
 * @param maxBadgeCount Specifies the maximum number of badges to display in the list.
 *
 * @param space Determines the space between badges in the list, measured in Dp.
 *
 * @param itemAttributes Defines the styling attributes for individual badges, including
 * properties like padding, icon size, and border radius, etc.
 */
@Immutable
data class BoxBadgeGroupAttributes(
    val maxBadgeCount: Int = 4,
    val space: Int = 4,
    val itemAttributes: BoxBadgeAttributes = BoxBadgeAttributes(),
)
