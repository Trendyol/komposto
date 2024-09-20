package com.trendyol.design.core.icon.icons.outline

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize

@Preview
@Composable
private fun VectorPreview() {
    Icon(Icons.Outline.Info, TrendyolIconSize.Medium)
}

public val Icons.Outline.Info: ImageVector by lazy {
    ImageVector.Builder(
        name = "Info",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = SolidColor(Color(0xFF999999)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8f, 2.00002f)
            curveTo(4.6863f, 2f, 2f, 4.6863f, 2f, 8f)
            curveTo(2f, 11.3138f, 4.6863f, 14f, 8f, 14f)
            curveTo(11.3137f, 14f, 14f, 11.3137f, 14f, 8f)
            curveTo(14f, 4.6863f, 11.3137f, 2f, 8f, 2f)
            close()
            moveTo(8f, 3.20002f)
            curveTo(5.349f, 3.2f, 3.2f, 5.3491f, 3.2f, 8f)
            curveTo(3.2f, 10.651f, 5.349f, 12.8f, 8f, 12.8f)
            curveTo(10.651f, 12.8f, 12.8f, 10.651f, 12.8f, 8f)
            curveTo(12.8f, 5.3491f, 10.651f, 3.2f, 8f, 3.2f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF999999)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.4f, 5.60002f)
            curveTo(7.4f, 5.2687f, 7.6686f, 5f, 8f, 5f)
            curveTo(8.3314f, 5f, 8.6f, 5.2687f, 8.6f, 5.6f)
            curveTo(8.6f, 5.9314f, 8.3314f, 6.2f, 8f, 6.2f)
            curveTo(7.6686f, 6.2f, 7.4f, 5.9314f, 7.4f, 5.6f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF999999)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.4f, 7.40002f)
            curveTo(7.4f, 7.0686f, 7.6686f, 6.8f, 8f, 6.8f)
            curveTo(8.3314f, 6.8f, 8.6f, 7.0686f, 8.6f, 7.4f)
            verticalLineTo(10.4f)
            curveTo(8.6f, 10.7314f, 8.3314f, 11f, 8f, 11f)
            curveTo(7.6686f, 11f, 7.4f, 10.7314f, 7.4f, 10.4f)
            verticalLineTo(7.40002f)
            close()
        }
    }.build()
}
