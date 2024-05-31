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
                                Icon(imageVector = Icons.Fill.Trash, onClick = { /*TODO*/ })
                            },
                            endIcon = {
                                Icon(imageVector = Icons.Fill.Trash, onClick = { /*TODO*/ })
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
                                Icon(imageVector = Icons.Fill.Trash, onClick = { /*TODO*/ })
                            },
                            firstIcon = {
                                Icon(imageVector = Icons.Fill.Help, onClick = { /*TODO*/ })
                            },
                            secondIcon = {
                                Icon(imageVector = Icons.Fill.Trash, onClick = { /*TODO*/ })
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
                                Icon(imageVector = Icons.Fill.Help, onClick = { /*TODO*/ })
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
                                Icon(imageVector = Icons.Fill.Trash, onClick = { /*TODO*/ })
                            },
                            textButton = {
                                Text(text = toolbarText, onClick = { /*TODO*/ })
                            }
                        )
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarEndIcon") {
                BoxWithHorizontalPadding {
                    Toolbar(
                        title = "ToolbarIconTextButton",
                        style = TrendyolToolbarStyle.EndIcon(
                            endIcon = {
                                Icon(imageVector = Icons.Fill.Trash, onClick = { /*TODO*/ })
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
                                Icon(imageVector = Icons.Fill.Help, onClick = { /*TODO*/ })
                            },
                            secondIcon = {
                                Icon(imageVector = Icons.Fill.Trash, onClick = { /*TODO*/ })
                            }
                        )
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarNone") {
                BoxWithHorizontalPadding {
                    Toolbar(
                        title = "ToolbarIconNone",
                        style = TrendyolToolbarStyle.None
                    )
                }
            },
            DesignScreenshotTestContainer("ToolbarTextButton") {
                BoxWithHorizontalPadding {
                    Toolbar(
                        title = "ToolbarIconTextButton",
                        style = TrendyolToolbarStyle.TextButton(
                            textButton = {
                                Text(text = toolbarText, onClick = { /*TODO*/ })
                            }
                        )
                    )
                }
            }
        )
    )
}
