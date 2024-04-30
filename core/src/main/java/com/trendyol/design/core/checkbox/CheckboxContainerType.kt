package com.trendyol.design.core.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable

@Immutable
sealed interface CheckboxContainerType {

    data object Default : CheckboxContainerType

    /**
     * The text label for checkbox.
     */
    data class Text(
        val text: String
    ) : CheckboxContainerType

    /**
     * The custom Composable content to be displayed within the checkbox.
     */
    data class Content(
        val content: @Composable () -> Unit
    ) : CheckboxContainerType
}
