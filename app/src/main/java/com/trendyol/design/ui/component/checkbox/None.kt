package com.trendyol.design.ui.component.checkbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.checkbox.CheckboxContainerType
import com.trendyol.design.core.checkbox.KPCheckboxSize
import com.trendyol.design.core.checkbox.KPCheckBoxStyle
import com.trendyol.design.core.checkbox.KPCheckbox
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

// region Primary
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_NONE,
    styleName = "Primary_XSmall"
)
@Composable
internal fun Checkbox_1_Primary_None_XSmall() = TrendyolTheme {
    Column {
        KPCheckbox(
            style = KPCheckBoxStyle.Primary,
            size = KPCheckboxSize.XSmall,
            containerType = CheckboxContainerType.None,
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Primary,
            size = KPCheckboxSize.XSmall,
            containerType = CheckboxContainerType.None,
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Primary,
            size = KPCheckboxSize.XSmall,
            containerType = CheckboxContainerType.None,
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Primary,
            size = KPCheckboxSize.XSmall,
            containerType = CheckboxContainerType.None,
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_NONE,
    styleName = "Primary_Small"
)
@Composable
internal fun Checkbox_1_Primary_None_Small() = TrendyolTheme {
    Column {
        KPCheckbox(
            style = KPCheckBoxStyle.Primary,
            size = KPCheckboxSize.Small,
            containerType = CheckboxContainerType.None,
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Primary,
            size = KPCheckboxSize.Small,
            containerType = CheckboxContainerType.None,
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Primary,
            size = KPCheckboxSize.Small,
            containerType = CheckboxContainerType.None,
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Primary,
            size = KPCheckboxSize.Small,
            containerType = CheckboxContainerType.None,
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_NONE,
    styleName = "Primary_Medium"
)
@Composable
internal fun Checkbox_1_Primary_None_Medium() = TrendyolTheme {
    Column {
        KPCheckbox(
            style = KPCheckBoxStyle.Primary,
            size = KPCheckboxSize.Medium,
            containerType = CheckboxContainerType.None,
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Primary,
            size = KPCheckboxSize.Medium,
            containerType = CheckboxContainerType.None,
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Primary,
            size = KPCheckboxSize.Medium,
            containerType = CheckboxContainerType.None,
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Primary,
            size = KPCheckboxSize.Medium,
            containerType = CheckboxContainerType.None,
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
    }
}
// endregion

// region Secondary
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_NONE,
    styleName = "Secondary_XSmall"
)
@Composable
internal fun Checkbox_1_Secondary_None_XSmall() = TrendyolTheme {
    Column {
        KPCheckbox(
            style = KPCheckBoxStyle.Secondary,
            size = KPCheckboxSize.XSmall,
            containerType = CheckboxContainerType.None,
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Secondary,
            size = KPCheckboxSize.XSmall,
            containerType = CheckboxContainerType.None,
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Secondary,
            size = KPCheckboxSize.XSmall,
            containerType = CheckboxContainerType.None,
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Secondary,
            size = KPCheckboxSize.XSmall,
            containerType = CheckboxContainerType.None,
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_NONE,
    styleName = "Secondary_Small"
)
@Composable
internal fun Checkbox_1_Secondary_None_Small() = TrendyolTheme {
    Column {
        KPCheckbox(
            style = KPCheckBoxStyle.Secondary,
            size = KPCheckboxSize.Small,
            containerType = CheckboxContainerType.None,
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Secondary,
            size = KPCheckboxSize.Small,
            containerType = CheckboxContainerType.None,
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Secondary,
            size = KPCheckboxSize.Small,
            containerType = CheckboxContainerType.None,
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Secondary,
            size = KPCheckboxSize.Small,
            containerType = CheckboxContainerType.None,
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_NONE,
    styleName = "Secondary_Medium"
)
@Composable
internal fun Checkbox_1_Secondary_None_Medium() = TrendyolTheme {
    Column {
        KPCheckbox(
            style = KPCheckBoxStyle.Secondary,
            size = KPCheckboxSize.Medium,
            containerType = CheckboxContainerType.None,
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Secondary,
            size = KPCheckboxSize.Medium,
            containerType = CheckboxContainerType.None,
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Secondary,
            size = KPCheckboxSize.Medium,
            containerType = CheckboxContainerType.None,
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        KPCheckbox(
            style = KPCheckBoxStyle.Secondary,
            size = KPCheckboxSize.Medium,
            containerType = CheckboxContainerType.None,
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
    }
}
// endregion
