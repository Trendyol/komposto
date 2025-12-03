package com.trendyol.design.core.statelayout.states.loading

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.preview.PreviewTheme

/**
 * Composable function for displaying a circular loading indicator.
 * This function creates a circular loading indicator that can be used in Jetpack Compose UI.
 *
 * @param modifier Optional parameter to specify the modifier for this composable.
 * @param loadingIndicatorStyle Style configuration for the loading indicator colors.
 * Defaults to [KPLoadingIndicatorStyle].
 */
@ExperimentalKompostoApi
@Composable
public fun KPCircularLoadingIndicator(
    modifier: Modifier = Modifier,
    loadingIndicatorStyle: LoadingIndicatorStyle = KPLoadingIndicatorStyle,
) {

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(
            color = loadingIndicatorStyle.indicatorColor,
            backgroundColor = loadingIndicatorStyle.backgroundColor,
            modifier = Modifier.size(52.dp),
            strokeWidth = loadingIndicatorStyle.strokeWidth,
        )
    }
}

@OptIn(ExperimentalKompostoApi::class)
@Preview(showSystemUi = true)
@Composable
private fun CircularLoadingIndicatorPreview() {
    PreviewTheme {
        KPCircularLoadingIndicator()
    }
}
