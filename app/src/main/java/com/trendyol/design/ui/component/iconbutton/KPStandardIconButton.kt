package com.trendyol.design.ui.component.iconbutton

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.icon.icons.fill.PauseButton
import com.trendyol.design.core.icon.icons.fill.PlayButton
import com.trendyol.design.core.iconbutton.standard.KPStandardIconButton
import com.trendyol.design.core.iconbutton.standard.KPStandardIconButtonSize
import com.trendyol.design.core.iconbutton.standard.KPStandardIconToggleButton
import com.trendyol.design.core.text.KPText
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.STANDARD_ICON_BUTTON,
    styleName = "NoToggle",
)
internal fun PreviewKPStandardIconButtonNoToggle() = TrendyolTheme {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPStandardIconButton(
                icon = KPIcons.Fill.Help,
                size = KPStandardIconButtonSize.XLarge,
                onClick = { }
            )
            KPText("XLarge")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPStandardIconButton(
                icon = KPIcons.Fill.Help,
                size = KPStandardIconButtonSize.Large,
                onClick = { }
            )
            KPText("Large")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPStandardIconButton(
                icon = KPIcons.Fill.Help,
                size = KPStandardIconButtonSize.Medium,
                onClick = { }
            )
            KPText("Medium")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPStandardIconButton(
                icon = KPIcons.Fill.Help,
                size = KPStandardIconButtonSize.Small,
                onClick = { }
            )
            KPText("Small")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPStandardIconButton(
                icon = KPIcons.Fill.Help,
                size = KPStandardIconButtonSize.XSmall,
                onClick = { }
            )
            KPText("XSmall")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPStandardIconButton(
                icon = KPIcons.Fill.Help,
                size = KPStandardIconButtonSize.XLarge,
                onClick = { },
                enabled = false,
            )
            KPText("Disabled")
        }
    }
}

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.STANDARD_ICON_BUTTON,
    styleName = "Toggle",
)
internal fun PreviewKPIconButtonToggle() = TrendyolTheme {
    var checked by remember { mutableStateOf(false) }
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPStandardIconToggleButton(
                checked = checked,
                checkedIcon = KPIcons.Fill.PlayButton,
                unCheckedIcon = KPIcons.Fill.PauseButton,
                size = KPStandardIconButtonSize.XLarge,
                onCheckedChange = { checked = it },
            )
            KPText("XLarge")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPStandardIconToggleButton(
                checked = checked,
                checkedIcon = KPIcons.Fill.PlayButton,
                unCheckedIcon = KPIcons.Fill.PauseButton,
                size = KPStandardIconButtonSize.Large,
                onCheckedChange = { checked = it },
            )
            KPText("Large")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPStandardIconToggleButton(
                checked = checked,
                checkedIcon = KPIcons.Fill.PlayButton,
                unCheckedIcon = KPIcons.Fill.PauseButton,
                size = KPStandardIconButtonSize.Medium,
                onCheckedChange = { checked = it },
            )
            KPText("Medium")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPStandardIconToggleButton(
                checked = checked,
                checkedIcon = KPIcons.Fill.PlayButton,
                unCheckedIcon = KPIcons.Fill.PauseButton,
                size = KPStandardIconButtonSize.Small,
                onCheckedChange = { checked = it },
            )
            KPText("Small")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPStandardIconToggleButton(
                checked = checked,
                checkedIcon = KPIcons.Fill.PlayButton,
                unCheckedIcon = KPIcons.Fill.PauseButton,
                size = KPStandardIconButtonSize.XSmall,
                onCheckedChange = { checked = it },
            )
            KPText("XSmall")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPStandardIconToggleButton(
                checked = false,
                checkedIcon = KPIcons.Fill.PlayButton,
                unCheckedIcon = KPIcons.Fill.PauseButton,
                size = KPStandardIconButtonSize.XLarge,
                onCheckedChange = { checked = it },
                enabled = false,
            )
            KPText("Disabled")
        }
    }
}
