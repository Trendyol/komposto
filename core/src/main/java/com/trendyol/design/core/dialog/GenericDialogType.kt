package com.trendyol.design.core.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle

interface GenericDialogType {

    @get:Composable
    val textStyle: TextStyle?

    val iconVector: ImageVector?
}