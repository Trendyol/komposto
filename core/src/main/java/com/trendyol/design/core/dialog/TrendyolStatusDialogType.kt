package com.trendyol.design.core.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.outline.ErrorState
import com.trendyol.design.core.icon.icons.outline.SuccessState
import com.trendyol.theme.TrendyolDesign

interface TrendyolStatusDialogType {

    data object Success : StatusDialogType {

        override val textStyle: TextStyle
            @Composable get() = TrendyolDesign.typography.titleMediumColorGreen

        override val iconVector: ImageVector
            get() = Icons.Outline.SuccessState
    }

    data object Error : StatusDialogType {

        override val textStyle: TextStyle
            @Composable get() = TrendyolDesign.typography.titleMediumColorOnSurfaceVariant3

        override val iconVector: ImageVector
            get() = Icons.Outline.ErrorState
    }
}