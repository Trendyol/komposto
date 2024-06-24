package toolbar

import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.icon.icons.fill.Trash
import com.trendyol.design.core.toolbar.Toolbar
import com.trendyol.design.core.toolbar.TrendyolToolbarStyle
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
                    Toolbar(
                        title = "ToolbarIconEndIcon",
                        style = TrendyolToolbarStyle.Icon.EndIcon(
                            icon = {
                                Icon(imageVector = Icons.Fill.Trash, onClick = { })
                            },
                            endIcon = {
                                Icon(imageVector = Icons.Fill.Trash, onClick = { })
                            }
                        )
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarIconEndTwoIcon") {
                BoxWithHorizontalPadding {
                    Toolbar(
                        title = "ToolbarIconEndTwoIcon",
                        style = TrendyolToolbarStyle.Icon.EndTwoIcons(
                            icon = {
                                Icon(imageVector = Icons.Fill.Trash, onClick = { })
                            },
                            firstIcon = {
                                Icon(imageVector = Icons.Fill.Help, onClick= { })
                            },
                            secondIcon = {
                                Icon(imageVector = Icons.Fill.Trash, onClick = { })
                            }
                        )
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarIconNone") {
                BoxWithHorizontalPadding {
                    Toolbar(
                        title = "ToolbarIconNone",
                        style = TrendyolToolbarStyle.Icon.None(
                            icon = {
                                Icon(imageVector = Icons.Fill.Help, onClick = { })
                            }
                        )
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarIconTextButton") {
                BoxWithHorizontalPadding {
                    Toolbar(
                        title = "ToolbarIconTextButton",
                        style = TrendyolToolbarStyle.Icon.TextButton(
                            icon = {
                                Icon(imageVector = Icons.Fill.Trash, onClick = { })
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
                    Toolbar(
                        title = "ToolbarEndIcon",
                        style = TrendyolToolbarStyle.EndIcon(
                            endIcon = {
                                Icon(imageVector = Icons.Fill.Trash, onClick = { })
                            }
                        )
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarEndTwoIcon") {
                BoxWithHorizontalPadding {
                    Toolbar(
                        title = "ToolbarIconEndTwoIcon",
                        style = TrendyolToolbarStyle.EndTwoIcons(
                            firstIcon = {
                                Icon(imageVector = Icons.Fill.Help, onClick = { })
                            },
                            secondIcon = {
                                Icon(imageVector = Icons.Fill.Trash, onClick = { })
                            }
                        )
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarNone") {
                BoxWithHorizontalPadding {
                    Toolbar(
                        title = "ToolbarNone",
                        style = TrendyolToolbarStyle.None
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarTextButton") {
                BoxWithHorizontalPadding {
                    Toolbar(
                        title = "ToolbarTextButton",
                        style = TrendyolToolbarStyle.TextButton(
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
