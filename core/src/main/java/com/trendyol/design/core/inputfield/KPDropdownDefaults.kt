package com.trendyol.design.core.inputfield

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember

internal object KPDropdownDefaults {

    @Composable
    internal fun interactionSource(onClick: () -> Unit): MutableInteractionSource {
        return remember { MutableInteractionSource() }.also { interactionSource ->
            LaunchedEffect(interactionSource) {
                interactionSource.interactions.collect {
                    when (it) {
                        is PressInteraction.Release,
                        is PressInteraction.Cancel -> onClick.invoke()
                    }
                }
            }
        }
    }
}
