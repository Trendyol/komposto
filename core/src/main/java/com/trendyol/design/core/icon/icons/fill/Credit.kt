package com.trendyol.design.core.icon.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons

@Preview
@Composable
private fun CreditImageVectorPreview() {
    KPIcon(imageVector = KPIcons.Fill.Credit, size = KPIconSize.XXXLarge)
}

public val KPIcons.Fill.Credit: ImageVector by lazy {
    ImageVector.Builder(
        name = "Credit",
        defaultWidth = 14.dp,
        defaultHeight = 14.dp,
        viewportWidth = 14f,
        viewportHeight = 14f
    ).apply {
        path(
            fill = SolidColor(Color(0xFFFFC000)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.565f, 4.365f)
            curveTo(7.85f, 3.241f, 7.169f, 2.099f, 6.045f, 1.815f)
            curveTo(4.92f, 1.53f, 3.778f, 2.211f, 3.494f, 3.335f)
            curveTo(3.209f, 4.459f, 3.89f, 5.602f, 5.014f, 5.886f)
            curveTo(6.139f, 6.171f, 7.281f, 5.49f, 7.565f, 4.365f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFFC000)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.159f, 8.696f)
            curveTo(9.716f, 8.702f, 10.253f, 8.487f, 10.651f, 8.097f)
            curveTo(11.049f, 7.708f, 11.277f, 7.176f, 11.283f, 6.619f)
            curveTo(11.289f, 6.062f, 11.074f, 5.526f, 10.684f, 5.128f)
            curveTo(10.295f, 4.73f, 9.763f, 4.502f, 9.206f, 4.496f)
            curveTo(8.649f, 4.49f, 8.113f, 4.705f, 7.715f, 5.095f)
            curveTo(7.316f, 5.484f, 7.089f, 6.016f, 7.083f, 6.573f)
            curveTo(7.077f, 7.129f, 7.292f, 7.666f, 7.681f, 8.064f)
            curveTo(8.071f, 8.462f, 8.603f, 8.689f, 9.159f, 8.696f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFFC000)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.074f, 8.589f)
            curveTo(11.827f, 8.436f, 11.52f, 8.416f, 11.256f, 8.535f)
            lineTo(9.203f, 9.466f)
            curveTo(9.262f, 9.564f, 9.3f, 9.674f, 9.316f, 9.788f)
            curveTo(9.36f, 10.089f, 9.24f, 10.391f, 9.001f, 10.58f)
            curveTo(8.849f, 10.702f, 8.659f, 10.768f, 8.464f, 10.768f)
            curveTo(8.418f, 10.768f, 8.372f, 10.765f, 8.326f, 10.757f)
            lineTo(5.439f, 10.287f)
            curveTo(5.334f, 10.27f, 5.263f, 10.171f, 5.28f, 10.066f)
            curveTo(5.297f, 9.96f, 5.396f, 9.889f, 5.501f, 9.906f)
            lineTo(8.364f, 10.373f)
            curveTo(8.509f, 10.391f, 8.656f, 10.353f, 8.775f, 10.268f)
            curveTo(8.899f, 10.16f, 8.959f, 9.996f, 8.933f, 9.833f)
            curveTo(8.907f, 9.67f, 8.799f, 9.533f, 8.647f, 9.469f)
            lineTo(6.309f, 8.496f)
            curveTo(6.249f, 8.471f, 6.185f, 8.458f, 6.12f, 8.458f)
            lineTo(3.808f, 8.458f)
            curveTo(3.7f, 8.458f, 3.595f, 8.494f, 3.509f, 8.56f)
            lineTo(3.015f, 8.938f)
            verticalLineTo(8.858f)
            curveTo(3.015f, 8.783f, 2.986f, 8.711f, 2.933f, 8.658f)
            curveTo(2.88f, 8.605f, 2.808f, 8.575f, 2.733f, 8.575f)
            lineTo(2.032f, 8.575f)
            curveTo(1.876f, 8.575f, 1.75f, 8.702f, 1.75f, 8.858f)
            verticalLineTo(11.628f)
            curveTo(1.75f, 11.784f, 1.876f, 11.91f, 2.032f, 11.91f)
            lineTo(2.733f, 11.91f)
            curveTo(2.889f, 11.91f, 3.015f, 11.784f, 3.015f, 11.628f)
            verticalLineTo(11.47f)
            lineTo(6.27f, 12.209f)
            curveTo(6.702f, 12.308f, 7.156f, 12.224f, 7.524f, 11.978f)
            lineTo(12.076f, 9.211f)
            curveTo(12.184f, 9.145f, 12.25f, 9.027f, 12.25f, 8.9f)
            curveTo(12.25f, 8.772f, 12.183f, 8.655f, 12.074f, 8.589f)
            close()
        }
    }.build()
}
