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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.Tick
import com.trendyol.design.core.icon.icons.outline.Info
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

@Composable
fun BottomSheetSingleSelectItem(
    selected: Boolean,
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isIconVisible: Boolean = true,
    textStyle: TextStyle = TrendyolDesign.typography.titleMediumColorOnSurfaceVariant3,
    helperText: String = "",
    helperTextStyle: TextStyle = TrendyolDesign.typography.body2MediumColorWarning,
    description: String = "",
    descriptionTextStyle: TextStyle = TrendyolDesign.typography.body1ColorOnSurfaceVariant1,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (isIconVisible) {
            Icon(imageVector = Icons.Outline.Info, size = TrendyolIconSize.Small)
            Spacer(modifier = Modifier.width(8.dp))
        }
        Column {
            val textColor = if (selected) {
                TrendyolDesign.colors.colorPrimary
            } else {
                textStyle.color
            }
            Text(text = text, style = textStyle.copy(color = textColor), maxLines = 1)
            if (description.isNotEmpty()) {
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = description,
                    style = descriptionTextStyle,
                    maxLines = 1
                )
            }
        }
        if (helperText.isNotEmpty()) {
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = helperText,
                style = helperTextStyle,
                maxLines = 1,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            )
        }
        if (selected) {
            Icon(imageVector = Icons.Fill.Tick, size = TrendyolIconSize.Small)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() = PreviewTheme {
    BottomSheetSingleSelectItem(
        selected = true,
        text = "Title",
        onClick = { },
        description = "Description",
        helperText = "Helper Text"
    )
}
