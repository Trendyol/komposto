package com.trendyol.design.core.icon.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize

@Preview
@Composable
private fun FenomenGradientImageVectorPreview() {
    Icon(imageVector = Icons.Fill.FenomenGradient, size = TrendyolIconSize.Large)
}

public val Icons.Fill.FenomenGradient: ImageVector by lazy {
    ImageVector.Builder(
        name = "HeartStar",
        defaultWidth = 14.dp,
        defaultHeight = 14.dp,
        viewportWidth = 14f,
        viewportHeight = 14f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colors = listOf(Color(0xFFFF9137), Color(0xFFFF69FF)),
                start = androidx.compose.ui.geometry.Offset(0.875f, 7f),
                end = androidx.compose.ui.geometry.Offset(13.125f, 7f)
            )
        ) {
            moveTo(7.15f, 9.757f)
            curveTo(7.061f, 9.822f, 6.938f, 9.822f, 6.85f, 9.757f)
            curveTo(6.604f, 9.578f, 4.448f, 7.971f, 4.448f, 6.641f)
            curveTo(4.448f, 5.688f, 5.156f, 5.118f, 5.84f, 5.118f)
            curveTo(6.234f, 5.118f, 6.694f, 5.311f, 7f, 5.816f)
            curveTo(7.305f, 5.311f, 7.765f, 5.118f, 8.159f, 5.118f)
            curveTo(8.843f, 5.118f, 9.552f, 5.688f, 9.552f, 6.641f)
            curveTo(9.552f, 7.971f, 7.396f, 9.578f, 7.15f, 9.757f)
            close()
            moveTo(13.033f, 6.801f)
            lineTo(12.061f, 5.991f)
            lineTo(12.649f, 4.87f)
            curveTo(12.722f, 4.732f, 12.654f, 4.556f, 12.499f, 4.507f)
            lineTo(11.29f, 4.13f)
            lineTo(11.405f, 2.869f)
            curveTo(11.419f, 2.715f, 11.293f, 2.579f, 11.128f, 2.592f)
            lineTo(9.866f, 2.706f)
            lineTo(9.49f, 1.497f)
            curveTo(9.442f, 1.344f, 9.267f, 1.273f, 9.127f, 1.347f)
            lineTo(8.006f, 1.936f)
            lineTo(7.196f, 0.963f)
            curveTo(7.099f, 0.846f, 6.901f, 0.846f, 6.804f, 0.963f)
            lineTo(5.993f, 1.936f)
            lineTo(4.872f, 1.347f)
            curveTo(4.729f, 1.272f, 4.557f, 1.347f, 4.51f, 1.497f)
            lineTo(4.133f, 2.706f)
            lineTo(2.872f, 2.592f)
            curveTo(2.708f, 2.579f, 2.58f, 2.715f, 2.595f, 2.869f)
            lineTo(2.71f, 4.13f)
            lineTo(1.501f, 4.507f)
            curveTo(1.345f, 4.556f, 1.278f, 4.732f, 1.351f, 4.87f)
            lineTo(1.939f, 5.991f)
            lineTo(0.966f, 6.801f)
            curveTo(0.845f, 6.903f, 0.844f, 7.091f, 0.966f, 7.194f)
            lineTo(1.939f, 8.005f)
            lineTo(1.351f, 9.127f)
            curveTo(1.276f, 9.268f, 1.349f, 9.442f, 1.501f, 9.489f)
            lineTo(2.71f, 9.865f)
            lineTo(2.595f, 11.127f)
            curveTo(2.58f, 11.289f, 2.722f, 11.423f, 2.872f, 11.405f)
            lineTo(4.133f, 11.289f)
            lineTo(4.51f, 12.499f)
            curveTo(4.557f, 12.652f, 4.732f, 12.722f, 4.872f, 12.649f)
            lineTo(5.993f, 12.061f)
            lineTo(6.804f, 13.033f)
            curveTo(6.906f, 13.155f, 7.094f, 13.155f, 7.196f, 13.033f)
            lineTo(8.006f, 12.061f)
            lineTo(9.127f, 12.649f)
            curveTo(9.266f, 12.722f, 9.442f, 12.653f, 9.49f, 12.499f)
            lineTo(9.866f, 11.289f)
            lineTo(11.128f, 11.405f)
            curveTo(11.277f, 11.423f, 11.42f, 11.29f, 11.405f, 11.127f)
            lineTo(11.29f, 9.865f)
            lineTo(12.499f, 9.489f)
            curveTo(12.651f, 9.442f, 12.723f, 9.268f, 12.649f, 9.127f)
            lineTo(12.061f, 8.005f)
            lineTo(13.033f, 7.194f)
            curveTo(13.156f, 7.091f, 13.155f, 6.903f, 13.033f, 6.801f)
            close()
        }
    }.build()
}
