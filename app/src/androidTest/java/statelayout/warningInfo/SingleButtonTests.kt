package statelayout.warningInfo

import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.statelayout.State
import com.trendyol.design.core.statelayout.StateComposeLayout
import com.trendyol.design.core.statelayout.TrendyolWarningInfoStateLayoutStyle
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class SingleButtonTests : DesignScreenshotTest() {

    private val contents = listOf(
        DesignScreenshotTestContainer("Full Version Medium") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonFullVersion(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            title = "İçerik Bulunamadı",
                            description = "Yeni içerikler keşfedebilirsin.",
                            primaryButtonText = "Alışverişe Devam Et",
                            primaryButtonClickListener = {}
                        )
                    )
                )
            }
        },

        DesignScreenshotTestContainer("Full Version Small") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonFullVersion(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            title = "İçerik Bulunamadı",
                            description = "Yeni içerikler keşfedebilirsin.",
                            primaryButtonText = "Alışverişe Devam Et",
                            primaryButtonClickListener = {}
                        )
                    )
                )
            }
        },

        DesignScreenshotTestContainer("No Description Medium") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonNoDescription(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            title = "İçerik Bulunamadı",
                            primaryButtonText = "Alışverişe Devam Et",
                            primaryButtonClickListener = {}
                        )
                    )
                )
            }
        },
        DesignScreenshotTestContainer("No Description Small") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonNoDescription(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            title = "İçerik Bulunamadı",
                            primaryButtonText = "Alışverişe Devam Et",
                            primaryButtonClickListener = {}
                        )
                    )
                )
            }
        },
        DesignScreenshotTestContainer("No Title Medium") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonNoTitle(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            description = "Yeni içerikler keşfedebilirsin.",
                            primaryButtonText = "Alışverişe Devam Et",
                            primaryButtonClickListener = {}
                        )
                    )
                )
            }
        },
        DesignScreenshotTestContainer("No Title Small") {
            BoxWithHorizontalPadding {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonNoTitle(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            description = "Yeni içerikler keşfedebilirsin.",
                            primaryButtonText = "Alışverişe Devam Et",
                            primaryButtonClickListener = {}
                        )
                    )
                )
            }
        }
    )

    @Test
    fun singleButtonWarningInfoTests() = runScreenShotTest(
        testName = "Single Button Warning Info Tests",
        contents = contents
    )
}
