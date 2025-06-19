package com.trendyol.design.core.icon.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons

@Preview
@Composable
private fun BasketPreview() {
    KPIcon(imageVector = KPIcons.Fill.Basket, size = KPIconSize.XXXLarge)
}

public val KPIcons.Fill.Basket: ImageVector by lazy {
    ImageVector.Builder(
        name = "Basket",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        group {
            path(
                fill = SolidColor(Color(0xFF666666)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.4f, 2f)
                curveTo(2.1791f, 2f, 2f, 2.1791f, 2f, 2.4f)
                curveTo(2f, 2.6209f, 2.1791f, 2.8f, 2.4f, 2.8f)
                horizontalLineTo(2.8f)
                lineTo(4.24f, 5.836f)
                lineTo(3.7f, 6.816f)
                curveTo(3.636f, 6.928f, 3.6f, 7.06f, 3.6f, 7.2f)
                curveTo(3.6f, 7.64f, 3.96f, 8f, 4.4f, 8f)
                horizontalLineTo(8.8f)
                curveTo(9.0209f, 8f, 9.2f, 7.8209f, 9.2f, 7.6f)
                curveTo(9.2f, 7.3791f, 9.0209f, 7.2f, 8.8f, 7.2f)
                horizontalLineTo(4.568f)
                curveTo(4.512f, 7.2f, 4.468f, 7.156f, 4.468f, 7.1f)
                lineTo(4.48f, 7.052f)
                lineTo(4.84f, 6.4f)
                horizontalLineTo(7.82f)
                curveTo(8.12f, 6.4f, 8.384f, 6.236f, 8.52f, 5.988f)
                lineTo(9.952f, 3.392f)
                curveTo(9.984f, 3.336f, 10f, 3.268f, 10f, 3.2f)
                curveTo(10f, 2.98f, 9.82f, 2.8f, 9.6f, 2.8f)
                horizontalLineTo(3.684f)
                lineTo(3.308f, 2f)
                horizontalLineTo(2.4f)
                close()
                moveTo(4.39943f, 8.40048f)
                curveTo(3.9594f, 8.4005f, 3.6034f, 8.7605f, 3.6034f, 9.2005f)
                curveTo(3.6034f, 9.6405f, 3.9594f, 10.0005f, 4.3994f, 10.0005f)
                curveTo(4.8394f, 10.0005f, 5.1994f, 9.6405f, 5.1994f, 9.2005f)
                curveTo(5.1994f, 8.7605f, 4.8394f, 8.4005f, 4.3994f, 8.4005f)
                close()
                moveTo(7.6036f, 9.20048f)
                curveTo(7.6036f, 8.7605f, 7.9596f, 8.4005f, 8.3996f, 8.4005f)
                curveTo(8.8396f, 8.4005f, 9.1996f, 8.7605f, 9.1996f, 9.2005f)
                curveTo(9.1996f, 9.6405f, 8.8396f, 10.0005f, 8.3996f, 10.0005f)
                curveTo(7.9596f, 10.0005f, 7.6036f, 9.6405f, 7.6036f, 9.2005f)
                close()
            }
        }
    }.build()
}
