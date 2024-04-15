package com.trendyol.design.core.toolbar

import androidx.compose.runtime.Composable

sealed interface TrendyolToolbarStyle : ToolbarStyle {

    data object None : TrendyolToolbarStyle

    data class TextButton(
        override val textButton: @Composable ToolbarScope.() -> Unit
    ) : TrendyolToolbarStyle, ToolbarStyleTextButton

    data class EndIcon(
        override val endIcon: @Composable ToolbarScope.() -> Unit,
    ) : TrendyolToolbarStyle, ToolbarStyleEndIcon

    data class EndTwoIcons(
        override val firstIcon: @Composable ToolbarScope.() -> Unit,
        override val secondIcon: @Composable ToolbarScope.() -> Unit
    ) : TrendyolToolbarStyle, ToolbarStyleEndTwoIcons

    // region Icon Style
    sealed interface Icon {
        data class None(
            override val icon: @Composable ToolbarScope.() -> Unit,
        ) : ToolbarStyleIcon

        data class TextButton(
            override val icon: @Composable ToolbarScope.() -> Unit,
            override val textButton: @Composable ToolbarScope.() -> Unit
        ) : ToolbarStyleIcon, ToolbarStyleTextButton

        data class EndIcon(
            override val icon: @Composable ToolbarScope.() -> Unit,
            override val endIcon: @Composable ToolbarScope.() -> Unit,
        ) : ToolbarStyleIcon, ToolbarStyleEndIcon

        data class EndTwoIcons(
            override val icon: @Composable ToolbarScope.() -> Unit,
            override val firstIcon: @Composable ToolbarScope.() -> Unit,
            override val secondIcon: @Composable ToolbarScope.() -> Unit,
        ) : ToolbarStyleIcon, ToolbarStyleEndTwoIcons
    }
    //endregion
}
