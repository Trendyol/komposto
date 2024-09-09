package com.trendyol.design.core.infobox

import androidx.compose.ui.graphics.Color

interface InfoBoxStyle {
    val infoBoxModel: InfoBoxModel
}

sealed interface TrendyolInfoBoxStyle {

    data class DefaultInfoBox(
        val textModel: ContentTextModel,
        val icon: IconModel,
        val iconPosition: IconPosition = IconPosition.START,
        val backgroundColor: Color = Color.Unspecified,
    ) : InfoBoxStyle {
        override val infoBoxModel: InfoBoxModel
            get() = InfoBoxModel(
                textModel = textModel,
                icon = icon,
                backgroundColor = backgroundColor,
                iconPosition = iconPosition
            )
    }

    data class DefaultInfoBoxWithBorder(
        val textModel: ContentTextModel,
        val icon: IconModel,
        val iconPosition: IconPosition = IconPosition.START,
        val backgroundColor: Color = Color.Unspecified,
        val borderColor: Color = Color.Unspecified
    ) : InfoBoxStyle {
        override val infoBoxModel: InfoBoxModel
            get() = InfoBoxModel(
                textModel = textModel,
                icon = icon,
                backgroundColor = backgroundColor,
                iconPosition = iconPosition,
                borderColor = borderColor
            )
    }
}