package com.trendyol.design.core.icon.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
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


@Preview
@Composable
private fun WarningInfoStateDefaultIconPreview() {
    Image(WarningInfoStateDefaultIcon, null)
}

private var _WarningInfoStateDefaultIcon: ImageVector? = null

public val WarningInfoStateDefaultIcon: ImageVector
    get() {
        if (_WarningInfoStateDefaultIcon != null) {
            return _WarningInfoStateDefaultIcon!!
        }
        _WarningInfoStateDefaultIcon = ImageVector.Builder(
            name = "Icon",
            defaultWidth = 104.dp,
            defaultHeight = 104.dp,
            viewportWidth = 104f,
            viewportHeight = 104f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFFFFFFFF)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(100f, 52f)
                    arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52f, 100f)
                    arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 52f)
                    arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100f, 52f)
                    close()
                }
            }
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
                moveTo(51.9517f, 26f)
                curveTo(60.6509f, 26f, 67.7017f, 33.0377f, 67.7017f, 41.7191f)
                curveTo(67.7017f, 50.401f, 51.9517f, 78f, 51.9517f, 78f)
                curveTo(51.9517f, 78f, 36.2017f, 50.401f, 36.2017f, 41.7191f)
                curveTo(36.2017f, 33.0377f, 43.2535f, 26f, 51.9517f, 26f)
                close()
                moveTo(51.9489f, 32.3685f)
                curveTo(46.7743f, 32.3685f, 42.5802f, 36.555f, 42.5802f, 41.7191f)
                curveTo(42.5802f, 46.8848f, 46.7743f, 51.0703f, 51.9489f, 51.0697f)
                curveTo(57.1235f, 51.0697f, 61.3187f, 46.8848f, 61.3187f, 41.7191f)
                curveTo(61.3187f, 36.555f, 57.1241f, 32.3685f, 51.9489f, 32.3685f)
                close()
            }
        }.build()
        return _WarningInfoStateDefaultIcon!!
    }

