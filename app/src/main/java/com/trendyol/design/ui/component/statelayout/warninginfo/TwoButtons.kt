package com.trendyol.design.ui.component.statelayout.warninginfo

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.statelayout.KPWarningInfoStateLayoutStyle
import com.trendyol.design.core.statelayout.states.warningInfo.KPWarningInfoStateComposable
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.TWO_BUTTON,
    styleName = "TwoButtons_FullVersion_Small"
)
@Composable
internal fun TwoButtons_FullVersion_Small() {
    TrendyolTheme {
        KPWarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsFullVersion(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                title = "İçerik Bulunamadı",
                description = "Yeni içerikler keşfedebilirsin.",
                primaryButtonText = "Alışverişe Devam Et",
                secondaryButtonText = "Alışverişe Devam Et",
                primaryButtonClickListener = {},
                secondaryButtonClickListener = {}
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.TWO_BUTTON,
    styleName = "TwoButtons_FullVersion_Medium"
)
@Composable
internal fun TwoButtons_FullVersion_Medium() {
    TrendyolTheme {
        KPWarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsFullVersion(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                title = "İçerik Bulunamadı",
                description = "Yeni içerikler keşfedebilirsin.",
                primaryButtonText = "Alışverişe Devam Et",
                secondaryButtonText = "Alışverişe Devam Et",
                primaryButtonClickListener = {},
                secondaryButtonClickListener = {}
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.TWO_BUTTON,
    styleName = "TwoButtons_NoTitle_Small"
)
@Composable
internal fun TwoButtons_NoTitle_Small() {
    TrendyolTheme {
        KPWarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsNoTitle(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                description = "Yeni içerikler keşfedebilirsin.",
                primaryButtonText = "Alışverişe Devam Et",
                secondaryButtonText = "Alışverişe Devam Et",
                primaryButtonClickListener = {},
                secondaryButtonClickListener = {}
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.TWO_BUTTON,
    styleName = "TwoButtons_NoTitle_Medium"
)
@Composable
internal fun TwoButtons_NoTitle_Medium() {
    TrendyolTheme {
        KPWarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsNoTitle(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                description = "Yeni içerikler keşfedebilirsin.",
                primaryButtonText = "Alışverişe Devam Et",
                secondaryButtonText = "Alışverişe Devam Et",
                primaryButtonClickListener = {},
                secondaryButtonClickListener = {}
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.TWO_BUTTON,
    styleName = "TwoButtons_NoDescription_Small"
)
@Composable
internal fun TwoButtons_NoDescription_Small() {
    TrendyolTheme {
        KPWarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsNoDescription(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                title = "İçerik Bulunamadı",
                primaryButtonText = "Alışverişe Devam Et",
                secondaryButtonText = "Alışverişe Devam Et",
                primaryButtonClickListener = {},
                secondaryButtonClickListener = {}
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.TWO_BUTTON,
    styleName = "TwoButtons_NoDescription_Medium"
)
@Composable
internal fun TwoButtons_NoDescription_Medium() {
    TrendyolTheme {
        KPWarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsNoDescription(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                title = "İçerik Bulunamadı",
                primaryButtonText = "Alışverişe Devam Et",
                secondaryButtonText = "Alışverişe Devam Et",
                primaryButtonClickListener = {},
                secondaryButtonClickListener = {}
            )
        )
    }
}
