@file:OptIn(ExperimentalKompostoApi::class)

package countdowntimer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.countdowntimer.KPCountdownTimer
import com.trendyol.design.core.countdowntimer.KPCountdownTimerSize
import com.trendyol.design.core.countdowntimer.KPCountdownTimerStyle
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test
import java.util.concurrent.TimeUnit

internal class CountdownTimerTest : DesignScreenshotTest() {

    private val endTime = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3672L)

    @Test
    fun sizeTest() = runScreenShotTest(
        testName = "sizeTest",
        contents = listOf(
            DesignScreenshotTestContainer("Small") {
                BoxWithHorizontalPadding {
                    Box(
                        modifier = Modifier
                            .background(KPDesign.colors.colorPrimary)
                            .padding(4.dp)
                    ) {
                        KPCountdownTimer(
                            style = KPCountdownTimerStyle.Primary,
                            size = KPCountdownTimerSize.Small,
                            endDate = endTime,
                            backgroundAlpha = 0.8f
                        )
                    }
                }
            },
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    Box(
                        modifier = Modifier
                            .background(KPDesign.colors.colorPrimary)
                            .padding(4.dp)
                    ) {
                        KPCountdownTimer(
                            style = KPCountdownTimerStyle.Primary,
                            size = KPCountdownTimerSize.Medium,
                            endDate = endTime,
                            backgroundAlpha = 0.8f
                        )
                    }
                }
            },
            DesignScreenshotTestContainer("Large") {
                BoxWithHorizontalPadding {
                    Box(
                        modifier = Modifier
                            .background(KPDesign.colors.colorPrimary)
                            .padding(4.dp)
                    ) {
                        KPCountdownTimer(
                            style = KPCountdownTimerStyle.Primary,
                            size = KPCountdownTimerSize.Large,
                            endDate = endTime,
                            backgroundAlpha = 0.8f
                        )
                    }
                }
            }
        )
    )

    @Test
    fun styleTest() = runScreenShotTest(
        testName = "styleTest",
        contents = listOf(
            DesignScreenshotTestContainer("Primary Style") {
                BoxWithHorizontalPadding {
                    Box(
                        modifier = Modifier
                            .background(KPDesign.colors.colorPrimary)
                            .padding(4.dp)
                    ) {
                        KPCountdownTimer(
                            style = KPCountdownTimerStyle.Primary,
                            size = KPCountdownTimerSize.Medium,
                            endDate = endTime,
                            backgroundAlpha = 0.8f
                        )
                    }
                }
            }
        )
    )

    @Test
    fun backgroundAlphaTest() = runScreenShotTest(
        testName = "backgroundAlphaTest",
        contents = listOf(
            DesignScreenshotTestContainer("Alpha 0.5") {
                BoxWithHorizontalPadding {
                    Box(
                        modifier = Modifier
                            .background(KPDesign.colors.colorPrimary)
                            .padding(4.dp)
                    ) {
                        KPCountdownTimer(
                            style = KPCountdownTimerStyle.Primary,
                            size = KPCountdownTimerSize.Medium,
                            endDate = endTime,
                            backgroundAlpha = 0.5f
                        )
                    }
                }
            },
            DesignScreenshotTestContainer("Alpha 0.8") {
                BoxWithHorizontalPadding {
                    Box(
                        modifier = Modifier
                            .background(KPDesign.colors.colorPrimary)
                            .padding(4.dp)
                    ) {
                        KPCountdownTimer(
                            style = KPCountdownTimerStyle.Primary,
                            size = KPCountdownTimerSize.Medium,
                            endDate = endTime,
                            backgroundAlpha = 0.8f
                        )
                    }
                }
            },
            DesignScreenshotTestContainer("Alpha 1.0") {
                BoxWithHorizontalPadding {
                    Box(
                        modifier = Modifier
                            .background(KPDesign.colors.colorPrimary)
                            .padding(4.dp)
                    ) {
                        KPCountdownTimer(
                            style = KPCountdownTimerStyle.Primary,
                            size = KPCountdownTimerSize.Medium,
                            endDate = endTime,
                            backgroundAlpha = 1.0f
                        )
                    }
                }
            }
        )
    )

    @Test
    fun multipleTimersTest() = runScreenShotTest(
        testName = "multipleTimersTest",
        contents = listOf(
            DesignScreenshotTestContainer("Multiple Timers") {
                BoxWithHorizontalPadding {
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .background(KPDesign.colors.colorPrimary)
                                    .padding(4.dp)
                            ) {
                                KPCountdownTimer(
                                    style = KPCountdownTimerStyle.Primary,
                                    size = KPCountdownTimerSize.Small,
                                    endDate = endTime,
                                    backgroundAlpha = 0.8f
                                )
                            }
                            Spacer(modifier = Modifier.width(16.dp))
                            KPText("Small Timer")
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .background(KPDesign.colors.colorPrimary)
                                    .padding(4.dp)
                            ) {
                                KPCountdownTimer(
                                    style = KPCountdownTimerStyle.Primary,
                                    size = KPCountdownTimerSize.Medium,
                                    endDate = endTime,
                                    backgroundAlpha = 0.8f
                                )
                            }
                            Spacer(modifier = Modifier.width(16.dp))
                            KPText("Medium Timer")
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .background(KPDesign.colors.colorPrimary)
                                    .padding(4.dp)
                            ) {
                                KPCountdownTimer(
                                    style = KPCountdownTimerStyle.Primary,
                                    size = KPCountdownTimerSize.Large,
                                    endDate = endTime,
                                    backgroundAlpha = 0.8f
                                )
                            }
                            Spacer(modifier = Modifier.width(16.dp))
                            KPText("Large Timer")
                        }
                    }
                }
            }
        )
    )
}
