@file:OptIn(ExperimentalKompostoApi::class)

package countdowntimer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.countdowntimer.KPCountdownTimer
import com.trendyol.design.core.countdowntimer.KPCountdownTimerSize
import com.trendyol.design.core.countdowntimer.KPCountdownTimerStyle
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

}