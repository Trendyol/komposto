@file:OptIn(ExperimentalMaterialApi::class)

package com.trendyol.design.core.iconbutton.contained

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.IconButton
import androidx.compose.material.IconToggleButton
import androidx.compose.material.LocalMinimumInteractiveComponentEnforcement
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.SaveSelected
import com.trendyol.design.core.icon.icons.fill.Share
import com.trendyol.design.core.icon.icons.outline.SaveUnselected
import com.trendyol.design.core.iconbutton.IconButtonDefaults
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.theme.KPDesign

/**
 * A composable function that displays a contained icon button with customizable size, colors,
 * and behavior.
 *
 * @param icon The [ImageVector] representing the icon to display inside the button.
 * @param size The [ContainedIconButtonSize] defining the sizes for the button and its container.
 * @param onClick The lambda to invoke when the button is clicked.
 * @param modifier The [Modifier] to apply to the button. Defaults to [Modifier].
 * @param enabled Whether the button is enabled. Defaults to `true`.
 * @param colors The [ContainedIconButtonColors] to use for styling the button's background, content,
 * and container colors. Defaults to [IconButtonDefaults.containedButtonColors].
 * @param interactionSource The [MutableInteractionSource] to track interaction events. Defaults to a new instance.
 */
@Composable
public fun KPContainedIconButton(
    icon: ImageVector,
    size: ContainedIconButtonSize,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: ContainedIconButtonColors = IconButtonDefaults.containedButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false) {
        Box(
            modifier = modifier
                .size(size.iconButtonSize.dp)
                .background(color = colors.backgroundColor(enabled).value),
            contentAlignment = Alignment.Center,
        ) {
            IconButton(
                onClick = onClick,
                modifier = Modifier
                    .shadow(
                        elevation = 3.dp,
                        shape = CircleShape,
                        spotColor = KPDesign.colors.colorOnSurfaceVariant3,
                    )
                    .background(
                        shape = CircleShape,
                        color = colors.containerColor(enabled).value,
                    )
                    .size(size.containerSize),
                enabled = enabled,
                interactionSource = interactionSource,
            ) {
                KPIcon(
                    imageVector = icon,
                    size = size.iconButtonSize.iconSize,
                    tint = colors.contentColor(enabled).value,
                )
            }
        }
    }
}

/**
 * A composable function that displays a contained icon toggle button with customizable size, colors,
 * and behavior for checked and unchecked states.
 *
 * @param checked Whether the button is in the checked state.
 * @param checkedIcon The [ImageVector] representing the icon to display when the button is checked.
 * @param unCheckedIcon The [ImageVector] representing the icon to display when the button is unchecked.
 * @param size The [ContainedIconButtonSize] defining the sizes for the button and its container.
 * @param onCheckedChange The lambda to invoke when the checked state changes.
 * @param modifier The [Modifier] to apply to the button. Defaults to [Modifier].
 * @param enabled Whether the button is enabled. Defaults to `true`.
 * @param colors The [ContainedIconButtonColors] to use for styling the button's background, content,
 * and container colors. Defaults to [IconButtonDefaults.containedButtonColors].
 * @param interactionSource The [MutableInteractionSource] to track interaction events. Defaults to a new instance.
 */
@Composable
public fun KPContainedIconToggleButton(
    checked: Boolean,
    checkedIcon: ImageVector,
    unCheckedIcon: ImageVector,
    size: ContainedIconButtonSize,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: ContainedIconButtonColors = IconButtonDefaults.containedButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false) {
        Box(
            modifier = modifier
                .size(size.iconButtonSize.dp)
                .background(color = colors.backgroundColor(enabled).value),
            contentAlignment = Alignment.Center,
        ) {
            IconToggleButton(
                checked = checked,
                onCheckedChange = onCheckedChange,
                modifier = Modifier
                    .shadow(
                        elevation = 3.dp,
                        shape = CircleShape,
                        spotColor = KPDesign.colors.colorOnSurfaceVariant3,
                    )
                    .background(
                        shape = CircleShape,
                        color = colors.containerColor(enabled).value,
                    )
                    .size(size.containerSize),
                enabled = enabled,
                interactionSource = interactionSource,
            ) {
                if (checked) {
                    KPIcon(
                        imageVector = checkedIcon,
                        size = size.iconButtonSize.iconSize,
                        tint = colors.contentColor(enabled).value,
                    )
                } else {
                    KPIcon(
                        imageVector = unCheckedIcon,
                        size = size.iconButtonSize.iconSize,
                        tint = colors.contentColor(enabled).value,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewKPContainedIconButton() = PreviewTheme {
    KPContainedIconButton(
        icon = KPIcons.Fill.Share,
        size = KPContainedIconButtonSize.Large,
        onClick = {},
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewKPContainedIconButtonDisabled() = PreviewTheme {
    KPContainedIconButton(
        icon = KPIcons.Fill.Share,
        size = KPContainedIconButtonSize.Large,
        onClick = {},
        enabled = false,
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewKPContainedToggleIconButton() = PreviewTheme {
    KPContainedIconToggleButton(
        checked = true,
        checkedIcon = KPIcons.Fill.SaveSelected,
        unCheckedIcon = KPIcons.Outline.SaveUnselected,
        size = KPContainedIconButtonSize.Large,
        onCheckedChange = {},
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewKPContainedToggleIconButtonDisabled() = PreviewTheme {
    KPContainedIconToggleButton(
        checked = true,
        checkedIcon = KPIcons.Fill.SaveSelected,
        unCheckedIcon = KPIcons.Outline.SaveUnselected,
        size = KPContainedIconButtonSize.Large,
        onCheckedChange = {},
        enabled = false,
    )
}
