package com.trendyol.design.core.dialog

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.trendyol.design.core.button.KPButton
import com.trendyol.design.core.button.KPButtonSize
import com.trendyol.design.core.button.KPButtonStyle
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign

public object DialogButtons {

    @Composable
    public fun Text(text: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
        KPText(
            modifier = modifier.clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
                onClick = onClick
            ),
            text = text,
            style = KPDesign.typography.subtitleMediumColorPrimary,
        )
    }

    @Composable
    public fun Primary(text: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
        KPButton(
            modifier = modifier,
            onClick = onClick,
            style = KPButtonStyle.Primary,
            size = KPButtonSize.Large
        ) {
            KPText(text = text)
        }
    }

    @Composable
    public fun Secondary(text: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
        KPButton(
            modifier = modifier,
            onClick = onClick,
            style = KPButtonStyle.Secondary,
            size = KPButtonSize.Large
        ) {
            KPText(text = text)
        }
    }

    internal fun (@Composable DialogButtons.() -> Unit)?.takeOrNull(): (@Composable () -> Unit)? {
        if (this == null) return null

        return { DialogButtons.this() }
    }
}
