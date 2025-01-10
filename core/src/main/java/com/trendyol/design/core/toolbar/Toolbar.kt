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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.text.Text
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign
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

        Text(
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
            ProvideTextStyle(value = TrendyolDesign.typography.titleMediumColorPrimary) {
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

/**
 * Toolbar displays information and actions relating to the current screen. There are some various
 * styles. You can reach the toolbar styles in ![figma](https://www.figma.com/file/YPxZC4FiiowYTBs8Txc4Xi/Design-App-Library?type=design&node-id=823%3A1083&mode=design&t=1whjmt1Zx10PDeyM-1).
 *
 * @param title This mandatory parameter defines the text that will be displayed in the center of the toolbar.
 * @param modifier The [Modifier] to be applied to this Toolbar
 * @param style This parameter controls the visual style of the toolbar. It can be set to one of the
 * predefined [TrendyolToolbarStyle] enum values like [TrendyolToolbarStyle.Icon.EndIcon] or [TrendyolToolbarStyle.TextButton]
 * to achieve different appearances. Defaults to [TrendyolToolbarStyle.None]
 * @param titleTextStyle This parameter allows you to customize the text style for the toolbar title.
 * @param backgroundColor The background color for the Toolbar.
 * @param elevation the elevation of this Toolbar
 * @param contentPadding the padding applied to the content of this Toolbar
 */
@Composable
@Deprecated(
    message = "Use KPToolbar instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun Toolbar(
    title: String,
    modifier: Modifier = Modifier,
    style: ToolbarStyle = TrendyolToolbarStyle.None,
    titleTextStyle: TextStyle = TrendyolDesign.typography.titleMediumColorOnSurfaceVariant3,
    backgroundColor: Color = TrendyolDesign.colors.colorSurface,
    elevation: Dp = ToolbarDefaults.Elevation,
    contentPadding: PaddingValues = ToolbarDefaults.ContentPadding,
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

        Text(
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
            ProvideTextStyle(value = TrendyolDesign.typography.titleMediumColorPrimary) {
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
