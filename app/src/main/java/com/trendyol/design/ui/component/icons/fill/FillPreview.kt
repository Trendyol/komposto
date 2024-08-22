package com.trendyol.design.ui.component.icons.fill

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.icon.icons.fill.StateOrder
import com.trendyol.design.core.icon.icons.fill.StatePin
import com.trendyol.design.core.icon.icons.fill.StateRefresh
import com.trendyol.design.core.icon.icons.fill.Trash
import com.trendyol.design.ui.theme.TrendyolTheme

private class TrendyolIconParameterProvider : PreviewParameterProvider<ImageVector> {
    override val values: Sequence<ImageVector>
        get() = sequenceOf(
            Icons.Fill.Help,
            Icons.Fill.StateOrder,
            Icons.Fill.StatePin,
            Icons.Fill.StateRefresh,
            Icons.Fill.Trash,
        )
}

@Preview
@Composable
private fun Preview_Icon(
    @PreviewParameter(TrendyolIconParameterProvider::class) icon: ImageVector,
) = TrendyolTheme {
    Icon(
        imageVector = icon,
        size = TrendyolIconSize.Medium,
    )
}
