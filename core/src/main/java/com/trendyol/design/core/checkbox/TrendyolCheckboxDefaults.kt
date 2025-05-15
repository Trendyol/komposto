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
import androidx.compose.ui.state.ToggleableState
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign

public object KPCheckboxDefaults {

    @Composable
    public fun colors(
        checkedColor: Color = KPDesign.colors.colorPrimary,
        uncheckedColor: Color = KPDesign.colors.colorOnSurfaceVariant1,
        checkmarkColor: Color = KPDesign.colors.colorSurface,
        disabledCheckmarkColor: Color = KPDesign.colors.colorSurface,
        disabledColor: Color = KPDesign.colors.colorBorder,
        checkBoxColor: Color = KPDesign.colors.colorPrimary,
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
                uncheckedBoxColor = checkedColor.copy(alpha = 0f),
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

@Deprecated(
    message = "Use KPCheckboxDefaults instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPCheckboxDefaults",
    ),
    level = DeprecationLevel.WARNING
)
public object TrendyolCheckboxDefaults {

    @Composable
    public fun colors(
        checkedColor: Color = TrendyolDesign.colors.colorPrimary,
        uncheckedColor: Color = TrendyolDesign.colors.colorOnSurfaceVariant1,

        checkmarkColor: Color = TrendyolDesign.colors.colorSurface,
        disabledCheckmarkColor: Color = TrendyolDesign.colors.colorSurface,

        disabledColor: Color = TrendyolDesign.colors.colorBorder,
        checkBoxColor: Color = TrendyolDesign.colors.colorPrimary,
        disabledBoxColor: Color = TrendyolDesign.colors.colorOnSurfaceVariant1,

        disabledUnselectedBorderColor: Color = TrendyolDesign.colors.colorBorder,
        disabledIndeterminateColor: Color = checkedColor.copy(alpha = ContentAlpha.disabled)
    ): TrendyolCheckboxColors {
        return remember(
            checkedColor,
            uncheckedColor,
            checkmarkColor,
            disabledCheckmarkColor,
            disabledColor,
            checkBoxColor,
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
                uncheckedBoxColor = checkedColor.copy(alpha = 0f),
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
) : TrendyolCheckboxColors, KPCheckboxColors {
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
