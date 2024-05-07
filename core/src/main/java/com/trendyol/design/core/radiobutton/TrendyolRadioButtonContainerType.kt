package com.trendyol.design.core.radiobutton

import androidx.compose.runtime.Composable

/**
 * Defining different types of RadioButton containers specific to the [com.trendyol.theme.TrendyolDesign] theme.
 *
 * This interface provides sealed classes representing different container types for [TrendyolRadioButton] components
 * with customization options tailored to the Trendyol design guidelines.
 */
sealed interface TrendyolRadioButtonContainerType {

    data object None : RadioButtonContainerType.None
    data class Text(override val text: String) : RadioButtonContainerType.Text
    data class Content(override val content: @Composable () -> Unit) : RadioButtonContainerType.Content
}
