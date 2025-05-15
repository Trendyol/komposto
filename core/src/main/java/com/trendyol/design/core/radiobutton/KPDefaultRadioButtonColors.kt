package com.trendyol.design.core.radiobutton

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.material.RadioButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color

/**
 * Default implementation of RadioButtonColors tailored for [com.trendyol.theme.KPDesign] theme.
 *
 * This class provides colors for [KPRadioButton] components based on their state and the Trendyol design guidelines.
 *
 * @property selectedColor Color when the RadioButton is selected.
 * @property unselectedColor Color when the RadioButton is not selected.
 * @property disabledSelectedColor Color when the RadioButton is disabled and selected.
 * @property disabledUnselectedColor Color when the RadioButton is disabled and not selected.
 */
internal class KPDefaultRadioButtonColors(
    private val selectedColor: Color,
    private val unselectedColor: Color,
    private val disabledSelectedColor: Color,
    private val disabledUnselectedColor: Color,
) : RadioButtonColors {

    /**
     * Calculates the color of the RadioButton based on its state.
     *
     * @param enabled Indicates if the RadioButton is enabled or disabled.
     * @param selected Indicates if the RadioButton is selected or not.
     * @return A State<Color> object representing the color of the RadioButton.
     */
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
