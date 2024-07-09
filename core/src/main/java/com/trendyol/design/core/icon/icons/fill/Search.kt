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
private fun SearchPreview() {
    Icon(imageVector = Icons.Fill.Search, size = TrendyolIconSize.Medium)
}

private var _Search: ImageVector? = null

public val Icons.Fill.Search: ImageVector
    get() {
        if (_Search != null) {
            return _Search!!
        }
        _Search = ImageVector.Builder(
            name = "Search",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFFF27A1A)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(12.8095f, 12.1429f)
                    horizontalLineTo(13.5715f)
                    lineTo(18.3334f, 16.9048f)
                    lineTo(16.9048f, 18.3334f)
                    lineTo(12.1429f, 13.5714f)
                    verticalLineTo(12.8095f)
                    lineTo(11.8572f, 12.5238f)
                    curveTo(10.8095f, 13.4762f, 9.381f, 14.0476f, 7.8572f, 14.0476f)
                    curveTo(4.4286f, 14.0476f, 1.6667f, 11.2857f, 1.6667f, 7.8572f)
                    curveTo(1.6667f, 4.4286f, 4.4286f, 1.6667f, 7.8572f, 1.6667f)
                    curveTo(11.2857f, 1.6667f, 14.0476f, 4.4286f, 14.0477f, 7.8572f)
                    curveTo(14.0477f, 9.381f, 13.4762f, 10.8095f, 12.5239f, 11.8572f)
                    lineTo(12.8095f, 12.1429f)
                    close()
                    moveTo(3.57146f, 7.85718f)
                    curveTo(3.5715f, 10.2381f, 5.4762f, 12.1429f, 7.8572f, 12.1429f)
                    curveTo(10.2381f, 12.1429f, 12.1429f, 10.2381f, 12.1429f, 7.8572f)
                    curveTo(12.1429f, 5.4762f, 10.2381f, 3.5715f, 7.8572f, 3.5715f)
                    curveTo(5.4762f, 3.5715f, 3.5715f, 5.4762f, 3.5715f, 7.8572f)
                    close()
                }
            }
        }.build()
        return _Search!!
    }
