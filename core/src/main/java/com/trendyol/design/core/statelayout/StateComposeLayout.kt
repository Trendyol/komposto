package com.trendyol.design.core.statelayout

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.trendyol.design.core.statelayout.states.loading.CircularLoadingIndicator
import com.trendyol.design.core.statelayout.states.loading.HorizontalLoadingIndicator
import com.trendyol.design.core.statelayout.states.loading.LoadingType
import com.trendyol.design.core.statelayout.states.warningInfo.WarningInfoStateComposable

@Composable
fun StateComposeLayout(
    modifier: Modifier = Modifier,
    state: State,
    contentStateLayout: @Composable () -> Unit = {},
    warningInfoStateLayout: @Composable (WarningInfoStateLayoutStyle) -> Unit =
        { warningInfoStateLayoutStyle ->
            WarningInfoStateComposable(
                warningInfoStateLayoutStyle = warningInfoStateLayoutStyle,
            )
        },
    loadingStateLayout: @Composable (message: String) -> Unit = { CircularLoadingIndicator() },
) {

    Box(modifier = modifier) {
        when (state) {
            is State.ContentWithLoading ->
                ContentState(state, contentStateLayout)

            is State.WarningInfo -> warningInfoStateLayout(
                state.warningInfoStateLayoutStyle,
            )

            is State.Loading ->
                loadingStateLayout(state.message.orEmpty())
        }
    }
}

@Composable
fun ContentState(
    content: State.ContentWithLoading,
    contentLayout: @Composable () -> Unit,
) {
    contentLayout()

    when (content.loadingType) {
        LoadingType.Circular -> CircularLoadingIndicator()
        LoadingType.Progressive -> HorizontalLoadingIndicator()
        else -> Unit
    }
}
