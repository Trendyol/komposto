package com.trendyol.design.core.icon

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.Icon as MaterialIcon

/**
 *  An Icon component that draws [imageVector] using [tint], with a default value
 *  is [Color.Unspecified]. [imageVector] has no default size, the size should given by
 *  developer.
 *
 * @param imageVector [ImageVector] to draw inside this Icon
 * @param size size to be instance of [IconSize]. You can reach the predefined sizes from [KPIconSize].
 * If you need another size except from [KPIconSize], you can modify with [Modifier.size].
 * @param modifier Modifier to be applied to the icon
 * @param contentDescription text used by accessibility services to describe what this icon
 * represents. The default value is set to [ImageVector.name]. If you want to change this value
 * you can change the [ImageVector.name] in icon files.
 * @param tint tint to be applied to [imageVector]. [Color.Unspecified] is applied as default value.
 *
 * */
@Composable
public fun KPIcon(
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

/**
 *  An Icon component that draws [imageVector] using [tint], with a default value
 *  is [Color.Unspecified]. [imageVector] has no default size, the size should given by
 *  developer.
 *
 * @param imageVector [ImageVector] to draw inside this Icon
 * @param size size to be instance of [IconSize]. You can reach the predefined sizes from [TrendyolIconSize].
 * If you need another size except from [TrendyolIconSize], you can modify with [Modifier.size].
 * @param modifier Modifier to be applied to the icon
 * @param contentDescription text used by accessibility services to describe what this icon
 * represents. The default value is set to [ImageVector.name]. If you want to change this value
 * you can change the [ImageVector.name] in icon files.
 * @param tint tint to be applied to [imageVector]. [Color.Unspecified] is applied as default value.
 *
 * */
@Composable
@Deprecated(
    message = "Use KPIcon instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun Icon(
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
