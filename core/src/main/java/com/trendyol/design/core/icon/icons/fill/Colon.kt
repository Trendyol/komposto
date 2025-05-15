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
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons

@Preview
@Composable
private fun ColonPreview() {
    KPIcon(KPIcons.Fill.Colon, KPIconSize.XXXLarge)
}

public val KPIcons.Fill.Colon: ImageVector by lazy {
    ImageVector.Builder(
        name = "Colon",
        defaultWidth = 8.dp,
        defaultHeight = 8.dp,
        viewportWidth = 8F,
        viewportHeight = 8F
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
            moveTo(4f, 1f)
            curveTo(3.4477f, 1f, 3f, 1.4477f, 3f, 2f)
            curveTo(3f, 2.5523f, 3.4477f, 3f, 4f, 3f)
            curveTo(4.5523f, 3f, 5f, 2.5523f, 5f, 2f)
            curveTo(5f, 1.4477f, 4.5523f, 1f, 4f, 1f)
            close()
            moveTo(4f, 5f)
            curveTo(3.4477f, 5f, 3f, 5.4477f, 3f, 6f)
            curveTo(3f, 6.5523f, 3.4477f, 7f, 4f, 7f)
            curveTo(4.5523f, 7f, 5f, 6.5523f, 5f, 6f)
            curveTo(5f, 5.4477f, 4.5523f, 5f, 4f, 5f)
            close()
        }
    }.build()
}

@Deprecated(
    message = "Use KPIcons.Fill.Colon instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPIcons.Fill.Colon"
    ),
    level = DeprecationLevel.WARNING
)
public val Icons.Fill.Colon: ImageVector by lazy {
    ImageVector.Builder(
        name = "Colon",
        defaultWidth = 8.dp,
        defaultHeight = 8.dp,
        viewportWidth = 8F,
        viewportHeight = 8F
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
            moveTo(4f, 1f)
            curveTo(3.4477f, 1f, 3f, 1.4477f, 3f, 2f)
            curveTo(3f, 2.5523f, 3.4477f, 3f, 4f, 3f)
            curveTo(4.5523f, 3f, 5f, 2.5523f, 5f, 2f)
            curveTo(5f, 1.4477f, 4.5523f, 1f, 4f, 1f)
            close()
            moveTo(4f, 5f)
            curveTo(3.4477f, 5f, 3f, 5.4477f, 3f, 6f)
            curveTo(3f, 6.5523f, 3.4477f, 7f, 4f, 7f)
            curveTo(4.5523f, 7f, 5f, 6.5523f, 5f, 6f)
            curveTo(5f, 5.4477f, 4.5523f, 5f, 4f, 5f)
            close()
        }
    }.build()
}
