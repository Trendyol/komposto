package com.trendyol.design.core.dialog

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.previewtheme.PreviewTheme
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

@Composable
fun StatusDialog(
    type: StatusDialogType,
    modifier: Modifier = Modifier,
    title: String? = null,
    message: String? = null,
    primaryButton: (@Composable DialogButtons.() -> Unit)? = null,
    secondaryButton: (@Composable DialogButtons.() -> Unit)? = null,
    displayCloseButton: Boolean,
    onCloseClicked: (() -> Unit)? = null,
    onDismissRequest: () -> Unit,
) {
    GenericDialog(
        modifier = modifier,
        icon = { Icon(imageVector = type.iconVector, size = TrendyolIconSize.XXXLarge) },
        title = {
            title?.let {
                Text(
                    text = title,
                    style = type.textStyle
                )
            }
        },
        message = {
            message?.let {
                Text(
                    text = message,
                    style = TrendyolDesign.typography.subtitleColorOnSurfaceVariant3
                )
            }
        },
        primaryButton = primaryButton,
        secondaryButton = secondaryButton,
        displayCloseButton = displayCloseButton,
        onCloseClicked = { onCloseClicked?.invoke() },
        onDismissRequest = onDismissRequest
    )
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolStatusDialogSuccess() {
    PreviewTheme {
        StatusDialog(
            type = TrendyolStatusDialogType.Success,
            title = "Success Message Title",
            message = "Message Detail",
            displayCloseButton = true,
            onDismissRequest = {}
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolStatusDialogSuccessWithButtons() {
    PreviewTheme {
        StatusDialog(
            type = TrendyolStatusDialogType.Success,
            title = "Success Message Title",
            message = "Message Detail",
            primaryButton = { DialogButtons.Primary(text = "Button", modifier = Modifier.fillMaxWidth()) {}},
            secondaryButton = { DialogButtons.Secondary(text = "Button", modifier = Modifier.fillMaxWidth()) {}},
            displayCloseButton = true,
            onDismissRequest = {}
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolStatusDialogSuccessWithoutClose() {
    PreviewTheme {
        StatusDialog(
            type = TrendyolStatusDialogType.Success,
            title = "Success Message Title",
            message = "Message Detail",
            displayCloseButton = false,
            onDismissRequest = {}
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolStatusDialogSuccessWithoutTitle() {
    PreviewTheme {
        StatusDialog(
            type = TrendyolStatusDialogType.Success,
            message = "Message Detail",
            displayCloseButton = false,
            onDismissRequest = {}
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolStatusDialogSuccessWithoutMessage() {
    PreviewTheme {
        StatusDialog(
            type = TrendyolStatusDialogType.Success,
            title = "Success Message Title",
            displayCloseButton = false,
            onDismissRequest = {}
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolStatusDialogError() {
    PreviewTheme {
        StatusDialog(
            type = TrendyolStatusDialogType.Error,
            title = "Error Message Title",
            message = "Message Detail",
            displayCloseButton = true,
            onDismissRequest = {}
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolStatusDialogErrorWithoutClose() {
    PreviewTheme {
        StatusDialog(
            type = TrendyolStatusDialogType.Error,
            title = "Error Message Title",
            message = "Message Detail",
            displayCloseButton = false,
            onDismissRequest = {}
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolStatusDialogErrorWithoutTitle() {
    PreviewTheme {
        StatusDialog(
            type = TrendyolStatusDialogType.Error,
            message = "Message Detail",
            displayCloseButton = false,
            onDismissRequest = {}
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolStatusDialogErrorWithoutMessage() {
    PreviewTheme {
        StatusDialog(
            type = TrendyolStatusDialogType.Error,
            title = "Error Message Title",
            displayCloseButton = false,
            onDismissRequest = {}
        )
    }
}