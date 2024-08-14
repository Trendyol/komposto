package com.trendyol.design.core.badge.boxbadge.attributes

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.IconSize
import com.trendyol.theme.TrendyolDesign

data object TrendyolBoxBadgeAttributes : BoxBadgeAttributes {

    override val boxWidth: Dp = 34.dp

    override val boxHeight: Dp = 40.dp

    override val borderRadius: Dp = 4.dp

    override val verticalPadding: Dp = 4.dp

    override val horizontalPadding: Dp = 0.dp

    override val iconSize: IconSize = BoxBadgeIconSize

    override val line: Int = 2

    override val fontColor: Color = Color(color = 0xFF333333)

    override val textStyle: TextStyle
        @Composable
        get() = TrendyolDesign.typography.overLineMedium.copy(fontWeight = FontWeight.Medium)
}
