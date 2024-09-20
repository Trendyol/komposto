package com.trendyol.design

import androidx.compose.runtime.Composable
import com.trendyol.design.bottomsheet.BottomSheetListContent
import com.trendyol.design.bottomsheet.TrendyolDesignBottomSheetFragment
import com.trendyol.design.bottomsheet.item.BottomSheetCheckboxItem
import com.trendyol.design.ui.theme.TrendyolTheme
import kotlinx.collections.immutable.persistentListOf

class ListExampleBottomSheetFragment : TrendyolDesignBottomSheetFragment() {

    @Composable
    override fun PageContent() {
        TrendyolTheme {
            BottomSheetListContent(
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
                    BottomSheetCheckboxItem(
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
