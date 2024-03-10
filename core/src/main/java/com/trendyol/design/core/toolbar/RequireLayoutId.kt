package com.trendyol.design.core.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId

@Composable
fun RequireLayoutId(
    layoutId: Any?,
    errorMessage: String = "Failed requirement.",
    content: @Composable () -> Unit,
) = Layout(content) { measurables, constraints ->

    val child = measurables.singleOrNull()
        ?: error("Only a single child is allowed, was: ${measurables.size}")

    require(child.layoutId == layoutId) { errorMessage }

    layout(0, 0) {}
}
