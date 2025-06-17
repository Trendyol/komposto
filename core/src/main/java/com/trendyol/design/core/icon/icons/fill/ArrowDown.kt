package com.trendyol.design.core.icon.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons

@Preview
@Composable
private fun ArrowDownPreview() {
    KPIcon(imageVector = KPIcons.Fill.ArrowDown, size = KPIconSize.XXXLarge)
}

public val KPIcons.Fill.ArrowDown: ImageVector by lazy {
    ImageVector.Builder(
        name = "ArrowDown",
        defaultWidth = 12.dp,
        defaultHeight = 6.dp,
        viewportWidth = 12f,
        viewportHeight = 6f
    ).apply {
        path(
            fill = SolidColor(Color(0xFF999999)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            lineTo(6f, 6f)
            lineTo(12f, 0f)
            horizontalLineTo(0f)
            close()
        }
    }.build()
}
