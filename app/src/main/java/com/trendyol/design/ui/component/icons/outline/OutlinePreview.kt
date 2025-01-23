package com.trendyol.design.ui.component.icons.outline

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.outline.Back
import com.trendyol.design.core.icon.icons.outline.Cancel
import com.trendyol.design.core.icon.icons.outline.Chevron
import com.trendyol.design.core.icon.icons.outline.ErrorState
import com.trendyol.design.core.icon.icons.outline.Info
import com.trendyol.design.core.icon.icons.outline.StateCaution
import com.trendyol.design.core.icon.icons.outline.SuccessState
import com.trendyol.design.core.icon.icons.outline.Union
import com.trendyol.design.ui.theme.TrendyolTheme

private class TrendyolIconParameterProvider : PreviewParameterProvider<ImageVector> {
    override val values: Sequence<ImageVector>
        get() = sequenceOf(
            KPIcons.Outline.Back,
            KPIcons.Outline.Cancel,
            KPIcons.Outline.Chevron,
            KPIcons.Outline.ErrorState,
            KPIcons.Outline.Info,
            KPIcons.Outline.StateCaution,
            KPIcons.Outline.SuccessState,
            KPIcons.Outline.Union,
        )
}

@Preview
@Composable
private fun Preview_KPIcon(
    @PreviewParameter(TrendyolIconParameterProvider::class) icon: ImageVector,
) = TrendyolTheme {
    KPIcon(
        imageVector = icon,
        size = KPIconSize.Medium,
    )
}
