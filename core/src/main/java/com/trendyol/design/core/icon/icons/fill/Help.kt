package com.trendyol.design.core.icon.icons.fill

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
private fun HelpPreview() {
    Icon(imageVector = Icons.Fill.Help, size = TrendyolIconSize.Medium)
}

private var _Help: ImageVector? = null

public val Icons.Fill.Help: ImageVector
    get() {
        if (_Help != null) {
            return _Help!!
        }
        _Help = ImageVector.Builder(
            name = "Help",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF666666)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(28.8f, 16f)
                arcTo(12.8f, 12.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 28.8f)
                arcTo(
                    12.8f,
                    12.8f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    3.1999999999999993f,
                    16f
                )
                arcTo(12.8f, 12.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28.8f, 16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.24f, 16.1994f)
                lineTo(19.1564f, 15.3017f)
                curveTo(19.6655f, 14.7033f, 20.0728f, 13.9053f, 20.0728f, 13.0077f)
                curveTo(20.0728f, 10.8134f, 18.24f, 9.0181f, 16f, 9.0181f)
                curveTo(13.76f, 9.0181f, 11.9273f, 10.8134f, 11.9273f, 13.0077f)
                horizontalLineTo(13.9637f)
                curveTo(13.9637f, 11.9105f, 14.88f, 11.0129f, 16f, 11.0129f)
                curveTo(17.12f, 11.0129f, 18.0364f, 11.9105f, 18.0364f, 13.0077f)
                curveTo(18.0364f, 13.6061f, 17.8328f, 14.1048f, 17.4255f, 14.404f)
                lineTo(16.2037f, 15.7007f)
                curveTo(15.3891f, 16.3988f, 14.9819f, 17.3962f, 14.9819f, 18.4934f)
                verticalLineTo(18.9921f)
                horizontalLineTo(17.0182f)
                curveTo(17.0182f, 17.496f, 17.4255f, 16.8976f, 18.24f, 16.1994f)
                close()
                moveTo(14.9819f, 20.9869f)
                verticalLineTo(22.9817f)
                horizontalLineTo(17.0182f)
                verticalLineTo(20.9869f)
                horizontalLineTo(14.9819f)
                close()
            }
        }.build()
        return _Help!!
    }
