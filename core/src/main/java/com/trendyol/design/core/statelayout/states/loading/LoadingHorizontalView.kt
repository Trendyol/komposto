package com.trendyol.design.core.statelayout.states.loading

import androidx.annotation.FloatRange
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.trendyol.design.core.previewtheme.PreviewTheme

@Composable
fun LoadingHorizontalView(
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
        LinearProgressIndicator(modifier = progressModifier)
    } else {
        LinearProgressIndicator(modifier = progressModifier, progress = animatedProgress)
    }
}

enum class HorizontalProgressState {
    INFINITIVE, PROGRESSIVE
}

@Preview(showSystemUi = true)
@Composable
private fun LoadingHorizontalViewInfinitivePreview() {
    PreviewTheme {
        LoadingHorizontalView(progressState = HorizontalProgressState.INFINITIVE)
    }
}

@Preview(showSystemUi = true)
@Composable
private fun LoadingHorizontalViewProgressivePreview() {
    PreviewTheme {
        LoadingHorizontalView(progressState = HorizontalProgressState.PROGRESSIVE)
    }
}
