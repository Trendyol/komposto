package com.trendyol.design.bottomsheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage

interface BottomSheetImageContent : BottomSheetContent {

    @Composable
    fun imageUrl(): String

    @Composable
    override fun PageContent() {
        Column {
            Header()
            AsyncImage(
                model = imageUrl(),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues = outerPadding()),
            )
        }
    }
}
