package com.trendyol.design.core.radiobutton

import androidx.compose.runtime.Composable

sealed interface TrendyolRadioButtonContainerType {

    data object None : RadioButtonContainerType.None
    data class Text(override val text: String) : RadioButtonContainerType.Text
    data class Content(override val content: @Composable () -> Unit) : RadioButtonContainerType.Content
}
