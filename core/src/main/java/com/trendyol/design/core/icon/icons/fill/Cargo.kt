package com.trendyol.design.core.icon.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
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
private fun CargoImageVectorPreview() {
    Icon(imageVector = Icons.Fill.Cargo, size = TrendyolIconSize.Large)
}

val Icons.Fill.Cargo: ImageVector by lazy {
    ImageVector.Builder(
        name = "Cargo",
        defaultWidth = 14.dp,
        defaultHeight = 14.dp,
        viewportWidth = 14f,
        viewportHeight = 14f
    ).apply {
        path(
            fill = SolidColor(Color(0xFF666666)),
        ) {
            moveTo(11.278f, 3.092f)
            lineTo(6.994f, 4.533f)
            lineTo(2.611f, 3.092f)
            lineTo(6.994f, 1.75f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF666666)),
        ) {
            moveTo(1.75f, 3.773f)
            lineTo(6.416f, 5.339f)
            lineTo(6.416f, 12.226f)
            lineTo(1.78f, 10.594f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF666666)),
        ) {
            moveTo(7.567f, 12.249f)
            lineTo(12.249f, 10.594f)
            lineTo(12.249f, 3.818f)
            lineTo(7.582f, 5.316f)
            close()
        }
    }.build()
}
