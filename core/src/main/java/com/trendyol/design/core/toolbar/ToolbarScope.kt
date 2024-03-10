package com.trendyol.design.core.toolbar

import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.layoutId
import com.trendyol.design.core.icon.IconSize

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
        onClick: () -> Unit = {},
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
}
internal object IconLayoutId
