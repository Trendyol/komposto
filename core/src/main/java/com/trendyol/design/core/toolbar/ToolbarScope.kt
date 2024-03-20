package com.trendyol.design.core.toolbar

import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextStyle
import com.trendyol.design.core.icon.IconSize
import com.trendyol.theme.TrendyolDesign

@Stable
object ToolbarScope {

    /**
     * Default icon used for Toolbar
     *
     * @param imageVector This mandatory parameter defines the vector graphic resource that will be
     * displayed as the icon. You'll need to provide an ImageVector object representing the
     * desired icon.
     * @param modifier The [Modifier] to be applied to this Toolbar
     * @param onClick This parameter allows you to specify an action to be performed when the user
     * clicks on the icon.
     * @param size  This parameter controls the size of the icon. It can be set to one of the
     * predefined IconSize enum values, such as [IconSize.Small] or [IconSize.Medium].
     * Defaults to the value from [ToolbarDefaults.IconSize].
     */
    @Composable
    fun Icon(
        imageVector: ImageVector,
        modifier: Modifier = Modifier,
        onClick: () -> Unit,
        size: IconSize = ToolbarDefaults.IconSize,
        tint: Color = Color.Unspecified
    ) {
        com.trendyol.design.core.icon.Icon(
            imageVector = imageVector,
            size = size,
            modifier = modifier
                .layoutId(IconLayoutId)
                .clickable { onClick.invoke() },
            tint = tint
        )
    }

    /**
     * Default text used for Toolbar
     *
     * @param text The text to be displayed. It should be a [String] value.
     * @param modifier modifier The [Modifier] to be applied to this Toolbar
     * @param onClick A lambda function that will be called when the user clicks on the text.
     * @param style A TextStyle object that defines the text style. The default
     * value is [TrendyolDesign.typography.titleMediumColorPrimary]
     */
    @Composable
    fun Text(
        text: String,
        modifier: Modifier = Modifier,
        onClick: () -> Unit,
        style: TextStyle = TrendyolDesign.typography.titleMediumColorPrimary,
    ) {
        com.trendyol.design.core.text.Text(
            text = text,
            modifier = modifier
                .layoutId(TextLayoutId)
                .clickable { onClick.invoke() },
            style = style
        )
    }
}

internal object IconLayoutId
internal object TextLayoutId
