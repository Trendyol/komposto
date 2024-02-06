package com.trendyol.design.core.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonElevation
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import com.trendyol.design.core.text.TrendyolTextDefaults

@Composable
fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: ButtonStyle = LocalButtonStyle.current,
    size: ButtonSize = LocalButtonSize.current,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    elevation: ButtonElevation? = TrendyolButtonDefaults.elevation(),
    shape: Shape = MaterialTheme.shapes.small,
    border: BorderStroke? = style.getBorder(enabled = enabled),
    colors: ButtonColors = style.buttonColors,
    contentPadding: PaddingValues = size.contentPadding,
    content: @Composable RowScope.() -> Unit,
) {
    // TODO Can we define a composition local for button border enabled like we did for textStyle's color at below
    androidx.compose.material.Button(
        onClick = onClick,
        modifier = modifier.defaultMinSize(minHeight = size.minHeight),
        enabled = enabled,
        interactionSource = interactionSource,
        elevation = elevation,
        shape = shape,
        border = border,
        colors = colors,
        contentPadding = contentPadding,
    ) {
        ProvideTextStyle(
            value = TextStyle.Default.copy(
                fontFamily = size.font.fontFamily,
                fontSize = size.font.fontSize,
                color = style.buttonColors.contentColor(enabled = enabled).value,
                letterSpacing = TrendyolTextDefaults.letterSpacing,
                platformStyle = TrendyolTextDefaults.platformStyle,
            )
        ) {
            content()
        }
    }
}

val LocalButtonStyle = compositionLocalOf { ButtonStyle.Default }
val LocalButtonSize = compositionLocalOf { ButtonSize.Default }
