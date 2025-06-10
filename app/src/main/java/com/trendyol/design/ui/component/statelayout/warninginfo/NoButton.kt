@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.ui.component.statelayout.warninginfo

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.R
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.statelayout.KPWarningInfoStateLayoutStyle
import com.trendyol.design.core.statelayout.states.warningInfo.KPWarningInfoStateComposable
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
        KPWarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonFullVersion(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                title = stringResource(id = R.string.state_layout_title),
                description = stringResource(id = R.string.state_layout_description),
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
        KPWarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonFullVersion(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                title = stringResource(id = R.string.state_layout_title),
                description = stringResource(id = R.string.state_layout_description),
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
        KPWarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonNoTitle(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                description = stringResource(id = R.string.state_layout_description),
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
        KPWarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonNoTitle(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                description = stringResource(id = R.string.state_layout_description),
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
        KPWarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonNoDescription(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                title = stringResource(id = R.string.state_layout_title),
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
        KPWarningInfoStateComposable(
            modifier = Modifier.size(400.dp),
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonNoDescription(
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                title = stringResource(id = R.string.state_layout_title),
            )
        )
    }
}
