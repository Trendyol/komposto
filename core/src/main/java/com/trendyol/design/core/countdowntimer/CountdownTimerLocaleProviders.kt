package com.trendyol.design.core.countdowntimer

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import java.util.Locale

public val LocalCountdownTimerLocale: ProvidableCompositionLocal<Locale> = staticCompositionLocalOf {
    error("CompositionLocal LocalCountdownTimerLocale not present")
}