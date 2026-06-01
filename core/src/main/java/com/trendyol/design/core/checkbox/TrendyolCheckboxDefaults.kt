package com.trendyol.design.core.checkbox

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.material.ContentAlpha
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.state.ToggleableState
import com.trendyol.theme.KPDesign

public object KPCheckboxDefaults {

    @Composable
    public fun primaryColors(
        uncheckedBoxColor: Color = Color.Unspecified,
    ): KPCheckboxColors {
        val checkedColor = KPDesign.colors.colorPrimary
        return colors(
            checkedColor = checkedColor,
            uncheckedColor = KPDesign.colors.colorOnSurfaceVariant1,
            checkmarkColor = KPDesign.colors.colorSurface,
            disabledCheckmarkColor = KPDesign.colors.colorSurface,
            disabledColor = KPDesign.colors.colorOnSurfaceVariant1,
            checkBoxColor = KPDesign.colors.colorPrimary,
            uncheckedBoxColor = uncheckedBoxColor.takeOrElse { checkedColor.copy(alpha = 0f) },
            disabledBoxColor = KPDesign.colors.colorOnSurfaceVariant1,
            disabledIndeterminateColor = KPDesign.colors.colorPrimary.copy(
                alpha = ContentAlpha.disabled
            ),
        )
    }

    @Composable
    public fun secondaryColors(): KPCheckboxColors {
        val checkedColor = KPDesign.colors.colorPrimary
        return colors(
            checkedColor = checkedColor,
            uncheckedColor = KPDesign.colors.colorBorder,
            checkmarkColor = KPDesign.colors.colorPrimary,
            disabledCheckmarkColor = KPDesign.colors.colorOnSurfaceVariant1,
            disabledColor = KPDesign.colors.colorOnSurfaceVariant1,
            checkBoxColor = KPDesign.colors.colorSurface,
            uncheckedBoxColor = checkedColor.copy(alpha = 0f),
            disabledBoxColor = KPDesign.colors.colorSurface,
            disabledIndeterminateColor = KPDesign.colors.colorPrimary.copy(
                alpha = ContentAlpha.disabled
            ),
        )
    }

    @Composable
    public fun colors(
        checkedColor: Color = KPDesign.colors.colorPrimary,
        uncheckedColor: Color = KPDesign.colors.colorOnSurfaceVariant1,
        checkmarkColor: Color = KPDesign.colors.colorSurface,
        disabledCheckmarkColor: Color = KPDesign.colors.colorSurface,
        disabledColor: Color = KPDesign.colors.colorBorder,
        checkBoxColor: Color = KPDesign.colors.colorPrimary,
        uncheckedBoxColor: Color = checkedColor.copy(alpha = 0f),
        disabledBoxColor: Color = KPDesign.colors.colorOnSurfaceVariant1,
        disabledUnselectedBorderColor: Color = KPDesign.colors.colorBorder,
        disabledIndeterminateColor: Color = checkedColor.copy(alpha = ContentAlpha.disabled)
    ): KPCheckboxColors {
        return remember(
            checkedColor,
            uncheckedColor,
            checkmarkColor,
            disabledCheckmarkColor,
            disabledColor,
            checkBoxColor,
            uncheckedBoxColor,
            disabledBoxColor,
            disabledUnselectedBorderColor,
            disabledIndeterminateColor,
        ) {
            KPDefaultCheckboxColors(
                checkedBorderColor = checkedColor,
                checkedBoxColor = checkBoxColor,
                disabledCheckmarkColor = disabledCheckmarkColor,
                checkedCheckmarkColor = checkmarkColor,
                uncheckedCheckmarkColor = checkmarkColor.copy(alpha = 0f),
                uncheckedBoxColor = uncheckedBoxColor,
                disabledCheckedBoxColor = disabledBoxColor,
                disabledUncheckedBoxColor = disabledColor.copy(alpha = 0f),
                disabledIndeterminateBoxColor = disabledIndeterminateColor,
                uncheckedBorderColor = uncheckedColor,
                disabledBorderColor = disabledColor,
                disabledUnselectedBorderColor = disabledUnselectedBorderColor,
                disabledIndeterminateBorderColor = disabledIndeterminateColor,
            )
        }
    }
}

@Stable
private class KPDefaultCheckboxColors(
    private val checkedCheckmarkColor: Color,
    private val uncheckedCheckmarkColor: Color,
    private val disabledCheckmarkColor: Color,
    private val checkedBoxColor: Color,
    private val uncheckedBoxColor: Color,
    private val disabledCheckedBoxColor: Color,
    private val disabledUncheckedBoxColor: Color,
    private val disabledIndeterminateBoxColor: Color,
    private val checkedBorderColor: Color,
    private val uncheckedBorderColor: Color,
    private val disabledBorderColor: Color,
    private val disabledUnselectedBorderColor: Color,
    private val disabledIndeterminateBorderColor: Color
) : KPCheckboxColors {
    @Composable
    override fun checkmarkColor(enabled: Boolean, state: ToggleableState): State<Color> {
        val target = when {
            !enabled -> disabledCheckmarkColor
            state == ToggleableState.Off -> uncheckedCheckmarkColor
            else -> checkedCheckmarkColor
        }
        val duration = if (state == ToggleableState.Off) BOX_OUT_DURATION else BOX_IN_DURATION

        return animateColorAsState(
            targetValue = target,
            animationSpec = tween(durationMillis = duration),
            label = CHECKBOX_LABEL
        )
    }

    @Composable
    override fun boxColor(enabled: Boolean, state: ToggleableState): State<Color> {
        val target = if (enabled) {
            when (state) {
                ToggleableState.On, ToggleableState.Indeterminate -> checkedBoxColor
                ToggleableState.Off -> uncheckedBoxColor
            }
        } else {
            when (state) {
                ToggleableState.On -> disabledCheckedBoxColor
                ToggleableState.Indeterminate -> disabledIndeterminateBoxColor
                ToggleableState.Off -> disabledUncheckedBoxColor
            }
        }

        // If not enabled 'snap' to the disabled state, as there should be no animations between
        // enabled / disabled.
        return if (enabled) {
            val duration = if (state == ToggleableState.Off) BOX_OUT_DURATION else BOX_IN_DURATION
            animateColorAsState(
                targetValue = target,
                animationSpec = tween(durationMillis = duration),
                label = CHECKBOX_LABEL
            )
        } else {
            rememberUpdatedState(target)
        }
    }

    @Composable
    override fun borderColor(enabled: Boolean, state: ToggleableState): State<Color> {
        val target = if (enabled) {
            when (state) {
                ToggleableState.On, ToggleableState.Indeterminate -> checkedBorderColor
                ToggleableState.Off -> uncheckedBorderColor
            }
        } else {
            when (state) {
                ToggleableState.Indeterminate -> disabledIndeterminateBorderColor
                ToggleableState.On -> disabledBorderColor
                ToggleableState.Off -> disabledUnselectedBorderColor
            }
        }

        return if (enabled) {
            val duration = if (state == ToggleableState.Off) BOX_OUT_DURATION else BOX_IN_DURATION
            animateColorAsState(
                targetValue = target,
                animationSpec = tween(durationMillis = duration),
                label = CHECKBOX_LABEL
            )
        } else {
            rememberUpdatedState(target)
        }
    }
}

private const val BOX_IN_DURATION = 50
private const val BOX_OUT_DURATION = 100
