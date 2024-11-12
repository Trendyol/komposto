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
private fun CircleIconPreview() {
    Icon(imageVector = Icons.Fill.CircleIcon, size = TrendyolIconSize.Medium)
}

private var _CircleIcon: ImageVector? = null

public val Icons.Fill.CircleIcon: ImageVector
    get() {
        if (_CircleIcon != null) {
            return _CircleIcon!!
        }
        _CircleIcon = ImageVector.Builder(
            name = "Infobg",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF27A1A)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(10f, 2f)
                curveTo(5.5817f, 2f, 2f, 5.5817f, 2f, 10f)
                curveTo(2f, 14.4183f, 5.5817f, 18f, 10f, 18f)
                curveTo(14.4183f, 18f, 18f, 14.4183f, 18f, 10f)
                curveTo(18f, 5.5817f, 14.4183f, 2f, 10f, 2f)
                close()
            }
        }.build()
        return _CircleIcon!!
    }
