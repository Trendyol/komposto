package statelayout.warninginfo

import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.statelayout.State
import com.trendyol.design.core.statelayout.KPStateComposeLayout
import com.trendyol.design.core.statelayout.KPWarningInfoStateLayoutStyle
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

@OptIn(ExperimentalKompostoApi::class)
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
                    KPStateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsFullVersion(
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
                    KPStateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsFullVersion(
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
                    KPStateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsNoDescription(
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
                    KPStateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsNoDescription(
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
                    KPStateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsNoTitle(
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
                    KPStateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsNoTitle(
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
