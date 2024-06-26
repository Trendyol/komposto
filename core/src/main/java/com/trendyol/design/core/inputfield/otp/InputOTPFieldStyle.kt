package com.trendyol.design.core.inputfield.otp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color

@Immutable
interface InputOTPFieldStyle {

    @Composable
    @ReadOnlyComposable
    fun getBorderColor(enabled: Boolean, isFocused: Boolean, isError: Boolean): State<Color>

    @Composable
    @ReadOnlyComposable
    fun getTextColor(enabled: Boolean): State<Color>

    @Composable
    @ReadOnlyComposable
    fun getBackgroundColor(enabled: Boolean, isError: Boolean): State<Color>

    @Composable
    @ReadOnlyComposable
    fun getTabIndicatorColor(enabled: Boolean, isFocused: Boolean, isError: Boolean): State<Color>
}