package com.trendyol.design.ui.component.button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.R
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.core.button.Button
import com.trendyol.design.core.button.TrendyolButtonSize
import com.trendyol.design.core.button.TrendyolButtonStyle
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.RunningOut
import com.trendyol.design.core.text.Text
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.TrendyolDesign

@Preview
@ShowkaseComposable(group = Group.BUTTON, name = Component.TERTIARY_BUTTON, styleName = "4.Large.Enabled")
@Composable
internal fun Tertiary_Button_Large_Enabled_Showkase() = TrendyolTheme {
    Row {
        Button(
            onClick = { },
            style = TrendyolButtonStyle.Tertiary,
            size = TrendyolButtonSize.Large,
        ) {
            Text(text = BUTTON_TEXT)
        }

        Spacer(modifier = Modifier.width(16.dp))

        Button(
            onClick = { },
            style = TrendyolButtonStyle.Tertiary,
            size = TrendyolButtonSize.Large,
            contentPadding = PaddingValues(
                vertical = 3.5.dp,
                horizontal = 20.dp
            ),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.button_top_text),
                    style = TrendyolDesign.typography.titleBold,
                )
                Spacer(modifier = Modifier.height(2.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Fill.RunningOut,
                        size = TrendyolIconSize.XXSmall,
                        tint = LocalContentColor.current,
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = stringResource(R.string.button_bottom_text),
                        style = TrendyolDesign.typography.body2Medium
                    )
                }
            }
        }
    }
}

@Preview
@ShowkaseComposable(group = Group.BUTTON, name = Component.TERTIARY_BUTTON, styleName = "3.Medium.Enabled")
@Composable
internal fun Tertiary_Button_Medium_Enabled_Showkase() = TrendyolTheme {
    Row {
        Button(
            onClick = { },
            style = TrendyolButtonStyle.Tertiary,
            size = TrendyolButtonSize.Medium,
        ) {
            Text(text = BUTTON_TEXT)
        }

        Spacer(modifier = Modifier.width(16.dp))

        Button(
            onClick = { },
            style = TrendyolButtonStyle.Tertiary,
            size = TrendyolButtonSize.Medium,
            contentPadding = PaddingValues(
                vertical = 3.5.dp,
                horizontal = 20.dp
            ),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.button_top_text),
                    style = TrendyolDesign.typography.body1Bold
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Fill.RunningOut,
                        size = TrendyolIconSize.XXSmall,
                        tint = LocalContentColor.current,
                        modifier = Modifier.width(10.dp),
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                    Text(
                        text = stringResource(R.string.button_bottom_text),
                        style = TrendyolDesign.typography.overLineMedium
                    )
                }
            }
        }
    }
}

@Preview
@ShowkaseComposable(group = Group.BUTTON, name = Component.TERTIARY_BUTTON, styleName = "2.Small.Enabled")
@Composable
internal fun Tertiary_Button_Small_Enabled_Showkase() {
    TrendyolTheme {
        Button(
            onClick = { },
            style = TrendyolButtonStyle.Tertiary,
            size = TrendyolButtonSize.Small,
        ) {
            Text(text = BUTTON_TEXT)
        }
    }
}

@Preview
@ShowkaseComposable(group = Group.BUTTON, name = Component.TERTIARY_BUTTON, styleName = "1.XSmall.Enabled")
@Composable
internal fun Tertiary_Button_XSmall_Enabled_Showkase() {
    TrendyolTheme {
        Button(
            onClick = { },
            style = TrendyolButtonStyle.Tertiary,
            size = TrendyolButtonSize.XSmall,
        ) {
            Text(text = BUTTON_TEXT)
        }
    }
}

@Preview
@ShowkaseComposable(group = Group.BUTTON, name = Component.TERTIARY_BUTTON, styleName = "5.Large.Disabled")
@Composable
internal fun Z_Tertiary_Button_Large_Disabled_Showkase() = TrendyolTheme {
    Row {
        Button(
            onClick = { },
            style = TrendyolButtonStyle.Tertiary,
            size = TrendyolButtonSize.Large,
            enabled = false,
        ) {
            Text(text = BUTTON_TEXT)
        }

        Spacer(modifier = Modifier.width(16.dp))

        Button(
            onClick = { },
            style = TrendyolButtonStyle.Tertiary,
            size = TrendyolButtonSize.Large,
            contentPadding = PaddingValues(
                vertical = 3.5.dp,
                horizontal = 20.dp
            ),
            enabled = false,
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.button_top_text),
                    style = TrendyolDesign.typography.titleBold,
                )
                Spacer(modifier = Modifier.height(2.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Fill.RunningOut,
                        size = TrendyolIconSize.XXSmall,
                        tint = LocalContentColor.current,
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = stringResource(R.string.button_bottom_text),
                        style = TrendyolDesign.typography.body2Medium
                    )
                }
            }
        }
    }
}

@Preview
@ShowkaseComposable(group = Group.BUTTON, name = Component.TERTIARY_BUTTON, styleName = "6.Large.Enabled.TwoLine")
@Composable
internal fun Tertiary_Button_Large_Enabled_TwoLine_Showkase() {
    TrendyolTheme {
        Button(
            onClick = { },
            style = TrendyolButtonStyle.Tertiary,
            size = TrendyolButtonSize.Large,
        ) {
            Text(
                text = "Long Title example\n is like that",
                textAlign = TextAlign.Center,
            )
        }
    }
}
