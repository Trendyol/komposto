package com.trendyol.design.core.badge.boxbadge.model

import androidx.compose.runtime.Stable
import com.trendyol.design.core.badge.boxbadge.BoxBadgeType

@Stable
data class BoxBadgeListContent(
    val list: List<BoxBadgeType>
)
