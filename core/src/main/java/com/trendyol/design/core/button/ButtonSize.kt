package com.trendyol.design.core.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

interface ButtonSize {

    val contentPadding: PaddingValues

    @get:Composable
    val font: TextStyle

    val minHeight: Dp
        @Composable
        get() = (
            font.fontSize.value +
                contentPadding.calculateTopPadding().value +
                contentPadding.calculateBottomPadding().value
            ).dp

    companion object {

        val Default: ButtonSize = TrendyolButtonSize.Medium
    }
}
