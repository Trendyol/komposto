package com.trendyol.design.core.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable

@Immutable
public sealed interface CheckboxContainerType {

    public data object None : CheckboxContainerType

    /**
     * The text label for checkbox.
     */
    public data class Text(
        val text: String
    ) : CheckboxContainerType

    /**
     * The custom Composable content to be displayed within the checkbox.
     */
    public data class Content(
        val content: @Composable () -> Unit
    ) : CheckboxContainerType
}
