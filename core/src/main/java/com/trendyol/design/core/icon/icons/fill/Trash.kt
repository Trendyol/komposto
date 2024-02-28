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
private fun TrashPreview() {
    Icon(imageVector = Icons.Fill.Trash, size = TrendyolIconSize.Small)
}

private var _Trash: ImageVector? = null

public val Icons.Fill.Trash: ImageVector
    get() {
        if (_Trash != null) {
            return _Trash!!
        }
        _Trash = ImageVector.Builder(
            name = "Trash",
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.1555f, 4.14811f)
                horizontalLineTo(26.3407f)
                verticalLineTo(7.11107f)
                horizontalLineTo(5.59999f)
                verticalLineTo(4.14811f)
                horizontalLineTo(10.7852f)
                lineTo(12.2667f, 2.66663f)
                horizontalLineTo(19.6741f)
                lineTo(21.1555f, 4.14811f)
                close()
                moveTo(10.0444f, 29.3333f)
                curveTo(8.4148f, 29.3333f, 7.0815f, 28f, 7.0815f, 26.3703f)
                verticalLineTo(8.59255f)
                horizontalLineTo(24.8593f)
                verticalLineTo(26.3703f)
                curveTo(24.8593f, 28f, 23.5259f, 29.3333f, 21.8963f, 29.3333f)
                horizontalLineTo(10.0444f)
                close()
            }
        }.build()
        return _Trash!!
    }

