@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.ui.component.statelayout.loading

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.statelayout.states.loading.HorizontalProgressState
import com.trendyol.design.core.statelayout.states.loading.KPCircularLoadingIndicator
import com.trendyol.design.core.statelayout.states.loading.KPHorizontalLoadingIndicator
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.KPDesign

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.CIRCULAR_LOADING,
    styleName = "StateLayout_Circular_Loading"
)
@Composable
internal fun StateLayout_Circular_Loading() {
    TrendyolTheme {
        KPCircularLoadingIndicator(
            modifier = Modifier.size(400.dp),
            indicatorColor = KPDesign.colors.colorPrimary,
            indicatorStrokeWidth = 4.dp
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.HORIZONTAL_LOADING,
    styleName = "StateLayout_Infinitive_Horizontal_Loading"
)
@Composable
internal fun StateLayout_Infinitive_Horizontal_Loading() {
    TrendyolTheme {
        Box(modifier = Modifier.size(400.dp)) {
            KPHorizontalLoadingIndicator(
                progressState = HorizontalProgressState.INFINITIVE,
            )
        }
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.STATE_LAYOUT,
    name = Component.HORIZONTAL_LOADING,
    styleName = "StateLayout_Progressive_Horizontal_Loading"
)
@Composable
internal fun StateLayout_Progressive_Horizontal_Loading() {
    TrendyolTheme {
        Box(modifier = Modifier.size(400.dp)) {
            KPHorizontalLoadingIndicator(
                progressState = HorizontalProgressState.PROGRESSIVE,
                progressValue = 0.7F,
            )
        }
    }
}
