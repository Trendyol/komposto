package com.trendyol.design.core.countdowntimer

import android.os.CountDownTimer
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.setValue
import java.util.concurrent.TimeUnit

@Stable
public class CountdownTimerState(
    public val endDate: Long,
) {
    private var onTimerFinished: () -> Unit = {}
    private val countDownTimer: CountDownTimer by lazy {
        createCountDownTimer()
    }

    public var remainingTime: Long by mutableLongStateOf(endDate - System.currentTimeMillis())
        private set
    public var isVisible: Boolean by mutableStateOf(true)
        private set

    public fun startTimer() {
        if (endDate <= 0) {
            cancelTimer()
            return
        }
        countDownTimer.start()
    }

    public fun cancelTimer() {
        countDownTimer.cancel()
    }

    public fun setOnTimerFinishedListener(action: () -> Unit) {
        onTimerFinished = action
    }

    public fun getRemainingTimes(time: Long): Triple<Long, Long, Long> {
        val seconds = time / ONE_SECOND_MILLISECONDS
        val hours = seconds / ONE_HOUR_SECONDS
        val minutes = (seconds % ONE_HOUR_SECONDS) / ONE_MINUTE_SECONDS
        val remainingSeconds = seconds % ONE_MINUTE_SECONDS

        return Triple(hours, minutes, remainingSeconds)
    }

    private fun createCountDownTimer(): CountDownTimer {
        return object : CountDownTimer(
            endDate - System.currentTimeMillis(),
            TICK_INTERVAL
        ) {
            override fun onTick(millisUntilFinished: Long) {
                remainingTime = endDate - System.currentTimeMillis()
            }

            override fun onFinish() {
                remainingTime = 0
                isVisible = false
                onTimerFinished.invoke()
            }
        }
    }

    public companion object {
        private val TICK_INTERVAL = TimeUnit.SECONDS.toMillis(1)
        private const val ONE_HOUR_SECONDS = 3600
        private const val ONE_MINUTE_SECONDS = 60
        private const val ONE_SECOND_MILLISECONDS = 1000
        internal val Saver = listSaver(
            save = { listOf(it.endDate) },
            restore = {
                CountdownTimerState(
                    endDate = it[0] as Long,
                )
            }
        )
    }
}
