package com.trendyol.design.core.icon.icons.fill

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
private fun VectorPreview() {
    Icon(Icons.Outline.Chevron, TrendyolIconSize.XSmall)
}

public val Icons.Outline.Chevron: ImageVector by lazy {
    ImageVector.Builder(
        name = "Chevron",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
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
            moveTo(11.1812f, 13.7437f)
            curveTo(10.8395f, 14.0854f, 10.2855f, 14.0854f, 9.9438f, 13.7437f)
            lineTo(4.81878f, 8.61872f)
            curveTo(4.4771f, 8.277f, 4.4771f, 7.723f, 4.8188f, 7.3813f)
            lineTo(9.94378f, 2.25628f)
            curveTo(10.2855f, 1.9146f, 10.8395f, 1.9146f, 11.1812f, 2.2563f)
            curveTo(11.5229f, 2.598f, 11.5229f, 3.152f, 11.1812f, 3.4937f)
            lineTo(6.67494f, 8f)
            lineTo(11.1812f, 12.5063f)
            curveTo(11.5229f, 12.848f, 11.5229f, 13.402f, 11.1812f, 13.7437f)
            close()
        }
    }.build()
}
