@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.ui.component.dialog

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.dialog.DialogButtons
import com.trendyol.design.core.dialog.KPAlertDialogContent
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.KPDesign

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
            color = KPDesign.colors.colorOnPrimary,
            contentColor = KPDesign.colors.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            KPAlertDialogContent(
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
            color = KPDesign.colors.colorOnPrimary,
            contentColor = KPDesign.colors.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            KPAlertDialogContent(
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
            color = KPDesign.colors.colorOnPrimary,
            contentColor = KPDesign.colors.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            KPAlertDialogContent(
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
