package com.trendyol.design.core.toolbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.icon.icons.fill.Share
import com.trendyol.design.core.icon.icons.fill.Trash
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign
import androidx.compose.material.TopAppBar as MaterialTopAppBar

/**
 * Toolbar displays information and actions relating to the current screen. There are some various
 * styles. You can reach the toolbar styles in ![figma](https://www.figma.com/file/YPxZC4FiiowYTBs8Txc4Xi/Design-App-Library?type=design&node-id=823%3A1083&mode=design&t=1whjmt1Zx10PDeyM-1).
 *
 * @param title This mandatory parameter defines the text that will be displayed in the center of the toolbar.
 * @param modifier The [Modifier] to be applied to this Toolbar
 * @param style This parameter controls the visual style of the toolbar. It can be set to one of the
 * predefined [KPToolbarStyle] enum values like [KPToolbarStyle.Icon.EndIcon] or [KPToolbarStyle.TextButton]
 * to achieve different appearances. Defaults to [KPToolbarStyle.None]
 * @param titleTextStyle This parameter allows you to customize the text style for the toolbar title.
 * @param backgroundColor The background color for the Toolbar.
 * @param elevation the elevation of this Toolbar
 * @param contentPadding the padding applied to the content of this Toolbar
 */
@Composable
public fun KPToolbar(
    title: String,
    modifier: Modifier = Modifier,
    style: ToolbarStyle = KPToolbarStyle.None,
    titleTextStyle: TextStyle = KPDesign.typography.titleMediumColorOnSurfaceVariant3,
    backgroundColor: Color = KPDesign.colors.colorSurface,
    elevation: Dp = KPToolbarDefaults.Elevation,
    contentPadding: PaddingValues = KPToolbarDefaults.ContentPadding,
) {
    MaterialTopAppBar(
        modifier = modifier,
        backgroundColor = backgroundColor,
        elevation = elevation,
        contentPadding = contentPadding,
    ) {
        if (style is ToolbarStyleIcon) {
            CheckToolbarLayoutIds(
                layoutId = IconLayoutId,
                isSingleChildRequired = true,
                errorMessage = "Composable should be instance of Icon"
            ) {
                style.icon(ToolbarScope)
            }
            style.icon(ToolbarScope)
            Spacer(modifier = Modifier.width(32.dp))
        }

        KPText(
            text = title,
            modifier = Modifier
                .weight(1f)
                .padding(end = 8.dp),
            style = titleTextStyle
        )

        if (style is ToolbarStyleTextButton) {
            CheckToolbarLayoutIds(
                layoutId = TextLayoutId,
                isSingleChildRequired = true,
                errorMessage = "Composable should be instance of Text",
            ) {
                style.textButton(ToolbarScope)
            }
            ProvideTextStyle(value = KPDesign.typography.titleMediumColorPrimary) {
                style.textButton(ToolbarScope)
            }
        }

        if (style is ToolbarStyleEndIcon) {
            CheckToolbarLayoutIds(
                layoutId = IconLayoutId,
                isSingleChildRequired = true,
                errorMessage = "Composable should be instance of Icon"
            ) {
                style.endIcon(ToolbarScope)
            }
            style.endIcon(ToolbarScope)
        }

        if (style is ToolbarStyleEndTwoIcons) {
            CheckToolbarLayoutIds(
                layoutId = IconLayoutId,
                errorMessage = "Composable should be instance of Icon"
            ) {
                style.firstIcon(ToolbarScope)
                style.secondIcon(ToolbarScope)
            }
            style.firstIcon(ToolbarScope)
            Spacer(modifier = Modifier.width(12.dp))
            style.secondIcon(ToolbarScope)
        }
    }
}

// RTL Previews

@Preview(showBackground = true)
@Composable
private fun KPToolbarNoneRTLPreview() {
    PreviewTheme(layoutDirection = LayoutDirection.Rtl) {
        KPToolbar(
            title = "عنوان",
            style = KPToolbarStyle.None
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun KPToolbarTextButtonRTLPreview() {
    PreviewTheme(layoutDirection = LayoutDirection.Rtl) {
        KPToolbar(
            title = "عنوان",
            style = KPToolbarStyle.TextButton(
                textButton = { Text(text = "تسمية", onClick = { }) }
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun KPToolbarEndIconRTLPreview() {
    PreviewTheme(layoutDirection = LayoutDirection.Rtl) {
        KPToolbar(
            title = "عنوان",
            style = KPToolbarStyle.EndIcon(
                endIcon = {
                    Icon(imageVector = KPIcons.Fill.Trash, onClick = { })
                }
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun KPToolbarEndTwoIconsRTLPreview() {
    PreviewTheme(layoutDirection = LayoutDirection.Rtl) {
        KPToolbar(
            title = "عنوان",
            style = KPToolbarStyle.EndTwoIcons(
                firstIcon = { Icon(imageVector = KPIcons.Fill.Help, onClick = { }) },
                secondIcon = { Icon(imageVector = KPIcons.Fill.Trash, onClick = { }) }
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun KPToolbarIconNoneRTLPreview() {
    PreviewTheme(layoutDirection = LayoutDirection.Rtl) {
        KPToolbar(
            title = "عنوان",
            style = KPToolbarStyle.Icon.None(
                icon = { Icon(imageVector = KPIcons.Fill.Share, onClick = { }) }
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun KPToolbarIconTextButtonRTLPreview() {
    PreviewTheme(layoutDirection = LayoutDirection.Rtl) {
        KPToolbar(
            title = "عنوان",
            style = KPToolbarStyle.Icon.TextButton(
                icon = { Icon(imageVector = KPIcons.Fill.Share, onClick = { }) },
                textButton = { Text(text = "تسمية", onClick = { }) }
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun KPToolbarIconEndIconRTLPreview() {
    PreviewTheme(layoutDirection = LayoutDirection.Rtl) {
        KPToolbar(
            title = "عنوان",
            style = KPToolbarStyle.Icon.EndIcon(
                icon = { Icon(imageVector = KPIcons.Fill.Share, onClick = { }) },
                endIcon = { Icon(imageVector = KPIcons.Fill.Trash, onClick = { }) }
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun KPToolbarIconEndTwoIconsRTLPreview() {
    PreviewTheme(layoutDirection = LayoutDirection.Rtl) {
        KPToolbar(
            title = "عنوان",
            style = KPToolbarStyle.Icon.EndTwoIcons(
                icon = { Icon(imageVector = KPIcons.Fill.Share, onClick = { }) },
                firstIcon = { Icon(imageVector = KPIcons.Fill.Help, onClick = { }) },
                secondIcon = { Icon(imageVector = KPIcons.Fill.Trash, onClick = { }) }
            )
        )
    }
}
