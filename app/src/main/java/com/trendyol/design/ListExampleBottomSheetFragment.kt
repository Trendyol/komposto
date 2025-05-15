package com.trendyol.design

import androidx.compose.runtime.Composable
import com.trendyol.design.bottomsheet.KPBottomSheetFragment
import com.trendyol.design.bottomsheet.KPBottomSheetListContent
import com.trendyol.design.bottomsheet.item.KPBottomSheetCheckboxItem
import com.trendyol.design.ui.theme.TrendyolTheme
import kotlinx.collections.immutable.persistentListOf

class ListExampleBottomSheetFragment : KPBottomSheetFragment() {

    @Composable
    override fun PageContent() {
        TrendyolTheme {
            KPBottomSheetListContent(
                title = "SomeTitle",
                onCloseIconClick = { },
                itemList = persistentListOf(
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                    "asd",
                ),
                itemContent = { _, item ->
                    KPBottomSheetCheckboxItem(
                        checked = false,
                        text = item,
                        onCheckedChange = {},
                        description = "description",
                        isIconVisible = true,
                    )
                }
            )
        }
    }
}
