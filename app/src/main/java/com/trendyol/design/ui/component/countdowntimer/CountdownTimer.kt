package com.trendyol.design.ui.component.countdowntimer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.countdowntimer.CountDownTimer
import com.trendyol.design.core.countdowntimer.TrendyolCountdownTimerSize
import com.trendyol.design.core.countdowntimer.TrendyolCountdownTimerStyle
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.TrendyolDesign
import java.util.concurrent.TimeUnit

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.TIMER,
    name = Component.COUNTDOWN_TIMER,
    styleName = "1.Primary_Large"
)
@Composable
internal fun Countdown_Timer_Large() {
    TrendyolTheme {
        Column(
            modifier = Modifier
                .background(TrendyolDesign.colors.colorPrimary)
                .padding(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            CountDownTimer(
                style = TrendyolCountdownTimerStyle.Primary,
                size = TrendyolCountdownTimerSize.Large,
                endDate = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(PREVIEW_DURATION),
            )
            CountDownTimer(
                style = TrendyolCountdownTimerStyle.Primary,
                size = TrendyolCountdownTimerSize.Large,
                endDate = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(PREVIEW_DURATION),
                backgroundAlpha = .8F
            )
        }
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.TIMER,
    name = Component.COUNTDOWN_TIMER,
    styleName = "2.Primary_Medium"
)
@Composable
internal fun Countdown_Timer_Medium() {
    TrendyolTheme {
        Column(
            modifier = Modifier
                .background(TrendyolDesign.colors.colorPrimary)
                .padding(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            CountDownTimer(
                style = TrendyolCountdownTimerStyle.Primary,
                size = TrendyolCountdownTimerSize.Medium,
                endDate = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(PREVIEW_DURATION),
            )
            CountDownTimer(
                style = TrendyolCountdownTimerStyle.Primary,
                size = TrendyolCountdownTimerSize.Medium,
                endDate = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(PREVIEW_DURATION),
                backgroundAlpha = .8F
            )
        }
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.TIMER,
    name = Component.COUNTDOWN_TIMER,
    styleName = "3.Primary_Small"
)
@Composable
internal fun Countdown_Timer_Small() {
    TrendyolTheme {
        Column(
            modifier = Modifier
                .background(TrendyolDesign.colors.colorPrimary)
                .padding(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            CountDownTimer(
                style = TrendyolCountdownTimerStyle.Primary,
                size = TrendyolCountdownTimerSize.Small,
                endDate = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(PREVIEW_DURATION),
            )
            CountDownTimer(
                style = TrendyolCountdownTimerStyle.Primary,
                size = TrendyolCountdownTimerSize.Small,
                endDate = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(PREVIEW_DURATION),
                backgroundAlpha = .8F
            )
        }
    }
}

private const val PREVIEW_DURATION = 3672L
