package bottomsheet.item

import com.trendyol.design.bottomsheet.item.BottomSheetCheckboxItem
import com.trendyol.design.bottomsheet.item.BottomSheetRadioItem
import com.trendyol.design.bottomsheet.item.BottomSheetSingleSelectItem
import com.trendyol.design.bottomsheet.item.BottomSheetStaticItem
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Bullet
import com.trendyol.design.core.icon.icons.outline.Union
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class BottomSheetItemTest : DesignScreenshotTest() {

    private val text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
    private val description =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eget metus commodo."

    @Test
    fun bottomSheetCheckboxItemTest() = runScreenShotTest(
        testName = "BottomSheet Checkbox Item Test",
        contents = listOf(
            DesignScreenshotTestContainer("BottomSheet Checkbox is Checked") {
                BoxWithHorizontalPadding {
                    BottomSheetCheckboxItem(checked = true, text = text, onCheckedChange = {})
                }
            },
            DesignScreenshotTestContainer("BottomSheet Checkbox is Unchecked") {
                BoxWithHorizontalPadding {
                    BottomSheetCheckboxItem(checked = false, text = text, onCheckedChange = {})
                }
            },
            DesignScreenshotTestContainer("BottomSheet Checkbox is Visible") {
                BoxWithHorizontalPadding {
                    BottomSheetCheckboxItem(
                        checked = true, text = text, onCheckedChange = {},
                        isIconVisible = true
                    )
                }
            },
            DesignScreenshotTestContainer("BottomSheet Checkbox is with Description") {
                BoxWithHorizontalPadding {
                    BottomSheetCheckboxItem(
                        checked = false, text = text, onCheckedChange = {},
                        description = description
                    )
                }
            }
        )
    )

    @Test
    fun bottomSheetRadioItemTest() = runScreenShotTest(
        testName = "BottomSheet Radio Item Test",
        contents = listOf(
            DesignScreenshotTestContainer("BottomSheet Radio is Selected") {
                BoxWithHorizontalPadding {
                    BottomSheetRadioItem(selected = true, text = text, onClick = {})
                }
            },
            DesignScreenshotTestContainer("BottomSheet Radio is Unselected") {
                BoxWithHorizontalPadding {
                    BottomSheetRadioItem(selected = false, text = text, onClick = {})
                }
            },
            DesignScreenshotTestContainer("BottomSheet Radio's icon is Visible") {
                BoxWithHorizontalPadding {
                    BottomSheetRadioItem(
                        selected = true, text = text, onClick = {},
                        isIconVisible = true
                    )
                }
            },
            DesignScreenshotTestContainer("BottomSheet Radio is with Description") {
                BoxWithHorizontalPadding {
                    BottomSheetRadioItem(
                        selected = false, text = text, onClick = {},
                        description = description
                    )
                }
            }
        )
    )

    @Test
    fun bottomSheetSingleSelectItemTest() = runScreenShotTest(
        testName = "BottomSheet Single Select Item Test",
        contents = listOf(
            DesignScreenshotTestContainer("BottomSheet Single Select is Selected") {
                BoxWithHorizontalPadding {
                    BottomSheetSingleSelectItem(selected = true, text = text, onClick = {})
                }
            },
            DesignScreenshotTestContainer("BottomSheet Single Select is Unselected") {
                BoxWithHorizontalPadding {
                    BottomSheetSingleSelectItem(selected = false, text = text, onClick = {})
                }
            },
            DesignScreenshotTestContainer("BottomSheet Single Select is not Visible")
            {
                BoxWithHorizontalPadding {
                    BottomSheetSingleSelectItem(
                        selected = true, text = text, onClick = {},
                        isIconVisible = false
                    )
                }
            },
            DesignScreenshotTestContainer("BottomSheet Single Select is with Description") {
                BoxWithHorizontalPadding {
                    BottomSheetSingleSelectItem(
                        selected = false, text = text, onClick = {},
                        description = description
                    )
                }
            },
            DesignScreenshotTestContainer("BottomSheet Single Select is with Helper Text") {
                BoxWithHorizontalPadding {
                    BottomSheetSingleSelectItem(
                        selected = false, text = text, onClick = {},
                        helperText = text
                    )
                }
            }
        )
    )


    @Test
    fun bottomSheetStaticItemTest() = runScreenShotTest(
        testName = "BottomSheet Static Item Test",
        contents = listOf(
            DesignScreenshotTestContainer("BottomSheet Static is with Text") {
                BoxWithHorizontalPadding {
                    BottomSheetStaticItem(text = text, onClick = {})
                }
            },
            DesignScreenshotTestContainer("BottomSheet Static is with Description Text") {
                BoxWithHorizontalPadding {
                    BottomSheetStaticItem(
                        text = text, onClick = {},
                        description = description
                    )
                }
            },
            DesignScreenshotTestContainer(
                "BottomSheet Static is with Icons.Outline.Union icon"
            ) {
                BoxWithHorizontalPadding {
                    BottomSheetStaticItem(
                        text = text, onClick = {},
                        icon = Icons.Outline.Union,
                        description = description
                    )
                }
            },
            DesignScreenshotTestContainer(
                "BottomSheet Static is with Icons.Fill.Bullet icon"
            ) {
                BoxWithHorizontalPadding {
                    BottomSheetStaticItem(
                        text = text, onClick = {},
                        icon = Icons.Fill.Bullet,
                        description = description
                    )
                }
            }
        )
    )
}