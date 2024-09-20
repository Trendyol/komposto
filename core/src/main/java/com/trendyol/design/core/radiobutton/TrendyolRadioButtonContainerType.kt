package com.trendyol.design.core.radiobutton

import androidx.compose.runtime.Composable

/**
 * Defining different types of RadioButton containers specific to the [com.trendyol.theme.TrendyolDesign] theme.
 *
 * This interface provides sealed classes representing different container types for [TrendyolRadioButton] components
 * with customization options tailored to the Trendyol design guidelines.
 */
public sealed interface TrendyolRadioButtonContainerType {

    public data object None : RadioButtonContainerType.None
    public data class Text(override val text: String) : RadioButtonContainerType.Text
    public data class Content(override val content: @Composable () -> Unit) : RadioButtonContainerType.Content
}
