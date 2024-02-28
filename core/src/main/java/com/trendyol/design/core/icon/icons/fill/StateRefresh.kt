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
private fun StateRefreshPreview() {
    Icon(imageVector = Icons.Fill.StateRefresh, size = TrendyolIconSize.XXLarge)
}

private var _StateRefresh: ImageVector? = null

public val Icons.Fill.StateRefresh: ImageVector
    get() {
        if (_StateRefresh != null) {
            return _StateRefresh!!
        }
        _StateRefresh = ImageVector.Builder(
            name = "Refresh",
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
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(40.619f, 33.9578f)
                curveTo(41.1697f, 31.2017f, 40.3923f, 28.2511f, 38.2869f, 26.1435f)
                curveTo(35.89f, 23.7441f, 32.3595f, 23.0632f, 29.3472f, 24.1008f)
                curveTo(28.7318f, 24.3277f, 28.0192f, 24.1656f, 27.5657f, 23.7117f)
                curveTo(26.6912f, 22.8362f, 27.0151f, 21.3447f, 28.1811f, 20.9232f)
                curveTo(32.3919f, 19.4317f, 37.3152f, 20.3396f, 40.7162f, 23.7441f)
                curveTo(43.5666f, 26.565f, 44.6678f, 30.4884f, 44.0848f, 34.1523f)
                lineTo(44.7326f, 33.5038f)
                curveTo(45.3804f, 32.8553f, 46.4817f, 32.8553f, 47.1295f, 33.5038f)
                curveTo(47.7773f, 34.1523f, 47.7773f, 35.2547f, 47.1295f, 35.9032f)
                lineTo(43.6637f, 39.3726f)
                curveTo(43.0159f, 40.0211f, 41.9147f, 40.0211f, 41.2668f, 39.3726f)
                lineTo(37.7687f, 35.9032f)
                curveTo(37.1209f, 35.2547f, 37.1209f, 34.1523f, 37.7687f, 33.5038f)
                curveTo(38.4165f, 32.8553f, 39.5178f, 32.8553f, 40.1656f, 33.5038f)
                lineTo(40.619f, 33.9578f)
                close()
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
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(36.9282f, 40.7344f)
                curveTo(37.8027f, 41.6099f, 37.4788f, 43.1014f, 36.3128f, 43.5229f)
                curveTo(32.0696f, 45.0469f, 27.1463f, 44.1066f, 23.7453f, 40.7344f)
                curveTo(20.8949f, 37.9135f, 19.7937f, 33.9902f, 20.3767f, 30.3262f)
                lineTo(19.7289f, 30.9747f)
                curveTo(19.0811f, 31.6232f, 17.9798f, 31.6232f, 17.332f, 30.9747f)
                curveTo(16.6842f, 30.3262f, 16.6842f, 29.2238f, 17.332f, 28.5753f)
                lineTo(20.7978f, 25.1059f)
                curveTo(21.4456f, 24.4574f, 22.5468f, 24.4574f, 23.1946f, 25.1059f)
                lineTo(26.6928f, 28.5753f)
                curveTo(27.3406f, 29.2238f, 27.3406f, 30.3262f, 26.6928f, 30.9747f)
                curveTo(26.045f, 31.6232f, 24.9437f, 31.6232f, 24.2959f, 30.9747f)
                lineTo(23.8425f, 30.5208f)
                curveTo(23.2918f, 33.2768f, 24.0692f, 36.2275f, 26.1746f, 38.335f)
                curveTo(28.6038f, 40.7344f, 32.102f, 41.4153f, 35.1467f, 40.3453f)
                curveTo(35.7621f, 40.1184f, 36.4423f, 40.2805f, 36.9282f, 40.7344f)
                close()
            }
        }.build()
        return _StateRefresh!!
    }

