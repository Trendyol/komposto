package com.trendyol.design.core.countdowntimer

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.Text

/**
 * A composable function that displays a separator text in a countdown timer.
 * The style of the separator, including text style and color, is defined by the provided `CountdownTimerStyle`.
 *
 * @param modifier A `Modifier` used to adjust the layout or behavior of the composable. Defaults to `Modifier`.
 * @param style The style configuration for the countdown timer, which provides the separator text style and separator color.
 */
@Composable
internal fun TimeBoxSeparator(
    modifier: Modifier = Modifier,
    style: CountdownTimerStyle,
) {
    Text(
        modifier = modifier,
        text = SEPARATOR,
        style = style.separatorTextStyle,
        color = style.backgroundColor,
    )
}

private const val SEPARATOR = ":"

@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
private fun TimeRowItemSeparatorPreview() {
    PreviewTheme {
        TimeBoxSeparator(
            style = TrendyolCountdownTimerStyle.Primary,
        )
    }
}
