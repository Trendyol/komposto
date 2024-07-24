package com.trendyol.design.core.dialog

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.outline.Cancel
import com.trendyol.design.core.dialog.DialogButtons.takeOrNull
import com.trendyol.theme.TrendyolDesign

@Composable
fun GenericDialog(
    modifier: Modifier = Modifier,
    dialogProperties: DialogProperties = DialogProperties(),
    displayCloseButton: Boolean,
    icon: @Composable (() -> Unit)? = null,
    title: @Composable (() -> Unit)? = null,
    message: @Composable (() -> Unit)? = null,
    primaryButton: (@Composable DialogButtons.() -> Unit)? = null,
    secondaryButton: (@Composable DialogButtons.() -> Unit)? = null,
    onCloseClicked: () -> Unit,
    onDismissRequest: () -> Unit,
) {
    Dialog(onDismissRequest = onDismissRequest, properties = dialogProperties) {
        Card(
            modifier = modifier,
            backgroundColor = TrendyolDesign.colors.colorOnPrimary,
            shape = RoundedCornerShape(8.dp)
        ) {
            Box {
                if (displayCloseButton) {
                    Icon(modifier = Modifier
                        .padding(top = 16.dp, end = 20.dp)
                        .align(Alignment.TopEnd)
                        .clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() }
                        ) { onCloseClicked() },
                        imageVector = Icons.Outline.Cancel,
                        size = TrendyolIconSize.XSmall
                    )

                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, top = 16.dp, end = 20.dp, bottom = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if (icon != null) {
                        icon()
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                    if (title != null) {
                        title()
                        Spacer(modifier = Modifier.height(12.dp))
                    }
                    message?.invoke()
                    if (primaryButton != null) {
                        Spacer(modifier = Modifier.height(16.dp))
                        primaryButton.takeOrNull()?.invoke()
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                    if (secondaryButton != null) {
                        secondaryButton.takeOrNull()?.invoke()
                    }
                }
            }
        }
    }
}