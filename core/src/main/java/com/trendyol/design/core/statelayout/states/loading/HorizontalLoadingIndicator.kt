@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.core.statelayout.states.loading

import androidx.annotation.FloatRange
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign

/**
 * Composable function for displaying a horizontal loading indicator.
 * This function creates a horizontal loading indicator that can be used in Jetpack Compose UI.
 *
 * @param modifier Optional parameter to specify the modifier for this composable.
 * @param progressState Optional parameter to specify the state of the loading progress. Defaults to INFINITIVE.
 * @param progressValue Optional parameter to specify the progress value (0.0 to 1.0). Defaults to 0.0.
 */
@ExperimentalKompostoApi
@Composable
public fun KPHorizontalLoadingIndicator(
    modifier: Modifier = Modifier,
    progressState: HorizontalProgressState = HorizontalProgressState.INFINITIVE,
    @FloatRange(0.0, 1.0) progressValue: Float = 0.0F,
) {

    val progress by remember { mutableFloatStateOf(progressValue) }
    val progressModifier: Modifier = modifier.fillMaxWidth()

    val animatedProgress = animateFloatAsState(
        targetValue = progress,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec, label = ""
    ).value

    if (progressState == HorizontalProgressState.INFINITIVE) {
        LinearProgressIndicator(
            modifier = progressModifier,
            backgroundColor = KPDesign.colors.colorBackground,
            color = KPDesign.colors.colorPrimary,
            strokeCap = StrokeCap.Round
        )
    } else {
        LinearProgressIndicator(
            modifier = progressModifier,
            progress = animatedProgress,
            backgroundColor = KPDesign.colors.colorBackground,
            color = KPDesign.colors.colorPrimary,
            strokeCap = StrokeCap.Round
        )
    }
}

/**
 * Composable function for displaying a horizontal loading indicator.
 * This function creates a horizontal loading indicator that can be used in Jetpack Compose UI.
 *
 * @param modifier Optional parameter to specify the modifier for this composable.
 * @param progressState Optional parameter to specify the state of the loading progress. Defaults to INFINITIVE.
 * @param progressValue Optional parameter to specify the progress value (0.0 to 1.0). Defaults to 0.0.
 */
@Composable
@Deprecated(
    message = "Use KPHorizontalLoadingIndicator instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun HorizontalLoadingIndicator(
    modifier: Modifier = Modifier,
    progressState: HorizontalProgressState = HorizontalProgressState.INFINITIVE,
    @FloatRange(0.0, 1.0) progressValue: Float = 0.0F,
) {

    val progress by remember { mutableFloatStateOf(progressValue) }
    val progressModifier: Modifier = modifier.fillMaxWidth()

    val animatedProgress = animateFloatAsState(
        targetValue = progress,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec, label = ""
    ).value

    if (progressState == HorizontalProgressState.INFINITIVE) {
        LinearProgressIndicator(
            modifier = progressModifier,
            backgroundColor = TrendyolDesign.colors.colorBackground,
            color = TrendyolDesign.colors.colorPrimary,
            strokeCap = StrokeCap.Round
        )
    } else {
        LinearProgressIndicator(
            modifier = progressModifier,
            progress = animatedProgress,
            backgroundColor = TrendyolDesign.colors.colorBackground,
            color = TrendyolDesign.colors.colorPrimary,
            strokeCap = StrokeCap.Round
        )
    }
}

public enum class HorizontalProgressState {
    INFINITIVE, PROGRESSIVE
}

@Preview(showSystemUi = true)
@Composable
private fun LoadingHorizontalViewInfinitivePreview() {
    PreviewTheme {
        KPHorizontalLoadingIndicator(progressState = HorizontalProgressState.INFINITIVE)
    }
}

@Preview(showSystemUi = true)
@Composable
private fun LoadingHorizontalViewProgressivePreview() {
    PreviewTheme {
        KPHorizontalLoadingIndicator(progressState = HorizontalProgressState.PROGRESSIVE)
    }
}
