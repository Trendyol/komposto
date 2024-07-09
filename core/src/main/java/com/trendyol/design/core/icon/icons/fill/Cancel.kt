package com.trendyol.design.core.icon.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
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
    Icon(imageVector = Icons.Fill.Cancel, size = TrendyolIconSize.Medium)
}

private var _Cancel: ImageVector? = null

public val Icons.Fill.Cancel: ImageVector
    get() {
        if (_Cancel != null) {
            return _Cancel!!
        }
        _Cancel = ImageVector.Builder(
            name = "Cancel",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF333333)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(14f, 3.2f)
                    lineTo(12.8f, 2f)
                    lineTo(8f, 6.8f)
                    lineTo(3.2f, 2f)
                    lineTo(2f, 3.2f)
                    lineTo(6.8f, 8f)
                    lineTo(2f, 12.8f)
                    lineTo(3.2f, 14f)
                    lineTo(8f, 9.2f)
                    lineTo(12.8f, 14f)
                    lineTo(14f, 12.8f)
                    lineTo(9.2f, 8f)
                    lineTo(14f, 3.2f)
                    close()
                }
            }
        }.build()
        return _Cancel!!
    }
