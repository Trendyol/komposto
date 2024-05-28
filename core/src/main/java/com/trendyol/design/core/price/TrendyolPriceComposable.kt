package com.trendyol.design.core.price

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TrendyolPriceComposable(
    modifier: Modifier = Modifier,
    style: PriceStyle
) {
    PriceComposable(modifier = modifier, style = style)
}
