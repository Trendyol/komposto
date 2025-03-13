package com.trendyol.design.core.statelayout

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.trendyol.design.core.statelayout.states.loading.CircularLoadingIndicator
import com.trendyol.design.core.statelayout.states.loading.HorizontalLoadingIndicator
import com.trendyol.design.core.statelayout.states.loading.KPCircularLoadingIndicator
import com.trendyol.design.core.statelayout.states.loading.KPHorizontalLoadingIndicator
import com.trendyol.design.core.statelayout.states.loading.LoadingType
import com.trendyol.design.core.statelayout.states.warningInfo.KPWarningInfoStateComposable
import com.trendyol.design.core.statelayout.states.warningInfo.WarningInfoStateComposable

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
 * @see State
 */
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
) {
    Box(modifier = modifier) {
        when (state) {
            is State.ContentWithLoading ->
                KPContentState(state, contentStateLayout)

            is State.WarningInfo -> warningInfoStateLayout(
                state.warningInfoStateLayoutStyle,
            )

            is State.Loading ->
                loadingStateLayout(state.message.orEmpty())
        }
    }
}

@Composable
@Deprecated(
    message = "Use KPStateComposeLayout instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun StateComposeLayout(
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

/**
 * A composable function for displaying content along with an optional loading indicator. The type of loading
 * indicator is determined by the [State.ContentWithLoading.loadingType].
 *
 * @param content The [State.ContentWithLoading] instance containing the content and loading type.
 * @param contentLayout A composable lambda for rendering the content.
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
 * @see State.ContentWithLoading
 */
@Composable
public fun KPContentState(
    content: State.ContentWithLoading,
    contentLayout: @Composable () -> Unit,
) {
    contentLayout()

    when (content.loadingType) {
        LoadingType.Circular -> KPCircularLoadingIndicator()
        LoadingType.Progressive -> KPHorizontalLoadingIndicator()
        else -> Unit
    }
}

@Composable
@Deprecated(
    message = "Use KPContentState instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun ContentState(
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
