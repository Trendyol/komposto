package com.trendyol.design.ui.component.iconbutton

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.SaveSelected
import com.trendyol.design.core.icon.icons.outline.SaveUnselected
import com.trendyol.design.core.icon.icons.fill.Share
import com.trendyol.design.core.iconbutton.contained.KPContainedIconButton
import com.trendyol.design.core.iconbutton.contained.KPContainedIconToggleButton
import com.trendyol.design.core.iconbutton.contained.KPContainedIconButtonSize
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.CONTAINED_ICON_BUTTON,
    styleName = "1.Large.NoToggle",
)
internal fun PreviewKPContainedIconButtonLargeNoToggle() = TrendyolTheme {
    KPContainedIconButton(
        icon = Icons.Fill.Share,
        size = KPContainedIconButtonSize.Large,
        onClick = { }
    )
}

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.CONTAINED_ICON_BUTTON,
    styleName = "1.Medium.NoToggle",
)
internal fun PreviewKPContainedIconButtonMediumNoToggle() = TrendyolTheme {
    KPContainedIconButton(
        icon = Icons.Fill.Share,
        size = KPContainedIconButtonSize.Medium,
        onClick = { }
    )
}

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.CONTAINED_ICON_BUTTON,
    styleName = "1.Small.NoToggle",
)
internal fun PreviewKPContainedIconButtonSmallNoToggle() = TrendyolTheme {
    KPContainedIconButton(
        icon = Icons.Fill.Share,
        size = KPContainedIconButtonSize.Small,
        onClick = { }
    )
}

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.CONTAINED_ICON_BUTTON,
    styleName = "1.Large.Toggle",
)
internal fun PreviewKPContainedIconButtonLargeToggle() = TrendyolTheme {
    var checked by remember { mutableStateOf(false) }
    KPContainedIconToggleButton(
        checked = checked,
        checkedIcon = Icons.Fill.SaveSelected,
        unCheckedIcon = Icons.Outline.SaveUnselected,
        size = KPContainedIconButtonSize.Large,
        onCheckedChange = { checked = it },
    )
}

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.CONTAINED_ICON_BUTTON,
    styleName = "1.Medium.Toggle",
)
internal fun PreviewKPContainedIconButtonMediumToggle() = TrendyolTheme {
    var checked by remember { mutableStateOf(false) }
    KPContainedIconToggleButton(
        checked = checked,
        checkedIcon = Icons.Fill.SaveSelected,
        unCheckedIcon = Icons.Outline.SaveUnselected,
        size = KPContainedIconButtonSize.Medium,
        onCheckedChange = { checked = it },
    )
}

@Preview(showBackground = true)
@Composable
@ShowkaseComposable(
    group = Group.ICON_BUTTON,
    name = Component.CONTAINED_ICON_BUTTON,
    styleName = "1.Small.Toggle",
)
internal fun PreviewKPContainedIconButtonSmallToggle() = TrendyolTheme {
    var checked by remember { mutableStateOf(false) }
    KPContainedIconToggleButton(
        checked = checked,
        checkedIcon = Icons.Fill.SaveSelected,
        unCheckedIcon = Icons.Outline.SaveUnselected,
        size = KPContainedIconButtonSize.Small,
        onCheckedChange = { checked = it },
    )
}
