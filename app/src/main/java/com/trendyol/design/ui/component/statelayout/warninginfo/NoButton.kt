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
    name = Component.NO_BUTTON,
    styleName = "NoButton_FullVersion_Small"
)
@Composable
internal fun NoButton_FullVersion_Small() {
    TrendyolTheme {
        WarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonFullVersion(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                title = "İçerik Bulunamadı",
                description = "Yeni içerikler keşfedebilirsin.",
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.NO_BUTTON,
    styleName = "NoButton_FullVersion_Medium"
)
@Composable
internal fun NoButton_FullVersion_Medium() {
    TrendyolTheme {
        WarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonFullVersion(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                title = "İçerik Bulunamadı",
                description = "Yeni içerikler keşfedebilirsin.",
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.NO_BUTTON,
    styleName = "NoButton_NoTitle_Small"
)
@Composable
internal fun NoButton_NoTitle_Small() {
    TrendyolTheme {
        WarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonNoTitle(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                description = "Yeni içerikler keşfedebilirsin.",
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.NO_BUTTON,
    styleName = "NoButton_NoTitle_Medium"
)
@Composable
internal fun NoButton_NoTitle_Medium() {
    TrendyolTheme {
        WarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonNoTitle(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                description = "Yeni içerikler keşfedebilirsin.",
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.NO_BUTTON,
    styleName = "NoButton_NoDescription_Small"
)
@Composable
internal fun NoButton_NoDescription_Small() {
    TrendyolTheme {
        WarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonNoDescription(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                title = "İçerik Bulunamadı",
            )
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.NO_BUTTON,
    styleName = "NoButton_NoDescription_Medium"
)
@Composable
internal fun NoButton_NoDescription_Medium() {
    TrendyolTheme {
        WarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.NoButtonNoDescription(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                title = "İçerik Bulunamadı",
            )
        )
    }
}
