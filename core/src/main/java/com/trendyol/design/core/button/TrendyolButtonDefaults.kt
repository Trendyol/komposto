package com.trendyol.design.core.button

import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ButtonElevation
import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

public object TrendyolButtonDefaults {

    @Composable
    public fun elevation(
        defaultElevation: Dp = 0.dp,
        pressedElevation: Dp = 0.dp,
        disabledElevation: Dp = 0.dp,
        hoveredElevation: Dp = 4.dp,
        focusedElevation: Dp = 4.dp,
    ): ButtonElevation {
        return ButtonDefaults.elevation(
            defaultElevation = defaultElevation,
            pressedElevation = pressedElevation,
            disabledElevation = disabledElevation,
            hoveredElevation = hoveredElevation,
            focusedElevation = focusedElevation,
        )
    }

    @Composable
    public fun buttonColors(
        backgroundColor: Color = MaterialTheme.colors.primary,
        contentColor: Color = contentColorFor(backgroundColor),
        borderColor: Color? = null,
        disabledBackgroundColor: Color = MaterialTheme.colors.onSurface.copy(alpha = 0.12f)
            .compositeOver(MaterialTheme.colors.surface),
        disabledContentColor: Color = MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.disabled),
        disabledBorderColor: Color? = null,
    ): TrendyolButtonColors = TrendyolDefaultButtonColors(
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        borderColor = borderColor,
        disabledBackgroundColor = disabledBackgroundColor,
        disabledContentColor = disabledContentColor,
        disabledBorderColor = disabledBorderColor,
    )
}
