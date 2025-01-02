package com.trendyol.design.core.countdowntimer

import android.os.CountDownTimer
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.setValue
import java.util.concurrent.TimeUnit

/**
 * Represents a countdown timer state with functionality to track the remaining time,
 * control the timer's visibility, and handle the timer's lifecycle events.
 *
 * This class is designed to work seamlessly with Jetpack Compose by using mutable states
 * to notify recompositions when the state changes.
 *
 * @constructor Creates a new [CountdownTimerState] instance.
 * @param endDate The end time of the countdown timer, represented in milliseconds since epoch.
 *
 * @property remainingTime The remaining time in milliseconds. This is updated in real-time
 * as the timer counts down.
 * @property isVisible Indicates whether the countdown timer is currently visible.
 *
 * @function startTimer Starts the countdown timer. If the `endDate` is invalid (<= 0),
 * the timer will be canceled immediately.
 * @function cancelTimer Cancels the countdown timer and stops any updates to the state.
 * @function setOnTimerFinishListener Registers a callback to be invoked when the timer finishes.
 * @function getRemainingTimes Calculates and returns the remaining time as a [Triple] containing
 * hours, minutes, and seconds.
 */
@Stable
public class CountdownTimerState(
    public val endDate: Long,
) {
    private var onTimerFinish: () -> Unit = {}
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

    public fun setOnTimerFinishListener(action: () -> Unit) {
        onTimerFinish = action
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
                onTimerFinish.invoke()
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
