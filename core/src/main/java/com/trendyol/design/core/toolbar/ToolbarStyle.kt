package com.trendyol.design.core.toolbar

import androidx.compose.runtime.Composable

interface TrendyolToolbarStyle {

    object None : TrendyolToolbarStyle

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
        ) : ToolbarStyleIcon, TrendyolToolbarStyle

        data class TextButton(
            override val icon: @Composable ToolbarScope.() -> Unit,
            override val textButton: @Composable ToolbarScope.() -> Unit
        ) : ToolbarStyleIcon, ToolbarStyleTextButton, TrendyolToolbarStyle

        data class EndIcon(
            override val icon: @Composable ToolbarScope.() -> Unit,
            override val endIcon: @Composable ToolbarScope.() -> Unit,
        ) : ToolbarStyleIcon, ToolbarStyleEndIcon, TrendyolToolbarStyle

        data class EndTwoIcons(
            override val icon: @Composable ToolbarScope.() -> Unit,
            override val firstIcon: @Composable ToolbarScope.() -> Unit,
            override val secondIcon: @Composable ToolbarScope.() -> Unit,
        ) : ToolbarStyleIcon, ToolbarStyleEndTwoIcons, TrendyolToolbarStyle
    }
    //endregion
}

interface ToolbarStyleIcon {
    val icon: @Composable ToolbarScope.() -> Unit
}

interface ToolbarStyleTextButton {
    val textButton: @Composable ToolbarScope. () -> Unit
}

interface ToolbarStyleEndIcon {
    val endIcon: @Composable ToolbarScope.() -> Unit
}

interface ToolbarStyleEndTwoIcons {
    val firstIcon: @Composable ToolbarScope.() -> Unit
    val secondIcon: @Composable ToolbarScope.() -> Unit
}
