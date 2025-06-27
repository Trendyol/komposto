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
private fun CircleIconPreview() {
    KPIcon(imageVector = KPIcons.Fill.CircleIcon, size = KPIconSize.XXXLarge)
}

public val KPIcons.Fill.CircleIcon: ImageVector by lazy {
    ImageVector.Builder(
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
}
