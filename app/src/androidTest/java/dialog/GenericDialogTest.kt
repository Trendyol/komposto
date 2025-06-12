@file:OptIn(ExperimentalKompostoApi::class)

package dialog

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.dialog.DialogButtons
import com.trendyol.design.core.dialog.KPGenericDialogContent
import com.trendyol.design.core.dialog.KPGenericDialogType
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.icons.outline.StateCaution
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class GenericDialogTest : DesignScreenshotTest() {
    @Test
    fun genericDialogSingleButtonTest() = runScreenShotTest(
        testName = "genericDialogSingleButtonTest",
        contents = listOf(
            DesignScreenshotTestContainer("SingleButton") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Custom,
                        displayCloseButton = false,
                        title = "Popup Title",
                        icon = {
                            com.trendyol.design.core.icon.Icon(
                                imageVector = KPIcons.Outline.StateCaution,
                                size = KPIconSize.XXXLarge
                            )
                        },
                        message = "Message Detail",
                        primaryButton = {
                            DialogButtons.Primary(
                                text = "Button",
                                modifier = Modifier.fillMaxWidth()
                            ) {
                            }
                        }
                    )
                }
            }
        )
    )

    @Test
    fun genericDialogSingleButtonWithCloseTest() = runScreenShotTest(
        testName = "genericDialogSingleButtonWithCloseTest",
        contents = listOf(
            DesignScreenshotTestContainer("SingleButtonWithClose") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Custom,
                        displayCloseButton = true,
                        title = "Popup Title",
                        icon = {
                            com.trendyol.design.core.icon.Icon(
                                imageVector = KPIcons.Outline.StateCaution,
                                size = KPIconSize.XXXLarge
                            )
                        },
                        message = "Message Detail",
                        primaryButton = {
                            DialogButtons.Primary(
                                text = "Button",
                                modifier = Modifier.fillMaxWidth()
                            ) {
                            }
                        }
                    )
                }
            }
        )
    )

    @Test
    fun genericDialogTwoButtonsTest() = runScreenShotTest(
        testName = "genericDialogTwoButtonsTest",
        contents = listOf(
            DesignScreenshotTestContainer("TwoButtons") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Custom,
                        displayCloseButton = false,
                        title = "Popup Title",
                        icon = {
                            com.trendyol.design.core.icon.Icon(
                                imageVector = KPIcons.Outline.StateCaution,
                                size = KPIconSize.XXXLarge
                            )
                        },
                        message = "Message Detail",
                        primaryButton = {
                            DialogButtons.Primary(
                                text = "Button",
                                modifier = Modifier.fillMaxWidth()
                            ) {
                            }
                        },
                        secondaryButton = {
                            DialogButtons.Secondary(
                                text = "Button",
                                modifier = Modifier.fillMaxWidth()
                            ) {
                            }
                        }
                    )
                }
            }
        )
    )

    @Test
    fun genericDialogTwoButtonsWithCloseTest() = runScreenShotTest(
        testName = "genericDialogTwoButtonsWithCloseTest",
        contents = listOf(
            DesignScreenshotTestContainer("TwoButtonsWithClose") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Custom,
                        displayCloseButton = true,
                        title = "Popup Title",
                        icon = {
                            com.trendyol.design.core.icon.Icon(
                                imageVector = KPIcons.Outline.StateCaution,
                                size = KPIconSize.XXXLarge
                            )
                        },
                        message = "Message Detail",
                        primaryButton = {
                            DialogButtons.Primary(
                                text = "Button",
                                modifier = Modifier.fillMaxWidth()
                            ) {
                            }
                        },
                        secondaryButton = {
                            DialogButtons.Secondary(
                                text = "Button",
                                modifier = Modifier.fillMaxWidth()
                            ) {
                            }
                        }
                    )
                }
            }
        )
    )

    @Test
    fun genericDialogNoButtonTest() = runScreenShotTest(
        testName = "genericDialogNoButtonTest",
        contents = listOf(
            DesignScreenshotTestContainer("NoButton") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Custom,
                        displayCloseButton = false,
                        title = "Popup Title",
                        icon = {
                            com.trendyol.design.core.icon.Icon(
                                imageVector = KPIcons.Outline.StateCaution,
                                size = KPIconSize.XXXLarge
                            )
                        },
                        message = "Message Detail"
                    )
                }
            }
        )
    )

    @Test
    fun genericDialogNoButtonWithCloseTest() = runScreenShotTest(
        testName = "genericDialogNoButtonWithCloseTest",
        contents = listOf(
            DesignScreenshotTestContainer("NoButtonWithClose") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Custom,
                        displayCloseButton = true,
                        title = "Popup Title",
                        icon = {
                            com.trendyol.design.core.icon.Icon(
                                imageVector = KPIcons.Outline.StateCaution,
                                size = KPIconSize.XXXLarge
                            )
                        },
                        message = "Message Detail"
                    )
                }
            }
        )
    )
}