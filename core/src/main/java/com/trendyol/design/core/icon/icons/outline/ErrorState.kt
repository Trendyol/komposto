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
private fun ErrorStatePreview() {
    Icon(imageVector = Icons.Outline.ErrorState, size = TrendyolIconSize.XXLarge)
}

private var _ErrorState: ImageVector? = null

public val Icons.Outline.ErrorState: ImageVector
    get() {
        if (_ErrorState != null) {
            return _ErrorState!!
        }
        _ErrorState = ImageVector.Builder(
            name = "ErrorState",
            defaultWidth = 64.dp,
            defaultHeight = 64.dp,
            viewportWidth = 64f,
            viewportHeight = 64f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFFBB0000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(32f, 62f)
                curveTo(48.5685f, 62f, 62f, 48.5685f, 62f, 32f)
                curveTo(62f, 15.4315f, 48.5685f, 2f, 32f, 2f)
                curveTo(15.4315f, 2f, 2f, 15.4315f, 2f, 32f)
                curveTo(2f, 48.5685f, 15.4315f, 62f, 32f, 62f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBB0000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(39.4353f, 23.0776f)
                lineTo(31.9998f, 30.5132f)
                lineTo(24.5643f, 23.0776f)
                curveTo(24.1531f, 22.6664f, 23.4886f, 22.6664f, 23.0774f, 23.0776f)
                curveTo(22.6663f, 23.4888f, 22.6663f, 24.1533f, 23.0774f, 24.5645f)
                lineTo(30.5129f, 32.0001f)
                lineTo(23.0774f, 39.4357f)
                curveTo(22.6663f, 39.8469f, 22.6663f, 40.5115f, 23.0774f, 40.9227f)
                curveTo(23.2825f, 41.1277f, 23.5517f, 41.2308f, 23.8209f, 41.2308f)
                curveTo(24.0901f, 41.2308f, 24.3592f, 41.1277f, 24.5643f, 40.9227f)
                lineTo(31.9998f, 33.487f)
                lineTo(39.4353f, 40.9227f)
                curveTo(39.6404f, 41.1277f, 39.9096f, 41.2308f, 40.1788f, 41.2308f)
                curveTo(40.448f, 41.2308f, 40.7172f, 41.1277f, 40.9222f, 40.9227f)
                curveTo(41.3334f, 40.5115f, 41.3334f, 39.8469f, 40.9222f, 39.4357f)
                lineTo(33.4867f, 32.0001f)
                lineTo(40.9222f, 24.5645f)
                curveTo(41.3334f, 24.1533f, 41.3334f, 23.4877f, 40.9222f, 23.0776f)
                curveTo(40.5111f, 22.6664f, 39.8465f, 22.6664f, 39.4353f, 23.0776f)
                close()
            }
        }.build()
        return _ErrorState!!
    }
