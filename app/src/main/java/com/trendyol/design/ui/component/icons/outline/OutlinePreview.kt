package com.trendyol.design.ui.component.icons.outline

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.outline.Back
import com.trendyol.design.core.icon.icons.outline.Cancel
import com.trendyol.design.core.icon.icons.outline.StateCaution
import com.trendyol.design.ui.theme.TrendyolTheme

private class TrendyolIconParameterProvider : PreviewParameterProvider<ImageVector> {
    override val values: Sequence<ImageVector>
        get() = sequenceOf(
            Icons.Outline.Back,
            Icons.Outline.Cancel,
            Icons.Outline.StateCaution,
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
