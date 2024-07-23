package com.trendyol.design.bottomsheet.header

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.Chevron
import com.trendyol.design.core.icon.icons.outline.Cancel
import com.trendyol.design.core.text.Text
import com.trendyol.design.previewtheme.PreviewTheme
import com.trendyol.theme.TrendyolDesign

@Composable
fun BottomSheetHeader(
    title: String,
    onCloseIconClick: () -> Unit,
    modifier: Modifier = Modifier,
    onBackIconClick: () -> Unit = {},
    isCloseIconVisible: Boolean = true,
    isBackIconVisible: Boolean = false,
    verticalPadding: PaddingValues = PaddingValues(vertical = 12.dp),
) {
    val topPadding = verticalPadding.calculateTopPadding()
    val bottomPadding = verticalPadding.calculateBottomPadding()
    Row(
        modifier = modifier
            .background(
                color = TrendyolDesign.colors.colorBackground,
                shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
            )
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (isBackIconVisible) {
            Icon(
                imageVector = Icons.Outline.Chevron,
                size = TrendyolIconSize.XSmall,
                modifier = Modifier
                    .clickable(onClick = onBackIconClick)
                    .padding(start = 16.dp, end = 12.dp, top = topPadding, bottom = bottomPadding),
            )
        }
        val titleStartPadding = if (isBackIconVisible) {
            0.dp
        } else 16.dp
        Text(
            text = title,
            style = TrendyolDesign.typography.titleBoldColorOnSurfaceVariant3,
            maxLines = 2,
            modifier = Modifier
                .weight(1f)
                .padding(start = titleStartPadding, top = topPadding, bottom = bottomPadding),
        )
        if (isCloseIconVisible) {
            Icon(
                imageVector = Icons.Outline.Cancel,
                size = TrendyolIconSize.XXSmall,
                modifier = Modifier
                    .clickable(onClick = onCloseIconClick)
                    .padding(start = 16.dp, end = 16.dp, top = topPadding, bottom = bottomPadding),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() = PreviewTheme {
    BottomSheetHeader(
        title = "Title",
        onCloseIconClick = {},
        isBackIconVisible = true
    )
}
