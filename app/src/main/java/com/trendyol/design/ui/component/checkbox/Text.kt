package com.trendyol.design.ui.component.checkbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.checkbox.CheckboxContainerType
import com.trendyol.design.core.checkbox.TrendyolCheckBoxSize
import com.trendyol.design.core.checkbox.TrendyolCheckBoxStyle
import com.trendyol.design.core.checkbox.TrendyolCheckbox
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

// region Primary
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_TEXT,
    styleName = "Primary_XSmall"
)
@Composable
internal fun Checkbox_2_Primary_Text_XSmall() = TrendyolTheme {
    Column {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the unselected and enabled checkbox component with text"
            ),
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the selected and enabled checkbox component with text"
            ),
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the unselected and not enabled checkbox component with text"
            ),
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the selected and not enabled checkbox component with text"
            ),
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Text(
                "This sample stands for checkbox component aligned to top of text"
            ),
            checked = true,
            onCheckedChange = { },
            position = Alignment.Top
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Text(
                "This sample stands for checkbox component aligned to bottom of text"
            ),
            checked = true,
            onCheckedChange = { },
            position = Alignment.Bottom
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_TEXT,
    styleName = "Primary_Small"
)
@Composable
internal fun Checkbox_2_Primary_Text_Small() = TrendyolTheme {
    Column {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the unselected and enabled checkbox component with text"
            ),
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the selected and enabled checkbox component with text"
            ),
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the unselected and not enabled checkbox component with text"
            ),
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the selected and not enabled checkbox component with text"
            ),
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Text(
                "This sample stands for checkbox component aligned to top of text"
            ),
            checked = true,
            onCheckedChange = { },
            position = Alignment.Top
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Text(
                "This sample stands for checkbox component aligned to bottom of text"
            ),
            checked = true,
            onCheckedChange = { },
            position = Alignment.Bottom
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_TEXT,
    styleName = "Primary_Medium"
)
@Composable
internal fun Checkbox_2_Primary_Text_Medium() = TrendyolTheme {
    Column {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the unselected and enabled checkbox component with text"
            ),
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the selected and enabled checkbox component with text"
            ),
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the unselected and not enabled checkbox component with text"
            ),
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the selected and not enabled checkbox component with text"
            ),
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Text(
                "This sample stands for checkbox component aligned to top of text"
            ),
            checked = true,
            onCheckedChange = { },
            position = Alignment.Top
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Text(
                "This sample stands for checkbox component aligned to bottom of text"
            ),
            checked = true,
            onCheckedChange = { },
            position = Alignment.Bottom
        )
    }
}
// endregion

// region Secondary
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_TEXT,
    styleName = "Secondary_XSmall"
)
@Composable
internal fun Checkbox_2_Secondary_Text_XSmall() = TrendyolTheme {
    Column {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the unselected and enabled checkbox component with text"
            ),
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the selected and enabled checkbox component with text"
            ),
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the unselected and not enabled checkbox component with text"
            ),
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the selected and not enabled checkbox component with text"
            ),
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_TEXT,
    styleName = "Secondary_Small"
)
@Composable
internal fun Checkbox_2_Secondary_Text_Small() = TrendyolTheme {
    Column {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the unselected and enabled checkbox component with text"
            ),
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the selected and enabled checkbox component with text"
            ),
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the unselected and not enabled checkbox component with text"
            ),
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the selected and not enabled checkbox component with text"
            ),
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_TEXT,
    styleName = "Secondary_Medium"
)
@Composable
internal fun Checkbox_2_Secondary_Text_Medium() = TrendyolTheme {
    Column {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the unselected and enabled checkbox component with text"
            ),
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the selected and enabled checkbox component with text"
            ),
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the unselected and not enabled checkbox component with text"
            ),
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Text(
                "This sample stands for the selected and not enabled checkbox component with text"
            ),
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
    }
}
// endregion
