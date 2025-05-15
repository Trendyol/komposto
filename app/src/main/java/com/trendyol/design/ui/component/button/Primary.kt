package com.trendyol.design.ui.component.button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.R
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.core.button.KPButton
import com.trendyol.design.core.button.KPButtonSize
import com.trendyol.design.core.button.KPButtonStyle
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.RunningOut
import com.trendyol.design.core.text.KPText
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.KPDesign

const val BUTTON_TEXT = "CTA Label"

@Preview
@ShowkaseComposable(group = Group.BUTTON, name = Component.PRIMARY_BUTTON, styleName = "4.Large.Enabled")
@Composable
internal fun Primary_Button_Large_Enabled_Showkase() = TrendyolTheme {
    Row {
        KPButton(
            onClick = { },
            style = KPButtonStyle.Primary,
            size = KPButtonSize.Large,
        ) {
            KPText(text = BUTTON_TEXT)
        }

        Spacer(modifier = Modifier.width(16.dp))

        KPButton(
            onClick = { },
            style = KPButtonStyle.Primary,
            size = KPButtonSize.Large,
            contentPadding = PaddingValues(
                vertical = 3.5.dp,
                horizontal = 20.dp
            ),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                KPText(
                    text = stringResource(R.string.button_top_text),
                    style = KPDesign.typography.titleBold,
                )
                Spacer(modifier = Modifier.height(2.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    KPIcon(
                        imageVector = KPIcons.Fill.RunningOut,
                        size = KPIconSize.XXSmall,
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    KPText(
                        text = stringResource(R.string.button_bottom_text),
                        style = KPDesign.typography.body2Medium
                    )
                }
            }
        }
    }
}

@Preview
@ShowkaseComposable(group = Group.BUTTON, name = Component.PRIMARY_BUTTON, styleName = "3.Medium.Enabled")
@Composable
internal fun Primary_Button_Medium_Enabled_Showkase() = TrendyolTheme {
    Row {
        KPButton(
            onClick = { },
            style = KPButtonStyle.Primary,
            size = KPButtonSize.Medium,
        ) {
            KPText(text = BUTTON_TEXT)
        }

        Spacer(modifier = Modifier.width(16.dp))

        KPButton(
            onClick = { },
            style = KPButtonStyle.Primary,
            size = KPButtonSize.Medium,
            contentPadding = PaddingValues(
                vertical = 3.5.dp,
                horizontal = 20.dp
            ),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                KPText(
                    text = stringResource(R.string.button_top_text),
                    style = KPDesign.typography.body1Bold
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    KPIcon(
                        imageVector = KPIcons.Fill.RunningOut,
                        size = KPIconSize.XXSmall,
                        modifier = Modifier.width(10.dp),
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                    KPText(
                        text = stringResource(R.string.button_bottom_text),
                        style = KPDesign.typography.overLineMedium
                    )
                }
            }
        }
    }
}

@Preview
@ShowkaseComposable(group = Group.BUTTON, name = Component.PRIMARY_BUTTON, styleName = "2.Small.Enabled")
@Composable
internal fun Primary_Button_Small_Enabled_Showkase() {
    TrendyolTheme {
        KPButton(
            onClick = { },
            style = KPButtonStyle.Primary,
            size = KPButtonSize.Small,
        ) {
            KPText(text = BUTTON_TEXT)
        }
    }
}

@Preview
@ShowkaseComposable(group = Group.BUTTON, name = Component.PRIMARY_BUTTON, styleName = "1.XSmall.Enabled")
@Composable
internal fun Primary_Button_XSmall_Enabled_Showkase() {
    TrendyolTheme {
        KPButton(
            onClick = { },
            style = KPButtonStyle.Primary,
            size = KPButtonSize.XSmall,
        ) {
            KPText(text = BUTTON_TEXT)
        }
    }
}

@Preview
@ShowkaseComposable(group = Group.BUTTON, name = Component.PRIMARY_BUTTON, styleName = "5.Large.Disabled")
@Composable
internal fun Z_Primary_Button_Large_Disabled_Showkase() = TrendyolTheme {
    Row {
        KPButton(
            onClick = { },
            style = KPButtonStyle.Primary,
            size = KPButtonSize.Large,
            enabled = false,
        ) {
            KPText(text = BUTTON_TEXT)
        }

        Spacer(modifier = Modifier.width(16.dp))

        KPButton(
            onClick = { },
            style = KPButtonStyle.Primary,
            size = KPButtonSize.Large,
            contentPadding = PaddingValues(
                vertical = 3.5.dp,
                horizontal = 20.dp
            ),
            enabled = false,
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                KPText(
                    text = stringResource(R.string.button_top_text),
                    style = KPDesign.typography.titleBold,
                )
                Spacer(modifier = Modifier.height(2.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    KPIcon(
                        imageVector = KPIcons.Fill.RunningOut,
                        size = KPIconSize.XXSmall,
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    KPText(
                        text = stringResource(R.string.button_bottom_text),
                        style = KPDesign.typography.body2Medium
                    )
                }
            }
        }
    }
}

@Preview
@ShowkaseComposable(group = Group.BUTTON, name = Component.PRIMARY_BUTTON, styleName = "6.Large.Enabled.TwoLine")
@Composable
internal fun Primary_Button_Large_Enabled_TwoLine_Showkase() {
    TrendyolTheme {
        KPButton(
            onClick = { },
            style = KPButtonStyle.Primary,
            size = KPButtonSize.Large,
        ) {
            KPText(
                text = "Long Title example\n is like that",
                textAlign = TextAlign.Center,
            )
        }
    }
}
