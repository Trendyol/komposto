package bottomsheet

import androidx.compose.material.Text
import com.trendyol.design.bottomsheet.BottomSheetImageContent
import com.trendyol.design.bottomsheet.BottomSheetListContent
import com.trendyol.design.bottomsheet.BottomSheetSliderContent
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import kotlinx.collections.immutable.persistentListOf
import org.junit.Test

internal class BottomSheetTest : DesignScreenshotTest() {

    private val headerTitle = "Title"
    private val testItemList = persistentListOf("Item 1", "Item 2", "Item 3")

    @Test
    fun bottomSheetStyleTest() = runScreenShotTest(
        testName = "BottomSheet Style Test",
        contents = listOf(
            DesignScreenshotTestContainer("BottomSheet Image Content") {
                BoxWithHorizontalPadding {
                    BottomSheetImageContent(
                        title = headerTitle,
                        onCloseIconClick = { },
                        model = null
                    )
                }
            },
            DesignScreenshotTestContainer("BottomSheet List Content") {
                BoxWithHorizontalPadding {
                    BottomSheetListContent(
                        title = headerTitle,
                        onCloseIconClick = {},
                        itemList = testItemList,
                        itemContent = { index, item ->
                            Text(text = "Index: $index, Item: $item")
                        }
                    )
                }
            },
            DesignScreenshotTestContainer("BottomSheet Slider Content") {
                BoxWithHorizontalPadding {
                    BottomSheetSliderContent(
                        title = headerTitle,
                        onCloseIconClick = { },
                        itemList = testItemList,
                        itemContent = { index, item ->
                            Text(text = "Index: $index, Item: $item")
                        }
                    )
                }
            }
        )
    )

}