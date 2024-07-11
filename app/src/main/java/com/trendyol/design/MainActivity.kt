package com.trendyol.design

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.icon.icons.outline.Back
import com.trendyol.design.core.statelayout.State
import com.trendyol.design.core.statelayout.StateComposeLayout
import com.trendyol.design.core.statelayout.TrendyolWarningInfoStateLayoutStyle
import com.trendyol.design.core.toolbar.Toolbar
import com.trendyol.design.core.toolbar.TrendyolToolbarStyle
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.TrendyolDesign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrendyolTheme {
                Scaffold(
                    topBar = {
                        Toolbar(
                            title = "Title",
                            style = TrendyolToolbarStyle.Icon.TextButton(
                                icon = {
                                    Icon(
                                        imageVector = Icons.Outline.Back,
                                        tint = TrendyolDesign.colors.colorOnSurfaceVariant3,
                                        onClick = { /*TODO*/ }
                                    )
                                },
                                textButton = { Text(text = "CTA Label", onClick = { /*TODO*/ }) }
                            )
                        )
                    }
                ) { paddingValues ->
                    StateComposeLayout(
                        modifier = Modifier.padding(paddingValues),
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
}
