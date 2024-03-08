package com.trendyol.design.core.toolbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.text.Text
import com.trendyol.design.core.text.TextLayoutId
import com.trendyol.theme.TrendyolDesign
import androidx.compose.material.TopAppBar as MaterialTopAppBar

@Composable
fun Toolbar(
    title: String,
    modifier: Modifier = Modifier,
    style: ToolbarStyle = ToolbarStyle.None,
    titleTextStyle: TextStyle = TrendyolDesign.typography.titleMediumColorOnSurfaceVariant3,
    backgroundColor: Color = MaterialTheme.colors.surface,
    elevation: Dp = ToolbarDefaults.Elevation,
    contentPadding: PaddingValues = ToolbarDefaults.ContentPadding,
) {

    MaterialTopAppBar(
        modifier = modifier,
        backgroundColor = backgroundColor,
        elevation = elevation,
        contentPadding = contentPadding,
    ) {
        if (style is ToolbarStyle.Icon) {
            RequireLayoutId(
                layoutId = IconLayoutId,
                errorMessage = "Composable should be instance of Icon"
            ) {
                style.icon(ToolbarScope)
            }
            style.icon(ToolbarScope)
            Spacer(modifier = modifier.width(16.dp))
        }

        Text(
            text = title,
            modifier = Modifier.weight(1f),
            style = titleTextStyle
        )

        if (style is ITextButton) {
            RequireLayoutId(
                layoutId = TextLayoutId,
                errorMessage = "Composable should be instance of Text",
                content = style.textButton
            )
            ProvideTextStyle(value = TrendyolDesign.typography.titleMediumColorPrimary) {
                style.textButton()
            }
        }

        if (style is IEndIcon) {
            RequireLayoutId(
                layoutId = IconLayoutId,
                errorMessage = "Composable should be instance of Icon"
            ) {
                style.endIcon(ToolbarScope)
            }
            style.endIcon(ToolbarScope)
        }

        if (style is IEndTwoIcons) {
            style.firstIcon(ToolbarScope)
            Spacer(modifier = Modifier.width(12.dp))
            style.secondIcon(ToolbarScope)
        }
    }
}
