package com.trendyol.design.core.radiobutton

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.material.RadioButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color

internal class TrendyolDefaultRadioButtonColors(
    private val selectedColor: Color,
    private val unselectedColor: Color,
    private val disabledSelectedColor: Color,
    private val disabledUnselectedColor: Color,
) : RadioButtonColors {

    @Composable
    override fun radioColor(enabled: Boolean, selected: Boolean): State<Color> {
        val target = when {
            enabled.not() && selected.not() -> disabledUnselectedColor
            enabled.not() && selected -> disabledSelectedColor
            enabled && selected.not() -> unselectedColor
            else -> selectedColor
        }

        return if (enabled) {
            animateColorAsState(target, tween(durationMillis = RADIO_ANIMATION_DURATION))
        } else {
            rememberUpdatedState(target)
        }
    }
}

internal const val RADIO_ANIMATION_DURATION = 100
