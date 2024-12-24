package com.trendyol.design.core.icon.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize

@Preview
@Composable
private fun VectorPreview() {
    Icon(Icons.Fill.Share, TrendyolIconSize.XXXLarge)
}

public val Icons.Fill.Share: ImageVector
    by lazy {
        Builder(
            name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF333333)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.0782f, 9.0352f)
                curveTo(5.9274f, 9.0352f, 6.6704f, 9.3367f, 7.2011f, 9.8392f)
                lineTo(14.7374f, 5.7186f)
                curveTo(14.6313f, 5.5176f, 14.6313f, 5.2161f, 14.6313f, 5.0151f)
                curveTo(14.6313f, 3.3065f, 16.0112f, 2.0f, 17.8156f, 2.0f)
                curveTo(19.6201f, 2.0f, 21.0f, 3.3065f, 21.0f, 5.0151f)
                curveTo(21.0f, 6.7236f, 19.6201f, 8.0302f, 17.8156f, 8.0302f)
                curveTo(16.9665f, 8.0302f, 16.2235f, 7.7286f, 15.6927f, 7.2261f)
                lineTo(8.1564f, 11.3467f)
                curveTo(8.2626f, 11.5477f, 8.2626f, 11.8492f, 8.2626f, 12.0503f)
                curveTo(8.2626f, 12.2513f, 8.2626f, 12.5528f, 8.1564f, 12.7538f)
                lineTo(15.6927f, 16.9749f)
                curveTo(16.2235f, 16.4724f, 16.9665f, 16.1709f, 17.8156f, 16.1709f)
                curveTo(19.514f, 16.1709f, 20.8939f, 17.4774f, 20.8939f, 19.0854f)
                curveTo(20.8939f, 20.6935f, 19.514f, 22.0f, 17.8156f, 22.0f)
                curveTo(16.1173f, 22.0f, 14.7374f, 20.6935f, 14.7374f, 19.0854f)
                curveTo(14.7374f, 18.8844f, 14.7374f, 18.6834f, 14.8436f, 18.3819f)
                lineTo(7.3073f, 14.1608f)
                curveTo(6.7765f, 14.6633f, 6.0335f, 14.9648f, 5.1844f, 14.9648f)
                curveTo(3.3799f, 14.9648f, 2.0f, 13.6583f, 2.0f, 11.9497f)
                curveTo(2.0f, 10.2412f, 3.2737f, 9.0352f, 5.0782f, 9.0352f)
                close()
            }
        }.build()
    }
