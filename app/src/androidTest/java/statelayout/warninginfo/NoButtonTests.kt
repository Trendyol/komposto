@file:OptIn(ExperimentalKompostoApi::class)

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

internal class NoButtonTests : DesignScreenshotTest() {

    private val title = "İçerik Bulunamadı"
    private val description = "Yeni içerikler keşfedebilirsin."

    @Test
    fun noButtonFullVersionMediumIconWarningInfoTests() = runScreenShotTest(
        testName = "NoButton - FullVersion - MediumIcon - Warning Info Tests",
        contents = listOf(
            DesignScreenshotTestContainer("Full Version Medium") {
                BoxWithHorizontalPadding {
                    KPStateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonFullVersion(
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
                    KPStateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonFullVersion(
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
                    KPStateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonNoDescription(
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
                    KPStateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonNoDescription(
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
                    KPStateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonNoTitle(
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
                    KPStateComposeLayout(
                        state = State.WarningInfo(
                            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonNoTitle(
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