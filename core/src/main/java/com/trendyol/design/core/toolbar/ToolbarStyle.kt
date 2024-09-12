package com.trendyol.design.core.toolbar

import androidx.compose.runtime.Composable

public interface ToolbarStyle

public interface ToolbarStyleIcon : ToolbarStyle {
    public val icon: @Composable ToolbarScope.() -> Unit
}

public interface ToolbarStyleTextButton : ToolbarStyle {
    public val textButton: @Composable ToolbarScope.() -> Unit
}

public interface ToolbarStyleEndIcon : ToolbarStyle {
    public val endIcon: @Composable ToolbarScope.() -> Unit
}

public interface ToolbarStyleEndTwoIcons : ToolbarStyle {
    public val firstIcon: @Composable ToolbarScope.() -> Unit
    public val secondIcon: @Composable ToolbarScope.() -> Unit
}
