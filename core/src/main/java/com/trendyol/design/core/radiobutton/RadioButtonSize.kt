package com.trendyol.design.core.radiobutton

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp

interface RadioButtonSize {

    val rippleRadius: Dp
    val buttonSize: Dp
    val dotSize: Dp

    @get:Composable
    val textSize: TextStyle

    val radius: Dp
        get() = buttonSize / 2
}
