package com.trendyol.design.bottomsheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.compose.ui.unit.dp

interface BottomSheetListContent<Item> : BottomSheetContent, ListContract<Item> {

    @Composable
    override fun DividerContent() {
        Spacer(modifier = Modifier.height(12.dp))
    }

    @Composable
    override fun PageContent() {
        Column(
            modifier = Modifier.nestedScroll(rememberNestedScrollInteropConnection()),
        ) {
            Header()
            val itemList = itemList()
            val outerPadding = outerPadding()
            LazyColumn(
                modifier = Modifier.padding(
                    paddingValues = PaddingValues(
                        start = outerPadding.calculateStartPadding(LocalLayoutDirection.current),
                        end = outerPadding.calculateEndPadding(LocalLayoutDirection.current),
                    )
                ),
            ) {
                item {
                    Spacer(modifier = Modifier.height(outerPadding.calculateTopPadding()))
                }
                itemsIndexed(items = itemList) { index, item ->
                    ItemContent(item)
                    if (index != itemList.lastIndex) {
                        DividerContent()
                    }
                }
                item {
                    Spacer(modifier = Modifier.height(outerPadding.calculateBottomPadding()))
                }
            }
        }
    }
}