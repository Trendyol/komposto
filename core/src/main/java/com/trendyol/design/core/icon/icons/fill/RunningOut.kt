package com.trendyol.design.core.icon.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize

@Preview
@Composable
private fun RunningOutVectorPreview() {
    Icon(imageVector = Icons.Fill.RunningOut, size = TrendyolIconSize.Large)
}

public val Icons.Fill.RunningOut: ImageVector by lazy {
    ImageVector.Builder(
        name = "RunningOut", defaultWidth = 12.0.dp, defaultHeight = 12.0.dp,
        viewportWidth = 12.0f, viewportHeight = 12.0f
    ).apply {
        path(
            fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
            pathFillType = EvenOdd
        ) {
            moveTo(11.0f, 6.0f)
            curveTo(11.0f, 7.8985f, 9.461f, 9.4375f, 7.5625f, 9.4375f)
            curveTo(5.664f, 9.4375f, 4.125f, 7.8985f, 4.125f, 6.0f)
            curveTo(4.125f, 4.1015f, 5.664f, 2.5625f, 7.5625f, 2.5625f)
            curveTo(9.461f, 2.5625f, 11.0f, 4.1015f, 11.0f, 6.0f)
            close()
            moveTo(7.875f, 3.8125f)
            curveTo(7.875f, 3.6399f, 7.7351f, 3.5f, 7.5625f, 3.5f)
            curveTo(7.3899f, 3.5f, 7.25f, 3.6399f, 7.25f, 3.8125f)
            verticalLineTo(6.0f)
            curveTo(7.25f, 6.0949f, 7.2931f, 6.1847f, 7.3673f, 6.244f)
            lineTo(8.9298f, 7.494f)
            curveTo(9.0646f, 7.6018f, 9.2612f, 7.58f, 9.369f, 7.4452f)
            curveTo(9.4768f, 7.3105f, 9.455f, 7.1138f, 9.3202f, 7.006f)
            lineTo(7.875f, 5.8498f)
            verticalLineTo(3.8125f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
            pathFillType = NonZero
        ) {
            moveTo(3.9576f, 4.125f)
            horizontalLineTo(1.9375f)
            curveTo(1.7649f, 4.125f, 1.625f, 4.2649f, 1.625f, 4.4375f)
            curveTo(1.625f, 4.6101f, 1.7649f, 4.75f, 1.9375f, 4.75f)
            horizontalLineTo(3.6959f)
            curveTo(3.766f, 4.5331f, 3.8538f, 4.3242f, 3.9576f, 4.125f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
            pathFillType = NonZero
        ) {
            moveTo(3.5118f, 5.6875f)
            horizontalLineTo(1.3125f)
            curveTo(1.1399f, 5.6875f, 1.0f, 5.8274f, 1.0f, 6.0f)
            curveTo(1.0f, 6.1726f, 1.1399f, 6.3125f, 1.3125f, 6.3125f)
            horizontalLineTo(3.5118f)
            curveTo(3.504f, 6.2094f, 3.5f, 6.1052f, 3.5f, 6.0f)
            curveTo(3.5f, 5.8948f, 3.504f, 5.7906f, 3.5118f, 5.6875f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
            pathFillType = NonZero
        ) {
            moveTo(1.9375f, 7.25f)
            horizontalLineTo(3.6959f)
            curveTo(3.766f, 7.4669f, 3.8538f, 7.6758f, 3.9576f, 7.875f)
            horizontalLineTo(1.9375f)
            curveTo(1.7649f, 7.875f, 1.625f, 7.7351f, 1.625f, 7.5625f)
            curveTo(1.625f, 7.3899f, 1.7649f, 7.25f, 1.9375f, 7.25f)
            close()
        }
    }.build()
}
