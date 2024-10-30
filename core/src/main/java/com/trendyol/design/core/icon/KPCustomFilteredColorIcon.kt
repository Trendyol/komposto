package com.trendyol.design.core.icon

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.trendyol.design.core.icon.icons.fill.CircleIcon
import com.trendyol.design.core.icon.icons.fill.InfoIcon

/**
 *
 * @param outerIcon You can set icon background in this parameter.
 * @param outerTint You can set outerIcon's tint in this parameter.
 * @param innerIcon You can set icon symbol in this parameter.
 * @param innerTint You can set innerIcon's tint in this parameter.
 */
@Composable
public fun KPCustomFilteredColorIcon(
    modifier: Modifier = Modifier,
    outerIcon: ImageVector = Icons.Fill.CircleIcon,
    outerTint: Color,
    innerIcon: ImageVector,
    innerTint: Color = Color.Unspecified,
) {
    Box(
        modifier = modifier
    ) {
        Icon(
            imageVector = outerIcon,
            tint = outerTint,
            size = TrendyolIconSize.Small,
        )
        Icon(
            imageVector = innerIcon,
            tint = innerTint,
            size = TrendyolIconSize.Small,
        )
    }
}

@Preview
@Composable
private fun CustomFilteredColorIconPreview() {
    KPCustomFilteredColorIcon(
        outerTint = Color.Red,
        innerIcon = Icons.Fill.InfoIcon,
        innerTint = Color.White
    )
}