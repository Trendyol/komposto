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
private fun StarPreview() {
    Icon(imageVector = Icons.Fill.Star, size = TrendyolIconSize.Medium)
}

public val Icons.Fill.Star: ImageVector by lazy {
    ImageVector.Builder(
        name = "Star",
        defaultWidth = 10.dp,
        defaultHeight = 10.dp,
        viewportWidth = 10f,
        viewportHeight = 10f
    ).apply {
        path(
            fill = SolidColor(Color(0xFFFFC000)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5f, 8.02469f)
            lineTo(1.90141f, 10f)
            lineTo(2.723f, 6.2963f)
            lineTo(0f, 3.80247f)
            lineTo(3.59155f, 3.48148f)
            lineTo(5f, 0f)
            lineTo(6.40845f, 3.48148f)
            lineTo(10f, 3.80247f)
            lineTo(7.277f, 6.2963f)
            lineTo(8.09859f, 10f)
            lineTo(5f, 8.02469f)
            close()
        }
    }.build()
}
