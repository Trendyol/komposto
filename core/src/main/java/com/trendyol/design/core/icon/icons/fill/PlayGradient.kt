package com.trendyol.design.core.icon.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons

@Preview
@Composable
private fun PlayGradientImageVectorPreview() {
    KPIcon(imageVector = KPIcons.Fill.PlayGradient, size = KPIconSize.XXXLarge)
}

public val KPIcons.Fill.PlayGradient: ImageVector by lazy {
    ImageVector.Builder(
        name = "PlayGradient",
        defaultWidth = 14.dp,
        defaultHeight = 14.dp,
        viewportWidth = 14f,
        viewportHeight = 14f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colors = listOf(Color(0xFFFF9743), Color(0xFFFF6097)),
                start = Offset(1.313f, 7f),
                end = Offset(12.688f, 7f),
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(7f, 1.312f)
            arcToRelative(5.688f, 5.688f, 0f, true, true, 0f, 11.375f)
            arcToRelative(5.688f, 5.688f, 0f, true, true, 0f, -11.375f)
            close()

            moveTo(9.186f, 7.443f)
            lineTo(6.084f, 9.26f)
            curveTo(6.01f, 9.304f, 5.907f, 9.333f, 5.818f, 9.333f)
            curveTo(5.73f, 9.333f, 5.641f, 9.304f, 5.567f, 9.26f)
            curveTo(5.405f, 9.171f, 5.301f, 8.994f, 5.301f, 8.816f)
            verticalLineTo(5.183f)
            curveTo(5.301f, 5.005f, 5.405f, 4.828f, 5.567f, 4.739f)
            curveTo(5.73f, 4.651f, 5.922f, 4.651f, 6.084f, 4.739f)
            lineTo(9.186f, 6.556f)
            curveTo(9.349f, 6.645f, 9.438f, 6.822f, 9.438f, 6.999f)
            curveTo(9.437f, 7.177f, 9.349f, 7.354f, 9.186f, 7.443f)
            close()
        }
    }.build()
}
