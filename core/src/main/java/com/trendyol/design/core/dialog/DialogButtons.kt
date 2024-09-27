package com.trendyol.design.core.dialog

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.trendyol.design.core.button.Button
import com.trendyol.design.core.button.TrendyolButtonSize
import com.trendyol.design.core.button.TrendyolButtonStyle
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

public object DialogButtons {

    @Composable
    public fun Text(text: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
        Text(
            modifier = modifier.clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
                onClick = onClick
            ),
            text = text,
            style = TrendyolDesign.typography.subtitleMediumColorPrimary,
        )
    }

    @Composable
    public fun Primary(text: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
        Button(
            modifier = modifier,
            onClick = onClick,
            style = TrendyolButtonStyle.Primary,
            size = TrendyolButtonSize.Large
        ) {
            Text(text = text)
        }
    }

    @Composable
    public fun Secondary(text: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
        Button(
            modifier = modifier,
            onClick = onClick,
            style = TrendyolButtonStyle.Secondary,
            size = TrendyolButtonSize.Large
        ) {
            Text(text = text)
        }
    }

    internal fun (@Composable DialogButtons.() -> Unit)?.takeOrNull(): (@Composable () -> Unit)? {
        if (this == null) return null

        return { DialogButtons.this() }
    }
}
