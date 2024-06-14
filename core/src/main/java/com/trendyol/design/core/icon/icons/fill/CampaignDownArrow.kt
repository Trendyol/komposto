package com.trendyol.design.core.icon.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize

@Preview
@Composable
private fun DownArrowPreview() {
    Icon(imageVector = Icons.Fill.CampaignDownArrow, size = TrendyolIconSize.XXSmall)
}

private var _CampaignDownArrow: ImageVector? = null

public val Icons.Fill.CampaignDownArrow: ImageVector
    get() {
        if (_CampaignDownArrow != null) {
            return _CampaignDownArrow!!
        }
        _CampaignDownArrow = ImageVector.Builder(
            name = "DownArrow",
            defaultWidth = 12.dp,
            defaultHeight = 12.dp,
            viewportWidth = 12f,
            viewportHeight = 12f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF666666)),
                    fillAlpha = 1.0f,
                    stroke = SolidColor(Color(0xFF666666)),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 0.25f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(7.04659f, 7.99997f)
                    horizontalLineTo(9.22196f)
                    curveTo(9.2573f, 8.0005f, 9.2924f, 7.9938f, 9.3251f, 7.98f)
                    curveTo(9.4301f, 7.9382f, 9.4996f, 7.8338f, 9.5f, 7.7172f)
                    verticalLineTo(5.06388f)
                    horizontalLineTo(8.94741f)
                    verticalLineTo(7.01946f)
                    lineTo(6.84899f, 4.79927f)
                    curveTo(6.7459f, 4.6889f, 6.5766f, 4.6841f, 6.4678f, 4.7884f)
                    lineTo(5.01287f, 6.19482f)
                    lineTo(2.88821f, 4f)
                    lineTo(2.5f, 4.40235f)
                    lineTo(4.80477f, 6.78928f)
                    curveTo(4.9086f, 6.9003f, 5.0792f, 6.9043f, 5.1877f, 6.7984f)
                    lineTo(6.65488f, 5.39374f)
                    lineTo(8.57844f, 7.43269f)
                    horizontalLineTo(7.04659f)
                    verticalLineTo(7.99997f)
                    close()
                }
            }
        }.build()
        return _CampaignDownArrow!!
    }
