package statelayout.warninginfo

import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.statelayout.State
import com.trendyol.design.core.statelayout.StateComposeLayout
import com.trendyol.design.core.statelayout.TrendyolWarningInfoStateLayoutStyle
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class TwoButtonTests : DesignScreenshotTest() {

    private val title = "İçerik Bulunamadı"
    private val description = "Yeni içerikler keşfedebilirsin."
    private val buttonText = "Alışverişe Devam Et"

    @Test
    fun twoButtonsFullVersionMediumIconWarningInfoTests() = runScreenShotTest(
        testName = "TwoButtons - FullVersion - MediumIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("Full Version Medium") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.TwoButtonsFullVersion(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                                title = title,
                                description = description,
                                primaryButtonText = buttonText,
                                primaryButtonClickListener = {},
                                secondaryButtonText = buttonText,
                                secondaryButtonClickListener = {}
                            )
                        )
                    )
                }
            }
        )
    )

    @Test
    fun twoButtonsFullVersionSmallIconWarningInfoTests() = runScreenShotTest(
        testName = "TwoButtons - FullVersion - SmallIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("Full Version Small") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.TwoButtonsFullVersion(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                                title = title,
                                description = description,
                                primaryButtonText = buttonText,
                                primaryButtonClickListener = {},
                                secondaryButtonText = buttonText,
                                secondaryButtonClickListener = {}
                            )
                        )
                    )
                }
            }
        )
    )

    @Test
    fun twoButtonsNoDescriptionMediumIconWarningInfoTests() = runScreenShotTest(
        testName = "TwoButtons - NoDescription - MediumIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("No Description Medium") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.TwoButtonsNoDescription(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                                title = title,
                                primaryButtonText = buttonText,
                                primaryButtonClickListener = {},
                                secondaryButtonText = buttonText,
                                secondaryButtonClickListener = {}
                            )
                        )
                    )
                }
            }
        )
    )

    @Test
    fun twoButtonsNoDescriptionSmallIconWarningInfoTests() = runScreenShotTest(
        testName = "TwoButtons - NoDescription - SmallIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("No Description Small") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.TwoButtonsNoDescription(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                                title = title,
                                primaryButtonText = buttonText,
                                primaryButtonClickListener = {},
                                secondaryButtonText = buttonText,
                                secondaryButtonClickListener = {}
                            )
                        )
                    )
                }
            }
        )
    )

    @Test
    fun twoButtonsNoTitleMediumIconWarningInfoTests() = runScreenShotTest(
        testName = "TwoButtons - NoTitle - MediumIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("No Title Medium") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.TwoButtonsNoTitle(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                                description = description,
                                primaryButtonText = buttonText,
                                primaryButtonClickListener = {},
                                secondaryButtonText = buttonText,
                                secondaryButtonClickListener = {}
                            )
                        )
                    )
                }
            }
        )
    )

    @Test
    fun twoButtonsNoTitleSmallIconWarningInfoTests() = runScreenShotTest(
        testName = "TwoButtons - NoTitle - SmallIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("No Title Small") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.TwoButtonsNoTitle(
                                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                                description = description,
                                primaryButtonText = buttonText,
                                primaryButtonClickListener = {},
                                secondaryButtonText = buttonText,
                                secondaryButtonClickListener = {}
                            )
                        )
                    )
                }
            }
        )
    )
}
