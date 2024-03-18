package com.trendyol.design.core.statelayout

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.trendyol.design.core.statelayout.states.loading.LoadingHorizontalView
import com.trendyol.design.core.statelayout.states.warningInfo.WarningInfoStateComposable

@Composable
fun StateComposeLayout(
    modifier: Modifier = Modifier,
    layoutState: State,
    contentStateLayout: @Composable () -> Unit = {},
    warningInfoStateLayout: @Composable (WarningInfoStateLayoutStyle) -> Unit =
        { warningInfoStateLayoutStyle ->
            WarningInfoStateComposable(
                warningInfoStateLayoutStyle = warningInfoStateLayoutStyle,
            )
        },
    loadingStateLayout: @Composable (message: String) -> Unit = { /*todo loadingState*/ },
) {

    Box(modifier = modifier) {
        when (layoutState) {
            is State.ContentWithLoading ->
                ContentState(layoutState, contentStateLayout)

            is State.WarningInfo -> warningInfoStateLayout(
                layoutState.warningInfoStateLayoutStyle,
            )

            is State.Loading ->
                loadingStateLayout(layoutState.message.orEmpty())
        }
    }
}

@Composable
fun ContentState(
    content: State.ContentWithLoading,
    contentLayout: @Composable () -> Unit,
) {
    if (content.type != null) {
        LoadingHorizontalView()
    }
    contentLayout()
}
