package bottomsheet.item

import com.trendyol.design.bottomsheet.item.BottomSheetCheckboxItem
import com.trendyol.design.bottomsheet.item.BottomSheetRadioItem
import com.trendyol.design.bottomsheet.item.BottomSheetSingleSelectItem
import com.trendyol.design.bottomsheet.item.BottomSheetStaticItem
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class BottomSheetItemTest : DesignScreenshotTest() {

    private val text = "Text"

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
            DesignScreenshotTestContainer("BottomSheet Static is without Text") {
                BoxWithHorizontalPadding {
                    BottomSheetStaticItem(text = "", onClick = {})
                }
            }
        )
    )
}