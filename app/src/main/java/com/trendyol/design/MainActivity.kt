package com.trendyol.design

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.statelayout.State
import com.trendyol.design.core.statelayout.StateComposeLayout
import com.trendyol.design.core.statelayout.TrendyolWarningInfoStateLayoutStyle
import com.trendyol.design.ui.theme.TrendyolTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrendyolTheme {
                StateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = TrendyolWarningInfoStateLayoutStyle.SingleButtonNoDescription(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            primaryButtonClickListener = {}
                        )
                    )
                )
            }
        }
    }
}
