package com.trendyol.design.core.icon.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize

@Preview
@Composable
private fun CouponPreview() {
    Icon(imageVector = Icons.Fill.Coupon, size = TrendyolIconSize.Large)
}

public val Icons.Fill.Coupon: ImageVector by lazy {
    ImageVector.Builder(
        name = "Coupon",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        group {
            path(
                fill = SolidColor(Color(0xFFFF4988)),
                pathFillType = PathFillType.EvenOdd,

            ) {
                moveTo(11.182f, 9.3f)
                curveTo(11.182f, 9.479f, 11.039f, 9.625f, 10.864f, 9.625f)
                curveTo(10.688f, 9.625f, 10.545f, 9.479f, 10.545f, 9.3f)
                curveTo(10.545f, 9.12f, 10.688f, 8.975f, 10.864f, 8.975f)
                curveTo(11.039f, 8.975f, 11.182f, 9.12f, 11.182f, 9.3f)
                close()

                moveTo(8.636f, 6.7f)
                curveTo(8.636f, 6.879f, 8.494f, 7.025f, 8.318f, 7.025f)
                curveTo(8.142f, 7.025f, 8.0f, 6.879f, 8.0f, 6.7f)
                curveTo(8.0f, 6.52f, 8.142f, 6.375f, 8.318f, 6.375f)
                curveTo(8.494f, 6.375f, 8.636f, 6.52f, 8.636f, 6.7f)
                close()

                moveTo(13.409f, 3.45f)
                lineTo(4.182f, 3.45f)
                verticalLineTo(4.425f)
                curveTo(4.182f, 4.604f, 4.039f, 4.75f, 3.864f, 4.75f)
                curveTo(3.688f, 4.75f, 3.545f, 4.604f, 3.545f, 4.425f)
                verticalLineTo(3.45f)
                horizontalLineTo(2.591f)
                curveTo(1.713f, 3.451f, 1.001f, 4.178f, 1.0f, 5.075f)
                verticalLineTo(10.925f)
                curveTo(1.001f, 11.822f, 1.713f, 12.549f, 2.591f, 12.55f)
                horizontalLineTo(3.545f)
                verticalLineTo(11.575f)
                curveTo(3.545f, 11.396f, 3.688f, 11.25f, 3.864f, 11.25f)
                curveTo(4.039f, 11.25f, 4.182f, 11.396f, 4.182f, 11.575f)
                verticalLineTo(12.55f)
                horizontalLineTo(13.409f)
                curveTo(14.287f, 12.549f, 14.999f, 11.822f, 15.0f, 10.925f)
                verticalLineTo(5.075f)
                curveTo(14.999f, 4.178f, 14.287f, 3.451f, 13.409f, 3.45f)
                close()
                moveTo(4.182f, 10.275f)
                curveTo(4.182f, 10.454f, 4.039f, 10.6f, 3.864f, 10.6f)
                curveTo(3.688f, 10.6f, 3.545f, 10.454f, 3.545f, 10.275f)
                verticalLineTo(9.625f)
                curveTo(3.545f, 9.445f, 3.688f, 9.3f, 3.864f, 9.3f)
                curveTo(4.039f, 9.3f, 4.182f, 9.445f, 4.182f, 9.625f)
                verticalLineTo(10.275f)
                close()
                moveTo(3.864f, 8.65f)
                curveTo(4.039f, 8.65f, 4.182f, 8.504f, 4.182f, 8.325f)
                verticalLineTo(7.675f)
                curveTo(4.182f, 7.495f, 4.039f, 7.35f, 3.864f, 7.35f)
                curveTo(3.688f, 7.35f, 3.545f, 7.495f, 3.545f, 7.675f)
                verticalLineTo(8.325f)
                curveTo(3.545f, 8.504f, 3.688f, 8.65f, 3.864f, 8.65f)
                close()
                moveTo(4.182f, 6.375f)
                curveTo(4.182f, 6.554f, 4.039f, 6.7f, 3.864f, 6.7f)
                curveTo(3.688f, 6.7f, 3.545f, 6.554f, 3.545f, 6.375f)
                verticalLineTo(5.725f)
                curveTo(3.545f, 5.545f, 3.688f, 5.4f, 3.864f, 5.4f)
                curveTo(4.039f, 5.4f, 4.182f, 5.545f, 4.182f, 5.725f)
                verticalLineTo(6.375f)
                close()
                moveTo(9.273f, 6.7f)
                curveTo(9.273f, 6.161f, 8.845f, 5.725f, 8.318f, 5.725f)
                curveTo(7.791f, 5.726f, 7.364f, 6.162f, 7.364f, 6.7f)
                curveTo(7.364f, 7.238f, 7.791f, 7.675f, 8.318f, 7.675f)
                curveTo(8.845f, 7.675f, 9.273f, 7.238f, 9.273f, 6.7f)
                close()
                moveTo(10.864f, 10.275f)
                curveTo(10.337f, 10.275f, 9.909f, 9.838f, 9.909f, 9.3f)
                curveTo(9.909f, 8.761f, 10.337f, 8.325f, 10.864f, 8.325f)
                curveTo(11.391f, 8.325f, 11.818f, 8.761f, 11.818f, 9.3f)
                curveTo(11.818f, 9.838f, 11.391f, 10.274f, 10.864f, 10.275f)
                close()
                moveTo(7.907f, 10.18f)
                lineTo(11.725f, 6.28f)
                curveTo(11.807f, 6.198f, 11.84f, 6.077f, 11.811f, 5.964f)
                curveTo(11.781f, 5.851f, 11.695f, 5.763f, 11.584f, 5.733f)
                curveTo(11.473f, 5.703f, 11.355f, 5.736f, 11.275f, 5.82f)
                lineTo(7.457f, 9.72f)
                curveTo(7.335f, 9.848f, 7.337f, 10.051f, 7.46f, 10.177f)
                curveTo(7.583f, 10.303f, 7.782f, 10.304f, 7.907f, 10.18f)
                close()
            }
        }
    }.build()
}
