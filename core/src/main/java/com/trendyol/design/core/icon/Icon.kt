package com.trendyol.design.core.icon

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.Icon as MaterialIcon

@Composable
fun Icon(
    imageVector: ImageVector,
    size: IconSize,
    modifier: Modifier = Modifier,
    contentDescription: String? = imageVector.name,
    tint: Color = Color.Unspecified
) {
    MaterialIcon(
        imageVector = imageVector,
        contentDescription = contentDescription,
        modifier = modifier.size(size.dp),
        tint = tint
    )
}
