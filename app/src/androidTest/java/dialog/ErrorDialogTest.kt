package dialog

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.trendyol.design.core.dialog.DialogButtons
import com.trendyol.design.core.dialog.GenericDialogContent
import com.trendyol.design.core.dialog.TrendyolGenericDialogType
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
                    GenericDialogContent(
                        type = TrendyolGenericDialogType.Error,
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
                    GenericDialogContent(
                        type = TrendyolGenericDialogType.Error,
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
                    GenericDialogContent(
                        type = TrendyolGenericDialogType.Error,
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
                    GenericDialogContent(
                        type = TrendyolGenericDialogType.Error,
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
                    GenericDialogContent(
                        type = TrendyolGenericDialogType.Error,
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
                    GenericDialogContent(
                        type = TrendyolGenericDialogType.Error,
                        displayCloseButton = true,
                        title = "Success Message Title",
                        message = "Message Detail"
                    )
                }
            }
        )
    )
}