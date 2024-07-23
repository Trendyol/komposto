package com.trendyol.design.core.icon.icons.outline

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
    Icon(Icons.Outline.Union, TrendyolIconSize.XSmall)
}

private var _Union: ImageVector? = null

val Icons.Outline.Union: ImageVector
    get() {
        if (_Union != null) {
            return _Union!!
        }
        _Union = ImageVector.Builder(
            name = "Union",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF999999)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.5f, 14.0005f)
                curveTo(13.7761f, 14.0005f, 14f, 13.7766f, 14f, 13.5005f)
                verticalLineTo(2.50049f)
                curveTo(14f, 2.2243f, 13.7761f, 2.0005f, 13.5f, 2.0005f)
                horizontalLineTo(2.5f)
                curveTo(2.2239f, 2.0005f, 2f, 2.2243f, 2f, 2.5005f)
                verticalLineTo(13.5005f)
                curveTo(2f, 13.7766f, 2.2239f, 14.0005f, 2.5f, 14.0005f)
                horizontalLineTo(13.5f)
                close()
                moveTo(4.12853f, 4.83612f)
                curveTo(3.5223f, 5.5769f, 3.1245f, 6.4949f, 3.0247f, 7.5005f)
                horizontalLineTo(6.79291f)
                lineTo(4.12853f, 4.83612f)
                close()
                moveTo(4.83563f, 4.12902f)
                lineTo(7.5f, 6.79338f)
                verticalLineTo(3.02518f)
                curveTo(6.4944f, 3.125f, 5.5764f, 3.5228f, 4.8356f, 4.129f)
                close()
                moveTo(8.5f, 9.20759f)
                verticalLineTo(12.9758f)
                curveTo(9.5056f, 12.876f, 10.4236f, 12.4782f, 11.1644f, 11.872f)
                lineTo(8.5f, 9.20759f)
                close()
                moveTo(11.8715f, 11.1649f)
                lineTo(9.20712f, 8.5005f)
                horizontalLineTo(12.9753f)
                curveTo(12.8755f, 9.5061f, 12.4777f, 10.4241f, 11.8715f, 11.1649f)
                close()
                moveTo(11.8744f, 12.582f)
                curveTo(11.6974f, 12.7319f, 11.5115f, 12.8717f, 11.3178f, 13.0005f)
                horizontalLineTo(12.2929f)
                lineTo(11.8744f, 12.582f)
                close()
                moveTo(13f, 12.2934f)
                lineTo(12.5815f, 11.8749f)
                curveTo(12.7314f, 11.6979f, 12.8712f, 11.512f, 13f, 11.3183f)
                verticalLineTo(12.2934f)
                close()
                moveTo(4.12558f, 3.41896f)
                lineTo(3.70711f, 3.00049f)
                horizontalLineTo(4.6822f)
                curveTo(4.4885f, 3.1293f, 4.3026f, 3.2691f, 4.1256f, 3.419f)
                close()
                moveTo(3f, 3.7076f)
                lineTo(3.41847f, 4.12607f)
                curveTo(3.2686f, 4.3031f, 3.1288f, 4.4889f, 3f, 4.6827f)
                verticalLineTo(3.7076f)
                close()
                moveTo(7.5f, 12.9758f)
                curveTo(6.4944f, 12.876f, 5.5764f, 12.4782f, 4.8356f, 11.872f)
                lineTo(7.5f, 9.2076f)
                verticalLineTo(12.9758f)
                close()
                moveTo(3.02469f, 8.5005f)
                curveTo(3.1245f, 9.5061f, 3.5223f, 10.4241f, 4.1285f, 11.1649f)
                lineTo(6.79289f, 8.5005f)
                horizontalLineTo(3.02469f)
                close()
                moveTo(12.9753f, 7.5005f)
                horizontalLineTo(9.2071f)
                lineTo(11.8715f, 4.83613f)
                curveTo(12.4777f, 5.5769f, 12.8755f, 6.4949f, 12.9753f, 7.5005f)
                close()
                moveTo(8.5f, 6.79339f)
                lineTo(11.1644f, 4.12902f)
                curveTo(10.4236f, 3.5228f, 9.5056f, 3.125f, 8.5f, 3.0252f)
                verticalLineTo(6.79339f)
                close()
                moveTo(13f, 4.68269f)
                curveTo(12.8712f, 4.4889f, 12.7314f, 4.3031f, 12.5815f, 4.1261f)
                lineTo(13f, 3.7076f)
                verticalLineTo(4.68269f)
                close()
                moveTo(11.8744f, 3.41896f)
                lineTo(12.2929f, 3.00049f)
                horizontalLineTo(11.3178f)
                curveTo(11.5115f, 3.1293f, 11.6974f, 3.2691f, 11.8744f, 3.419f)
                close()
                moveTo(3f, 12.2934f)
                lineTo(3.41848f, 11.8749f)
                curveTo(3.2686f, 11.6979f, 3.1288f, 11.512f, 3f, 11.3183f)
                verticalLineTo(12.2934f)
                close()
                moveTo(4.12558f, 12.582f)
                lineTo(3.70711f, 13.0005f)
                horizontalLineTo(4.6822f)
                curveTo(4.4885f, 12.8717f, 4.3026f, 12.7319f, 4.1256f, 12.582f)
                close()
            }
        }.build()
        return _Union!!
    }
