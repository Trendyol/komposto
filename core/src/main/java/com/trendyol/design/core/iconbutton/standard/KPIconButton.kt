package com.trendyol.design.core.iconbutton.standard

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.size
import androidx.compose.material.ButtonColors
import androidx.compose.material.IconButton
import androidx.compose.material.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.icon.icons.fill.PauseButton
import com.trendyol.design.core.icon.icons.fill.PlayButton
import com.trendyol.design.core.iconbutton.IconButtonDefaults
import com.trendyol.design.core.preview.PreviewTheme

/**
 * A composable function that displays an icon button with customizable size, colors, and behavior.
 *
 * @param icon The [ImageVector] representing the icon to display inside the button.
 * @param size The [IconButtonSize] defining the size of the button and its icon.
 * @param onClick The lambda to invoke when the button is clicked.
 * @param modifier The [Modifier] to apply to the button. Defaults to [Modifier].
 * @param enabled Whether the button is enabled. Defaults to `true`.
 * @param colors The [ButtonColors] to use for styling the button's background and content colors.
 * Defaults to [IconButtonDefaults.buttonColors].
 * @param interactionSource The [MutableInteractionSource] to track interaction events. Defaults to a new instance.
 */
@Composable
public fun KPIconButton(
    icon: ImageVector,
    size: IconButtonSize,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: ButtonColors = IconButtonDefaults.buttonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
            .size(size.dp)
            .background(color = colors.backgroundColor(enabled).value),
        enabled = enabled,
        interactionSource = interactionSource,
    ) {
        Icon(
            imageVector = icon,
            size = size.iconSize,
            tint = colors.contentColor(enabled).value
        )
    }
}

/**
 * A composable function that displays a toggleable icon button with customizable size, colors,
 * and behavior for checked and unchecked states.
 *
 * @param checked Whether the button is in the checked state.
 * @param checkedIcon The [ImageVector] representing the icon to display when the button is checked.
 * @param unCheckedIcon The [ImageVector] representing the icon to display when the button is unchecked.
 * @param size The [IconButtonSize] defining the size of the button and its icons.
 * @param onCheckedChange The lambda to invoke when the checked state changes.
 * @param modifier The [Modifier] to apply to the button. Defaults to [Modifier].
 * @param enabled Whether the button is enabled. Defaults to `true`.
 * @param colors The [ButtonColors] to use for styling the button's background and content colors.
 * Defaults to [IconButtonDefaults.buttonColors].
 * @param interactionSource The [MutableInteractionSource] to track interaction events. Defaults to a new instance.
 */
@Composable
public fun KPIconToggleButton(
    checked: Boolean,
    checkedIcon: ImageVector,
    unCheckedIcon: ImageVector,
    size: IconButtonSize,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: ButtonColors = IconButtonDefaults.buttonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    IconToggleButton(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier
            .size(size.dp)
            .background(color = colors.backgroundColor(enabled).value),
        enabled = enabled,
        interactionSource = interactionSource
    ) {
        if (checked) {
            Icon(
                imageVector = checkedIcon,
                size = size.iconSize,
                tint = colors.contentColor(enabled).value,
            )
        } else {
            Icon(
                imageVector = unCheckedIcon,
                size = size.iconSize,
                tint = colors.contentColor(enabled).value,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewKPIconButton() = PreviewTheme {
    KPIconButton(
        icon = Icons.Fill.Help,
        size = KPIconButtonSize.Large,
        onClick = { },
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewKPIconButtonDisabled() = PreviewTheme {
    KPIconButton(
        icon = Icons.Fill.Help,
        size = KPIconButtonSize.Large,
        onClick = { },
        enabled = false,
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewKPContainedToggleIconButton() = PreviewTheme {
    KPIconToggleButton(
        checked = false,
        checkedIcon = Icons.Fill.PlayButton,
        unCheckedIcon = Icons.Fill.PauseButton,
        size = KPIconButtonSize.Large,
        onCheckedChange = {},
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewKPContainedToggleIconButtonDisabled() = PreviewTheme {
    KPIconToggleButton(
        checked = false,
        checkedIcon = Icons.Fill.PlayButton,
        unCheckedIcon = Icons.Fill.PauseButton,
        size = KPIconButtonSize.Large,
        onCheckedChange = {},
        enabled = false,
    )
}
