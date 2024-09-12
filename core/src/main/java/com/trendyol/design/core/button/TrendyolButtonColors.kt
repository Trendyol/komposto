package com.trendyol.design.core.button

import androidx.compose.material.ButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color

public interface TrendyolButtonColors : ButtonColors {
    @Composable
    public fun borderColor(enabled: Boolean): State<Color?>
}

internal class TrendyolDefaultButtonColors(
    private val backgroundColor: Color,
    private val contentColor: Color,
    private val borderColor: Color?,
    private val disabledBackgroundColor: Color,
    private val disabledContentColor: Color,
    private val disabledBorderColor: Color?,
) : TrendyolButtonColors {

    @Composable
    override fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) backgroundColor else disabledBackgroundColor)
    }

    @Composable
    override fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) contentColor else disabledContentColor)
    }

    @Composable
    override fun borderColor(enabled: Boolean): State<Color?> {
        return rememberUpdatedState(if (enabled) borderColor else disabledBorderColor)
    }
}
