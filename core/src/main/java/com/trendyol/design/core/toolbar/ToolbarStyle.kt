package com.trendyol.design.core.toolbar

import androidx.compose.runtime.Composable

interface ToolbarStyle {

    object None : ToolbarStyle

    data class TextButton(
        override val textButton: @Composable () -> Unit
    ) : ToolbarStyle, ITextButton

    data class EndIcon(
        override val endIcon: @Composable ToolbarScope.() -> Unit,
    ) : ToolbarStyle, IEndIcon

    data class EndTwoIcons(
        override val firstIcon: @Composable() ToolbarScope.() -> Unit,
        override val secondIcon: @Composable() ToolbarScope.() -> Unit
    ) : ToolbarStyle, IEndTwoIcons

    // region Icon Style
    sealed interface Icon : ToolbarStyle {
        val icon: @Composable ToolbarScope.() -> Unit

        data class None(
            override val icon: @Composable ToolbarScope.() -> Unit,
        ) : Icon

        data class TextButton(
            override val icon: @Composable ToolbarScope.() -> Unit,
            override val textButton: @Composable () -> Unit
        ) : Icon, ITextButton

        data class EndIcon(
            override val icon: @Composable ToolbarScope.() -> Unit,
            override val endIcon: @Composable ToolbarScope.() -> Unit,
        ) : Icon, IEndIcon

        data class EndTwoIcons(
            override val icon: @Composable ToolbarScope.() -> Unit,
            override val firstIcon: @Composable ToolbarScope.() -> Unit,
            override val secondIcon: @Composable ToolbarScope.() -> Unit,
        ) : Icon, IEndTwoIcons
    }
    //endregion
}

interface ITextButton {
    val textButton: @Composable () -> Unit
}

interface IEndIcon {
    val endIcon: @Composable ToolbarScope.() -> Unit
}

interface IEndTwoIcons {
    val firstIcon: @Composable ToolbarScope.() -> Unit
    val secondIcon: @Composable ToolbarScope.() -> Unit
}
