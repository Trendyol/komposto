@file:OptIn(ExperimentalKompostoApi::class)

package listcell

import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.design.bottomsheet.item.KPBottomSheetCheckboxItem
import com.trendyol.design.bottomsheet.item.KPBottomSheetRadioItem
import com.trendyol.design.bottomsheet.item.KPBottomSheetSingleSelectItem
import com.trendyol.design.bottomsheet.item.KPBottomSheetStaticItem
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Bullet
import com.trendyol.design.core.icon.icons.outline.Union
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class ListCellTest : DesignScreenshotTest() {

    private val title = "Title"
    private val description = "Description"
    private val helperText = "Helper text"

    @Test
    fun checkboxItemTest() = runScreenShotTest(
        testName = "checkboxItemTest",
        contents = listOf(
            DesignScreenshotTestContainer("Basic - Checked with Icon") {
                BoxWithHorizontalPadding {
                    KPBottomSheetCheckboxItem(
                        checked = true,
                        text = title,
                        onCheckedChange = { },
                        isIconVisible = true,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Basic - Checked without Icon") {
                BoxWithHorizontalPadding {
                    KPBottomSheetCheckboxItem(
                        checked = true,
                        text = title,
                        onCheckedChange = { },
                        isIconVisible = false,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Basic - Unchecked with Icon") {
                BoxWithHorizontalPadding {
                    KPBottomSheetCheckboxItem(
                        checked = false,
                        text = title,
                        onCheckedChange = { },
                        isIconVisible = true,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Rich - Checked with Description") {
                BoxWithHorizontalPadding {
                    KPBottomSheetCheckboxItem(
                        checked = true,
                        text = title,
                        onCheckedChange = { },
                        isIconVisible = true,
                        description = description,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Rich - Unchecked with Description") {
                BoxWithHorizontalPadding {
                    KPBottomSheetCheckboxItem(
                        checked = false,
                        text = title,
                        onCheckedChange = { },
                        isIconVisible = true,
                        description = description,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            }
        )
    )

    @Test
    fun radioItemTest() = runScreenShotTest(
        testName = "radioItemTest",
        contents = listOf(
            DesignScreenshotTestContainer("Basic - Selected with Icon") {
                BoxWithHorizontalPadding {
                    KPBottomSheetRadioItem(
                        selected = true,
                        text = title,
                        onClick = { },
                        isIconVisible = true,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Basic - Selected without Icon") {
                BoxWithHorizontalPadding {
                    KPBottomSheetRadioItem(
                        selected = true,
                        text = title,
                        onClick = { },
                        isIconVisible = false,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Basic - Unselected with Icon") {
                BoxWithHorizontalPadding {
                    KPBottomSheetRadioItem(
                        selected = false,
                        text = title,
                        onClick = { },
                        isIconVisible = true,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Rich - Selected with Description") {
                BoxWithHorizontalPadding {
                    KPBottomSheetRadioItem(
                        selected = true,
                        text = title,
                        onClick = { },
                        isIconVisible = true,
                        description = description,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Rich - Unselected with Description") {
                BoxWithHorizontalPadding {
                    KPBottomSheetRadioItem(
                        selected = false,
                        text = title,
                        onClick = { },
                        isIconVisible = true,
                        description = description,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            }
        )
    )

    @Test
    fun singleSelectItemTest() = runScreenShotTest(
        testName = "singleSelectItemTest",
        contents = listOf(
            DesignScreenshotTestContainer("Basic - Unselected with Helper") {
                BoxWithHorizontalPadding {
                    KPBottomSheetSingleSelectItem(
                        selected = false,
                        text = title,
                        onClick = { },
                        helperText = helperText,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Basic - Unselected without Helper") {
                BoxWithHorizontalPadding {
                    KPBottomSheetSingleSelectItem(
                        selected = false,
                        text = title,
                        onClick = { },
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Basic - Selected with Helper") {
                BoxWithHorizontalPadding {
                    KPBottomSheetSingleSelectItem(
                        selected = true,
                        text = title,
                        onClick = { },
                        helperText = helperText,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Rich - Unselected with Description") {
                BoxWithHorizontalPadding {
                    KPBottomSheetSingleSelectItem(
                        selected = false,
                        text = title,
                        onClick = { },
                        description = description,
                        helperText = helperText,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Rich - Selected with Description") {
                BoxWithHorizontalPadding {
                    KPBottomSheetSingleSelectItem(
                        selected = true,
                        text = title,
                        onClick = { },
                        description = description,
                        helperText = helperText,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            }
        )
    )

    @Test
    fun staticItemTest() = runScreenShotTest(
        testName = "staticItemTest",
        contents = listOf(
            DesignScreenshotTestContainer("Basic - Text Only") {
                BoxWithHorizontalPadding {
                    KPBottomSheetStaticItem(
                        text = title,
                        onClick = { },
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Basic - With Description") {
                BoxWithHorizontalPadding {
                    KPBottomSheetStaticItem(
                        text = title,
                        onClick = { },
                        description = description,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Union Icon - Top Position") {
                BoxWithHorizontalPadding {
                    KPBottomSheetStaticItem(
                        text = title,
                        onClick = { },
                        icon = KPIcons.Outline.Union,
                        iconPosition = Alignment.Top,
                        description = description,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Union Icon - Center Position") {
                BoxWithHorizontalPadding {
                    KPBottomSheetStaticItem(
                        text = title,
                        onClick = { },
                        icon = KPIcons.Outline.Union,
                        iconPosition = Alignment.CenterVertically,
                        description = description,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Union Icon - Bottom Position") {
                BoxWithHorizontalPadding {
                    KPBottomSheetStaticItem(
                        text = title,
                        onClick = { },
                        icon = KPIcons.Outline.Union,
                        iconPosition = Alignment.Bottom,
                        description = description,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            }
        )
    )

    @Test
    fun staticItemBulletTest() = runScreenShotTest(
        testName = "staticItemBulletTest",
        contents = listOf(
            DesignScreenshotTestContainer("Bullet Icon - Top Position") {
                BoxWithHorizontalPadding {
                    KPBottomSheetStaticItem(
                        text = title,
                        onClick = { },
                        icon = KPIcons.Fill.Bullet,
                        iconPosition = Alignment.Top,
                        description = description,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Bullet Icon - Center Position") {
                BoxWithHorizontalPadding {
                    KPBottomSheetStaticItem(
                        text = title,
                        onClick = { },
                        icon = KPIcons.Fill.Bullet,
                        iconPosition = Alignment.CenterVertically,
                        description = description,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            },
            DesignScreenshotTestContainer("Bullet Icon - Bottom Position") {
                BoxWithHorizontalPadding {
                    KPBottomSheetStaticItem(
                        text = title,
                        onClick = { },
                        icon = KPIcons.Fill.Bullet,
                        iconPosition = Alignment.Bottom,
                        description = description,
                        modifier = Modifier.padding(vertical = 12.dp),
                    )
                }
            }
        )
    )

    @Test
    fun listCellVariationsTest() = runScreenShotTest(
        testName = "listCellVariationsTest",
        contents = listOf(
            DesignScreenshotTestContainer("Checkbox Variations") {
                BoxWithHorizontalPadding {
                    Column {
                        KPBottomSheetCheckboxItem(
                            checked = true,
                            text = "Checked with Icon",
                            onCheckedChange = { },
                            isIconVisible = true,
                            modifier = Modifier.padding(vertical = 8.dp),
                        )
                        KPBottomSheetCheckboxItem(
                            checked = false,
                            text = "Unchecked with Description",
                            onCheckedChange = { },
                            isIconVisible = false,
                            description = "This is a description",
                            modifier = Modifier.padding(vertical = 8.dp),
                        )
                    }
                }
            },
            DesignScreenshotTestContainer("Radio Variations") {
                BoxWithHorizontalPadding {
                    Column {
                        KPBottomSheetRadioItem(
                            selected = true,
                            text = "Selected with Icon",
                            onClick = { },
                            isIconVisible = true,
                            modifier = Modifier.padding(vertical = 8.dp),
                        )
                        KPBottomSheetRadioItem(
                            selected = false,
                            text = "Unselected with Description",
                            onClick = { },
                            isIconVisible = false,
                            description = "This is a description",
                            modifier = Modifier.padding(vertical = 8.dp),
                        )
                    }
                }
            },
            DesignScreenshotTestContainer("Single Select Variations") {
                BoxWithHorizontalPadding {
                    Column {
                        KPBottomSheetSingleSelectItem(
                            selected = true,
                            text = "Selected with Helper",
                            onClick = { },
                            helperText = "Helper text here",
                            modifier = Modifier.padding(vertical = 8.dp),
                        )
                        KPBottomSheetSingleSelectItem(
                            selected = false,
                            text = "Unselected with Description",
                            onClick = { },
                            description = "This is a description",
                            modifier = Modifier.padding(vertical = 8.dp),
                        )
                    }
                }
            },
            DesignScreenshotTestContainer("Static Variations") {
                BoxWithHorizontalPadding {
                    Column {
                        KPBottomSheetStaticItem(
                            text = "Simple Static Item",
                            onClick = { },
                            modifier = Modifier.padding(vertical = 8.dp),
                        )
                        KPBottomSheetStaticItem(
                            text = "Static with Icon",
                            onClick = { },
                            icon = KPIcons.Outline.Union,
                            description = "This is a description",
                            modifier = Modifier.padding(vertical = 8.dp),
                        )
                    }
                }
            }
        )
    )
}
