package statelayout.warningInfo

import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.statelayout.State
import com.trendyol.design.core.statelayout.StateComposeLayout
import com.trendyol.design.core.statelayout.TrendyolWarningInfoStateLayoutStyle
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class NoButtonTests : DesignScreenshotTest() {

    private val contents = listOf(
        DesignScreenshotTestContainer("Full Version Medium") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonFullVersion(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            title = "İçerik Bulunamadı",
                            description = "Yeni içerikler keşfedebilirsin."
                        )
                    )
                )
            }
        },

        DesignScreenshotTestContainer("Full Version Small") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonFullVersion(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            title = "İçerik Bulunamadı",
                            description = "Yeni içerikler keşfedebilirsin."
                        )
                    )
                )
            }
        },

        DesignScreenshotTestContainer("No Description Medium") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonNoDescription(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            title = "İçerik Bulunamadı"
                        )
                    )
                )
            }
        },
        DesignScreenshotTestContainer("No Description Small") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonNoDescription(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            title = "İçerik Bulunamadı"
                        )
                    )
                )
            }
        },
        DesignScreenshotTestContainer("No Title Medium") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonNoTitle(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            description = "Yeni içerikler keşfedebilirsin."
                        )
                    )
                )
            }
        },
        DesignScreenshotTestContainer("No Title Small") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonNoTitle(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            description = "Yeni içerikler keşfedebilirsin."
                        )
                    )
                )
            }
        }
    )

    @Test
    fun noButtonWarningInfoTests() = runScreenShotTest(
        testName = "No Button Warning Info Tests",
        contents = contents
    )
}