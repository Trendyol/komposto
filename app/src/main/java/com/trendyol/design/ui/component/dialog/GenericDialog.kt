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
import com.trendyol.design.core.dialog.KPGenericDialogContent
import com.trendyol.design.core.dialog.KPGenericDialogType
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.outline.StateCaution
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.KPDesign

@Composable
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.DIALOG,
    name = Component.GENERIC_DIALOG,
    styleName = "Single Button",
)
internal fun Generic_Dialog_Single_Button() {
    TrendyolTheme {
        Surface(
            color = KPDesign.colors.colorOnPrimary,
            contentColor = KPDesign.colors.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            KPGenericDialogContent(
                type = KPGenericDialogType.Custom,
                displayCloseButton = false,
                title = "Popup Title",
                icon = {
                    KPIcon(
                        imageVector = KPIcons.Outline.StateCaution,
                        size = KPIconSize.XXXLarge
                    )
                },
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
    name = Component.GENERIC_DIALOG,
    styleName = "Single Button With Close",
)
internal fun Generic_Dialog_Single_Button_Close() {
    TrendyolTheme {
        Surface(
            color = KPDesign.colors.colorOnPrimary,
            contentColor = KPDesign.colors.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            KPGenericDialogContent(
                type = KPGenericDialogType.Custom,
                displayCloseButton = true,
                title = "Popup Title",
                icon = {
                    KPIcon(
                        imageVector = KPIcons.Outline.StateCaution,
                        size = KPIconSize.XXXLarge
                    )
                },
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
    name = Component.GENERIC_DIALOG,
    styleName = "Two Button",
)
internal fun Generic_Dialog_Two_Button() {
    TrendyolTheme {
        Surface(
            color = KPDesign.colors.colorOnPrimary,
            contentColor = KPDesign.colors.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            KPGenericDialogContent(
                type = KPGenericDialogType.Custom,
                displayCloseButton = false,
                title = "Popup Title",
                icon = {
                    KPIcon(
                        imageVector = KPIcons.Outline.StateCaution,
                        size = KPIconSize.XXXLarge
                    )
                },
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
    name = Component.GENERIC_DIALOG,
    styleName = "Two Button With Close",
)
internal fun Generic_Dialog_Two_Button_Button_Close() {
    TrendyolTheme {
        Surface(
            color = KPDesign.colors.colorOnPrimary,
            contentColor = KPDesign.colors.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            KPGenericDialogContent(
                type = KPGenericDialogType.Custom,
                displayCloseButton = true,
                title = "Popup Title",
                icon = {
                    KPIcon(
                        imageVector = KPIcons.Outline.StateCaution,
                        size = KPIconSize.XXXLarge
                    )
                },
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
    name = Component.GENERIC_DIALOG,
    styleName = "No Button Dialog",
)
internal fun Generic_Dialog_No_Button_Dialog() {
    TrendyolTheme {
        Surface(
            color = KPDesign.colors.colorOnPrimary,
            contentColor = KPDesign.colors.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            KPGenericDialogContent(
                type = KPGenericDialogType.Custom,
                displayCloseButton = false,
                title = "Popup Title",
                icon = {
                    KPIcon(
                        imageVector = KPIcons.Outline.StateCaution,
                        size = KPIconSize.XXXLarge
                    )
                },
                message = "Message Detail"
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.DIALOG,
    name = Component.GENERIC_DIALOG,
    styleName = "No Button Dialog With Close",
)
internal fun Generic_Dialog_No_Button_Dialog_Button_Close() {
    TrendyolTheme {
        Surface(
            color = KPDesign.colors.colorOnPrimary,
            contentColor = KPDesign.colors.colorOnPrimary,
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            KPGenericDialogContent(
                type = KPGenericDialogType.Custom,
                displayCloseButton = true,
                title = "Popup Title",
                icon = {
                    KPIcon(
                        imageVector = KPIcons.Outline.StateCaution,
                        size = KPIconSize.XXXLarge
                    )
                },
                message = "Message Detail"
            )
        }
    }
}
