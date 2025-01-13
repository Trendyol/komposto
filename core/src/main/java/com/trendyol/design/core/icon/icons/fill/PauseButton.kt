package com.trendyol.design.core.icon.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons

@Preview
@Composable
private fun VectorPreview() {
    KPIcon(KPIcons.Fill.PauseButton, KPIconSize.XXXLarge)
}

public val KPIcons.Fill.PauseButton: ImageVector
    by lazy {
        Builder(
            name = "PauseButton", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
            viewportWidth = 32.0f, viewportHeight = 32.0f
        ).apply {
            path(
                fill = SolidColor(
                    Color(0xFF333333)
                ),
                stroke = null,
                fillAlpha = 0.3f,
                strokeAlpha = 0.3f,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 0.0f)
                curveTo(7.1776f, 0.0f, 0.0f, 7.1776f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8224f, 7.1776f, 32.0f, 16.0f, 32.0f)
                curveTo(24.8228f, 32.0f, 32.0f, 24.8224f, 32.0f, 16.0f)
                curveTo(32.0f, 7.1776f, 24.8228f, 0.0f, 16.0f, 0.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(0.5f, 16.0f)
                curveTo(0.5f, 7.4537f, 7.4537f, 0.5f, 16.0f, 0.5f)
                curveTo(24.5467f, 0.5f, 31.5f, 7.4537f, 31.5f, 16.0f)
                curveTo(31.5f, 24.5463f, 24.5467f, 31.5f, 16.0f, 31.5f)
                curveTo(7.4537f, 31.5f, 0.5f, 24.5463f, 0.5f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.7998f, 8.0f)
                lineTo(12.7998f, 8.0f)
                arcTo(2.1333f, 2.1333f, 0.0f, false, true, 14.9332f, 10.1333f)
                lineTo(14.9332f, 21.8667f)
                arcTo(2.1333f, 2.1333f, 0.0f, false, true, 12.7998f, 24.0f)
                lineTo(12.7998f, 24.0f)
                arcTo(2.1333f, 2.1333f, 0.0f, false, true, 10.6665f, 21.8667f)
                lineTo(10.6665f, 10.1333f)
                arcTo(2.1333f, 2.1333f, 0.0f, false, true, 12.7998f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.1992f, 8.0f)
                lineTo(19.1992f, 8.0f)
                arcTo(2.1333f, 2.1333f, 0.0f, false, true, 21.3326f, 10.1333f)
                lineTo(21.3326f, 21.8667f)
                arcTo(2.1333f, 2.1333f, 0.0f, false, true, 19.1992f, 24.0f)
                lineTo(19.1992f, 24.0f)
                arcTo(2.1333f, 2.1333f, 0.0f, false, true, 17.0659f, 21.8667f)
                lineTo(17.0659f, 10.1333f)
                arcTo(2.1333f, 2.1333f, 0.0f, false, true, 19.1992f, 8.0f)
                close()
            }
        }.build()
    }
