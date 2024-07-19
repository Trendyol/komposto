package com.trendyol.design.bottomsheet

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

interface BottomSheetContent {

    fun outerPadding(): PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 12.dp)

    fun title(): String

    @Composable
    fun Header()

    @Composable
    fun PageContent()
}
