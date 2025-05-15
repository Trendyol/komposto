package button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.button.KPButton
import com.trendyol.design.core.button.KPButtonSize
import com.trendyol.design.core.button.KPButtonStyle
import com.trendyol.design.core.text.KPText
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class ButtonTest : DesignScreenshotTest() {

    private val buttonText = "CTA Label"
    private val twoLineButtonText = "CTA Label\n Two line"

    @Test
    fun styleTest() = runScreenShotTest(
        testName = "styleTest",
        contents = listOf(
            DesignScreenshotTestContainer("Primary") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.Medium,
                    ) { KPText(text = buttonText) }
                }
            },
            DesignScreenshotTestContainer("Secondary") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Secondary,
                        size = KPButtonSize.Medium,
                    ) { KPText(text = buttonText) }
                }
            },
            DesignScreenshotTestContainer("Tertiary") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Tertiary,
                        size = KPButtonSize.Medium,
                    ) { KPText(text = buttonText) }
                }
            },
        )
    )

    @Test
    fun sizeTest() = runScreenShotTest(
        testName = "sizeTest",
        contents = listOf(
            DesignScreenshotTestContainer("Large") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.Large,
                    ) { KPText(text = buttonText) }
                }
            },
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.Medium,
                    ) { KPText(text = buttonText) }
                }
            },
            DesignScreenshotTestContainer("Small") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.Small,
                    ) { KPText(text = buttonText) }
                }
            },
            DesignScreenshotTestContainer("XSmall") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.XSmall,
                    ) { KPText(text = buttonText) }
                }
            },
        )
    )

    @Test
    fun maxWidthTest() = runScreenShotTest(
        testName = "maxWidthTest",
        contents = listOf(
            DesignScreenshotTestContainer("Large") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.Large,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        KPText(text = buttonText)
                    }
                }
            },
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.Medium,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        KPText(text = buttonText)
                    }
                }
            },
            DesignScreenshotTestContainer("Small") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.Small,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        KPText(text = buttonText)
                    }
                }
            },
            DesignScreenshotTestContainer("XSmall") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.XSmall,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        KPText(text = buttonText)
                    }
                }
            },
        )
    )

    @Test
    fun twoLineTest() = runScreenShotTest(
        testName = "twoLineTest",
        contents = listOf(
            DesignScreenshotTestContainer("Large") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.Large,
                    ) {
                        KPText(text = twoLineButtonText)
                    }
                }
            },
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.Medium,
                    ) {
                        KPText(text = twoLineButtonText)
                    }
                }
            },
            DesignScreenshotTestContainer("Small") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.Small,
                    ) {
                        KPText(text = twoLineButtonText)
                    }
                }
            },
            DesignScreenshotTestContainer("XSmall") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.XSmall,
                    ) {
                        KPText(text = twoLineButtonText)
                    }
                }
            },
        )
    )

    @Test
    fun paddingTest() = runScreenShotTest(
        testName = "paddingTest",
        contents = listOf(
            DesignScreenshotTestContainer("Large") {
                BoxWithHorizontalPadding {
                    Column {
                        Row {
                            KPButton(
                                onClick = { },
                                style = KPButtonStyle.Primary,
                                size = KPButtonSize.Large
                            ) { KPText(text = buttonText) }
                            Spacer(modifier = Modifier.width(8.dp))
                            KPButton(
                                onClick = { },
                                style = KPButtonStyle.Primary,
                                size = KPButtonSize.Large
                            ) { KPText(text = buttonText) }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Primary,
                            size = KPButtonSize.Large
                        ) { KPText(text = buttonText) }
                    }
                }
            },
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    Column {
                        Row {
                            KPButton(
                                onClick = { },
                                style = KPButtonStyle.Primary,
                                size = KPButtonSize.Medium
                            ) { KPText(text = buttonText) }
                            Spacer(modifier = Modifier.width(8.dp))
                            KPButton(
                                onClick = { },
                                style = KPButtonStyle.Primary,
                                size = KPButtonSize.Medium
                            ) { KPText(text = buttonText) }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Primary,
                            size = KPButtonSize.Medium
                        ) { KPText(text = buttonText) }
                    }
                }
            },
            DesignScreenshotTestContainer("Small") {
                BoxWithHorizontalPadding {
                    Column {
                        Row {
                            KPButton(
                                onClick = { },
                                style = KPButtonStyle.Primary,
                                size = KPButtonSize.Small
                            ) { KPText(text = buttonText) }
                            Spacer(modifier = Modifier.width(8.dp))
                            KPButton(
                                onClick = { },
                                style = KPButtonStyle.Primary,
                                size = KPButtonSize.Small
                            ) { KPText(text = buttonText) }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Primary,
                            size = KPButtonSize.Small
                        ) { KPText(text = buttonText) }
                    }
                }
            },
            DesignScreenshotTestContainer("XSmall") {
                BoxWithHorizontalPadding {
                    Column {
                        Row {
                            KPButton(
                                onClick = { },
                                style = KPButtonStyle.Primary,
                                size = KPButtonSize.XSmall
                            ) { KPText(text = buttonText) }
                            Spacer(modifier = Modifier.width(8.dp))
                            KPButton(
                                onClick = { },
                                style = KPButtonStyle.Primary,
                                size = KPButtonSize.XSmall
                            ) { KPText(text = buttonText) }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Primary,
                            size = KPButtonSize.XSmall
                        ) { KPText(text = buttonText) }
                    }
                }
            },
        )
    )

    @Test
    fun enabledDisabledTest() = runScreenShotTest(
        testName = "enabledDisabledTest",
        contents = listOf(
            DesignScreenshotTestContainer("Primary") {
                BoxWithHorizontalPadding {
                    Row {
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Primary,
                            size = KPButtonSize.Medium,
                            enabled = true
                        ) { KPText(text = buttonText) }
                        Spacer(modifier = Modifier.width(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Primary,
                            size = KPButtonSize.Medium,
                            enabled = false
                        ) { KPText(text = buttonText) }
                    }
                }
            },
            DesignScreenshotTestContainer("Secondary") {
                BoxWithHorizontalPadding {
                    Row {
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Secondary,
                            size = KPButtonSize.Medium,
                            enabled = true
                        ) { KPText(text = buttonText) }
                        Spacer(modifier = Modifier.width(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Secondary,
                            size = KPButtonSize.Medium,
                            enabled = false
                        ) { KPText(text = buttonText) }
                    }
                }
            },
            DesignScreenshotTestContainer("Tertiary") {
                BoxWithHorizontalPadding {
                    Row {
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Tertiary,
                            size = KPButtonSize.Medium,
                            enabled = true
                        ) { KPText(text = buttonText) }
                        Spacer(modifier = Modifier.width(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Tertiary,
                            size = KPButtonSize.Medium,
                            enabled = false
                        ) { KPText(text = buttonText) }
                    }
                }
            },
        )
    )
}
