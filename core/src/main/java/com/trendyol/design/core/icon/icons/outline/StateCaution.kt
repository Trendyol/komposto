package com.trendyol.design.core.icon.icons.outline

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
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons

@Preview
@Composable
private fun StateCautionPreview() {
    KPIcon(imageVector = KPIcons.Outline.StateCaution, size = KPIconSize.XXXLarge)
}

public val KPIcons.Outline.StateCaution: ImageVector by lazy {
    ImageVector.Builder(
        name = "Statecaution",
        defaultWidth = 56.dp,
        defaultHeight = 56.dp,
        viewportWidth = 56f,
        viewportHeight = 56f
    ).apply {
        path(
            fill = SolidColor(Color(0xFFFFFFFF)),
            fillAlpha = 1.0f,
            stroke = SolidColor(Color(0xFF666666)),
            strokeAlpha = 1.0f,
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(52f, 28f)
            arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 52f)
            arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 28f)
            arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52f, 28f)
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
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(27.9999f, 42.4f)
            curveTo(26.5088f, 42.4f, 25.3f, 41.1217f, 25.3f, 39.5449f)
            curveTo(25.3f, 37.968f, 26.5088f, 36.6897f, 27.9999f, 36.6897f)
            curveTo(29.491f, 36.6897f, 30.6998f, 37.968f, 30.6998f, 39.5449f)
            curveTo(30.6998f, 41.1217f, 29.491f, 42.4f, 27.9999f, 42.4f)
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
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(27.9999f, 14.8f)
            curveTo(26.0133f, 14.8f, 24.3999f, 16.5063f, 24.3999f, 18.6071f)
            curveTo(24.3999f, 19.8942f, 25.1947f, 29.0724f, 26.2898f, 32.6921f)
            curveTo(26.5355f, 33.5053f, 26.8303f, 34.0803f, 27.0965f, 34.3636f)
            curveTo(27.3865f, 34.6719f, 27.7024f, 34.7861f, 27.9999f, 34.7861f)
            curveTo(28.2974f, 34.7861f, 28.6133f, 34.6719f, 28.9033f, 34.3636f)
            curveTo(29.1695f, 34.0803f, 29.4643f, 33.5053f, 29.71f, 32.6921f)
            curveTo(30.8051f, 29.0724f, 31.5999f, 19.8942f, 31.5999f, 18.6071f)
            curveTo(31.5999f, 16.5063f, 29.9865f, 14.8f, 27.9999f, 14.8f)
            close()
        }
    }.build()
}

private var _StateCaution: ImageVector? = null

@Deprecated(
    message = "Use KPIcons.Outline.StateCaution instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPIcons.Outline.StateCaution"
    ),
    level = DeprecationLevel.WARNING
)
public val Icons.Outline.StateCaution: ImageVector
    get() {
        if (_StateCaution != null) {
            return _StateCaution!!
        }
        _StateCaution = ImageVector.Builder(
            name = "Statecaution",
            defaultWidth = 56.dp,
            defaultHeight = 56.dp,
            viewportWidth = 56f,
            viewportHeight = 56f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF666666)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(52f, 28f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 52f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 28f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52f, 28f)
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(27.9999f, 42.4f)
                curveTo(26.5088f, 42.4f, 25.3f, 41.1217f, 25.3f, 39.5449f)
                curveTo(25.3f, 37.968f, 26.5088f, 36.6897f, 27.9999f, 36.6897f)
                curveTo(29.491f, 36.6897f, 30.6998f, 37.968f, 30.6998f, 39.5449f)
                curveTo(30.6998f, 41.1217f, 29.491f, 42.4f, 27.9999f, 42.4f)
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(27.9999f, 14.8f)
                curveTo(26.0133f, 14.8f, 24.3999f, 16.5063f, 24.3999f, 18.6071f)
                curveTo(24.3999f, 19.8942f, 25.1947f, 29.0724f, 26.2898f, 32.6921f)
                curveTo(26.5355f, 33.5053f, 26.8303f, 34.0803f, 27.0965f, 34.3636f)
                curveTo(27.3865f, 34.6719f, 27.7024f, 34.7861f, 27.9999f, 34.7861f)
                curveTo(28.2974f, 34.7861f, 28.6133f, 34.6719f, 28.9033f, 34.3636f)
                curveTo(29.1695f, 34.0803f, 29.4643f, 33.5053f, 29.71f, 32.6921f)
                curveTo(30.8051f, 29.0724f, 31.5999f, 19.8942f, 31.5999f, 18.6071f)
                curveTo(31.5999f, 16.5063f, 29.9865f, 14.8f, 27.9999f, 14.8f)
                close()
            }
        }.build()
        return _StateCaution!!
    }
