@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.core.dialog

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.outline.Cancel
import com.trendyol.design.core.dialog.DialogButtons.takeOrNull
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign

/**
 *
 * This composable function allows you to create a generic dialog with various configurable
 * options including the type of dialog, optional title, message, icon, and action buttons.
 * The dialog can be customized to display or hide a close button and will invoke the
 * provided callbacks when actions are performed.
 *
 * @param type Specifies the type of the dialog. Success, Error, Custom.
 * @param modifier Modifier to be applied to the dialog container.
 * @param dialogProperties Configuration options for the dialog's behavior.
 * @param displayCloseButton Boolean to indicate whether a close button should be displayed in the dialog.
 * @param title Optional title text to be displayed at the top of the dialog. Defaults to an empty string.
 * @param message Optional message content to be displayed in the dialog. Defaults to an empty string.
 * @param icon Optional composable function to display an icon within the dialog. If null, no icon is shown.
 * @param primaryButton Composable function for the primary action button. If null, no primary button is shown.
 * @param secondaryButton Composable function for the secondary action button. If null, no secondary button is shown.
 * @param onCloseClick Lambda function to be invoked when the close button is clicked. Defaults to an empty function.
 * @param onDismissRequest Lambda function to be called when the dialog is requested to be dismissed.
 */
@ExperimentalKompostoApi
@Composable
public fun KPGenericDialog(
    type: GenericDialogType,
    displayCloseButton: Boolean,
    modifier: Modifier = Modifier,
    dialogProperties: DialogProperties = DialogProperties(),
    title: String = "",
    message: String = "",
    icon: @Composable (() -> Unit)? = null,
    primaryButton: (@Composable DialogButtons.() -> Unit)? = null,
    secondaryButton: (@Composable DialogButtons.() -> Unit)? = null,
    onCloseClick: () -> Unit = {},
    onDismissRequest: () -> Unit,
) {
    Dialog(onDismissRequest = onDismissRequest, properties = dialogProperties) {
        KPGenericDialogContent(
            type = type,
            displayCloseButton = displayCloseButton,
            modifier = modifier,
            title = title,
            message = message,
            icon = icon,
            primaryButton = primaryButton,
            secondaryButton = secondaryButton,
            onCloseClick = onCloseClick
        )
    }
}

/**
 *
 * This composable function allows you to create a generic dialog with various configurable
 * options including the type of dialog, optional title, message, icon, and action buttons.
 * The dialog can be customized to display or hide a close button and will invoke the
 * provided callbacks when actions are performed.
 *
 * @param type Specifies the type of the dialog. Success, Error, Custom.
 * @param modifier Modifier to be applied to the dialog container.
 * @param dialogProperties Configuration options for the dialog's behavior.
 * @param displayCloseButton Boolean to indicate whether a close button should be displayed in the dialog.
 * @param title Optional title text to be displayed at the top of the dialog. Defaults to an empty string.
 * @param message Optional message content to be displayed in the dialog. Defaults to an empty string.
 * @param icon Optional composable function to display an icon within the dialog. If null, no icon is shown.
 * @param primaryButton Composable function for the primary action button. If null, no primary button is shown.
 * @param secondaryButton Composable function for the secondary action button. If null, no secondary button is shown.
 * @param onCloseClicked Lambda function to be invoked when the close button is clicked. Defaults to an empty function.
 * @param onDismissRequest Lambda function to be called when the dialog is requested to be dismissed.
 */
@Composable
@Deprecated(
    message = "Use KPGenericDialog instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun GenericDialog(
    type: GenericDialogType,
    displayCloseButton: Boolean,
    modifier: Modifier = Modifier,
    dialogProperties: DialogProperties = DialogProperties(),
    title: String = "",
    message: String = "",
    icon: @Composable (() -> Unit)? = null,
    primaryButton: (@Composable DialogButtons.() -> Unit)? = null,
    secondaryButton: (@Composable DialogButtons.() -> Unit)? = null,
    onCloseClicked: () -> Unit = {},
    onDismissRequest: () -> Unit,
) {
    Dialog(onDismissRequest = onDismissRequest, properties = dialogProperties) {
        GenericDialogContent(
            type = type,
            displayCloseButton = displayCloseButton,
            modifier = modifier,
            title = title,
            message = message,
            icon = icon,
            primaryButton = primaryButton,
            secondaryButton = secondaryButton,
            onCloseClicked = onCloseClicked
        )
    }
}

@ExperimentalKompostoApi
@Composable
public fun KPGenericDialogContent(
    type: GenericDialogType,
    displayCloseButton: Boolean,
    modifier: Modifier = Modifier,
    title: String = "",
    message: String = "",
    icon: @Composable (() -> Unit)? = null,
    primaryButton: (@Composable DialogButtons.() -> Unit)? = null,
    secondaryButton: (@Composable DialogButtons.() -> Unit)? = null,
    onCloseClick: () -> Unit = {},
) {
    Card(
        modifier = modifier,
        backgroundColor = KPDesign.colors.colorOnPrimary,
        shape = RoundedCornerShape(8.dp)
    ) {
        Box {
            if (displayCloseButton) {
                KPIcon(
                    modifier = Modifier
                        .padding(top = 16.dp, end = 20.dp)
                        .align(Alignment.TopEnd)
                        .clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() }
                        ) { onCloseClick() },
                    imageVector = KPIcons.Outline.Cancel,
                    size = KPIconSize.XSmall
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, top = 16.dp, end = 20.dp, bottom = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Content(
                    type = type,
                    title = title,
                    message = message,
                    icon = icon
                )

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

@Composable
@Deprecated(
    message = "Use KPGenericDialogContent instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun GenericDialogContent(
    type: GenericDialogType,
    displayCloseButton: Boolean,
    modifier: Modifier = Modifier,
    title: String = "",
    message: String = "",
    icon: @Composable (() -> Unit)? = null,
    primaryButton: (@Composable DialogButtons.() -> Unit)? = null,
    secondaryButton: (@Composable DialogButtons.() -> Unit)? = null,
    onCloseClicked: () -> Unit = {},
) {
    Card(
        modifier = modifier,
        backgroundColor = TrendyolDesign.colors.colorOnPrimary,
        shape = RoundedCornerShape(8.dp)
    ) {
        Box {
            if (displayCloseButton) {
                Icon(
                    modifier = Modifier
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
                Content(
                    type = type,
                    title = title,
                    message = message,
                    icon = icon
                )

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

@Composable
private fun ColumnScope.Content(
    type: GenericDialogType,
    title: String,
    message: String,
    icon: @Composable (() -> Unit)? = null,
) {
    // Ensuring the type is Success or Error.So that, we set predefined values
    if (type.iconVector != null && type.textStyle != null) {
        KPIcon(imageVector = type.iconVector!!, size = KPIconSize.XXXLarge)

        Spacer(modifier = Modifier.height(16.dp))

        if (title.isNotEmpty()) {
            KPText(
                text = title,
                style = type.textStyle!!
            )
            Spacer(modifier = Modifier.height(12.dp))
        }
    } else {
        if (icon != null) {
            icon()
            Spacer(modifier = Modifier.height(16.dp))
        }

        if (title.isNotEmpty()) {
            KPText(
                text = title,
                style = type.textStyle!!
            )
            Spacer(modifier = Modifier.height(12.dp))
        }
    }

    if (message.isNotEmpty()) {
        KPText(
            text = message,
            style = KPDesign.typography.subtitleColorOnSurfaceVariant3
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolStatusDialogSuccess() {
    PreviewTheme {
        KPGenericDialog(
            type = KPGenericDialogType.Success,
            title = "Success Message Title",
            message = "Message Detail",
            displayCloseButton = true,
            onDismissRequest = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolStatusDialogSuccessWithButtons() {
    PreviewTheme {
        KPGenericDialog(
            type = KPGenericDialogType.Success,
            title = "Success Message Title",
            message = "Message Detail",
            primaryButton = {
                DialogButtons.Primary(
                    text = "Button",
                    modifier = Modifier.fillMaxWidth()
                ) {}
            },
            secondaryButton = {
                DialogButtons.Secondary(
                    text = "Button",
                    modifier = Modifier.fillMaxWidth()
                ) {}
            },
            displayCloseButton = true,
            onDismissRequest = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolStatusDialogSuccessWithoutClose() {
    PreviewTheme {
        KPGenericDialog(
            type = KPGenericDialogType.Success,
            title = "Success Message Title",
            message = "Message Detail",
            displayCloseButton = false,
            onDismissRequest = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolStatusDialogSuccessWithoutTitle() {
    PreviewTheme {
        KPGenericDialog(
            type = KPGenericDialogType.Success,
            message = "Message Detail",
            displayCloseButton = false,
            onDismissRequest = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolStatusDialogSuccessWithoutMessage() {
    PreviewTheme {
        KPGenericDialog(
            type = KPGenericDialogType.Success,
            title = "Success Message Title",
            displayCloseButton = false,
            onDismissRequest = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolStatusDialogError() {
    PreviewTheme {
        KPGenericDialog(
            type = KPGenericDialogType.Error,
            title = "Error Message Title",
            message = "Message Detail",
            displayCloseButton = true,
            onDismissRequest = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolStatusDialogErrorWithoutClose() {
    PreviewTheme {
        KPGenericDialog(
            type = KPGenericDialogType.Error,
            title = "Error Message Title",
            message = "Message Detail",
            displayCloseButton = false,
            onDismissRequest = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolStatusDialogErrorWithoutTitle() {
    PreviewTheme {
        KPGenericDialog(
            type = KPGenericDialogType.Error,
            message = "Message Detail",
            displayCloseButton = false,
            onDismissRequest = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolStatusDialogErrorWithoutMessage() {
    PreviewTheme {
        KPGenericDialog(
            type = KPGenericDialogType.Error,
            title = "Error Message Title",
            displayCloseButton = false,
            onDismissRequest = {}
        )
    }
}
