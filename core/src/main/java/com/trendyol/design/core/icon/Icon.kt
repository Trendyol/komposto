package com.trendyol.design.core.icon

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun Icon(
    modifier: Modifier = Modifier,
    imageVector: ImageVector,
    size: IconSize,
    contentDescription: String? = imageVector.name,
    tint: Color = LocalContentColor.current
) {
    androidx.compose.material.Icon(
        imageVector = imageVector,
        contentDescription = contentDescription,
        modifier = modifier.size(size.dp),
        tint = tint
    )
}

val LocalContentColor = compositionLocalOf { Color.Unspecified }