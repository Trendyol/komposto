package com.trendyol.design.core.toolbar

import androidx.compose.runtime.Composable

public sealed interface KPToolbarStyle : ToolbarStyle {

    public data object None : KPToolbarStyle

    public data class TextButton(
        override val textButton: @Composable ToolbarScope.() -> Unit
    ) : KPToolbarStyle, ToolbarStyleTextButton

    public data class EndIcon(
        override val endIcon: @Composable ToolbarScope.() -> Unit,
    ) : KPToolbarStyle, ToolbarStyleEndIcon

    public data class EndTwoIcons(
        override val firstIcon: @Composable ToolbarScope.() -> Unit,
        override val secondIcon: @Composable ToolbarScope.() -> Unit
    ) : KPToolbarStyle, ToolbarStyleEndTwoIcons

    // region Icon Style
    public sealed interface Icon {
        public data class None(
            override val icon: @Composable ToolbarScope.() -> Unit,
        ) : ToolbarStyleIcon

        public data class TextButton(
            override val icon: @Composable ToolbarScope.() -> Unit,
            override val textButton: @Composable ToolbarScope.() -> Unit
        ) : ToolbarStyleIcon, ToolbarStyleTextButton

        public data class EndIcon(
            override val icon: @Composable ToolbarScope.() -> Unit,
            override val endIcon: @Composable ToolbarScope.() -> Unit,
        ) : ToolbarStyleIcon, ToolbarStyleEndIcon

        public data class EndTwoIcons(
            override val icon: @Composable ToolbarScope.() -> Unit,
            override val firstIcon: @Composable ToolbarScope.() -> Unit,
            override val secondIcon: @Composable ToolbarScope.() -> Unit,
        ) : ToolbarStyleIcon, ToolbarStyleEndTwoIcons
    }
    //endregion
}
