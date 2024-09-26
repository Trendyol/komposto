package com.trendyol.design.core.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle

public interface GenericDialogType {

    @get:Composable
    public val textStyle: TextStyle?

    public val iconVector: ImageVector?
}
