@file:OptIn(ExperimentalKompostoApi::class)

package iconbutton

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.icon.icons.fill.PauseButton
import com.trendyol.design.core.icon.icons.fill.PlayButton
import com.trendyol.design.core.icon.icons.fill.SaveSelected
import com.trendyol.design.core.icon.icons.fill.Share
import com.trendyol.design.core.icon.icons.outline.SaveUnselected
import com.trendyol.design.core.iconbutton.contained.KPContainedIconButton
import com.trendyol.design.core.iconbutton.contained.KPContainedIconButtonSize
import com.trendyol.design.core.iconbutton.contained.KPContainedIconToggleButton
import com.trendyol.design.core.iconbutton.standard.KPStandardIconButton
import com.trendyol.design.core.iconbutton.standard.KPStandardIconButtonSize
import com.trendyol.design.core.iconbutton.standard.KPStandardIconToggleButton
import com.trendyol.design.core.text.KPText
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class IconButtonTest : DesignScreenshotTest() {

    @Test
    fun containedIconButtonSizeTest() = runScreenShotTest(
        testName = "containedIconButtonSizeTest",
        contents = listOf(
            DesignScreenshotTestContainer("Small") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPContainedIconButton(
                            icon = KPIcons.Fill.Share,
                            size = KPContainedIconButtonSize.Small,
                            onClick = { }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Small")
                    }
                }
            },
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPContainedIconButton(
                            icon = KPIcons.Fill.Share,
                            size = KPContainedIconButtonSize.Medium,
                            onClick = { }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Medium")
                    }
                }
            },
            DesignScreenshotTestContainer("Large") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPContainedIconButton(
                            icon = KPIcons.Fill.Share,
                            size = KPContainedIconButtonSize.Large,
                            onClick = { }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Large")
                    }
                }
            }
        )
    )

    @Test
    fun containedIconButtonStateTest() = runScreenShotTest(
        testName = "containedIconButtonStateTest",
        contents = listOf(
            DesignScreenshotTestContainer("Enabled") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPContainedIconButton(
                            icon = KPIcons.Fill.Share,
                            size = KPContainedIconButtonSize.Medium,
                            onClick = { }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Enabled")
                    }
                }
            },
            DesignScreenshotTestContainer("Disabled") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPContainedIconButton(
                            icon = KPIcons.Fill.Share,
                            size = KPContainedIconButtonSize.Medium,
                            onClick = { },
                            enabled = false
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Disabled")
                    }
                }
            }
        )
    )

    @Test
    fun containedIconToggleButtonTest() = runScreenShotTest(
        testName = "containedIconToggleButtonTest",
        contents = listOf(
            DesignScreenshotTestContainer("Unchecked") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPContainedIconToggleButton(
                            checked = false,
                            checkedIcon = KPIcons.Fill.SaveSelected,
                            unCheckedIcon = KPIcons.Outline.SaveUnselected,
                            size = KPContainedIconButtonSize.Medium,
                            onCheckedChange = { }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Unchecked")
                    }
                }
            },
            DesignScreenshotTestContainer("Checked") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPContainedIconToggleButton(
                            checked = true,
                            checkedIcon = KPIcons.Fill.SaveSelected,
                            unCheckedIcon = KPIcons.Outline.SaveUnselected,
                            size = KPContainedIconButtonSize.Medium,
                            onCheckedChange = { }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Checked")
                    }
                }
            },
            DesignScreenshotTestContainer("Disabled") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPContainedIconToggleButton(
                            checked = false,
                            checkedIcon = KPIcons.Fill.SaveSelected,
                            unCheckedIcon = KPIcons.Outline.SaveUnselected,
                            size = KPContainedIconButtonSize.Medium,
                            onCheckedChange = { },
                            enabled = false
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Disabled")
                    }
                }
            }
        )
    )

    @Test
    fun standardIconButtonSizeTest() = runScreenShotTest(
        testName = "standardIconButtonSizeTest",
        contents = listOf(
            DesignScreenshotTestContainer("XSmall") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPStandardIconButton(
                            icon = KPIcons.Fill.Help,
                            size = KPStandardIconButtonSize.XSmall,
                            onClick = { }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("XSmall")
                    }
                }
            },
            DesignScreenshotTestContainer("Small") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPStandardIconButton(
                            icon = KPIcons.Fill.Help,
                            size = KPStandardIconButtonSize.Small,
                            onClick = { }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Small")
                    }
                }
            },
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPStandardIconButton(
                            icon = KPIcons.Fill.Help,
                            size = KPStandardIconButtonSize.Medium,
                            onClick = { }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Medium")
                    }
                }
            },
            DesignScreenshotTestContainer("Large") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPStandardIconButton(
                            icon = KPIcons.Fill.Help,
                            size = KPStandardIconButtonSize.Large,
                            onClick = { }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Large")
                    }
                }
            },
            DesignScreenshotTestContainer("XLarge") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPStandardIconButton(
                            icon = KPIcons.Fill.Help,
                            size = KPStandardIconButtonSize.XLarge,
                            onClick = { }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("XLarge")
                    }
                }
            }
        )
    )

    @Test
    fun standardIconButtonStateTest() = runScreenShotTest(
        testName = "standardIconButtonStateTest",
        contents = listOf(
            DesignScreenshotTestContainer("Enabled") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPStandardIconButton(
                            icon = KPIcons.Fill.Help,
                            size = KPStandardIconButtonSize.Medium,
                            onClick = { }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Enabled")
                    }
                }
            },
            DesignScreenshotTestContainer("Disabled") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPStandardIconButton(
                            icon = KPIcons.Fill.Help,
                            size = KPStandardIconButtonSize.Medium,
                            onClick = { },
                            enabled = false
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Disabled")
                    }
                }
            }
        )
    )

    @Test
    fun standardIconToggleButtonTest() = runScreenShotTest(
        testName = "standardIconToggleButtonTest",
        contents = listOf(
            DesignScreenshotTestContainer("Unchecked") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPStandardIconToggleButton(
                            checked = false,
                            checkedIcon = KPIcons.Fill.PlayButton,
                            unCheckedIcon = KPIcons.Fill.PauseButton,
                            size = KPStandardIconButtonSize.Medium,
                            onCheckedChange = { }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Unchecked")
                    }
                }
            },
            DesignScreenshotTestContainer("Checked") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPStandardIconToggleButton(
                            checked = true,
                            checkedIcon = KPIcons.Fill.PlayButton,
                            unCheckedIcon = KPIcons.Fill.PauseButton,
                            size = KPStandardIconButtonSize.Medium,
                            onCheckedChange = { }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Checked")
                    }
                }
            },
            DesignScreenshotTestContainer("Disabled") {
                BoxWithHorizontalPadding {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        KPStandardIconToggleButton(
                            checked = false,
                            checkedIcon = KPIcons.Fill.PlayButton,
                            unCheckedIcon = KPIcons.Fill.PauseButton,
                            size = KPStandardIconButtonSize.Medium,
                            onCheckedChange = { },
                            enabled = false
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        KPText("Disabled")
                    }
                }
            }
        )
    )

    @Test
    fun multipleIconButtonsTest() = runScreenShotTest(
        testName = "multipleIconButtonsTest",
        contents = listOf(
            DesignScreenshotTestContainer("Contained Buttons") {
                BoxWithHorizontalPadding {
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            KPContainedIconButton(
                                icon = KPIcons.Fill.Share,
                                size = KPContainedIconButtonSize.Small,
                                onClick = { }
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            KPText("Small")
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            KPContainedIconButton(
                                icon = KPIcons.Fill.Share,
                                size = KPContainedIconButtonSize.Medium,
                                onClick = { }
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            KPText("Medium")
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            KPContainedIconButton(
                                icon = KPIcons.Fill.Share,
                                size = KPContainedIconButtonSize.Large,
                                onClick = { }
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            KPText("Large")
                        }
                    }
                }
            },
            DesignScreenshotTestContainer("Standard Buttons") {
                BoxWithHorizontalPadding {
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            KPStandardIconButton(
                                icon = KPIcons.Fill.Help,
                                size = KPStandardIconButtonSize.XSmall,
                                onClick = { }
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            KPText("XSmall")
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            KPStandardIconButton(
                                icon = KPIcons.Fill.Help,
                                size = KPStandardIconButtonSize.Small,
                                onClick = { }
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            KPText("Small")
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            KPStandardIconButton(
                                icon = KPIcons.Fill.Help,
                                size = KPStandardIconButtonSize.Medium,
                                onClick = { }
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            KPText("Medium")
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            KPStandardIconButton(
                                icon = KPIcons.Fill.Help,
                                size = KPStandardIconButtonSize.Large,
                                onClick = { }
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            KPText("Large")
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            KPStandardIconButton(
                                icon = KPIcons.Fill.Help,
                                size = KPStandardIconButtonSize.XLarge,
                                onClick = { }
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            KPText("XLarge")
                        }
                    }
                }
            }
        )
    )
}
