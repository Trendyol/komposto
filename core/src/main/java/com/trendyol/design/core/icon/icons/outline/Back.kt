package com.trendyol.design.core.icon.icons.outline

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
private fun BackPreview() {
    Icon(imageVector = Icons.Outline.Back, size = TrendyolIconSize.XLarge)
}

private var _Back: ImageVector? = null

public val Icons.Outline.Back: ImageVector
    get() {
        if (_Back != null) {
            return _Back!!
        }
        _Back = ImageVector.Builder(
            name = "Back",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
            autoMirror = true,
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
                moveTo(9.3248f, 14.4f)
                lineTo(18.2624f, 5.46235f)
                lineTo(16f, 3.19995f)
                lineTo(3.2f, 16f)
                lineTo(16f, 28.8f)
                lineTo(18.2624f, 26.5376f)
                lineTo(9.3248f, 17.6f)
                horizontalLineTo(28.8f)
                verticalLineTo(14.4f)
                horizontalLineTo(9.3248f)
                close()
            }
        }.build()
        return _Back!!
    }
