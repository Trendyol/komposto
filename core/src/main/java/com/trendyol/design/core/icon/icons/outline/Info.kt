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

private var _Info: ImageVector? = null

val Icons.Outline.Info: ImageVector
    get() {
        if (_Info != null) {
            return _Info!!
        }
        _Info = ImageVector.Builder(
            name = "Info",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
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
                moveTo(12f, 1.99854f)
                curveTo(6.4771f, 1.9985f, 2f, 6.4757f, 2f, 11.9985f)
                curveTo(2f, 17.5214f, 6.4771f, 21.9985f, 12f, 21.9985f)
                curveTo(17.5228f, 21.9985f, 22f, 17.5213f, 22f, 11.9985f)
                curveTo(22f, 6.4757f, 17.5228f, 1.9985f, 12f, 1.9985f)
                close()
                moveTo(12f, 3.99854f)
                curveTo(7.5817f, 3.9985f, 4f, 7.5803f, 4f, 11.9985f)
                curveTo(4f, 16.4168f, 7.5817f, 19.9985f, 12f, 19.9985f)
                curveTo(16.4183f, 19.9985f, 20f, 16.4168f, 20f, 11.9985f)
                curveTo(20f, 7.5803f, 16.4183f, 3.9985f, 12f, 3.9985f)
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
                moveTo(11f, 7.99854f)
                curveTo(11f, 7.4463f, 11.4477f, 6.9985f, 12f, 6.9985f)
                curveTo(12.5523f, 6.9985f, 13f, 7.4463f, 13f, 7.9985f)
                curveTo(13f, 8.5508f, 12.5523f, 8.9985f, 12f, 8.9985f)
                curveTo(11.4477f, 8.9985f, 11f, 8.5508f, 11f, 7.9985f)
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
                moveTo(11f, 10.9985f)
                curveTo(11f, 10.4463f, 11.4477f, 9.9985f, 12f, 9.9985f)
                curveTo(12.5523f, 9.9985f, 13f, 10.4463f, 13f, 10.9985f)
                verticalLineTo(15.9985f)
                curveTo(13f, 16.5508f, 12.5523f, 16.9985f, 12f, 16.9985f)
                curveTo(11.4477f, 16.9985f, 11f, 16.5508f, 11f, 15.9985f)
                verticalLineTo(10.9985f)
                close()
            }
        }.build()
        return _Info!!
    }

