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
import com.trendyol.design.core.icon.TrendyolIconSize

@Preview
@Composable
private fun WarningInfoStateDefaultIconPreview() {
    Icon(WarningInfoStateDefaultIcon, size = TrendyolIconSize.Medium)
}

private var _WarningInfoStateDefaultIcon: ImageVector? = null

public val WarningInfoStateDefaultIcon: ImageVector
    get() {
        if (_WarningInfoStateDefaultIcon != null) {
            return _WarningInfoStateDefaultIcon!!
        }
        _WarningInfoStateDefaultIcon = ImageVector.Builder(
            name = "WarningInfoDefaultIcon",
            defaultWidth = 104.dp,
            defaultHeight = 104.dp,
            viewportWidth = 104f,
            viewportHeight = 104f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFFFFFFFF)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(100.75f, 52f)
                    arcTo(
                        48.75f,
                        48.75f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        52f,
                        100.75f
                    )
                    arcTo(
                        48.75f,
                        48.75f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        3.25f,
                        52f
                    )
                    arcTo(
                        48.75f,
                        48.75f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        100.75f,
                        52f
                    )
                    close()
                }
            }
            path(
                fill = SolidColor(Color(0xFFF27A1A)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(51.9999f, 30.7878f)
                lineTo(32.4624f, 38.7737f)
                lineTo(51.9999f, 46.7596f)
                lineTo(71.5374f, 38.7737f)
                lineTo(51.9999f, 30.7878f)
                close()
                moveTo(31.0347f, 40.5149f)
                verticalLineTo(65.0753f)
                lineTo(50.9249f, 73.2119f)
                verticalLineTo(48.6515f)
                lineTo(31.0347f, 40.5149f)
                close()
                moveTo(53.0752f, 48.6515f)
                lineTo(72.9654f, 40.5149f)
                verticalLineTo(65.0753f)
                lineTo(53.0752f, 73.2119f)
                verticalLineTo(48.6515f)
                close()
            }
        }.build()
        return _WarningInfoStateDefaultIcon!!
    }
