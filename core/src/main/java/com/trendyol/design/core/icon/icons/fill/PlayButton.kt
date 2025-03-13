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
    KPIcon(KPIcons.Fill.PlayButton, KPIconSize.XXXLarge)
}

public val KPIcons.Fill.PlayButton: ImageVector
    by lazy {
        Builder(
            name = "PlayButton", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                strokeLineWidth = 1.62637f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(0.8132f, 16.0f)
                curveTo(0.8132f, 7.6267f, 7.6267f, 0.8132f, 16.0f, 0.8132f)
                curveTo(24.3737f, 0.8132f, 31.1868f, 7.6267f, 31.1868f, 16.0f)
                curveTo(31.1868f, 24.3733f, 24.3737f, 31.1868f, 16.0f, 31.1868f)
                curveTo(7.6267f, 31.1868f, 0.8132f, 24.3733f, 0.8132f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(23.1151f, 16.6926f)
                lineTo(12.5404f, 24.3726f)
                curveTo(12.3936f, 24.4793f, 12.2202f, 24.5335f, 12.0459f, 24.5335f)
                curveTo(11.914f, 24.5335f, 11.782f, 24.5023f, 11.6602f, 24.4396f)
                curveTo(11.3776f, 24.2937f, 11.2f, 24.0001f, 11.2f, 23.6801f)
                verticalLineTo(8.3201f)
                curveTo(11.2f, 8.0001f, 11.3776f, 7.7066f, 11.6602f, 7.5606f)
                curveTo(11.9423f, 7.4151f, 12.2824f, 7.4399f, 12.54f, 7.6276f)
                lineTo(23.1147f, 15.3076f)
                curveTo(23.3355f, 15.4681f, 23.4666f, 15.7258f, 23.4666f, 16.0001f)
                curveTo(23.4666f, 16.2745f, 23.3355f, 16.5322f, 23.1151f, 16.6926f)
                close()
            }
        }.build()
    }
