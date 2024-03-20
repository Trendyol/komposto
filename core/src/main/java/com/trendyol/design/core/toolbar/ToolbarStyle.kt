package com.trendyol.design.core.toolbar

import androidx.compose.runtime.Composable

interface ToolbarStyle

interface ToolbarStyleIcon : ToolbarStyle {
    val icon: @Composable ToolbarScope.() -> Unit
}

interface ToolbarStyleTextButton : ToolbarStyle {
    val textButton: @Composable ToolbarScope.() -> Unit
}

interface ToolbarStyleEndIcon : ToolbarStyle {
    val endIcon: @Composable ToolbarScope.() -> Unit
}

interface ToolbarStyleEndTwoIcons : ToolbarStyle {
    val firstIcon: @Composable ToolbarScope.() -> Unit
    val secondIcon: @Composable ToolbarScope.() -> Unit
}