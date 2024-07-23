package com.trendyol.design.bottomsheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.trendyol.design.bottomsheet.header.BottomSheetHeader

@Composable
fun BottomSheetImageContent(
    title: String,
    onCloseIconClick: () -> Unit,
    model: Any?,
    modifier: Modifier = Modifier,
    header: @Composable () -> Unit = {
        BottomSheetHeader(title = title, onCloseIconClick = onCloseIconClick)
    },
    outerPadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
) {
    Column(
        modifier = modifier,
    ) {
        header()
        AsyncImage(
            model = model,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = outerPadding),
        )
    }
}
