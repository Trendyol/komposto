package com.trendyol.design.core.countdowntimer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.Text
import java.util.Locale

/**
 * A composable function that displays a single time unit (hours, minutes, or seconds) in a countdown timer.
 * The time unit is styled according to the provided `CountdownTimerStyle` and `CountdownTimerSize`.
 * The background color of the time box can also be adjusted with an alpha value.
 *
 * @param style The style configuration for the countdown timer, which provides the text style and background color.
 * @param size The size configuration for the countdown timer, which defines the padding around the time box.
 * @param time The time unit to be displayed, represented as a `Long` value.
 * @param backgroundAlpha The alpha value for the background color, allowing control over the transparency of the background.
 * @param modifier A `Modifier` used to adjust the layout or behavior of the composable. Defaults to `Modifier`.
 */
@Composable
internal fun TimeBoxItem(
    style: CountdownTimerStyle,
    size: CountdownTimerSize,
    time: Long,
    backgroundAlpha: Float,
    modifier: Modifier = Modifier,
) {
    Text(
        modifier = modifier
            .wrapContentSize()
            .background(
                color = style.backgroundColor.copy(alpha = backgroundAlpha),
                shape = RoundedCornerShape(4.dp)
            )
            .padding(
                horizontal = size.horizontalPadding,
                vertical = size.verticalPadding
            ),
        text = String.format(Locale.getDefault(), TIME_FORMAT, time),
        style = style.textStyle(size = size),
        maxLines = 1
    )
}

private const val TIME_FORMAT = "%02d"

@Preview(showBackground = true)
@Composable
internal fun TimeRowItemLargePreview() {
    PreviewTheme {
        TimeBoxItem(
            style = TrendyolCountdownTimerStyle.Primary,
            size = TrendyolCountdownTimerSize.Large,
            time = 24,
            backgroundAlpha = .5F,
            modifier = Modifier.width(24.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun TimeRowItemMediumPreview() {
    PreviewTheme {
        TimeBoxItem(
            style = TrendyolCountdownTimerStyle.Primary,
            size = TrendyolCountdownTimerSize.Medium,
            modifier = Modifier.width(24.dp),
            time = 24,
            backgroundAlpha = .5F,
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun TimeRowItemSmallPreview() {
    PreviewTheme {
        TimeBoxItem(
            style = TrendyolCountdownTimerStyle.Primary,
            size = TrendyolCountdownTimerSize.Small,
            modifier = Modifier.width(24.dp),
            time = 24,
            backgroundAlpha = .5F,
        )
    }
}
