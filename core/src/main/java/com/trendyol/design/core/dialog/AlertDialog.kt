package com.trendyol.design.core.dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.trendyol.design.core.dialog.DialogButtons.takeOrNull
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.KPText
import com.trendyol.design.core.text.Text
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign

/**
 * Displays an [KPAlertDialog] with customizable options for title, message, and buttons.
 *
 * This composable function allows you to create an alert dialog with a title, a message,
 * and optional buttons. You can specify a negative button, a positive button, and a neutral button,
 * each of which can be customized with composable content.
 *
 * @param modifier Modifier to be applied to the AlertDialog container.
 * @param title The title text to be displayed at the top of the dialog. Defaults to an empty string.
 * @param message The main content message to be displayed in the dialog. This parameter is required.
 * @param dialogProperties Configuration options for the dialog's behavior.
 * @param negativeButton Composable function for the negative button. If null, no negative button is shown.
 * @param positiveButton Composable function for the positive button. If null, no positive button is shown.
 * @param neutralButton Composable function for the neutral button. If null, no neutral button is shown.
 * @param onDismissRequest A lambda function that is called when the dialog is requested to be dismissed.
 */
@Composable
public fun KPAlertDialog(
    message: String,
    modifier: Modifier = Modifier,
    title: String = "",
    dialogProperties: DialogProperties = DialogProperties(),
    negativeButton: (@Composable DialogButtons.() -> Unit)? = null,
    positiveButton: (@Composable DialogButtons.() -> Unit)? = null,
    neutralButton: (@Composable DialogButtons.() -> Unit)? = null,
    onDismissRequest: () -> Unit,
) {
    Dialog(onDismissRequest = onDismissRequest, properties = dialogProperties) {
        KPAlertDialogContent(
            message = message,
            modifier = modifier,
            title = title,
            negativeButton = negativeButton,
            positiveButton = positiveButton,
            neutralButton = neutralButton
        )
    }
}

/**
 * Displays an [AlertDialog] with customizable options for title, message, and buttons.
 *
 * This composable function allows you to create an alert dialog with a title, a message,
 * and optional buttons. You can specify a negative button, a positive button, and a neutral button,
 * each of which can be customized with composable content.
 *
 * @param modifier Modifier to be applied to the AlertDialog container.
 * @param title The title text to be displayed at the top of the dialog. Defaults to an empty string.
 * @param message The main content message to be displayed in the dialog. This parameter is required.
 * @param dialogProperties Configuration options for the dialog's behavior.
 * @param negativeButton Composable function for the negative button. If null, no negative button is shown.
 * @param positiveButton Composable function for the positive button. If null, no positive button is shown.
 * @param neutralButton Composable function for the neutral button. If null, no neutral button is shown.
 * @param onDismissRequest A lambda function that is called when the dialog is requested to be dismissed.
 */
@Composable
@Deprecated(
    message = "Use KPAlertDialog instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun AlertDialog(
    message: String,
    modifier: Modifier = Modifier,
    title: String = "",
    dialogProperties: DialogProperties = DialogProperties(),
    negativeButton: (@Composable DialogButtons.() -> Unit)? = null,
    positiveButton: (@Composable DialogButtons.() -> Unit)? = null,
    neutralButton: (@Composable DialogButtons.() -> Unit)? = null,
    onDismissRequest: () -> Unit,
) {
    Dialog(onDismissRequest = onDismissRequest, properties = dialogProperties) {
        AlertDialogContent(
            message = message,
            modifier = modifier,
            title = title,
            negativeButton = negativeButton,
            positiveButton = positiveButton,
            neutralButton = neutralButton
        )
    }
}

@Composable
public fun KPAlertDialogContent(
    message: String,
    modifier: Modifier = Modifier,
    title: String = "",
    negativeButton: (@Composable DialogButtons.() -> Unit)? = null,
    positiveButton: (@Composable DialogButtons.() -> Unit)? = null,
    neutralButton: (@Composable DialogButtons.() -> Unit)? = null,
) {
    Surface(color = KPDesign.colors.colorSurface, shape = RoundedCornerShape(8.dp)) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 20.dp)
        ) {
            if (title.isNotEmpty()) {
                KPText(title, style = KPDesign.typography.titleMediumColorOnSurfaceVariant3)
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(12.dp)
                )
            }
            KPText(
                text = message,
                style = KPDesign.typography.subtitleColorOnSurfaceVariant2
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(16.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                neutralButton?.let {
                    it.takeOrNull()?.invoke()
                    Spacer(modifier = Modifier.weight(1f))
                }
                negativeButton?.let {
                    it.takeOrNull()?.invoke()
                    Spacer(modifier = Modifier.width(16.dp))
                }
                positiveButton.takeOrNull()?.invoke()
            }
        }
    }
}

@Composable
@Deprecated(
    message = "Use KPAlertDialogContent instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun AlertDialogContent(
    message: String,
    modifier: Modifier = Modifier,
    title: String = "",
    negativeButton: (@Composable DialogButtons.() -> Unit)? = null,
    positiveButton: (@Composable DialogButtons.() -> Unit)? = null,
    neutralButton: (@Composable DialogButtons.() -> Unit)? = null,
) {
    Surface(color = TrendyolDesign.colors.colorSurface, shape = RoundedCornerShape(8.dp)) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 20.dp)
        ) {
            if (title.isNotEmpty()) {
                Text(title, style = TrendyolDesign.typography.titleMediumColorOnSurfaceVariant3)
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(12.dp)
                )
            }
            Text(
                text = message,
                style = TrendyolDesign.typography.subtitleColorOnSurfaceVariant2
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(16.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                neutralButton?.let {
                    it.takeOrNull()?.invoke()
                    Spacer(modifier = Modifier.weight(1f))
                }
                negativeButton?.let {
                    it.takeOrNull()?.invoke()
                    Spacer(modifier = Modifier.width(16.dp))
                }
                positiveButton.takeOrNull()?.invoke()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolAlertDialogFull() {
    PreviewTheme {
        KPAlertDialog(
            title = "Uyarı",
            message = "Aynı anda iki kupon kullanamazsınız.",
            negativeButton = { DialogButtons.Text(text = "Vazgeç", onClick = {}) },
            positiveButton = { DialogButtons.Text(text = "Devam Et", onClick = {}) },
            neutralButton = { DialogButtons.Text(text = "Neutral", onClick = {}) },
            onDismissRequest = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolAlertDialogWithoutNeutral() {
    PreviewTheme {
        KPAlertDialog(
            title = "Uyarı",
            message = "Aynı anda iki kupon kullanamazsınız.",
            negativeButton = { DialogButtons.Text(text = "Vazgeç", onClick = {}) },
            positiveButton = { DialogButtons.Text(text = "Devam Et", onClick = {}) },
            onDismissRequest = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolAlertDialogFullWithoutPositive() {
    PreviewTheme {
        KPAlertDialog(
            title = "Uyarı",
            message = "Aynı anda iki kupon kullanamazsınız.",
            negativeButton = { DialogButtons.Text(text = "Vazgeç", onClick = {}) },
            onDismissRequest = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolAlertDialogNoTitle() {
    PreviewTheme {
        KPAlertDialog(
            message = "Aynı anda iki kupon kullanamazsınız.",
            negativeButton = { DialogButtons.Text(text = "Vazgeç", onClick = {}) },
            positiveButton = { DialogButtons.Text(text = "Devam Et", onClick = {}) },
            onDismissRequest = {}
        )
    }
}
