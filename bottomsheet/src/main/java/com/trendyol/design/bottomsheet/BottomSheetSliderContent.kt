package com.trendyol.design.bottomsheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

interface BottomSheetSliderContent<Item> : BottomSheetContent, ListContract<Item> {

    @Composable
    override fun DividerContent() {
        Spacer(modifier = Modifier.width(12.dp))
    }

    @Composable
    override fun PageContent() {
        Column {
            Header()
            val itemList = itemList()
            LazyRow(
                modifier = Modifier.padding(paddingValues = outerPadding()),
            ) {
                itemsIndexed(items = itemList) { index, item ->
                    ItemContent(item)
                    if (index != itemList.lastIndex) {
                        DividerContent()
                    }
                }
            }
        }
    }
}
