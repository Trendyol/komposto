package com.trendyol.design.core.dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.trendyol.design.core.dialog.DialogButtons.takeOrNull
import com.trendyol.design.core.previewtheme.PreviewTheme
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

@Composable
fun AlertDialog(
    modifier: Modifier = Modifier,
    title: String? = null,
    message: String,
    dialogProperties: DialogProperties = DialogProperties(),
    negativeButton: (@Composable DialogButtons.() -> Unit)? = null,
    positiveButton: (@Composable DialogButtons.() -> Unit)? = null,
    neutralButton: (@Composable DialogButtons.() -> Unit)? = null,
    onDismissRequest: () -> Unit,
) {
    Dialog(onDismissRequest = onDismissRequest, properties = dialogProperties) {
        Surface(color = TrendyolDesign.colors.colorSurface) {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 20.dp)
            ) {
                title?.let {
                    Text(title, style = TrendyolDesign.typography.titleBoldColorOnSurfaceVariant1)
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(12.dp)
                    )
                }
                Text(
                    text = message,
                    style = TrendyolDesign.typography.subtitleColorOnSurfaceVariant1.copy(
                        lineHeight = (16.41).sp
                    )
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
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolAlertDialogFull() {
    PreviewTheme {
        AlertDialog(
            title = "Uyarı",
            message = "Aynı anda iki kupon kullanamazsınız. Devam ederseniz sadece son seçtiğiniz kupon uygulanacaktır.",
            negativeButton = { DialogButtons.Text(text = "Vazgeç", onClick = {}) },
            positiveButton = { DialogButtons.Text(text = "Devam Et", onClick = {}) },
            neutralButton = { DialogButtons.Text(text = "Neutral", onClick = {}) },
            onDismissRequest = {}
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolAlertDialogWithoutNeutral() {
    PreviewTheme {
        AlertDialog(
            title = "Uyarı",
            message = "Aynı anda iki kupon kullanamazsınız. Devam ederseniz sadece son seçtiğiniz kupon uygulanacaktır.",
            negativeButton = { DialogButtons.Text(text = "Vazgeç", onClick = {}) },
            positiveButton = { DialogButtons.Text(text = "Devam Et", onClick = {}) },
            onDismissRequest = {}
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolAlertDialogFullWithoutPositive() {
    PreviewTheme {
        AlertDialog(
            title = "Uyarı",
            message = "Aynı anda iki kupon kullanamazsınız. Devam ederseniz sadece son seçtiğiniz kupon uygulanacaktır.",
            negativeButton = { DialogButtons.Text(text = "Vazgeç", onClick = {}) },
            onDismissRequest = {}
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrendyolAlertDialogNoTitle() {
    PreviewTheme {
        AlertDialog(
            message = "Aynı anda iki kupon kullanamazsınız. Devam ederseniz sadece son seçtiğiniz kupon uygulanacaktır.",
            negativeButton = { DialogButtons.Text(text = "Vazgeç", onClick = {}) },
            positiveButton = { DialogButtons.Text(text = "Devam Et", onClick = {}) },
            onDismissRequest = {}
        )
    }
}