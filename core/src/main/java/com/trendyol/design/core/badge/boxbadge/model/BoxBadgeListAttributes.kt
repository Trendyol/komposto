package com.trendyol.design.core.badge.boxbadge.model

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.badge.boxbadge.BoxBadgeList

/**
 * Customizable styling attributes of the [BoxBadgeList] component
 *
 * @param displayMode Defines how badges are displayed within the list.
 *
 *   - If [displayMode] is [BoxBadgeListDisplayMode.SPREAD], the badges will scale their size proportionally
 *   to match the available width of the container. The height of each badge will adjust to maintain the
 *   aspect ratio defined by [BoxBadgeAttributes.boxWidth] / [BoxBadgeAttributes.boxHeight].
 *   (e.g., 34:40)
 *
 *   - If [displayMode] is [BoxBadgeListDisplayMode.FIXED], each badge will maintain a fixed size of
 *   [BoxBadgeAttributes.boxWidth].dp in width and [BoxBadgeAttributes.boxHeight].dp in height.
 *   (e.g., width=34.dp height=4.dp0)
 *
 * @param visibleBadgeCount Specifies the maximum number of badges to display in the list.
 *
 * @param space Determines the space between badges in the list, measured in Dp.
 *
 * @param itemAttributes Defines the styling attributes for individual badges, including
 * properties like padding, icon size, and border radius, etc.
 */
@Immutable
data class BoxBadgeListAttributes(
    val displayMode: BoxBadgeListDisplayMode = BoxBadgeListDisplayMode.FIXED,
    val visibleBadgeCount: Int = 4,
    val space: Dp = 4.dp,
    val itemAttributes: BoxBadgeAttributes = BoxBadgeAttributes(),
)
