package com.trendyol.design.core.icon.icons.outline

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
    KPIcon(KPIcons.Outline.SaveUnselected, KPIconSize.XXXLarge)
}

public val KPIcons.Outline.SaveUnselected: ImageVector
    by lazy {
        Builder(
            name = "Save Unselected", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF333333)), stroke = SolidColor(Color(0xFF333333)),
                strokeLineWidth = 0.388889f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.4231f, 2.4002f)
                horizontalLineTo(8.5772f)
                curveTo(6.8264f, 2.4002f, 5.4001f, 3.8264f, 5.4001f, 5.599f)
                verticalLineTo(20.959f)
                curveTo(5.4001f, 21.2038f, 5.5398f, 21.426f, 5.7558f, 21.5329f)
                curveTo(5.9712f, 21.6406f, 6.2297f, 21.6186f, 6.4242f, 21.4692f)
                lineTo(12.0001f, 17.204f)
                lineTo(17.5761f, 21.4692f)
                curveTo(17.6907f, 21.5549f, 17.8213f, 21.5974f, 17.961f, 21.5974f)
                curveTo(18.0583f, 21.5974f, 18.1555f, 21.5761f, 18.2444f, 21.5288f)
                curveTo(18.4605f, 21.4218f, 18.6001f, 21.1997f, 18.6001f, 20.9549f)
                verticalLineTo(5.599f)
                curveTo(18.6001f, 3.8264f, 17.1704f, 2.4002f, 15.4231f, 2.4002f)
                close()
                moveTo(17.3309f, 19.6664f)
                lineTo(12.385f, 15.8847f)
                curveTo(12.2711f, 15.799f, 12.1349f, 15.7565f, 12.0001f, 15.7565f)
                curveTo(11.8647f, 15.7565f, 11.725f, 15.799f, 11.6153f, 15.8847f)
                lineTo(6.6687f, 19.6664f)
                verticalLineTo(5.599f)
                curveTo(6.6687f, 4.5368f, 7.5281f, 3.6845f, 8.5772f, 3.6845f)
                horizontalLineTo(15.4189f)
                curveTo(16.468f, 3.6845f, 17.3267f, 4.5327f, 17.3267f, 5.599f)
                verticalLineTo(19.6664f)
                horizontalLineTo(17.3309f)
                close()
            }
        }.build()
    }
