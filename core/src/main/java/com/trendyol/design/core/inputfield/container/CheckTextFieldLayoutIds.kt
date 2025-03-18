package com.trendyol.design.core.inputfield.container

import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import kotlinx.collections.immutable.PersistentSet

/**
 * A composable that validates the layoutId of its children.
 * This composable doesn't actually render anything to the screen,
 * it only performs validation during the layout phase.
 *
 * @param layoutId Set of allowed layoutIds. The children must have one of these layoutIds.
 * @param isSingleChildRequired If true, ensures that there is exactly one child.
 *                            If false, allows multiple children but all must have valid layoutIds.
 * @param errorMessage Custom error message to show when validation fails.
 * @param content The composable content to be validated.
 *
 * Example usage:
 * ```
 * CheckTextFieldLayoutIds(
 *     layoutId = setOf(IconLayoutId, TextLayoutId),
 *     isSingleChildRequired = true,
 *     errorMessage = "Content must be either Icon or Text"
 * ) {
 *     // Your content here
 * }
 * ```
 */
@Composable
internal fun CheckTextFieldLayoutIds(
    layoutId: PersistentSet<Any>,
    isSingleChildRequired: Boolean = false,
    errorMessage: String = "Failed requirement.",
    content: @Composable () -> Unit,
) {
    Layout(content) { measurables, _ ->
        if (isSingleChildRequired) {
            val child = measurables.singleOrNull()
                ?: error("Only a single child is allowed, was: ${measurables.size}")

            require(child.layoutId in layoutId) { errorMessage }
        } else {
            require(measurables.all { child -> child.layoutId in layoutId }) { errorMessage }
        }

        layout(0, 0) {}
    }
}
