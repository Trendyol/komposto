package button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Alignment
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material.LocalContentColor
import androidx.compose.foundation.layout.PaddingValues
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.icons.fill.RunningOut
import com.trendyol.theme.KPDesign

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

    @Test
    fun iconWithTextTest() = runScreenShotTest(
        testName = "iconWithTextTest",
        contents = listOf(
            DesignScreenshotTestContainer("Primary Large") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.Large,
                        contentPadding = PaddingValues(
                            vertical = 3.5.dp,
                            horizontal = 20.dp
                        ),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            KPText(
                                text = "Top Text",
                                style = KPDesign.typography.titleBold,
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                KPIcon(
                                    imageVector = KPIcons.Fill.RunningOut,
                                    size = KPIconSize.XXSmall,
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                KPText(
                                    text = "Bottom Text",
                                    style = KPDesign.typography.body2Medium
                                )
                            }
                        }
                    }
                }
            },
            DesignScreenshotTestContainer("Secondary Large") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Secondary,
                        size = KPButtonSize.Large,
                        contentPadding = PaddingValues(
                            vertical = 3.5.dp,
                            horizontal = 20.dp
                        ),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            KPText(
                                text = "Top Text",
                                style = KPDesign.typography.titleBold,
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                KPIcon(
                                    imageVector = KPIcons.Fill.RunningOut,
                                    size = KPIconSize.XXSmall,
                                    tint = LocalContentColor.current,
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                KPText(
                                    text = "Bottom Text",
                                    style = KPDesign.typography.body2Medium
                                )
                            }
                        }
                    }
                }
            },
            DesignScreenshotTestContainer("Tertiary Large") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Tertiary,
                        size = KPButtonSize.Large,
                        contentPadding = PaddingValues(
                            vertical = 3.5.dp,
                            horizontal = 20.dp
                        ),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            KPText(
                                text = "Top Text",
                                style = KPDesign.typography.titleBold,
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                KPIcon(
                                    imageVector = KPIcons.Fill.RunningOut,
                                    size = KPIconSize.XXSmall,
                                    tint = LocalContentColor.current,
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                KPText(
                                    text = "Bottom Text",
                                    style = KPDesign.typography.body2Medium
                                )
                            }
                        }
                    }
                }
            },
        )
    )

    @Test
    fun iconWithTextMediumTest() = runScreenShotTest(
        testName = "iconWithTextMediumTest",
        contents = listOf(
            DesignScreenshotTestContainer("Primary Medium") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.Medium,
                        contentPadding = PaddingValues(
                            vertical = 3.5.dp,
                            horizontal = 20.dp
                        ),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            KPText(
                                text = "Top Text",
                                style = KPDesign.typography.body1Bold
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                KPIcon(
                                    imageVector = KPIcons.Fill.RunningOut,
                                    size = KPIconSize.XXSmall,
                                    modifier = Modifier.width(10.dp),
                                )
                                Spacer(modifier = Modifier.width(1.dp))
                                KPText(
                                    text = "Bottom Text",
                                    style = KPDesign.typography.overLineMedium
                                )
                            }
                        }
                    }
                }
            },
            DesignScreenshotTestContainer("Secondary Medium") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Secondary,
                        size = KPButtonSize.Medium,
                        contentPadding = PaddingValues(
                            vertical = 3.5.dp,
                            horizontal = 20.dp
                        ),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            KPText(
                                text = "Top Text",
                                style = KPDesign.typography.body1Bold
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                KPIcon(
                                    imageVector = KPIcons.Fill.RunningOut,
                                    size = KPIconSize.XXSmall,
                                    tint = LocalContentColor.current,
                                    modifier = Modifier.width(10.dp),
                                )
                                Spacer(modifier = Modifier.width(1.dp))
                                KPText(
                                    text = "Bottom Text",
                                    style = KPDesign.typography.overLineMedium
                                )
                            }
                        }
                    }
                }
            },
            DesignScreenshotTestContainer("Tertiary Medium") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Tertiary,
                        size = KPButtonSize.Medium,
                        contentPadding = PaddingValues(
                            vertical = 3.5.dp,
                            horizontal = 20.dp
                        ),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            KPText(
                                text = "Top Text",
                                style = KPDesign.typography.body1Bold
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                KPIcon(
                                    imageVector = KPIcons.Fill.RunningOut,
                                    size = KPIconSize.XXSmall,
                                    tint = LocalContentColor.current,
                                    modifier = Modifier.width(10.dp),
                                )
                                Spacer(modifier = Modifier.width(1.dp))
                                KPText(
                                    text = "Bottom Text",
                                    style = KPDesign.typography.overLineMedium
                                )
                            }
                        }
                    }
                }
            },
        )
    )

    @Test
    fun disabledAllSizesTest() = runScreenShotTest(
        testName = "disabledAllSizesTest",
        contents = listOf(
            DesignScreenshotTestContainer("Primary Disabled") {
                BoxWithHorizontalPadding {
                    Column {
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Primary,
                            size = KPButtonSize.Large,
                            enabled = false
                        ) { KPText(text = "Large Disabled") }
                        Spacer(modifier = Modifier.height(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Primary,
                            size = KPButtonSize.Medium,
                            enabled = false
                        ) { KPText(text = "Medium Disabled") }
                        Spacer(modifier = Modifier.height(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Primary,
                            size = KPButtonSize.Small,
                            enabled = false
                        ) { KPText(text = "Small Disabled") }
                        Spacer(modifier = Modifier.height(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Primary,
                            size = KPButtonSize.XSmall,
                            enabled = false
                        ) { KPText(text = "XSmall Disabled") }
                    }
                }
            },
            DesignScreenshotTestContainer("Secondary Disabled") {
                BoxWithHorizontalPadding {
                    Column {
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Secondary,
                            size = KPButtonSize.Large,
                            enabled = false
                        ) { KPText(text = "Large Disabled") }
                        Spacer(modifier = Modifier.height(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Secondary,
                            size = KPButtonSize.Medium,
                            enabled = false
                        ) { KPText(text = "Medium Disabled") }
                        Spacer(modifier = Modifier.height(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Secondary,
                            size = KPButtonSize.Small,
                            enabled = false
                        ) { KPText(text = "Small Disabled") }
                        Spacer(modifier = Modifier.height(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Secondary,
                            size = KPButtonSize.XSmall,
                            enabled = false
                        ) { KPText(text = "XSmall Disabled") }
                    }
                }
            },
            DesignScreenshotTestContainer("Tertiary Disabled") {
                BoxWithHorizontalPadding {
                    Column {
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Tertiary,
                            size = KPButtonSize.Large,
                            enabled = false
                        ) { KPText(text = "Large Disabled") }
                        Spacer(modifier = Modifier.height(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Tertiary,
                            size = KPButtonSize.Medium,
                            enabled = false
                        ) { KPText(text = "Medium Disabled") }
                        Spacer(modifier = Modifier.height(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Tertiary,
                            size = KPButtonSize.Small,
                            enabled = false
                        ) { KPText(text = "Small Disabled") }
                        Spacer(modifier = Modifier.height(8.dp))
                        KPButton(
                            onClick = { },
                            style = KPButtonStyle.Tertiary,
                            size = KPButtonSize.XSmall,
                            enabled = false
                        ) { KPText(text = "XSmall Disabled") }
                    }
                }
            },
        )
    )

    @Test
    fun iconWithTextDisabledTest() = runScreenShotTest(
        testName = "iconWithTextDisabledTest",
        contents = listOf(
            DesignScreenshotTestContainer("Primary Disabled") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.Large,
                        contentPadding = PaddingValues(
                            vertical = 3.5.dp,
                            horizontal = 20.dp
                        ),
                        enabled = false,
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            KPText(
                                text = "Top Text",
                                style = KPDesign.typography.titleBold,
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                KPIcon(
                                    imageVector = KPIcons.Fill.RunningOut,
                                    size = KPIconSize.XXSmall,
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                KPText(
                                    text = "Bottom Text",
                                    style = KPDesign.typography.body2Medium
                                )
                            }
                        }
                    }
                }
            },
            DesignScreenshotTestContainer("Secondary Disabled") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Secondary,
                        size = KPButtonSize.Large,
                        contentPadding = PaddingValues(
                            vertical = 3.5.dp,
                            horizontal = 20.dp
                        ),
                        enabled = false,
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            KPText(
                                text = "Top Text",
                                style = KPDesign.typography.titleBold,
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                KPIcon(
                                    imageVector = KPIcons.Fill.RunningOut,
                                    size = KPIconSize.XXSmall,
                                    tint = LocalContentColor.current,
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                KPText(
                                    text = "Bottom Text",
                                    style = KPDesign.typography.body2Medium
                                )
                            }
                        }
                    }
                }
            },
            DesignScreenshotTestContainer("Tertiary Disabled") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Tertiary,
                        size = KPButtonSize.Large,
                        contentPadding = PaddingValues(
                            vertical = 3.5.dp,
                            horizontal = 20.dp
                        ),
                        enabled = false,
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            KPText(
                                text = "Top Text",
                                style = KPDesign.typography.titleBold,
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                KPIcon(
                                    imageVector = KPIcons.Fill.RunningOut,
                                    size = KPIconSize.XXSmall,
                                    tint = LocalContentColor.current,
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                KPText(
                                    text = "Bottom Text",
                                    style = KPDesign.typography.body2Medium
                                )
                            }
                        }
                    }
                }
            },
        )
    )

    @Test
    fun twoLineButtonAllStylesTest() = runScreenShotTest(
        testName = "twoLineButtonAllStylesTest",
        contents = listOf(
            DesignScreenshotTestContainer("Primary Two Line") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Primary,
                        size = KPButtonSize.Large,
                    ) {
                        KPText(
                            text = "Long Title example\n is like that",
                            textAlign = TextAlign.Center,
                        )
                    }
                }
            },
            DesignScreenshotTestContainer("Secondary Two Line") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Secondary,
                        size = KPButtonSize.Large,
                    ) {
                        KPText(
                            text = "Long Title example\n is like that",
                            textAlign = TextAlign.Center,
                        )
                    }
                }
            },
            DesignScreenshotTestContainer("Tertiary Two Line") {
                BoxWithHorizontalPadding {
                    KPButton(
                        onClick = { },
                        style = KPButtonStyle.Tertiary,
                        size = KPButtonSize.Large,
                    ) {
                        KPText(
                            text = "Long Title example\n is like that",
                            textAlign = TextAlign.Center,
                        )
                    }
                }
            },
        )
    )
}
