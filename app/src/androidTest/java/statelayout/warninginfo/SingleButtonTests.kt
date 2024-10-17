package statelayout.warninginfo

import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.statelayout.State
import com.trendyol.design.core.statelayout.StateComposeLayout
import com.trendyol.design.core.statelayout.TrendyolWarningInfoStateLayoutStyle
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class SingleButtonTests : DesignScreenshotTest() {

    private val title = "İçerik Bulunamadı"
    private val description = "Yeni içerikler keşfedebilirsin."
    private val primaryButtonText = "Alışverişe Devam Et"

    @Test
    fun singleButtonFullVersionMediumIconWarningInfoTests() = runScreenShotTest(
        testName = "SingleButton - FullVersion - MediumIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("Full Version Medium") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonFullVersion(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                                title = title,
                                description = description,
                                primaryButtonText = primaryButtonText,
                                primaryButtonClickListener = {}
                            )
                        )
                    )
                }
            }
        )
    )

    @Test
    fun singleButtonFullVersionSmallIconWarningInfoTests() = runScreenShotTest(
        testName = "SingleButton - FullVersion - SmallIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("Full Version Small") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonFullVersion(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                                title = title,
                                description = description,
                                primaryButtonText = primaryButtonText,
                                primaryButtonClickListener = {}
                            )
                        )
                    )
                }
            }
        )
    )

    @Test
    fun singleButtonNoDescriptionMediumIconWarningInfoTests() = runScreenShotTest(
        testName = "SingleButton - NoDescription - MediumIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("No Description Medium") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonNoDescription(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                                title = title,
                                primaryButtonText = primaryButtonText,
                                primaryButtonClickListener = {}
                            )
                        )
                    )
                }
            }
        )
    )

    @Test
    fun singleButtonNoDescriptionSmallIconWarningInfoTests() = runScreenShotTest(
        testName = "SingleButton - NoDescription - SmallIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("No Description Small") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonNoDescription(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                                title = title,
                                primaryButtonText = primaryButtonText,
                                primaryButtonClickListener = {}
                            )
                        )
                    )
                }
            }
        )
    )

    @Test
    fun singleButtonNoTitleMediumIconWarningInfoTests() = runScreenShotTest(
        testName = "SingleButton - NoTitle - MediumIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("No Title Medium") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonNoTitle(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                                description = description,
                                primaryButtonText = primaryButtonText,
                                primaryButtonClickListener = {}
                            )
                        )
                    )
                }
            }
        )
    )

    @Test
    fun singleButtonNoTitleSmallIconWarningInfoTests() = runScreenShotTest(
        testName = "SingleButton - NoTitle - SmallIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("No Title Small") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonNoTitle(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                                description = description,
                                primaryButtonText = primaryButtonText,
                                primaryButtonClickListener = {}
                            )
                        )
                    )
                }
            }
        )
    )
}
