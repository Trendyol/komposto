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
private fun VectorPreview() {
    Icon(Icons.Fill.Tick, TrendyolIconSize.XSmall)
}

private var _Tick: ImageVector? = null

val Icons.Fill.Tick: ImageVector
    get() {
        if (_Tick != null) {
            return _Tick!!
        }
        _Tick = ImageVector.Builder(
            name = "Tick",
            defaultWidth = 20.dp,
            defaultHeight = 21.dp,
            viewportWidth = 20f,
            viewportHeight = 21f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF27A1A)),
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFFF27A1A)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 0.5f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(17.8198f, 4.68579f)
                curveTo(17.5795f, 4.4381f, 17.1898f, 4.4381f, 16.9495f, 4.6858f)
                lineTo(6.97413f, 14.9686f)
                lineTo(3.05052f, 10.924f)
                curveTo(2.8102f, 10.6763f, 2.4206f, 10.6763f, 2.1802f, 10.924f)
                curveTo(1.9399f, 11.1717f, 1.9399f, 11.5734f, 2.1802f, 11.8211f)
                lineTo(6.53903f, 16.3143f)
                curveTo(6.7793f, 16.5619f, 7.169f, 16.5619f, 7.4093f, 16.3143f)
                lineTo(17.8198f, 5.58289f)
                curveTo(18.0601f, 5.3351f, 18.0601f, 4.9335f, 17.8198f, 4.6858f)
                close()
            }
        }.build()
        return _Tick!!
    }

