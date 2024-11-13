package com.trendyol.design.core.snackbar

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.button.Button
import com.trendyol.design.core.button.TrendyolButtonSize
import com.trendyol.design.core.button.TrendyolButtonStyle
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.outline.Cancel
import com.trendyol.theme.LocalTrendyolDesignTheme
import com.trendyol.theme.TrendyolDesign


/**
 * A customizable snackbar component that displays a message based on the provided [KompostoSnackbarData]
 * with optional action and dismiss button.
 *
 * @param modifier A [Modifier] to customize the appearance or behavior of the snackbar, such as padding, size, or alignment.
 * Default is [Modifier], meaning no additional customization unless specified.
 * @param kompostoSnackbarData A data object containing the information needed to display the snackbar's content.
 * This object is nullable, and if `null`, the snackbar will not be displayed or will show default data.
 * @param backgroundColor The background color of the snackbar. Default is a color fetched from the current theme's
 * `colorOnSurfaceVariant3` using [LocalTrendyolDesignTheme].
 * @param onDismissButtonClicked A lambda function that gets triggered when the dismiss button is clicked.
 * This is nullable; if no dismiss action is required, this can be omitted or set to `null`.
 * @param content Optional composable content that can be placed inside the snackbar, in addition to the title and subtitle.
 * Default is `null`, meaning no extra content is shown.
 *
 * ### Usage Example:
 * You can use in Scaffold or any composable.
 *
 * To show a `KompostoSnackbar` using `KompostoSnackbarHost`, you must follow these steps:
 *
 *
 * ```kotlin
 * @Composable
 * fun MySnackbarExample() {
 *     // 1. Create the KompostoSnackbarHostState
 *     val snackbarHostState = rememberKompostoSnackbarHostState()
 *
 *     // 2. Create KompostoSnackbarHost to hold the snackbar
 *     KompostoSnackbarHost(
 *         hostState = snackbarHostState,
 *         modifier = Modifier.fillMaxWidth()
 *     ) { data, kompostoData ->
 *         KompostoSnackbar()
 *     }
 *
 *     // 3. Trigger the snackbar to show
 *     LaunchedEffect(Unit) {
 *         snackbarHostState.showKompostoSnackbar(
 *             kompostoSnackbarData = KompostoSnackbarData(
 *                 title = "Action Successful!",
 *                 subtitle = "Your changes have been saved.",
 *                 actionLabel = "Undo",
 *                 onActionClicked = { /* Handle undo action */ }
 *             ),
 *             duration = ..
 *         )
 *     }
 * }
 * ```
 */
@Composable
public fun KompostoSnackbar(
    modifier: Modifier = Modifier,
    kompostoSnackbarData: KompostoSnackbarData?,
    backgroundColor: Color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3,
    onDismissButtonClicked: (() -> Unit)? = null,
    content: @Composable (() -> Unit)? = null
) {
    if (kompostoSnackbarData == null) return
    Box(modifier = modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(top = 10.dp)
                .background(color = backgroundColor)
                .padding(12.dp)
        ) {
            if (content != null) {
                content()
                Spacer(modifier = Modifier.width(12.dp))
            }
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = kompostoSnackbarData.title,
                    style = TrendyolDesign.typography.titleMediumColorOnPrimary,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                if (kompostoSnackbarData.subtitle.isNotEmpty()) {
                    Text(
                        text = kompostoSnackbarData.subtitle,
                        style = TrendyolDesign.typography.subtitleMediumColorOnSurfaceVariant1,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
            SnackbarActionButton(kompostoSnackbarData.actionButton)
        }
        if (kompostoSnackbarData.isDismissButtonVisible) {
            Box(
                modifier = Modifier
                    .padding(end = 12.dp)
                    .size(20.dp)
                    .align(Alignment.TopEnd)
                    .background(Color.White, shape = CircleShape)
                    .border(
                        2.dp,
                        color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3,
                        shape = CircleShape
                    )
                    .clickable { onDismissButtonClicked?.invoke() }
            ) {
                Icon(
                    imageVector = Icons.Outline.Cancel,
                    contentDescription = "Close",
                    size = TrendyolIconSize.Small,
                    tint = Color.Black,
                    modifier = Modifier.padding(4.dp)
                )
            }
        }
    }
}

/**
 * A customizable snackbar component that displays a message with an optional action dismiss button and content.
 *
 * @param modifier A modifier to customize the appearance or behavior of the snackbar, such as padding or size.
 * Default is [Modifier].
 * @param title The main title text to display in the snackbar. This is a required field.
 * @param subtitle An optional subtitle text to display below the title. Default is an empty string.
 * @param actionButton The action button displayed in the snackbar. It triggers an action when clicked.
 * This is a required parameter of type [KompostoSnackbarActionButton].
 * @param isDismissButtonVisible A boolean flag indicating whether the dismiss button should be visible.
 * Default is `false`.
 * @param onDismissButtonClicked A lambda function that gets triggered when the dismiss button is clicked.
 * It's nullable and can be omitted if the dismiss button is not shown or no action is needed.
 * @param backgroundColor The background color of the snackbar. Defaults to a color from the current theme
 * (using [LocalTrendyolDesignTheme]).
 * @param content Optional composable content that can be placed inside the snackbar, in addition to the title
 * and subtitle. Default is `null`, meaning no extra content is shown.
 */
@Composable
public fun KompostoSnackbar(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String = "",
    actionButton: KompostoSnackbarActionButton,
    isDismissButtonVisible: Boolean = false,
    onDismissButtonClicked: (() -> Unit)? = null,
    backgroundColor: Color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3,
    content: @Composable (() -> Unit)? = null
) {
    Box(modifier = modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(top = 10.dp)
                .background(color = backgroundColor)
                .padding(12.dp)
        ) {
            if (content != null) {
                content()
                Spacer(modifier = Modifier.width(12.dp))
            }
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = TrendyolDesign.typography.titleMediumColorOnPrimary,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                if (subtitle.isNotEmpty()) {
                    Text(
                        text = subtitle,
                        style = TrendyolDesign.typography.subtitleMediumColorOnSurfaceVariant1,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
            SnackbarActionButton(actionButton)
        }
        if (isDismissButtonVisible) {
            Box(
                modifier = Modifier
                    .padding(end = 12.dp)
                    .size(20.dp)
                    .align(Alignment.TopEnd)
                    .background(Color.White, shape = CircleShape)
                    .border(
                        2.dp,
                        color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3,
                        shape = CircleShape
                    )
                    .clickable { onDismissButtonClicked?.invoke() }
            ) {
                Icon(
                    imageVector = Icons.Outline.Cancel,
                    contentDescription = "Close",
                    size = TrendyolIconSize.Small,
                    tint = Color.Black,
                    modifier = Modifier.padding(4.dp)
                )
            }
        }
    }
}

@Composable
private fun SnackbarActionButton(
    actionButton: KompostoSnackbarActionButton,
    onActionButtonClicked: (() -> Unit)? = null
) {
    when (actionButton) {
        is KompostoSnackbarActionButton.TextButton -> {
            Spacer(modifier = Modifier.width(12.dp))
            TextButton(onClick = { onActionButtonClicked?.invoke() }) {
                Text(
                    text = actionButton.buttonText,
                    style = TrendyolDesign.typography.body1MediumColorOnPrimary
                )
            }
        }

        is KompostoSnackbarActionButton.SecondaryButton -> {
            Spacer(modifier = Modifier.width(12.dp))
            Button(
                onClick = { onActionButtonClicked?.invoke() },
                style = TrendyolButtonStyle.Secondary,
                size = TrendyolButtonSize.Medium
            ) {
                Text(
                    text = actionButton.buttonText,
                    style = TrendyolDesign.typography.body1MediumColorPrimary
                )
            }
        }

        is KompostoSnackbarActionButton.None -> Unit
    }

}