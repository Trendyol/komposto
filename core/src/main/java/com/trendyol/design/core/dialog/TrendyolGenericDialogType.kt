package com.trendyol.design.core.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.outline.ErrorState
import com.trendyol.design.core.icon.icons.outline.SuccessState
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign

public interface KPGenericDialogType {

    public data object Success : GenericDialogType {

        override val textStyle: TextStyle
            @Composable get() = KPDesign.typography.titleMediumColorGreen

        override val iconVector: ImageVector
            get() = KPIcons.Outline.SuccessState
    }

    public data object Error : GenericDialogType {

        override val textStyle: TextStyle
            @Composable get() = KPDesign.typography.titleMediumColorOnSurfaceVariant3

        override val iconVector: ImageVector
            get() = KPIcons.Outline.ErrorState
    }

    public data object Custom : GenericDialogType {

        override val textStyle: TextStyle?
            @Composable get() = KPDesign.typography.titleMediumColorOnSurfaceVariant3

        override val iconVector: ImageVector?
            get() = null
    }
}

@Deprecated(
    message = "Use KPGenericDialogType instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPGenericDialogType"
    ),
    level = DeprecationLevel.WARNING
)
public interface TrendyolGenericDialogType {

    public data object Success : GenericDialogType {

        override val textStyle: TextStyle
            @Composable get() = TrendyolDesign.typography.titleMediumColorGreen

        override val iconVector: ImageVector
            get() = Icons.Outline.SuccessState
    }

    public data object Error : GenericDialogType {

        override val textStyle: TextStyle
            @Composable get() = TrendyolDesign.typography.titleMediumColorOnSurfaceVariant3

        override val iconVector: ImageVector
            get() = Icons.Outline.ErrorState
    }

    public data object Custom : GenericDialogType {

        override val textStyle: TextStyle?
            @Composable get() = TrendyolDesign.typography.titleMediumColorOnSurfaceVariant3

        override val iconVector: ImageVector?
            get() = null
    }
}
