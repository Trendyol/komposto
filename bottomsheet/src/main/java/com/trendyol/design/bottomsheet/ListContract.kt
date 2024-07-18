package com.trendyol.design.bottomsheet

import androidx.compose.runtime.Composable

interface ListContract<Item> {

    @Composable
    fun itemList(): List<Item>

    @Composable
    fun ItemContent(item: Item)

    @Composable
    fun DividerContent()
}
