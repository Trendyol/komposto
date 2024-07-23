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
import com.trendyol.design.bottomsheet.header.BottomSheetHeader
import kotlinx.collections.immutable.PersistentList

@Composable
fun <Item> BottomSheetSliderContent(
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
        modifier = modifier,
    ) {
        header()
        SliderContent(
            itemList = itemList,
            itemContent = itemContent,
        )
    }
}

@Composable
fun <Item> SliderContent(
    itemList: PersistentList<Item>,
    itemContent: @Composable (index: Int, item: Item) -> Unit,
    modifier: Modifier = Modifier,
    outerPadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
    dividerContent: @Composable (index: Int, item: Item) -> Unit = { _, _ ->
        Spacer(modifier = Modifier.width(12.dp))
    },
) {
    LazyRow(
        modifier = modifier.padding(
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
            itemContent(index, item)
            if (index != itemList.lastIndex) {
                dividerContent(index, item)
            }
        }
        item {
            Spacer(modifier = Modifier.width(outerPadding.calculateEndPadding(LocalLayoutDirection.current)))
        }
    }
}
