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
    KPIcon(KPIcons.Fill.FavoriteSelected, KPIconSize.XXXLarge)
}

public val KPIcons.Fill.FavoriteSelected: ImageVector
    by lazy {
        Builder(
            name = "Favorite Selected", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF27A1A)), stroke = SolidColor(Color(0xFFF27A1A)),
                strokeLineWidth = 1.38889f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.5089f, 6.1507f)
                lineTo(11.999f, 6.6264f)
                lineTo(12.4828f, 6.1444f)
                curveTo(13.4525f, 5.1783f, 14.7947f, 4.6944f, 16.1306f, 4.6944f)
                curveTo(17.4911f, 4.6944f, 18.8058f, 5.1753f, 19.8079f, 6.173f)
                lineTo(19.8078f, 6.1731f)
                lineTo(19.8142f, 6.1792f)
                curveTo(20.818f, 7.1537f, 21.3056f, 8.4243f, 21.3056f, 9.698f)
                curveTo(21.3056f, 10.9717f, 20.818f, 12.2423f, 19.8142f, 13.2168f)
                lineTo(11.9935f, 20.8091f)
                lineTo(4.2014f, 13.2177f)
                lineTo(4.2005f, 13.2168f)
                curveTo(2.1924f, 11.2674f, 2.1924f, 8.1002f, 4.2005f, 6.1507f)
                curveTo(5.2056f, 5.175f, 6.5244f, 4.6944f, 7.8547f, 4.6944f)
                curveTo(9.1851f, 4.6944f, 10.5039f, 5.175f, 11.5089f, 6.1507f)
                close()
            }
        }.build()
    }
