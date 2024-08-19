package com.trendyol.design.ui.component.statelayout.warninginfo

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.statelayout.TrendyolWarningInfoStateLayoutStyle
import com.trendyol.design.core.statelayout.states.warningInfo.WarningInfoStateComposable
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.SINGLE_BUTTON,
    styleName = "SingleButton_FullVersion_Small"
)
@Composable
internal fun SingleButton_FullVersion_Small() {
    TrendyolTheme {
        WarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonFullVersion(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                title = "İçerik Bulunamadı",
                description = "Yeni içerikler keşfedebilirsin.",
                primaryButtonText = "Alışverişe Devam Et",
                primaryButtonClickListener = {},
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.SINGLE_BUTTON,
    styleName = "SingleButton_FullVersion_Medium"
)
@Composable
internal fun SingleButton_FullVersion_Medium() {
    TrendyolTheme {
        WarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonFullVersion(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                title = "İçerik Bulunamadı",
                description = "Yeni içerikler keşfedebilirsin.",
                primaryButtonText = "Alışverişe Devam Et",
                primaryButtonClickListener = {},
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.SINGLE_BUTTON,
    styleName = "SingleButton_NoTitle_Small"
)
@Composable
internal fun SingleButton_NoTitle_Small() {
    TrendyolTheme {
        WarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonNoTitle(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                description = "Yeni içerikler keşfedebilirsin.",
                primaryButtonText = "Alışverişe Devam Et",
                primaryButtonClickListener = {},
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.SINGLE_BUTTON,
    styleName = "SingleButton_NoTitle_Medium"
)
@Composable
internal fun SingleButton_NoTitle_Medium() {
    TrendyolTheme {
        WarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonNoTitle(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                description = "Yeni içerikler keşfedebilirsin.",
                primaryButtonText = "Alışverişe Devam Et",
                primaryButtonClickListener = {},
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.SINGLE_BUTTON,
    styleName = "SingleButton_NoDescription_Small"
)
@Composable
internal fun SingleButton_NoDescription_Small() {
    TrendyolTheme {
        WarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonNoDescription(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                title = "İçerik Bulunamadı",
                primaryButtonText = "Alışverişe Devam Et",
                primaryButtonClickListener = {},
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.SINGLE_BUTTON,
    styleName = "SingleButton_NoDescription_Medium"
)
@Composable
internal fun SingleButton_NoDescription_Medium() {
    TrendyolTheme {
        WarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonNoDescription(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                title = "İçerik Bulunamadı",
                primaryButtonText = "Alışverişe Devam Et",
                primaryButtonClickListener = {},
            )
        )
    }
}
