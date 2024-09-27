package com.trendyol.design.ui.component.dialog

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.dialog.AlertDialogContent
import com.trendyol.design.core.dialog.DialogButtons
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolColor
import com.trendyol.design.ui.theme.TrendyolTheme

@Composable
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.DIALOG,
    name = Component.ALERT_DIALOG,
    styleName = "Single Button",
)
internal fun AlertDialog_Single_Button() {
    TrendyolTheme {
        Surface(
            color = TrendyolColor.themeColor.colorOnPrimary,
            contentColor = TrendyolColor.themeColor.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            AlertDialogContent(
                message = "Description",
                title = "Title",
                negativeButton = {
                    DialogButtons.Text(text = "Button", onClick = { })
                }
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.DIALOG,
    name = Component.ALERT_DIALOG,
    styleName = "Two Button",
)
internal fun AlertDialog_Two_Button() {
    TrendyolTheme {
        Surface(
            color = TrendyolColor.themeColor.colorOnPrimary,
            contentColor = TrendyolColor.themeColor.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            AlertDialogContent(
                message = "Description",
                title = "Title",
                negativeButton = {
                    DialogButtons.Text(text = "Button", onClick = { })
                },
                positiveButton = {
                    DialogButtons.Text(text = "Button", onClick = { })
                }
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.DIALOG,
    name = Component.ALERT_DIALOG,
    styleName = "Three Button",
)
internal fun AlertDialog_Three_Button() {
    TrendyolTheme {
        Surface(
            color = TrendyolColor.themeColor.colorOnPrimary,
            contentColor = TrendyolColor.themeColor.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            AlertDialogContent(
                message = "Description",
                title = "Title",
                negativeButton = {
                    DialogButtons.Text(text = "Button", onClick = { })
                },
                positiveButton = {
                    DialogButtons.Text(text = "Button", onClick = { })
                },
                neutralButton = {
                    DialogButtons.Text(text = "Button", onClick = { })
                },
            )
        }
    }
}
