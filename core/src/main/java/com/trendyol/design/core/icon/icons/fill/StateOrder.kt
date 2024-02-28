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
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize


@Preview
@Composable
private fun StateOrderPreview() {
    Icon(imageVector = Icons.Fill.StateOrder, size = TrendyolIconSize.XXLarge)
}

private var _StateOrder: ImageVector? = null

public val Icons.Fill.StateOrder: ImageVector
    get() {
        if (_StateOrder != null) {
            return _StateOrder!!
        }
        _StateOrder = ImageVector.Builder(
            name = "Stateorder",
            defaultWidth = 64.dp,
            defaultHeight = 64.dp,
            viewportWidth = 64f,
            viewportHeight = 64f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFFF5F5F5)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(62f, 32f)
                    arcTo(30f, 30f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 62f)
                    arcTo(30f, 30f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 32f)
                    arcTo(30f, 30f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62f, 32f)
                    close()
                }
            }
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
                moveTo(31.9998f, 18.9463f)
                lineTo(19.9768f, 23.8607f)
                lineTo(31.9998f, 28.7751f)
                lineTo(44.0229f, 23.8607f)
                lineTo(31.9998f, 18.9463f)
                close()
                moveTo(19.0981f, 24.9322f)
                verticalLineTo(40.0463f)
                lineTo(31.3383f, 45.0535f)
                verticalLineTo(29.9394f)
                lineTo(19.0981f, 24.9322f)
                close()
                moveTo(32.6615f, 29.9394f)
                lineTo(44.9017f, 24.9322f)
                verticalLineTo(40.0463f)
                lineTo(32.6615f, 45.0535f)
                verticalLineTo(29.9394f)
                close()
            }
        }.build()
        return _StateOrder!!
    }

