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
import com.trendyol.design.core.icon.icons.fill.SaveSelected
import com.trendyol.design.core.icon.icons.outline.SaveUnselected
import com.trendyol.design.core.icon.icons.fill.Share
import com.trendyol.design.core.iconbutton.contained.KPContainedIconButton
import com.trendyol.design.core.iconbutton.contained.KPContainedIconToggleButton
import com.trendyol.design.core.iconbutton.contained.KPContainedIconButtonSize
import com.trendyol.design.core.text.KPText
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.CONTAINED_ICON_BUTTON,
    styleName = "NoToggle",
)
internal fun PreviewKPContainedIconButtonNoToggle() = TrendyolTheme {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPContainedIconButton(
                icon = KPIcons.Fill.Share,
                size = KPContainedIconButtonSize.Large,
                onClick = { }
            )
            KPText("Large")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPContainedIconButton(
                icon = KPIcons.Fill.Share,
                size = KPContainedIconButtonSize.Medium,
                onClick = { }
            )
            KPText("Medium")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPContainedIconButton(
                icon = KPIcons.Fill.Share,
                size = KPContainedIconButtonSize.Small,
                onClick = { }
            )
            KPText("Small")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPContainedIconButton(
                icon = KPIcons.Fill.Share,
                size = KPContainedIconButtonSize.Large,
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
    name = Component.CONTAINED_ICON_BUTTON,
    styleName = "Toggle",
)
internal fun PreviewKPContainedIconButtonToggle() = TrendyolTheme {
    Column {
        var checked by remember { mutableStateOf(false) }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPContainedIconToggleButton(
                checked = checked,
                checkedIcon = KPIcons.Fill.SaveSelected,
                unCheckedIcon = KPIcons.Outline.SaveUnselected,
                size = KPContainedIconButtonSize.Large,
                onCheckedChange = { checked = it },
            )
            KPText("Large")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPContainedIconToggleButton(
                checked = checked,
                checkedIcon = KPIcons.Fill.SaveSelected,
                unCheckedIcon = KPIcons.Outline.SaveUnselected,
                size = KPContainedIconButtonSize.Medium,
                onCheckedChange = { checked = it },
            )
            KPText("Medium")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPContainedIconToggleButton(
                checked = checked,
                checkedIcon = KPIcons.Fill.SaveSelected,
                unCheckedIcon = KPIcons.Outline.SaveUnselected,
                size = KPContainedIconButtonSize.Small,
                onCheckedChange = { checked = it },
            )
            KPText("Small")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            KPContainedIconToggleButton(
                checked = false,
                checkedIcon = KPIcons.Fill.SaveSelected,
                unCheckedIcon = KPIcons.Outline.SaveUnselected,
                size = KPContainedIconButtonSize.Large,
                onCheckedChange = { checked = it },
                enabled = false,
            )
            KPText("Disabled")
        }
    }
}
