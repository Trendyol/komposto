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
private fun CancelPreview() {
    Icon(imageVector = Icons.Fill.Cancel, size = TrendyolIconSize.XXSmall)
}

private var _Cancel: ImageVector? = null

public val Icons.Fill.Cancel: ImageVector
    get() {
        if (_Cancel != null) {
            return _Cancel!!
        }
        _Cancel = ImageVector.Builder(
            name = "Cancel",
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
                moveTo(29.3334f, 5.33332f)
                lineTo(26.6667f, 2.66666f)
                lineTo(16f, 13.3333f)
                lineTo(5.33335f, 2.66666f)
                lineTo(2.66669f, 5.33332f)
                lineTo(13.3334f, 16f)
                lineTo(2.66669f, 26.6667f)
                lineTo(5.33335f, 29.3333f)
                lineTo(16f, 18.6667f)
                lineTo(26.6667f, 29.3333f)
                lineTo(29.3334f, 26.6667f)
                lineTo(18.6667f, 16f)
                lineTo(29.3334f, 5.33332f)
                close()
            }
        }.build()
        return _Cancel!!
    }
