@file:OptIn(ExperimentalKompostoApi::class)

package bottomsheet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.trendyol.design.bottomsheet.KPBottomSheetImageContent
import com.trendyol.design.bottomsheet.KPBottomSheetListContent
import com.trendyol.design.bottomsheet.KPBottomSheetSliderContent
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import kotlinx.collections.immutable.persistentListOf
import org.junit.Test

internal class BottomSheetTest : DesignScreenshotTest() {

    private val headerTitle = "Title"
    val testItemList = persistentListOf(
        com.trendyol.design.bottomsheet.R.drawable.image1,
        com.trendyol.design.bottomsheet.R.drawable.image2,
        com.trendyol.design.bottomsheet.R.drawable.image3,
        com.trendyol.design.bottomsheet.R.drawable.image4,
        com.trendyol.design.bottomsheet.R.drawable.image5
    )

    @Test
    fun bottomSheetStyleTest() = runScreenShotTest(
        testName = "BottomSheet Style Test",
        contents = listOf(
            DesignScreenshotTestContainer("BottomSheet Image Content") {
                BoxWithHorizontalPadding {
                    KPBottomSheetImageContent(
                        title = headerTitle,
                        onCloseIconClick = { },
                        model = null
                    )
                }
            },
            DesignScreenshotTestContainer("BottomSheet List Content") {
                BoxWithHorizontalPadding {
                    KPBottomSheetListContent(
                        title = headerTitle,
                        onCloseIconClick = {},
                        itemList = testItemList,
                        itemContent = { index, item ->
                            Column(
                                modifier = Modifier.padding(8.dp)
                            ) {
                                Text(
                                    text = "Index: $index",
                                    modifier = Modifier.padding(bottom = 1.dp)
                                )
                                Image(
                                    painter = painterResource(id = item),
                                    contentDescription = "Image at index $index",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(24.dp)
                                )
                            }
                        }
                    )
                }
            },
            DesignScreenshotTestContainer("BottomSheet Slider Content") {
                BoxWithHorizontalPadding {
                    KPBottomSheetSliderContent(
                        title = headerTitle,
                        onCloseIconClick = { },
                        itemList = testItemList,
                        itemContent = { index, item ->
                            Column(
                                modifier = Modifier.padding(8.dp)
                            ) {
                                Text(
                                    text = "Index: $index",
                                    modifier = Modifier.padding(bottom = 1.dp)
                                )
                                Image(
                                    painter = painterResource(id = item),
                                    contentDescription = "Image at index $index",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(44.dp)
                                )
                            }
                        }
                    )
                }
            }
        )
    )

}