package com.trendyol.design.core.statelayout

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.trendyol.design.core.statelayout.states.loading.LoadingHorizontalView
import com.trendyol.design.core.statelayout.states.warningInfo.WarningInfoStateComposable

@Composable
fun StateComposeLayout(
    modifier: Modifier = Modifier,
    layoutState: LayoutState,
    contentStateLayout: @Composable () -> Unit = {},
    warningInfoStateLayout: InfoModel,
    loadingStateLayout: @Composable (message: String) -> Unit = { /*todo loadingState*/ },
) {

    Box(modifier = modifier) {
        when (layoutState.content) {
            is State.Content ->
                ContentState(layoutState.content as State.Content, contentStateLayout)

            is State.WarningInfo -> WarningInfoStateComposable(infoModel = warningInfoStateLayout)
            is State.Loading ->
                loadingStateLayout((layoutState.content as State.Loading).message.orEmpty())
        }
    }
}

@Composable
fun ContentState(
    content: State.Content,
    contentLayout: @Composable () -> Unit,
) {
    if (content.type != null) {
        LoadingHorizontalView()
    }
    contentLayout()
}
