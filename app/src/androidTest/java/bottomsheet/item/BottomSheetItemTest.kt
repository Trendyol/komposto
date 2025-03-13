package bottomsheet.item

import com.trendyol.design.bottomsheet.item.KPBottomSheetCheckboxItem
import com.trendyol.design.bottomsheet.item.KPBottomSheetRadioItem
import com.trendyol.design.bottomsheet.item.KPBottomSheetSingleSelectItem
import com.trendyol.design.bottomsheet.item.KPBottomSheetStaticItem
import com.trendyol.design.core.icon.KPIcons
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
                    KPBottomSheetCheckboxItem(checked = true, text = text, onCheckedChange = {})
                }
            },
            DesignScreenshotTestContainer("BottomSheet Checkbox is Unchecked") {
                BoxWithHorizontalPadding {
                    KPBottomSheetCheckboxItem(checked = false, text = text, onCheckedChange = {})
                }
            },
            DesignScreenshotTestContainer("BottomSheet Checkbox is Visible") {
                BoxWithHorizontalPadding {
                    KPBottomSheetCheckboxItem(
                        checked = true, text = text, onCheckedChange = {},
                        isIconVisible = true
                    )
                }
            },
            DesignScreenshotTestContainer("BottomSheet Checkbox is with Description") {
                BoxWithHorizontalPadding {
                    KPBottomSheetCheckboxItem(
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
                    KPBottomSheetRadioItem(selected = true, text = text, onClick = {})
                }
            },
            DesignScreenshotTestContainer("BottomSheet Radio is Unselected") {
                BoxWithHorizontalPadding {
                    KPBottomSheetRadioItem(selected = false, text = text, onClick = {})
                }
            },
            DesignScreenshotTestContainer("BottomSheet Radio's icon is Visible") {
                BoxWithHorizontalPadding {
                    KPBottomSheetRadioItem(
                        selected = true, text = text, onClick = {},
                        isIconVisible = true
                    )
                }
            },
            DesignScreenshotTestContainer("BottomSheet Radio is with Description") {
                BoxWithHorizontalPadding {
                    KPBottomSheetRadioItem(
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
                    KPBottomSheetSingleSelectItem(selected = true, text = text, onClick = {})
                }
            },
            DesignScreenshotTestContainer("BottomSheet Single Select is Unselected") {
                BoxWithHorizontalPadding {
                    KPBottomSheetSingleSelectItem(selected = false, text = text, onClick = {})
                }
            },
            DesignScreenshotTestContainer("BottomSheet Single Select is not Visible")
            {
                BoxWithHorizontalPadding {
                    KPBottomSheetSingleSelectItem(
                        selected = true, text = text, onClick = {},
                        isIconVisible = false
                    )
                }
            },
            DesignScreenshotTestContainer("BottomSheet Single Select is with Description") {
                BoxWithHorizontalPadding {
                    KPBottomSheetSingleSelectItem(
                        selected = false, text = text, onClick = {},
                        description = description
                    )
                }
            },
            DesignScreenshotTestContainer("BottomSheet Single Select is with Helper Text") {
                BoxWithHorizontalPadding {
                    KPBottomSheetSingleSelectItem(
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
                    KPBottomSheetStaticItem(text = text, onClick = {})
                }
            },
            DesignScreenshotTestContainer("BottomSheet Static is with Description Text") {
                BoxWithHorizontalPadding {
                    KPBottomSheetStaticItem(
                        text = text, onClick = {},
                        description = description
                    )
                }
            },
            DesignScreenshotTestContainer(
                "BottomSheet Static is with Outline.Union icon"
            ) {
                BoxWithHorizontalPadding {
                    KPBottomSheetStaticItem(
                        text = text, onClick = {},
                        icon = KPIcons.Outline.Union,
                        description = description
                    )
                }
            },
            DesignScreenshotTestContainer(
                "BottomSheet Static is with Fill.Bullet icon"
            ) {
                BoxWithHorizontalPadding {
                    KPBottomSheetStaticItem(
                        text = text, onClick = {},
                        icon = KPIcons.Fill.Bullet,
                        description = description
                    )
                }
            }
        )
    )
}