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
private fun ColonPreview() {
    Icon(Icons.Fill.Colon, TrendyolIconSize.XSmall)
}

val Icons.Fill.Colon: ImageVector by lazy {
    ImageVector.Builder(
        name = "Colon",
        defaultWidth = 2.dp,
        defaultHeight = 6.dp,
        viewportWidth = 2f,
        viewportHeight = 6f,
    ).apply {
        path(
            fill = SolidColor(Color(0xFFFFFFFF)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(1f, 0f)
            horizontalLineTo(1f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 1f)
            verticalLineTo(1f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 2f)
            horizontalLineTo(1f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1f)
            verticalLineTo(1f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 0f)
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
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(1f, 4f)
            horizontalLineTo(1f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 5f)
            verticalLineTo(5f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 6f)
            horizontalLineTo(1f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5f)
            verticalLineTo(5f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 4f)
            close()
        }
    }.build()
}
