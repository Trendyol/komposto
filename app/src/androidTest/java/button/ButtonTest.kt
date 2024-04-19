package button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.button.Button
import com.trendyol.design.core.button.TrendyolButtonSize
import com.trendyol.design.core.button.TrendyolButtonStyle
import com.trendyol.design.core.text.Text
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
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.Medium,
                    ) { Text(text = buttonText) }
                }
            },
            DesignScreenshotTestContainer("Secondary") {
                BoxWithHorizontalPadding {
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Secondary,
                        size = TrendyolButtonSize.Medium,
                    ) { Text(text = buttonText) }
                }
            },
            DesignScreenshotTestContainer("Tertiary") {
                BoxWithHorizontalPadding {
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Tertiary,
                        size = TrendyolButtonSize.Medium,
                    ) { Text(text = buttonText) }
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
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.Large,
                    ) { Text(text = buttonText) }
                }
            },
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.Medium,
                    ) { Text(text = buttonText) }
                }
            },
            DesignScreenshotTestContainer("Small") {
                BoxWithHorizontalPadding {
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.Small,
                    ) { Text(text = buttonText) }
                }
            },
            DesignScreenshotTestContainer("XSmall") {
                BoxWithHorizontalPadding {
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.XSmall,
                    ) { Text(text = buttonText) }
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
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.Large,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = buttonText)
                    }
                }
            },
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.Medium,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = buttonText)
                    }
                }
            },
            DesignScreenshotTestContainer("Small") {
                BoxWithHorizontalPadding {
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.Small,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = buttonText)
                    }
                }
            },
            DesignScreenshotTestContainer("XSmall") {
                BoxWithHorizontalPadding {
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.XSmall,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = buttonText)
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
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.Large,
                    ) {
                        Text(text = twoLineButtonText)
                    }
                }
            },
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.Medium,
                    ) {
                        Text(text = twoLineButtonText)
                    }
                }
            },
            DesignScreenshotTestContainer("Small") {
                BoxWithHorizontalPadding {
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.Small,
                    ) {
                        Text(text = twoLineButtonText)
                    }
                }
            },
            DesignScreenshotTestContainer("XSmall") {
                BoxWithHorizontalPadding {
                    Button(
                        onClick = { },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.XSmall,
                    ) {
                        Text(text = twoLineButtonText)
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
                            Button(
                                onClick = { },
                                style = TrendyolButtonStyle.Primary,
                                size = TrendyolButtonSize.Large
                            ) { Text(text = buttonText) }
                            Spacer(modifier = Modifier.width(8.dp))
                            Button(
                                onClick = { },
                                style = TrendyolButtonStyle.Primary,
                                size = TrendyolButtonSize.Large
                            ) { Text(text = buttonText) }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Button(
                            onClick = { },
                            style = TrendyolButtonStyle.Primary,
                            size = TrendyolButtonSize.Large
                        ) { Text(text = buttonText) }
                    }
                }
            },
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    Column {
                        Row {
                            Button(
                                onClick = { },
                                style = TrendyolButtonStyle.Primary,
                                size = TrendyolButtonSize.Medium
                            ) { Text(text = buttonText) }
                            Spacer(modifier = Modifier.width(8.dp))
                            Button(
                                onClick = { },
                                style = TrendyolButtonStyle.Primary,
                                size = TrendyolButtonSize.Medium
                            ) { Text(text = buttonText) }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Button(
                            onClick = { },
                            style = TrendyolButtonStyle.Primary,
                            size = TrendyolButtonSize.Medium
                        ) { Text(text = buttonText) }
                    }
                }
            },
            DesignScreenshotTestContainer("Small") {
                BoxWithHorizontalPadding {
                    Column {
                        Row {
                            Button(
                                onClick = { },
                                style = TrendyolButtonStyle.Primary,
                                size = TrendyolButtonSize.Small
                            ) { Text(text = buttonText) }
                            Spacer(modifier = Modifier.width(8.dp))
                            Button(
                                onClick = { },
                                style = TrendyolButtonStyle.Primary,
                                size = TrendyolButtonSize.Small
                            ) { Text(text = buttonText) }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Button(
                            onClick = { },
                            style = TrendyolButtonStyle.Primary,
                            size = TrendyolButtonSize.Small
                        ) { Text(text = buttonText) }
                    }
                }
            },
            DesignScreenshotTestContainer("XSmall") {
                BoxWithHorizontalPadding {
                    Column {
                        Row {
                            Button(
                                onClick = { },
                                style = TrendyolButtonStyle.Primary,
                                size = TrendyolButtonSize.XSmall
                            ) { Text(text = buttonText) }
                            Spacer(modifier = Modifier.width(8.dp))
                            Button(
                                onClick = { },
                                style = TrendyolButtonStyle.Primary,
                                size = TrendyolButtonSize.XSmall
                            ) { Text(text = buttonText) }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Button(
                            onClick = { },
                            style = TrendyolButtonStyle.Primary,
                            size = TrendyolButtonSize.XSmall
                        ) { Text(text = buttonText) }
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
                        Button(
                            onClick = { },
                            style = TrendyolButtonStyle.Primary,
                            size = TrendyolButtonSize.Medium,
                            enabled = true
                        ) { Text(text = buttonText) }
                        Spacer(modifier = Modifier.width(8.dp))
                        Button(
                            onClick = { },
                            style = TrendyolButtonStyle.Primary,
                            size = TrendyolButtonSize.Medium,
                            enabled = false
                        ) { Text(text = buttonText) }
                    }
                }
            },
            DesignScreenshotTestContainer("Secondary") {
                BoxWithHorizontalPadding {
                    Row {
                        Button(
                            onClick = { },
                            style = TrendyolButtonStyle.Secondary,
                            size = TrendyolButtonSize.Medium,
                            enabled = true
                        ) { Text(text = buttonText) }
                        Spacer(modifier = Modifier.width(8.dp))
                        Button(
                            onClick = { },
                            style = TrendyolButtonStyle.Secondary,
                            size = TrendyolButtonSize.Medium,
                            enabled = false
                        ) { Text(text = buttonText) }
                    }
                }
            },
            DesignScreenshotTestContainer("Tertiary") {
                BoxWithHorizontalPadding {
                    Row {
                        Button(
                            onClick = { },
                            style = TrendyolButtonStyle.Tertiary,
                            size = TrendyolButtonSize.Medium,
                            enabled = true
                        ) { Text(text = buttonText) }
                        Spacer(modifier = Modifier.width(8.dp))
                        Button(
                            onClick = { },
                            style = TrendyolButtonStyle.Tertiary,
                            size = TrendyolButtonSize.Medium,
                            enabled = false
                        ) { Text(text = buttonText) }
                    }
                }
            },
        )
    )
}
