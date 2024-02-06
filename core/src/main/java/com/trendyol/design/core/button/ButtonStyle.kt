package com.trendyol.design.core.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

interface ButtonStyle {

    @get:Composable
    val buttonColors: TrendyolButtonColors

    @Composable
    fun getBorder(
        width: Dp = 1.dp,
        enabled: Boolean,
    ): BorderStroke? {
        return buttonColors.borderColor(enabled = enabled).value?.let { borderColor ->
            BorderStroke(width = width, color = borderColor)
        }
    }

    companion object {

        val Default: ButtonStyle = TrendyolButtonStyle.Primary
    }
}
