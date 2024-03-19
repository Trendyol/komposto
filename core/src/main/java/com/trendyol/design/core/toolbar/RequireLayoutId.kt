package com.trendyol.design.core.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId

@Composable
fun CheckToolbarLayoutIds(
    layoutId: Any?,
    modifier: Modifier = Modifier,
    isSingleChildRequired: Boolean = false,
    errorMessage: String = "Failed requirement.",
    content: @Composable () -> Unit,
) = Layout(content) { measurables, _ ->

    if (isSingleChildRequired) {
        val child = measurables.singleOrNull()
            ?: error("Only a single child is allowed, was: ${measurables.size}")

        require(child.layoutId == layoutId) { errorMessage }
    } else {
        require(measurables.all { child -> child.layoutId == layoutId }) { errorMessage }
    }

    layout(0, 0) {}
}
