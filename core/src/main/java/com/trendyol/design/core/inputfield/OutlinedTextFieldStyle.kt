package com.trendyol.design.core.inputfield

import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable

interface OutlinedTextFieldStyle {

    val shouldShowLabel: Boolean

    @get:Composable
    val outlinedTextFieldColors: TextFieldColors
}
