package statelayout.warninginfo

import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.statelayout.State
import com.trendyol.design.core.statelayout.StateComposeLayout
import com.trendyol.design.core.statelayout.TrendyolWarningInfoStateLayoutStyle
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class NoButtonTests : DesignScreenshotTest() {

    private val title = "İçerik Bulunamadı"
    private val description = "Yeni içerikler keşfedebilirsin."

    @Test
    fun noButtonFullVersionMediumIconWarningInfoTests() = runScreenShotTest(
        testName = "NoButton - FullVersion - MediumIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("Full Version Medium") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonFullVersion(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                                title = title,
                                description = description
                            )
                        )
                    )
                }
            }
        )
    )

    @Test
    fun noButtonFullVersionSmallIconWarningInfoTests() = runScreenShotTest(
        testName = "NoButton - FullVersion - SmallIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("Full Version Medium") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonFullVersion(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                                title = title,
                                description = description
                            )
                        )
                    )
                }
            }
        ),
    )

    @Test
    fun noButtonNoDescriptionMediumIconWarningInfoTests() = runScreenShotTest(
        testName = "NoButton - NoDescription - MediumIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("No Description Medium") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonNoDescription(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                                title = title
                            )
                        )
                    )
                }
            }
        ),
    )

    @Test
    fun noButtonNoDescriptionSmallIconWarningInfoTests() = runScreenShotTest(
        testName = "NoButton - NoDescription - SmallIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("No Description Small") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonNoDescription(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                                title = title
                            )
                        )
                    )
                }
            }
        ),
    )

    @Test
    fun noButtonNoTitleMediumIconWarningInfoTests() = runScreenShotTest(
        testName = "NoButton - NoTitle - MediumIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("No Title Medium") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonNoTitle(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                                description = description
                            )
                        )
                    )
                }
            }
        ),
    )

    @Test
    fun noButtonNoTitleSmallIconWarningInfoTests() = runScreenShotTest(
        testName = "NoButton - NoTitle - SmallIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("No Title Small") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonNoTitle(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                                description = description
                            )
                        )
                    )
                }
            }
        ),
    )
}