package com.trendyol.design.core.statelayout

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.statelayout.states.loading.KPCircularLoadingIndicator
import com.trendyol.design.core.statelayout.states.loading.KPHorizontalLoadingIndicator
import com.trendyol.design.core.statelayout.states.loading.KPLoadingIndicatorStyle
import com.trendyol.design.core.statelayout.states.loading.LoadingIndicatorStyle
import com.trendyol.design.core.statelayout.states.loading.LoadingType
import com.trendyol.design.core.statelayout.states.warningInfo.KPWarningInfoStateComposable

/**
 * A composable function that renders different layouts based on the given [State]. It supports displaying content,
 * warning/informational states, and loading indicators.
 *
 * This function acts as a state-based UI manager, delegating the rendering of specific states to the provided
 * composable lambdas.
 *
 * @param modifier [Modifier] to apply to the root container. Default is [Modifier].
 * @param state The current [State] which determines what layout is displayed.
 * @param contentStateLayout A composable lambda for rendering the content state. Default is an empty composable.
 * @param warningInfoStateLayout A composable lambda for rendering a warning or informational state.
 * By default, it uses [KPWarningInfoStateComposable].
 * @param loadingStateLayout A composable lambda for rendering a loading state. By default, it displays a
 * circular loading indicator using [KPCircularLoadingIndicator].
 * @param loadingIndicatorStyle Style configuration for loading indicators shown in [State.ContentWithLoading].
 * Default is [KPLoadingIndicatorStyle].
 *
 * ### Supported States
 * - **ContentWithLoading**: Displays content with an optional loading indicator.
 * - **WarningInfo**: Displays a warning or informational layout based on [WarningInfoStateLayoutStyle].
 * - **Loading**: Displays a loading indicator with an optional message.
 *
 * ## Example Usage
 * ```
 * val currentState: State = State.WarningInfo(WarningInfoStateLayoutStyle(/* ... */))
 * KPStateComposeLayout(
 *     state = currentState,
 *     contentStateLayout = {
 *         Text("This is the content layout")
 *     }
 * )
 * ```
 *
 * @see KPWarningInfoStateComposable
 * @see KPCircularLoadingIndicator
 * @see KPLoadingIndicatorStyle
 * @see State
 */
@ExperimentalKompostoApi
@Composable
public fun KPStateComposeLayout(
    modifier: Modifier = Modifier,
    state: State,
    contentStateLayout: @Composable () -> Unit = {},
    warningInfoStateLayout: @Composable (WarningInfoStateLayoutStyle) -> Unit =
        { warningInfoStateLayoutStyle ->
            KPWarningInfoStateComposable(
                warningInfoStateLayoutStyle = warningInfoStateLayoutStyle,
            )
        },
    loadingStateLayout: @Composable (message: String) -> Unit = { KPCircularLoadingIndicator() },
    loadingIndicatorStyle: LoadingIndicatorStyle = KPLoadingIndicatorStyle,
) {
    Box(modifier = modifier) {
        when (state) {
            is State.ContentWithLoading ->
                KPContentState(
                    content = state,
                    contentLayout = contentStateLayout,
                    loadingIndicatorStyle = loadingIndicatorStyle,
                )

            is State.WarningInfo -> warningInfoStateLayout(
                state.warningInfoStateLayoutStyle,
            )

            is State.Loading ->
                loadingStateLayout(state.message.orEmpty())
        }
    }
}

/**
 * A composable function for displaying content along with an optional loading indicator. The type of loading
 * indicator is determined by the [State.ContentWithLoading.loadingType].
 *
 * @param content The [State.ContentWithLoading] instance containing the content and loading type.
 * @param contentLayout A composable lambda for rendering the content.
 * @param loadingIndicatorStyle Style configuration for the loading indicators.
 * Default is [KPLoadingIndicatorStyle].
 *
 * ### Supported Loading Types
 * - **Circular**: Displays a circular loading indicator using [KPCircularLoadingIndicator].
 * - **Progressive**: Displays a horizontal loading indicator using [KPHorizontalLoadingIndicator].
 * - **None**: No loading indicator is displayed.
 *
 * ## Example Usage
 * ```
 * KPContentState(
 *     content = State.ContentWithLoading(
 *         loadingType = LoadingType.Circular
 *     )
 * ) {
 *     Text("This is the main content.")
 * }
 * ```
 *
 * @see KPCircularLoadingIndicator
 * @see KPHorizontalLoadingIndicator
 * @see KPLoadingIndicatorStyle
 * @see State.ContentWithLoading
 */
@ExperimentalKompostoApi
@Composable
public fun KPContentState(
    content: State.ContentWithLoading,
    contentLayout: @Composable () -> Unit,
    loadingIndicatorStyle: LoadingIndicatorStyle = KPLoadingIndicatorStyle,
) {
    contentLayout()

    when (content.loadingType) {
        LoadingType.Circular -> KPCircularLoadingIndicator(
            loadingIndicatorStyle = loadingIndicatorStyle,
        )
        LoadingType.Progressive -> KPHorizontalLoadingIndicator(
            loadingIndicatorStyle = loadingIndicatorStyle,
        )
        else -> Unit
    }
}
