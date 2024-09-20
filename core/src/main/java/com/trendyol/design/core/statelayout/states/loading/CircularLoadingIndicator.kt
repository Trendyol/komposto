package com.trendyol.design.core.statelayout.states.loading

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.theme.TrendyolDesign

/**
 * Composable function for displaying a circular loading indicator.
 * This function creates a circular loading indicator that can be used in Jetpack Compose UI.
 *
 * @param modifier Optional parameter to specify the modifier for this composable.
 * @param indicatorColor Optional parameter to specify the color of the loading indicator. Defaults to the primary color.
 * @param indicatorStrokeWidth Optional parameter to specify the stroke width of the loading indicator. Defaults to 4dp.
 */
@Composable
public fun CircularLoadingIndicator(
    modifier: Modifier = Modifier,
    indicatorColor: Color = TrendyolDesign.colors.colorPrimary,
    indicatorStrokeWidth: Dp = 4.dp,
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(
            color = indicatorColor,
            backgroundColor = TrendyolDesign.colors.colorBackground,
            modifier = Modifier.size(52.dp),
            strokeWidth = indicatorStrokeWidth,
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CircularLoadingIndicatorPreview() {
    PreviewTheme {
        CircularLoadingIndicator(
            indicatorColor = Color.Red,
        )
    }
}
