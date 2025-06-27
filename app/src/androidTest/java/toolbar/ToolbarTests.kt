package toolbar

import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.icon.icons.fill.Trash
import com.trendyol.design.core.toolbar.KPToolbar
import com.trendyol.design.core.toolbar.KPToolbarStyle
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class ToolbarTests : DesignScreenshotTest() {

    private val toolbarText = "CTA Label"

    @Test
    fun styleTest() = runScreenShotTest(
        testName = "styleTest",
        contents = listOf(
            DesignScreenshotTestContainer("ToolbarIconEndIcon") {
                BoxWithHorizontalPadding {
                    KPToolbar(
                        title = "ToolbarIconEndIcon",
                        style = KPToolbarStyle.Icon.EndIcon(
                            icon = {
                                Icon(imageVector = KPIcons.Fill.Trash, onClick = { })
                            },
                            endIcon = {
                                Icon(imageVector = KPIcons.Fill.Trash, onClick = { })
                            }
                        )
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarIconEndTwoIcon") {
                BoxWithHorizontalPadding {
                    KPToolbar(
                        title = "ToolbarIconEndTwoIcon",
                        style = KPToolbarStyle.Icon.EndTwoIcons(
                            icon = {
                                Icon(imageVector = KPIcons.Fill.Trash, onClick = { })
                            },
                            firstIcon = {
                                Icon(imageVector = KPIcons.Fill.Help, onClick= { })
                            },
                            secondIcon = {
                                Icon(imageVector = KPIcons.Fill.Trash, onClick = { })
                            }
                        )
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarIconNone") {
                BoxWithHorizontalPadding {
                    KPToolbar(
                        title = "ToolbarIconNone",
                        style = KPToolbarStyle.Icon.None(
                            icon = {
                                Icon(imageVector = KPIcons.Fill.Help, onClick = { })
                            }
                        )
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarIconTextButton") {
                BoxWithHorizontalPadding {
                    KPToolbar(
                        title = "ToolbarIconTextButton",
                        style = KPToolbarStyle.Icon.TextButton(
                            icon = {
                                Icon(imageVector = KPIcons.Fill.Trash, onClick = { })
                            },
                            textButton = {
                                Text(text = toolbarText, onClick = { })
                            }
                        )
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarEndIcon") {
                BoxWithHorizontalPadding {
                    KPToolbar(
                        title = "ToolbarEndIcon",
                        style = KPToolbarStyle.EndIcon(
                            endIcon = {
                                Icon(imageVector = KPIcons.Fill.Trash, onClick = { })
                            }
                        )
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarEndTwoIcon") {
                BoxWithHorizontalPadding {
                    KPToolbar(
                        title = "ToolbarIconEndTwoIcon",
                        style = KPToolbarStyle.EndTwoIcons(
                            firstIcon = {
                                Icon(imageVector = KPIcons.Fill.Help, onClick = { })
                            },
                            secondIcon = {
                                Icon(imageVector = KPIcons.Fill.Trash, onClick = { })
                            }
                        )
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarNone") {
                BoxWithHorizontalPadding {
                    KPToolbar(
                        title = "ToolbarNone",
                        style = KPToolbarStyle.None
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarTextButton") {
                BoxWithHorizontalPadding {
                    KPToolbar(
                        title = "ToolbarTextButton",
                        style = KPToolbarStyle.TextButton(
                            textButton = {
                                Text(text = toolbarText, onClick = { })
                            }
                        )
                    )
                }
            }
        )
    )
}
