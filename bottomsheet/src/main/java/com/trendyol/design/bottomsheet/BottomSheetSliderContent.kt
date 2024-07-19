package com.trendyol.design.bottomsheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
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
            val outerPadding = outerPadding()
            LazyRow(
                modifier = Modifier.padding(
                    paddingValues = PaddingValues(
                        top = outerPadding.calculateTopPadding(),
                        bottom = outerPadding.calculateBottomPadding(),
                    )
                ),
            ) {
                item {
                    Spacer(modifier = Modifier.width(outerPadding.calculateStartPadding(LocalLayoutDirection.current)))
                }
                itemsIndexed(items = itemList) { index, item ->
                    ItemContent(item)
                    if (index != itemList.lastIndex) {
                        DividerContent()
                    }
                }
                item {
                    Spacer(modifier = Modifier.width(outerPadding.calculateEndPadding(LocalLayoutDirection.current)))
                }
            }
        }
    }
}
