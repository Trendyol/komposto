package com.trendyol.design.bottomsheet.item

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.outline.Union
import com.trendyol.design.core.text.Text
import com.trendyol.design.previewtheme.PreviewTheme
import com.trendyol.theme.TrendyolDesign

@Composable
fun BottomSheetStaticItem(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    iconPosition: Alignment.Vertical = Alignment.CenterVertically,
    textStyle: TextStyle = TrendyolDesign.typography.subtitleMediumColorOnSurfaceVariant3,
    description: String = "",
    descriptionTextStyle: TextStyle = TrendyolDesign.typography.body1ColorOnSurfaceVariant1,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        verticalAlignment = iconPosition,
    ) {
        if (icon != null) {
            Icon(imageVector = icon, size = TrendyolIconSize.XSmall)
            Spacer(modifier = Modifier.width(8.dp))
        }
        Column {
            Text(text = text, style = textStyle, maxLines = 1)
            if (description.isNotEmpty()) {
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = description,
                    style = descriptionTextStyle,
                    maxLines = 1
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() = PreviewTheme {
    BottomSheetStaticItem(
        text = "Title",
        onClick = {},
        icon = Icons.Outline.Union,
        description = "Description",
    )
}
