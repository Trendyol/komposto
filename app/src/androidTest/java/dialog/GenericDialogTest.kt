package dialog

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.trendyol.design.core.dialog.DialogButtons
import com.trendyol.design.core.dialog.GenericDialogContent
import com.trendyol.design.core.dialog.TrendyolGenericDialogType
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
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
                    GenericDialogContent(
                        type = TrendyolGenericDialogType.Custom,
                        displayCloseButton = false,
                        title = "Popup Title",
                        icon = {
                            com.trendyol.design.core.icon.Icon(
                                imageVector = Icons.Outline.StateCaution,
                                size = TrendyolIconSize.XXXLarge
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
                    GenericDialogContent(
                        type = TrendyolGenericDialogType.Custom,
                        displayCloseButton = true,
                        title = "Popup Title",
                        icon = {
                            com.trendyol.design.core.icon.Icon(
                                imageVector = Icons.Outline.StateCaution,
                                size = TrendyolIconSize.XXXLarge
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
                    GenericDialogContent(
                        type = TrendyolGenericDialogType.Custom,
                        displayCloseButton = false,
                        title = "Popup Title",
                        icon = {
                            com.trendyol.design.core.icon.Icon(
                                imageVector = Icons.Outline.StateCaution,
                                size = TrendyolIconSize.XXXLarge
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
                    GenericDialogContent(
                        type = TrendyolGenericDialogType.Custom,
                        displayCloseButton = true,
                        title = "Popup Title",
                        icon = {
                            com.trendyol.design.core.icon.Icon(
                                imageVector = Icons.Outline.StateCaution,
                                size = TrendyolIconSize.XXXLarge
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
                    GenericDialogContent(
                        type = TrendyolGenericDialogType.Custom,
                        displayCloseButton = false,
                        title = "Popup Title",
                        icon = {
                            com.trendyol.design.core.icon.Icon(
                                imageVector = Icons.Outline.StateCaution,
                                size = TrendyolIconSize.XXXLarge
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
                    GenericDialogContent(
                        type = TrendyolGenericDialogType.Custom,
                        displayCloseButton = true,
                        title = "Popup Title",
                        icon = {
                            com.trendyol.design.core.icon.Icon(
                                imageVector = Icons.Outline.StateCaution,
                                size = TrendyolIconSize.XXXLarge
                            )
                        },
                        message = "Message Detail"
                    )
                }
            }
        )
    )
}