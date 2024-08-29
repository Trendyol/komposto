package com.trendyol.design.ui.component.countdowntimer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.countdowntimer.KPCountdownTimer
import com.trendyol.design.core.countdowntimer.KPCountdownTimerSize
import com.trendyol.design.core.countdowntimer.KPCountdownTimerStyle
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.TrendyolDesign
import java.util.concurrent.TimeUnit

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.TIMER,
    name = Component.COUNTDOWN_TIMER,
    styleName = "1.Large"
)
@Composable
internal fun Countdown_Timer_Large() {
    TrendyolTheme {
        Box(
            modifier = Modifier
                .background(TrendyolDesign.colors.colorPrimary)
                .padding(4.dp),
        ) {
            KPCountdownTimer(
                style = KPCountdownTimerStyle.Primary,
                size = KPCountdownTimerSize.Large,
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
    styleName = "2.Medium"
)
@Composable
internal fun Countdown_Timer_Medium() {
    TrendyolTheme {
        Box(
            modifier = Modifier
                .background(TrendyolDesign.colors.colorPrimary)
                .padding(4.dp),
        ) {
            KPCountdownTimer(
                style = KPCountdownTimerStyle.Primary,
                size = KPCountdownTimerSize.Medium,
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
    styleName = "3.Small"
)
@Composable
internal fun Countdown_Timer_Small() {
    TrendyolTheme {
        Box(
            modifier = Modifier
                .background(TrendyolDesign.colors.colorPrimary)
                .padding(4.dp),
        ) {
            KPCountdownTimer(
                style = KPCountdownTimerStyle.Primary,
                size = KPCountdownTimerSize.Small,
                endDate = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(PREVIEW_DURATION),
                backgroundAlpha = .8F
            )
        }
    }
}

private const val PREVIEW_DURATION = 3672L
