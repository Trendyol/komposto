package com.trendyol.design.core.countdowntimer

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.IconSize
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Colon
import com.trendyol.design.core.preview.PreviewTheme
import java.util.concurrent.TimeUnit

/**
 * A composable function that displays a countdown timer with hours, minutes, and seconds.
 * The timer counts down to the specified `endDate` and is styled according to the provided `CountdownTimerStyle`
 * and `CountdownTimerSize`. The composable automatically handles the lifecycle of the countdown timer, including
 * starting and stopping the timer.
 *
 * @param style The style configuration for the countdown timer, which defines the text style and background color.
 * @param size The size configuration for the countdown timer, which determines the padding and layout.
 * @param endDate The end date for the countdown, represented as a `Long` timestamp in milliseconds.
 * @param modifier A `Modifier` used to adjust the layout or behavior of the composable. Defaults to `Modifier`.
 * @param backgroundAlpha The alpha value for the background color, allowing control over the transparency of the time boxes. Defaults to `1F`.
 * @param onTimerFinish Registers a callback to be invoked when the timer finishes.
 */
@Composable
public fun KPCountdownTimer(
    size: CountdownTimerSize,
    endDate: Long,
    modifier: Modifier = Modifier,
    onTimerFinish: () -> Unit = {},
    style: CountdownTimerStyle = KPCountdownTimerStyle.Primary,
    backgroundAlpha: Float = 1F,
) {
    val latestOnTimerFinish by rememberUpdatedState(onTimerFinish)
    val state = rememberSaveable(endDate, saver = CountdownTimerState.Saver) {
        CountdownTimerState(endDate = endDate)
    }
    val remainingTimes by remember(state) {
        derivedStateOf { state.getRemainingTimes(state.remainingTime) }
    }
    val isVisible by remember(state) { derivedStateOf { state.isVisible } }

    DisposableEffect(state) {
        state.setOnTimerFinishListener(latestOnTimerFinish)
        state.startTimer()
        onDispose { state.cancelTimer() }
    }

    if (isVisible) {
        val (hours, minutes, seconds) = remainingTimes
        CompositionLocalProvider(
            LocalLayoutDirection provides LayoutDirection.Ltr
        ) {
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                TimeBoxItem(
                    style = style,
                    size = size,
                    time = hours,
                    backgroundAlpha = backgroundAlpha,
                )
                Spacer(modifier = Modifier.width(size.verticalBoxPadding))
                KPIcon(
                    size = CustomIconSize,
                    imageVector = KPIcons.Fill.Colon,
                    contentDescription = KPIcons.Fill.Colon.name,
                    tint = style.separatorTintColor
                )
                Spacer(modifier = Modifier.width(size.verticalBoxPadding))
                TimeBoxItem(
                    style = style,
                    size = size,
                    time = minutes,
                    backgroundAlpha = backgroundAlpha,
                )
                Spacer(modifier = Modifier.width(size.verticalBoxPadding))
                Icon(
                    size = CustomIconSize,
                    imageVector = KPIcons.Fill.Colon,
                    contentDescription = KPIcons.Fill.Colon.name,
                    tint = style.separatorTintColor
                )
                Spacer(modifier = Modifier.width(size.verticalBoxPadding))
                TimeBoxItem(
                    style = style,
                    size = size,
                    time = seconds,
                    backgroundAlpha = backgroundAlpha,
                )
            }
        }
    }
}

private object CustomIconSize : IconSize {

    override val dp: Dp
        get() = 8.dp
}

@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
private fun CountDownTimerLargePreview() {
    PreviewTheme {
        KPCountdownTimer(
            style = KPCountdownTimerStyle.Primary,
            size = KPCountdownTimerSize.Large,
            endDate = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(PREVIEW_DURATION),
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
private fun CountDownTimerMediumPreview() {
    PreviewTheme {
        KPCountdownTimer(
            style = KPCountdownTimerStyle.Primary,
            size = KPCountdownTimerSize.Medium,
            endDate = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(PREVIEW_DURATION),
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
private fun CountDownTimerSmallPreview() {
    PreviewTheme {
        KPCountdownTimer(
            style = KPCountdownTimerStyle.Primary,
            size = KPCountdownTimerSize.Small,
            endDate = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(PREVIEW_DURATION),
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF000000, locale = "ar-AR")
@Composable
private fun CountDownTimerRTLPreview() {
    PreviewTheme {
        KPCountdownTimer(
            style = KPCountdownTimerStyle.Primary,
            size = KPCountdownTimerSize.Large,
            endDate = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(PREVIEW_DURATION),
        )
    }
}

private const val PREVIEW_DURATION = 3672L
