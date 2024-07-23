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
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import com.trendyol.design.bottomsheet.header.BottomSheetHeader
import com.trendyol.design.bottomsheet.item.BottomSheetStaticItem
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Bullet
import com.trendyol.design.previewtheme.PreviewTheme
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.toPersistentList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * A composable function that creates a bottom sheet content layout with a vertical list of items and a customizable header.
 *
 * @param Item The type of items in the list.
 * @param title The title to be displayed in the header.
 * @param onCloseIconClick A lambda function to be invoked when the close icon in the header is clicked.
 * @param itemList A `PersistentList` of items to be displayed in the list.
 * @param itemContent A composable lambda to define the content for each item in the list.
 * @param modifier A `Modifier` for styling and layout customization. Default is `Modifier`.
 * @param header A composable lambda for customizing the header content. Default is a `BottomSheetHeader` with the provided title and close icon click action.
 */
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

/**
 * A composable function that creates a lazy column with a list of items and optional divider content.
 *
 * @param Item The type of items in the list.
 * @param itemList A `PersistentList` of items to be displayed in the list.
 * @param itemContent A composable lambda to define the content for each item in the list.
 * @param modifier A `Modifier` for styling and layout customization. Default is `Modifier`.
 * @param outerPadding A `PaddingValues` object to set the padding around the list content.
 * Top and Bottom paddings will work as item padding in order to make items disappear when user scrolls to enhance UX. Default is `PaddingValues(horizontal = 16.dp, vertical = 12.dp)`.
 * @param dividerContent A composable lambda to define the content for the divider between items. Default is a `Spacer` with a height of 12.dp.
 */
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

@Preview(showSystemUi = true)
@Composable
private fun Preview() = PreviewTheme {
    BottomSheetListContent(
        title = "Some Title",
        onCloseIconClick = { },
        itemList = MutableStateFlow(LoremIpsum().values.first().split(" ").subList(0, 30))
            .asStateFlow()
            .collectAsState()
            .value
            .toPersistentList(),
        itemContent = { _, item ->
            BottomSheetStaticItem(
                text = item,
                onClick = { },
                icon = Icons.Fill.Bullet,
                iconPosition = Alignment.CenterVertically,
                description = "Description",
            )
        },
    )
}
