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
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons

@Preview
@Composable
private fun SuccessDialogPreview() {
    KPIcon(imageVector = KPIcons.Outline.SuccessState, size = KPIconSize.XXXLarge)
}

public val KPIcons.Outline.SuccessState: ImageVector by lazy {
    ImageVector.Builder(
        name = "SuccessState",
        defaultWidth = 64.dp,
        defaultHeight = 64.dp,
        viewportWidth = 64f,
        viewportHeight = 64f
    ).apply {
        path(
            fill = SolidColor(Color(0xFFFFFFFF)),
            fillAlpha = 1.0f,
            stroke = SolidColor(Color(0xFF0BC15C)),
            strokeAlpha = 1.0f,
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(32f, 32f)
            moveToRelative(-30f, 0f)
            arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, 60f, 0f)
            arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, -60f, 0f)
        }
        path(
            fill = SolidColor(Color(0xFF0BC15C)),
            fillAlpha = 1.0f,
            stroke = SolidColor(Color(0xFF0BC15C)),
            strokeAlpha = 1.0f,
            strokeLineWidth = 0.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(41.809f, 24.867f)
            curveTo(41.503f, 24.542f, 41.007f, 24.542f, 40.701f, 24.867f)
            lineTo(28.003f, 38.352f)
            lineTo(23.009f, 33.048f)
            curveTo(22.703f, 32.723f, 22.207f, 32.723f, 21.901f, 33.048f)
            curveTo(21.595f, 33.373f, 21.595f, 33.9f, 21.901f, 34.224f)
            lineTo(27.45f, 40.117f)
            curveTo(27.755f, 40.442f, 28.252f, 40.442f, 28.557f, 40.117f)
            lineTo(41.809f, 26.043f)
            curveTo(42.115f, 25.718f, 42.115f, 25.191f, 41.809f, 24.867f)
            close()
        }
    }.build()
}
