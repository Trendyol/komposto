package bottomsheet.header

import com.trendyol.design.bottomsheet.header.KPBottomSheetHeader // Assuming KPBottomSheetHeader is the correct import
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class BottomSheetHeaderTest : DesignScreenshotTest() {

    private val singleRowTitle = "Title"
    private val doubleRowTitle =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod"

    @Test
    fun bottomSheetHeaderRowTitleTest() = runScreenShotTest(
        testName = "BottomSheet Header Single Row Test",
        contents = listOf(
            DesignScreenshotTestContainer("BottomSheet Header Single Row") {
                BoxWithHorizontalPadding {
                    KPBottomSheetHeader(title = singleRowTitle, onCloseIconClick = { }) // Replaced BottomSheetHeader with KPBottomSheetHeader
                }
            },
            DesignScreenshotTestContainer("BottomSheet Header Double Row") {
                BoxWithHorizontalPadding {
                    KPBottomSheetHeader(title = doubleRowTitle, onCloseIconClick = { }) // Replaced BottomSheetHeader with KPBottomSheetHeader
                }
            }
        )
    )

    @Test
    fun bottomSheetHeaderBackIconTest() = runScreenShotTest(
        testName = "BottomSheet Header Back Icon Test",
        contents = listOf(
            DesignScreenshotTestContainer("BottomSheet Header Back Icon is Visible") {
                BoxWithHorizontalPadding {
                    KPBottomSheetHeader( // Replaced BottomSheetHeader with KPBottomSheetHeader
                        title = singleRowTitle, onCloseIconClick = { },
                        isBackIconVisible = true
                    )
                }
            },
            DesignScreenshotTestContainer("BottomSheet Header Back Icon is not Visible") {
                BoxWithHorizontalPadding {
                    KPBottomSheetHeader( // Replaced BottomSheetHeader with KPBottomSheetHeader
                        title = singleRowTitle, onCloseIconClick = { },
                        isBackIconVisible = false
                    )
                }
            }
        )
    )

    @Test
    fun bottomSheetHeaderCloseIconTest() = runScreenShotTest(
        testName = "BottomSheet Header Close Icon Test",
        contents = listOf(
            DesignScreenshotTestContainer("BottomSheet Header Back Icon is Visible") {
                BoxWithHorizontalPadding {
                    KPBottomSheetHeader( // Replaced BottomSheetHeader with KPBottomSheetHeader
                        title = singleRowTitle, onCloseIconClick = { },
                        isCloseIconVisible = true
                    )
                }
            },
            DesignScreenshotTestContainer("BottomSheet Header Close Icon is not Visible") {
                BoxWithHorizontalPadding {
                    KPBottomSheetHeader( // Replaced BottomSheetHeader with KPBottomSheetHeader
                        title = singleRowTitle, onCloseIconClick = { },
                        isCloseIconVisible = false
                    )
                }
            }
        )
    )

}