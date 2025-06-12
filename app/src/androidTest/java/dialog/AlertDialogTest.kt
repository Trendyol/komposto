@file:OptIn(ExperimentalKompostoApi::class)

package dialog

import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.dialog.DialogButtons
import com.trendyol.design.core.dialog.KPAlertDialogContent
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class AlertDialogTest : DesignScreenshotTest() {
    @Test
    fun alertDialogSingleButtonTest() = runScreenShotTest(
        testName = "alertDialogSingleButtonTest",
        contents = listOf(
            DesignScreenshotTestContainer("Single") {
                BoxWithHorizontalPadding {
                    KPAlertDialogContent(
                        message = "Description",
                        title = "Title",
                        negativeButton = {
                            Text(text = "Button", onClick = { })
                        }
                    )
                }
            }
        )
    )

    @Test
    fun alertDialogTwoButtonsTest() = runScreenShotTest(
        testName = "alertDialogTwoButtonsTest",
        contents = listOf(
            DesignScreenshotTestContainer("TwoButtons") {
                BoxWithHorizontalPadding {
                    KPAlertDialogContent(
                        message = "Description",
                        title = "Title",
                        negativeButton = {
                            DialogButtons.Text(text = "Button", onClick = { })
                        },
                        positiveButton = {
                            DialogButtons.Text(text = "Button", onClick = { })
                        }
                    )
                }
            }
        )
    )

    @Test
    fun alertDialogThreeButtonsTest() = runScreenShotTest(
        testName = "alertDialogThreeButtonsTest",
        contents = listOf(
            DesignScreenshotTestContainer("ThreeButtons") {
                BoxWithHorizontalPadding {
                    KPAlertDialogContent(
                        message = "Description",
                        title = "Title",
                        negativeButton = {
                            DialogButtons.Text(text = "Button", onClick = { })
                        },
                        positiveButton = {
                            DialogButtons.Text(text = "Button", onClick = { })
                        },
                        neutralButton = {
                            DialogButtons.Text(text = "Button", onClick = { })
                        },
                    )
                }
            }
        )
    )
}