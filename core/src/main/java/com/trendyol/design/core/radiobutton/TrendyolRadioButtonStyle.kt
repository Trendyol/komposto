package com.trendyol.design.core.radiobutton

import androidx.compose.runtime.Composable

sealed interface TrendyolRadioButtonStyle {

    data class Text(override val text: String) : RadioButtonStyle.Text
    data class Content(override val content: @Composable () -> Unit) : RadioButtonStyle.Content
}
