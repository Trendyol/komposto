package com.trendyol.design.core.icon.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons

@Preview
@Composable
private fun StatePinPreview() {
    KPIcon(imageVector = KPIcons.Fill.StatePin, size = KPIconSize.XXXLarge)
}

public val KPIcons.Fill.StatePin: ImageVector by lazy {
    ImageVector.Builder(
        name = "Statepin",
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
            moveTo(31.9698f, 15.75f)
            curveTo(37.4068f, 15.75f, 41.8135f, 20.1486f, 41.8135f, 25.5744f)
            curveTo(41.8135f, 31.0006f, 31.9698f, 48.25f, 31.9698f, 48.25f)
            curveTo(31.9698f, 48.25f, 22.126f, 31.0006f, 22.126f, 25.5744f)
            curveTo(22.126f, 20.1486f, 26.5334f, 15.75f, 31.9698f, 15.75f)
            close()
            moveTo(31.9682f, 19.7303f)
            curveTo(28.734f, 19.7303f, 26.1127f, 22.3469f, 26.1127f, 25.5744f)
            curveTo(26.1127f, 28.803f, 28.734f, 31.4189f, 31.9682f, 31.4186f)
            curveTo(35.2023f, 31.4186f, 37.8243f, 28.803f, 37.8243f, 25.5744f)
            curveTo(37.8243f, 22.3469f, 35.2026f, 19.7303f, 31.9682f, 19.7303f)
            close()
        }
    }.build()
}
