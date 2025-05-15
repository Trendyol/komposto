package com.trendyol.design.core.toolbar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.IconSize
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign

@Stable
public object ToolbarScope {

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
     * predefined IconSize enum values, such as [KPIconSize.Small] or [KPIconSize.Medium].
     * Defaults to the value from [KPToolbarDefaults.IconSize].
     */
    @Composable
    public fun Icon(
        imageVector: ImageVector,
        modifier: Modifier = Modifier,
        onClick: () -> Unit,
        size: IconSize = KPToolbarDefaults.IconSize,
        tint: Color = Color.Unspecified
    ) {
        Box(
            modifier
                .layoutId(IconLayoutId)
                .size(size = size.dp)
                .clickable { onClick.invoke() },
        ) {
            KPIcon(
                imageVector = imageVector,
                size = KPIconSize.Medium,
                modifier = Modifier
                    .align(alignment = Alignment.Center)
                    .padding(all = 2.dp),
                tint = tint
            )
        }
    }

    /**
     * Default text used for Toolbar
     *
     * @param text The text to be displayed. It should be a [String] value.
     * @param modifier modifier The [Modifier] to be applied to this Toolbar
     * @param onClick A lambda function that will be called when the user clicks on the text.
     * @param style A TextStyle object that defines the text style. The default
     * value is [KPDesign.typography.subtitleMediumColorPrimary]
     */
    @Composable
    public fun Text(
        text: String,
        modifier: Modifier = Modifier,
        onClick: () -> Unit,
        style: TextStyle = KPDesign.typography.subtitleMediumColorPrimary,
    ) {
        KPText(
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
