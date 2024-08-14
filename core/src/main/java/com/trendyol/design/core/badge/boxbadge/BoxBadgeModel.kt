package com.trendyol.design.core.badge.boxbadge

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@Immutable
data class BoxBadgeModel(
    val title: String,
    val backgroundColor: Color,
    val icon: ImageVector,
    val iconTint: Color = Color.Unspecified,
)
