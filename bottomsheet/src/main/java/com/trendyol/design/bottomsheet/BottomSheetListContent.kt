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
import com.trendyol.design.bottomsheet.header.BottomSheetHeader
import kotlinx.collections.immutable.PersistentList

@Composable
fun <Item> BottomSheetListContent(
    title: String,
    onCloseIconClick: () -> Unit,
    itemList: PersistentList<Item>,
    itemContent: @Composable (index: Int, item: Item) -> Unit,
    modifier: Modifier = Modifier,
    header: @Composable () -> Unit = {
        BottomSheetHeader(title = title, onCloseIconClick = onCloseIconClick)
    },
) {
    Column(
        modifier = modifier.nestedScroll(rememberNestedScrollInteropConnection()),
    ) {
        header()
        ListContent(
            itemList = itemList,
            itemContent = itemContent,
        )
    }
}

@Composable
fun <Item> ListContent(
    itemList: PersistentList<Item>,
    itemContent: @Composable (index: Int, item: Item) -> Unit,
    modifier: Modifier = Modifier,
    outerPadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
    dividerContent: @Composable (index: Int, item: Item) -> Unit = { _, _ ->
        Spacer(modifier = Modifier.height(12.dp))
    },
) {
    LazyColumn(
        modifier = modifier.padding(
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
            itemContent(index, item)
            if (index != itemList.lastIndex) {
                dividerContent(index, item)
            }
        }
        item {
            Spacer(modifier = Modifier.height(outerPadding.calculateBottomPadding()))
        }
    }
}
