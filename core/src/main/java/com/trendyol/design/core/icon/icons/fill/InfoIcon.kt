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
private fun InfoIconPreview() {
    KPIcon(imageVector = KPIcons.Fill.InfoIcon, size = KPIconSize.XXXLarge)
}

public val KPIcons.Fill.InfoIcon: ImageVector by lazy {
    ImageVector.Builder(
        name = "Info Icon",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
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
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.0002f, 5.9999f)
            curveTo(9.5584f, 5.9999f, 9.2002f, 6.3581f, 9.2002f, 6.7999f)
            curveTo(9.2002f, 7.2417f, 9.5584f, 7.5999f, 10.0002f, 7.5999f)
            curveTo(10.442f, 7.5999f, 10.8002f, 7.2417f, 10.8002f, 6.7999f)
            curveTo(10.8002f, 6.3581f, 10.442f, 5.9999f, 10.0002f, 5.9999f)
            close()
            moveTo(10.0002f, 8.3999f)
            curveTo(9.5584f, 8.3999f, 9.2002f, 8.7581f, 9.2002f, 9.1999f)
            verticalLineTo(13.1999f)
            curveTo(9.2002f, 13.6417f, 9.5584f, 13.9999f, 10.0002f, 13.9999f)
            curveTo(10.442f, 13.9999f, 10.8002f, 13.6417f, 10.8002f, 13.1999f)
            verticalLineTo(9.1999f)
            curveTo(10.8002f, 8.7581f, 10.442f, 8.3999f, 10.0002f, 8.3999f)
            close()
        }
    }.build()
}
