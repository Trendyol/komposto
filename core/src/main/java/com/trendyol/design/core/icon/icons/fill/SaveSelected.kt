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
    KPIcon(KPIcons.Fill.SaveSelected, KPIconSize.XXXLarge)
}

public val KPIcons.Fill.SaveSelected: ImageVector
    by lazy {
        Builder(
            name = "Save Selected",
            defaultWidth = 20.0.dp,
            defaultHeight = 20.0.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f
        ).apply {
            path(
                fill = SolidColor(
                    Color(0xFFF27A1A)
                ),
                stroke = SolidColor(Color(0xFFF27A1A)),
                strokeLineWidth = 0.388889f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.1475f, 1.9998f)
                horizontalLineTo(12.8525f)
                curveTo(14.3085f, 1.9998f, 15.5f, 3.1883f, 15.5f, 4.6655f)
                verticalLineTo(17.462f)
                curveTo(15.5f, 17.666f, 15.3836f, 17.8512f, 15.2036f, 17.9403f)
                curveTo(15.1295f, 17.9797f, 15.0484f, 17.9975f, 14.9674f, 17.9975f)
                curveTo(14.851f, 17.9975f, 14.7422f, 17.962f, 14.6466f, 17.8906f)
                lineTo(10.0f, 14.3363f)
                lineTo(5.3534f, 17.8906f)
                curveTo(5.1913f, 18.0152f, 4.9759f, 18.0335f, 4.7964f, 17.9437f)
                curveTo(4.6164f, 17.8546f, 4.5f, 17.6695f, 4.5f, 17.4655f)
                verticalLineTo(4.6655f)
                curveTo(4.5f, 3.1883f, 5.6886f, 1.9998f, 7.1475f, 1.9998f)
                close()
            }
        }.build()
    }
