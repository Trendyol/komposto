package com.trendyol.design.ui.component.dialog

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.dialog.DialogButtons
import com.trendyol.design.core.dialog.GenericDialogContent
import com.trendyol.design.core.dialog.TrendyolGenericDialogType
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolColor
import com.trendyol.design.ui.theme.TrendyolTheme

@Composable
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.DIALOG,
    name = Component.SUCCESS_DIALOG,
    styleName = "Single Button",
)
private fun Succes_Dialog_Single_Button() {
    TrendyolTheme {
        Surface(
            color = TrendyolColor.themeColor.colorOnPrimary,
            contentColor = TrendyolColor.themeColor.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            GenericDialogContent(
                type = TrendyolGenericDialogType.Success,
                displayCloseButton = false,
                title = "Success Message Title",
                message = "Message Detail",
                primaryButton = {
                    DialogButtons.Primary(text = "Button", modifier = Modifier.fillMaxWidth()) {
                    }
                }
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.DIALOG,
    name = Component.SUCCESS_DIALOG,
    styleName = "Single Button With Close",
)
private fun Succes_Dialog_Single_Button_Close() {
    TrendyolTheme {
        Surface(
            color = TrendyolColor.themeColor.colorOnPrimary,
            contentColor = TrendyolColor.themeColor.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            GenericDialogContent(
                type = TrendyolGenericDialogType.Success,
                displayCloseButton = true,
                title = "Success Message Title",
                message = "Message Detail",
                primaryButton = {
                    DialogButtons.Primary(text = "Button", modifier = Modifier.fillMaxWidth()) {
                    }
                }
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.DIALOG,
    name = Component.SUCCESS_DIALOG,
    styleName = "Two Button",
)
private fun Succes_Dialog_Two_Button() {
    TrendyolTheme {
        Surface(
            color = TrendyolColor.themeColor.colorOnPrimary,
            contentColor = TrendyolColor.themeColor.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            GenericDialogContent(
                type = TrendyolGenericDialogType.Success,
                displayCloseButton = false,
                title = "Success Message Title",
                message = "Message Detail",
                primaryButton = {
                    DialogButtons.Primary(text = "Button", modifier = Modifier.fillMaxWidth()) {
                    }
                },
                secondaryButton = {
                    DialogButtons.Secondary(text = "Button", modifier = Modifier.fillMaxWidth()) {
                    }
                }
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.DIALOG,
    name = Component.SUCCESS_DIALOG,
    styleName = "Two Button With Close",
)
private fun Succes_Dialog_Two_Button_Button_Close() {
    TrendyolTheme {
        Surface(
            color = TrendyolColor.themeColor.colorOnPrimary,
            contentColor = TrendyolColor.themeColor.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            GenericDialogContent(
                type = TrendyolGenericDialogType.Success,
                displayCloseButton = true,
                title = "Success Message Title",
                message = "Message Detail",
                primaryButton = {
                    DialogButtons.Primary(text = "Button", modifier = Modifier.fillMaxWidth()) {
                    }
                },
                secondaryButton = {
                    DialogButtons.Secondary(text = "Button", modifier = Modifier.fillMaxWidth()) {
                    }
                }
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.DIALOG,
    name = Component.SUCCESS_DIALOG,
    styleName = "No Button Dialog",
)
private fun Success_Dialog_No_Button_Dialog() {
    TrendyolTheme {
        Surface(
            color = TrendyolColor.themeColor.colorOnPrimary,
            contentColor = TrendyolColor.themeColor.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            GenericDialogContent(
                type = TrendyolGenericDialogType.Success,
                displayCloseButton = false,
                title = "Success Message Title",
                message = "Message Detail"
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.DIALOG,
    name = Component.SUCCESS_DIALOG,
    styleName = "No Button Dialog With Close",
)
private fun Success_Dialog_No_Button_Dialog_Button_Close() {
    TrendyolTheme {
        Surface(
            color = TrendyolColor.themeColor.colorOnPrimary,
            contentColor = TrendyolColor.themeColor.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            GenericDialogContent(
                type = TrendyolGenericDialogType.Success,
                displayCloseButton = true,
                title = "Success Message Title",
                message = "Message Detail"
            )
        }
    }
}
