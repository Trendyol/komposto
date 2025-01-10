package com.trendyol.design.core.checkbox

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import com.trendyol.design.core.preview.PreviewTheme

/**
 * This composable function representing a custom checkbox component designed for the Trendyol.
 *
 * @param style The style configuration for the checkbox, defining its appearance.
 * See [TrendyolCheckBoxStyle.Primary] and [TrendyolCheckBoxStyle.Secondary]
 * @param size The size configuration for the checkbox, determining its dimensions.
 * See [TrendyolCheckBoxSize.Medium], [TrendyolCheckBoxSize.Small] and [TrendyolCheckBoxSize.XSmall]
 * @param containerType The type of container in which the checkbox is placed.
 * See [CheckboxContainerType.Text], [CheckboxContainerType.Content] and [CheckboxContainerType.None]
 * @param checked The current checked state of the checkbox.
 * @param onCheckedChange A callback function invoked when the checked state of the checkbox changes.
 *                        It receives a Boolean parameter indicating the new checked state.
 * @param modifier Additional modifier for the layout of the checkbox.
 * @param enabled Whether the checkbox is interactive and can be checked/unchecked by the user.
 * @param interactionSource The source of interactions for the checkbox, used for tracking user interactions.
 * @param position The vertical alignment of the checkbox within its container.
 */
@Composable
public fun KPCheckbox(
    style: CheckboxStyle,
    size: CheckboxSize,
    containerType: CheckboxContainerType,
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    position: Alignment.Vertical = Alignment.CenterVertically,
) {
    KPTriStateCheckbox(
        modifier = modifier,
        style = style,
        containerType = containerType,
        size = size,
        state = ToggleableState(checked),
        onClick = if (onCheckedChange != null) {
            { onCheckedChange(!checked) }
        } else null,
        interactionSource = interactionSource,
        enabled = enabled,
        colors = style.colors,
        position = position,
    )
}

/**
 * This composable function representing a custom checkbox component designed for the Trendyol.
 *
 * @param style The style configuration for the checkbox, defining its appearance.
 * See [TrendyolCheckBoxStyle.Primary] and [TrendyolCheckBoxStyle.Secondary]
 * @param size The size configuration for the checkbox, determining its dimensions.
 * See [TrendyolCheckBoxSize.Medium], [TrendyolCheckBoxSize.Small] and [TrendyolCheckBoxSize.XSmall]
 * @param containerType The type of container in which the checkbox is placed.
 * See [CheckboxContainerType.Text], [CheckboxContainerType.Content] and [CheckboxContainerType.None]
 * @param checked The current checked state of the checkbox.
 * @param onCheckedChange A callback function invoked when the checked state of the checkbox changes.
 *                        It receives a Boolean parameter indicating the new checked state.
 * @param modifier Additional modifier for the layout of the checkbox.
 * @param enabled Whether the checkbox is interactive and can be checked/unchecked by the user.
 * @param interactionSource The source of interactions for the checkbox, used for tracking user interactions.
 * @param position The vertical alignment of the checkbox within its container.
 */
@Composable
@Deprecated(
    message = "Use KPCheckbox instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun TrendyolCheckbox(
    style: CheckboxStyle,
    size: CheckboxSize,
    containerType: CheckboxContainerType,
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    position: Alignment.Vertical = Alignment.CenterVertically,
) {
    KPTriStateCheckbox(
        modifier = modifier,
        style = style,
        containerType = containerType,
        size = size,
        state = ToggleableState(checked),
        onClick = if (onCheckedChange != null) {
            { onCheckedChange(!checked) }
        } else null,
        interactionSource = interactionSource,
        enabled = enabled,
        colors = style.colors,
        position = position,
    )
}

@Preview(showBackground = true)
@Composable
private fun TrendyolMediumCheckboxPreviewChecked() {
    PreviewTheme {
        KPCheckbox(
            style = KPCheckboxStyle.Primary,
            size = KPCheckboxSize.Medium,
            containerType = CheckboxContainerType.None,
            checked = true,
            onCheckedChange = { },
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolMediumCheckboxPreview() {
    PreviewTheme {
        KPCheckbox(
            style = KPCheckboxStyle.Primary,
            size = KPCheckboxSize.Medium,
            containerType = CheckboxContainerType.None,
            checked = false,
            onCheckedChange = { },
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolMediumCheckboxPreviewDisabled() {
    PreviewTheme {
        KPCheckbox(
            style = KPCheckboxStyle.Primary,
            size = KPCheckboxSize.Medium,
            containerType = CheckboxContainerType.None,
            checked = true,
            onCheckedChange = { },
            enabled = false
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolSmallCheckboxPreviewChecked() {
    PreviewTheme {
        KPCheckbox(
            style = KPCheckboxStyle.Primary,
            size = KPCheckboxSize.Small,
            containerType = CheckboxContainerType.None,
            checked = true,
            onCheckedChange = { },
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolSmallCheckboxPreview() {
    PreviewTheme {
        KPCheckbox(
            style = KPCheckboxStyle.Primary,
            size = KPCheckboxSize.Small,
            containerType = CheckboxContainerType.None,
            checked = false,
            onCheckedChange = { },
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolSmallCheckboxPreviewDisabled() {
    PreviewTheme {
        KPCheckbox(
            style = KPCheckboxStyle.Primary,
            size = KPCheckboxSize.Small,
            containerType = CheckboxContainerType.None,
            checked = true,
            onCheckedChange = { },
            enabled = false
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolXSmallCheckboxPreviewChecked() {
    PreviewTheme {
        KPCheckbox(
            style = KPCheckboxStyle.Primary,
            size = KPCheckboxSize.XSmall,
            containerType = CheckboxContainerType.None,
            checked = true,
            onCheckedChange = { },
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolXSmallCheckboxPreview() {
    PreviewTheme {
        KPCheckbox(
            style = KPCheckboxStyle.Primary,
            size = KPCheckboxSize.XSmall,
            containerType = CheckboxContainerType.None,
            checked = false,
            onCheckedChange = { },
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendyolXSmallCheckboxPreviewDisabled() {
    PreviewTheme {
        KPCheckbox(
            style = KPCheckboxStyle.Primary,
            size = KPCheckboxSize.XSmall,
            containerType = CheckboxContainerType.None,
            checked = true,
            onCheckedChange = { },
            enabled = false
        )
    }
}
