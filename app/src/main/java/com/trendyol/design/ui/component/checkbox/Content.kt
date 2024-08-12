package com.trendyol.design.ui.component.checkbox

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.trendyol.design.core.text.Text
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.TrendyolDesign

// region Primary
@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_CONTENT,
    styleName = "Primary_XSmall"
)
@Composable
internal fun Checkbox_3_Primary_Content_XSmall() = TrendyolTheme {
    Column {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[0])),
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[1])),
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[2])),
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[3])),
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[4])),
            checked = true,
            onCheckedChange = { },
            position = Alignment.Top
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[5])),
            checked = true,
            onCheckedChange = { },
            position = Alignment.Bottom
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_CONTENT,
    styleName = "Primary_Small"
)
@Composable
internal fun Checkbox_3_Primary_Content_Small() = TrendyolTheme {
    Column {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[0])),
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[1])),
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[2])),
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[3])),
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[4])),
            checked = true,
            onCheckedChange = { },
            position = Alignment.Top
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[5])),
            checked = true,
            onCheckedChange = { },
            position = Alignment.Bottom
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_CONTENT,
    styleName = "Primary_Medium"
)
@Composable
internal fun Checkbox_3_Primary_Content_Medium() = TrendyolTheme {
    Column {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[0])),
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[1])),
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[2])),
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[3])),
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[4])),
            checked = true,
            onCheckedChange = { },
            position = Alignment.Top
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Primary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[5])),
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
    name = Component.CHECKBOX_CONTENT,
    styleName = "Secondary_XSmall"
)
@Composable
internal fun Checkbox_3_Secondary_Content_XSmall() = TrendyolTheme {
    Column {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[0])),
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[1])),
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[2])),
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.XSmall,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[3])),
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_CONTENT,
    styleName = "Secondary_Small"
)
@Composable
internal fun Checkbox_3_Secondary_Content_Small() = TrendyolTheme {
    Column {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[0])),
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[1])),
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[2])),
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Small,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[3])),
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.CHECKBOX,
    name = Component.CHECKBOX_CONTENT,
    styleName = "Secondary_Medium"
)
@Composable
internal fun Checkbox_3_Secondary_Content_Medium() = TrendyolTheme {
    Column {
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[0])),
            checked = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[1])),
            checked = true,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[2])),
            checked = false,
            enabled = false,
            onCheckedChange = { }
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        TrendyolCheckbox(
            style = TrendyolCheckBoxStyle.Secondary,
            size = TrendyolCheckBoxSize.Medium,
            containerType = CheckboxContainerType.Content(content(checkboxTexts[3])),
            checked = true,
            enabled = false,
            onCheckedChange = { }
        )
    }
}
// endregion

internal val checkboxTexts = listOf(
    "This sample stands for the unselected and enabled checkbox component with text",
    "This sample stands for the selected and enabled checkbox component with text",
    "This sample stands for the unselected and not enabled checkbox component with text",
    "This sample stands for the selected and not enabled checkbox component with text",
    "This sample stands for checkbox component aligned to top of text",
    "This sample stands for checkbox component aligned to bottom of text",
)
private fun content(text: String): @Composable () -> Unit = {
    Column(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = TrendyolDesign.colors.colorBorder,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Row {
            Text(text = text)
        }
    }
}
