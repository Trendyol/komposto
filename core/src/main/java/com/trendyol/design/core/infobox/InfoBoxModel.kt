package com.trendyol.design.core.infobox

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.CircleIcon
import com.trendyol.design.core.icon.icons.fill.InfoIcon

/**
 *
 * @param textModel You can set text, secondText and textTint in this parameter. TextTint is valid for both texts
 * @param icon You can set outerIcon, innerIcon and its colors in this parameter.
 * @param iconPosition You can set icon position in this parameter as start or end or none
 * @param backgroundColor You can set color to background in this parameter.
 * @param borderColor If you want to add border, it is enough to set color to border.
 */
@Stable
data class InfoBoxModel(
    val textModel: ContentTextModel,
    val icon: IconModel,
    val iconPosition: IconPosition = IconPosition.NONE,
    val backgroundColor: Color = Color.Unspecified,
    val borderColor: Color? = Color.Unspecified,
)

data class ContentTextModel(
    val text: String,
    val secondText: String? = null,
    val textTint: Color = Color.Unspecified,
)

data class IconModel(
    val outerIcon: ImageVector = Icons.Fill.CircleIcon,
    val innerIcon: ImageVector = Icons.Fill.InfoIcon,
    val outerTint: Color = Color.Unspecified,
    val innerTint: Color? = Color.White,
)

enum class IconPosition {
    START,
    END,
    NONE,
}



