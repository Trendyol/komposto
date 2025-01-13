package com.trendyol.design.ui.component.iconbutton

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.icon.icons.fill.PauseButton
import com.trendyol.design.core.icon.icons.fill.PlayButton
import com.trendyol.design.core.iconbutton.standard.KPIconButton
import com.trendyol.design.core.iconbutton.standard.KPIconButtonSize
import com.trendyol.design.core.iconbutton.standard.KPIconToggleButton
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.ICON_BUTTON,
    styleName = "1.XLarge.NoToggle",
)
internal fun PreviewKPIconButtonXLargeNoToggle() = TrendyolTheme {
    KPIconButton(
        icon = KPIcons.Fill.Help,
        size = KPIconButtonSize.XLarge,
        onClick = { }
    )
}

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.ICON_BUTTON,
    styleName = "2.Large.NoToggle",
)
internal fun PreviewKPIconButtonLargeNoToggle() = TrendyolTheme {
    KPIconButton(
        icon = KPIcons.Fill.Help,
        size = KPIconButtonSize.Large,
        onClick = { }
    )
}

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.ICON_BUTTON,
    styleName = "3.Medium.NoToggle",
)
internal fun PreviewKPIconButtonMediumNoToggle() = TrendyolTheme {
    KPIconButton(
        icon = KPIcons.Fill.Help,
        size = KPIconButtonSize.Medium,
        onClick = { }
    )
}

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.ICON_BUTTON,
    styleName = "4.Small.NoToggle",
)
internal fun PreviewKPIconButtonSmallNoToggle() = TrendyolTheme {
    KPIconButton(
        icon = KPIcons.Fill.Help,
        size = KPIconButtonSize.Small,
        onClick = { }
    )
}

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.ICON_BUTTON,
    styleName = "5.XSmall.NoToggle",
)
internal fun PreviewKPIconButtonXSmallNoToggle() = TrendyolTheme {
    KPIconButton(
        icon = KPIcons.Fill.Help,
        size = KPIconButtonSize.XSmall,
        onClick = { }
    )
}

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.ICON_BUTTON,
    styleName = "1.XLarge.Toggle",
)
internal fun PreviewKPIconButtonXLargeToggle() = TrendyolTheme {
    var checked by remember { mutableStateOf(false) }
    KPIconToggleButton(
        checked = checked,
        checkedIcon = KPIcons.Fill.PlayButton,
        unCheckedIcon = KPIcons.Fill.PauseButton,
        size = KPIconButtonSize.XLarge,
        onCheckedChange = { checked = it },
    )
}

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.ICON_BUTTON,
    styleName = "2.Large.Toggle",
)
internal fun PreviewKPIconButtonLargeToggle() = TrendyolTheme {
    var checked by remember { mutableStateOf(false) }
    KPIconToggleButton(
        checked = checked,
        checkedIcon = KPIcons.Fill.PlayButton,
        unCheckedIcon = KPIcons.Fill.PauseButton,
        size = KPIconButtonSize.Large,
        onCheckedChange = { checked = it },
    )
}

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.ICON_BUTTON,
    styleName = "3.Medium.Toggle",
)
internal fun PreviewKPIconButtonMediumToggle() = TrendyolTheme {
    var checked by remember { mutableStateOf(false) }
    KPIconToggleButton(
        checked = checked,
        checkedIcon = KPIcons.Fill.PlayButton,
        unCheckedIcon = KPIcons.Fill.PauseButton,
        size = KPIconButtonSize.Medium,
        onCheckedChange = { checked = it },
    )
}

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.ICON_BUTTON,
    styleName = "4.Small.Toggle",
)
internal fun PreviewKPIconButtonSmallToggle() = TrendyolTheme {
    var checked by remember { mutableStateOf(false) }
    KPIconToggleButton(
        checked = checked,
        checkedIcon = KPIcons.Fill.PlayButton,
        unCheckedIcon = KPIcons.Fill.PauseButton,
        size = KPIconButtonSize.Small,
        onCheckedChange = { checked = it },
    )
}

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.ICON_BUTTON,
    styleName = "5.XSmall.Toggle",
)
internal fun PreviewKPIconButtonXSmallToggle() = TrendyolTheme {
    var checked by remember { mutableStateOf(false) }
    KPIconToggleButton(
        checked = checked,
        checkedIcon = KPIcons.Fill.PlayButton,
        unCheckedIcon = KPIcons.Fill.PauseButton,
        size = KPIconButtonSize.XSmall,
        onCheckedChange = { checked = it },
    )
}
