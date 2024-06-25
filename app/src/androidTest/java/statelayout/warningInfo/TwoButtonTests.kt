package statelayout.warningInfo

import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.statelayout.State
import com.trendyol.design.core.statelayout.StateComposeLayout
import com.trendyol.design.core.statelayout.TrendyolWarningInfoStateLayoutStyle
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class TwoButtonTests : DesignScreenshotTest() {

    private val contents = listOf(
        DesignScreenshotTestContainer("Full Version Medium") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.TwoButtonsFullVersion(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            title = "İçerik Bulunamadı",
                            description = "Yeni içerikler keşfedebilirsin.",
                            primaryButtonText = "Alışverişe Devam Et",
                            primaryButtonClickListener = {},
                            secondaryButtonText = "Alışverişe Devam Et",
                            secondaryButtonClickListener = {}
                        )
                    )
                )
            }
        },

        DesignScreenshotTestContainer("Full Version Small") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.TwoButtonsFullVersion(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            title = "İçerik Bulunamadı",
                            description = "Yeni içerikler keşfedebilirsin.",
                            primaryButtonText = "Alışverişe Devam Et",
                            primaryButtonClickListener = {},
                            secondaryButtonText = "Alışverişe Devam Et",
                            secondaryButtonClickListener = {}
                        )
                    )
                )
            }
        },

        DesignScreenshotTestContainer("No Description Medium") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.TwoButtonsNoDescription(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            title = "İçerik Bulunamadı",
                            primaryButtonText = "Alışverişe Devam Et",
                            primaryButtonClickListener = {},
                            secondaryButtonText = "Alışverişe Devam Et",
                            secondaryButtonClickListener = {}
                        )
                    )
                )
            }
        },
        DesignScreenshotTestContainer("No Description Small") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.TwoButtonsNoDescription(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            title = "İçerik Bulunamadı",
                            primaryButtonText = "Alışverişe Devam Et",
                            primaryButtonClickListener = {},
                            secondaryButtonText = "Alışverişe Devam Et",
                            secondaryButtonClickListener = {}
                        )
                    )
                )
            }
        },
        DesignScreenshotTestContainer("No Title Medium") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.TwoButtonsNoTitle(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            description = "Yeni içerikler keşfedebilirsin.",
                            primaryButtonText = "Alışverişe Devam Et",
                            primaryButtonClickListener = {},
                            secondaryButtonText = "Alışverişe Devam Et",
                            secondaryButtonClickListener = {}
                        )
                    )
                )
            }
        },
        DesignScreenshotTestContainer("No Title Small") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.TwoButtonsNoTitle(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            description = "Yeni içerikler keşfedebilirsin.",
                            primaryButtonText = "Alışverişe Devam Et",
                            primaryButtonClickListener = {},
                            secondaryButtonText = "Alışverişe Devam Et",
                            secondaryButtonClickListener = {}
                        )
                    )
                )
            }
        }
    )

    @Test
    fun singleButtonWarningInfoTests() = runScreenShotTest(
        testName = "Two Buttons Warning Info Tests",
        contents = contents
    )
}
