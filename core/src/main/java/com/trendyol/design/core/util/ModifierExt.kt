package com.trendyol.design.core.util

import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.addOutline
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

/**
 * An extension function for the `Modifier` class that mirrors the content horizontally based on the layout direction.
 *
 * @param layoutDirection The `LayoutDirection` which determines the mirroring. If the direction is `LayoutDirection.Rtl`, the content is mirrored.
 * @return A modified `Modifier` with horizontal mirroring applied if the layout direction is `LayoutDirection.Rtl`.
 */
@Stable
public fun Modifier.mirror(layoutDirection: LayoutDirection): Modifier {
    return if (layoutDirection == LayoutDirection.Rtl)
        this.scale(scaleX = -1f, scaleY = 1f)
    else
        this
}

@Stable
public fun Modifier.customBorder(
    color: Color,
    shape: Shape,
    strokeWidth: Dp = 1.dp,
    dashWidth: Dp? = null,
    gapWidth: Dp? = null,
    strokeCap: StrokeCap = StrokeCap.Round
): Modifier = this.drawWithContent {
    val outline = shape.createOutline(size, layoutDirection, this)
    val path = Path()
    path.addOutline(outline)

    val stroke = Stroke(
        cap = strokeCap,
        width = strokeWidth.toPx(),
        pathEffect = dashWidth?.let {
            PathEffect.dashPathEffect(
                intervals = floatArrayOf(dashWidth.toPx(), gapWidth?.toPx() ?: dashWidth.toPx()),
                phase = 0f
            )
        }
    )

    this.drawContent()

    drawPath(
        path = path,
        style = stroke,
        color = color
    )
}
