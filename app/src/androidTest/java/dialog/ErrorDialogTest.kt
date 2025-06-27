@file:OptIn(ExperimentalKompostoApi::class)

package dialog

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.dialog.DialogButtons
import com.trendyol.design.core.dialog.KPGenericDialogContent
import com.trendyol.design.core.dialog.KPGenericDialogType
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class ErrorDialogTest : DesignScreenshotTest() {
    @Test
    fun errorDialogSingleButtonTest() = runScreenShotTest(
        testName = "errorDialogSingleButtonTest",
        contents = listOf(
            DesignScreenshotTestContainer("Single") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Error,
                        displayCloseButton = false,
                        title = "Success Message Title",
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
    fun errorDialogSingleButtonWithCloseTest() = runScreenShotTest(
        testName = "errorDialogSingleButtonWithCloseTest",
        contents = listOf(
            DesignScreenshotTestContainer("singleWithClose") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Error,
                        displayCloseButton = true,
                        title = "Success Message Title",
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
    fun errorDialogTwoButtonsTest() = runScreenShotTest(
        testName = "errorDialogTwoButtonsTest",
        contents = listOf(
            DesignScreenshotTestContainer("twoButton") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Error,
                        displayCloseButton = false,
                        title = "Success Message Title",
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
    fun errorDialogTwoButtonsWithCloseTest() = runScreenShotTest(
        testName = "errorDialogTwoButtonsWithCloseTest",
        contents = listOf(
            DesignScreenshotTestContainer("twoButtonWithClose") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Error,
                        displayCloseButton = true,
                        title = "Success Message Title",
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
    fun errorDialogNoButtonTest() = runScreenShotTest(
        testName = "errorDialogNoButtonTest",
        contents = listOf(
            DesignScreenshotTestContainer("noButton") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Error,
                        displayCloseButton = false,
                        title = "Success Message Title",
                        message = "Message Detail"
                    )
                }
            }
        )
    )

    @Test
    fun errorDialogNoButtonWithCloseTest() = runScreenShotTest(
        testName = "errorDialogNoButtonWithCloseTest",
        contents = listOf(
            DesignScreenshotTestContainer("noButtonWithClose") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Error,
                        displayCloseButton = true,
                        title = "Success Message Title",
                        message = "Message Detail"
                    )
                }
            }
        )
    )
}