package com.trendyol.design.core.icon.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize

@Preview
@Composable
private fun VectorPreview() {
    Icon(imageVector = Icons.Fill.Campaign, size = TrendyolIconSize.Large)
}

val Icons.Fill.Campaign: ImageVector by lazy {
    ImageVector.Builder(
        name = "Campaign",
        defaultWidth = 14.dp,
        defaultHeight = 14.dp,
        viewportWidth = 14f,
        viewportHeight = 14f
    ).apply {
        path(
            fill = SolidColor(Color(0xFFF27A1A)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.248f, 6.287f)
            lineTo(12.041f, 2.926f)
            curveTo(12.025f, 2.675f, 11.918f, 2.438f, 11.74f, 2.259f)
            curveTo(11.562f, 2.081f, 11.325f, 1.974f, 11.073f, 1.959f)
            lineTo(7.712f, 1.752f)
            curveTo(7.417f, 1.734f, 7.128f, 1.844f, 6.918f, 2.054f)
            lineTo(2.052f, 6.919f)
            curveTo(1.859f, 7.113f, 1.75f, 7.376f, 1.75f, 7.65f)
            curveTo(1.75f, 7.924f, 1.859f, 8.187f, 2.052f, 8.38f)
            lineTo(5.621f, 11.948f)
            curveTo(5.814f, 12.142f, 6.077f, 12.251f, 6.351f, 12.251f)
            curveTo(6.625f, 12.251f, 6.888f, 12.142f, 7.082f, 11.948f)
            lineTo(11.947f, 7.081f)
            curveTo(12.157f, 6.872f, 12.266f, 6.583f, 12.248f, 6.287f)
            close()
            moveTo(9.807f, 6.078f)
            curveTo(9.557f, 6.328f, 9.218f, 6.469f, 8.864f, 6.469f)
            curveTo(8.51f, 6.469f, 8.171f, 6.329f, 7.921f, 6.078f)
            curveTo(7.671f, 5.828f, 7.53f, 5.489f, 7.53f, 5.136f)
            curveTo(7.53f, 4.782f, 7.671f, 4.443f, 7.921f, 4.193f)
            curveTo(8.171f, 3.943f, 8.51f, 3.802f, 8.864f, 3.802f)
            curveTo(9.218f, 3.802f, 9.557f, 3.943f, 9.807f, 4.193f)
            curveTo(10.057f, 4.443f, 10.198f, 4.782f, 10.198f, 5.136f)
            curveTo(10.198f, 5.489f, 10.057f, 5.828f, 9.807f, 6.078f)
            close()
        }
    }.build()
}
