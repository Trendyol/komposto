package dialog

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.trendyol.design.core.dialog.DialogButtons
import com.trendyol.design.core.dialog.KPGenericDialogContent
import com.trendyol.design.core.dialog.KPGenericDialogType
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class SuccessDialogTest : DesignScreenshotTest() {
    @Test
    fun successDialogSingleButtonTest() = runScreenShotTest(
        testName = "successDialogSingleButtonTest",
        contents = listOf(
            DesignScreenshotTestContainer("SingleButton") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Success,
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
    fun successDialogSingleButtonWithCloseTest() = runScreenShotTest(
        testName = "successDialogSingleButtonWithCloseTest",
        contents = listOf(
            DesignScreenshotTestContainer("SingleButtonWithClose") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Success,
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
    fun successDialogTwoButtonsTest() = runScreenShotTest(
        testName = "successDialogTwoButtonsTest",
        contents = listOf(
            DesignScreenshotTestContainer("TwoButtons") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Success,
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
    fun successDialogTwoButtonsWithCloseTest() = runScreenShotTest(
        testName = "successDialogTwoButtonsWithCloseTest",
        contents = listOf(
            DesignScreenshotTestContainer("TwoButtonsWithClose") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Success,
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
    fun successDialogNoButtonTest() = runScreenShotTest(
        testName = "successDialogNoButtonTest",
        contents = listOf(
            DesignScreenshotTestContainer("NoButton") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Success,
                        displayCloseButton = false,
                        title = "Success Message Title",
                        message = "Message Detail"
                    )
                }
            }
        )
    )

    @Test
    fun successDialogNoButtonWithCloseTest() = runScreenShotTest(
        testName = "successDialogNoButtonWithCloseTest",
        contents = listOf(
            DesignScreenshotTestContainer("NoButtonWithClose") {
                BoxWithHorizontalPadding {
                    KPGenericDialogContent(
                        type = KPGenericDialogType.Success,
                        displayCloseButton = true,
                        title = "Success Message Title",
                        message = "Message Detail"
                    )
                }
            }
        )
    )
}