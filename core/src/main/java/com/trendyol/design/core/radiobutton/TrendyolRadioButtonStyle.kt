package com.trendyol.design.core.radiobutton

import androidx.compose.runtime.Composable

sealed interface TrendyolRadioButtonStyle {

    data object Default : RadioButtonStyle
    data class WithText(override val text: String) : RadioButtonStyle.Text
    data class WithContent(override val content: @Composable () -> Unit) : RadioButtonStyle.Content
}
