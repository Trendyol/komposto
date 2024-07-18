package com.trendyol.design.bottomsheet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.Chevron
import com.trendyol.design.core.icon.icons.outline.Cancel
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

interface BottomSheetContent {

    fun outerPadding(): PaddingValues = PaddingValues(all = 16.dp)

    @Composable
    fun Header() {
        Row(
            modifier = Modifier
                .background(
                    color = TrendyolDesign.colors.colorBackground,
                    shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
                )
                .padding(vertical = 12.dp, horizontal = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            val isBackIconVisible = true
            if (isBackIconVisible) {
                Icon(imageVector = Icons.Outline.Chevron, size = TrendyolIconSize.XSmall)
            }
            val titleStartPadding = if (isBackIconVisible) {
                12.dp
            } else 0.dp
            Text(
                text = "Title",
                style = TrendyolDesign.typography.titleBoldColorOnSurfaceVariant3,
                maxLines = 2,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = titleStartPadding, end = 16.dp),
            )
            val isCloseIconVisible = true
            if (isCloseIconVisible) {
                Icon(imageVector = Icons.Outline.Cancel, size = TrendyolIconSize.XXSmall)
            }
        }
    }

    @Composable
    fun PageContent()
}
