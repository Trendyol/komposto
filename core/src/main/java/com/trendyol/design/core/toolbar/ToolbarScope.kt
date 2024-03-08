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
     * Default icon used for TrendyolToolbar
     *
     * @param imageVector
     * @param onClick
     * @param size
     */
    @Composable
    fun Icon(
        imageVector: ImageVector,
        onClick: () -> Unit = {},
        size: IconSize = ToolbarDefaults.IconSize,
        tint: Color = Color.Unspecified
    ) {
        com.trendyol.design.core.icon.Icon(
            imageVector = imageVector,
            size = size,
            modifier = Modifier
                .layoutId(IconLayoutId)
                .clickable { onClick.invoke() },
            tint = tint
        )
    }
}
internal object IconLayoutId
