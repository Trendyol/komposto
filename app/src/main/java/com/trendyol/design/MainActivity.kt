package com.trendyol.design

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import com.trendyol.design.core.button.Button
import com.trendyol.design.core.button.TrendyolButtonSize
import com.trendyol.design.core.button.TrendyolButtonStyle
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.outline.Back
import com.trendyol.design.core.text.Text
import com.trendyol.design.core.toolbar.Toolbar
import com.trendyol.design.core.toolbar.TrendyolToolbarStyle
import com.trendyol.design.ui.theme.TrendyolTheme

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
                                        onClick = { /*TODO*/ })
                                },
                                textButton = { Text(text = "actionText", onClick = { /*TODO*/ }) }
                            )
                        )
                    }
                ) { paddingValues ->
                    Column {
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier.padding(paddingValues),
                            style = TrendyolButtonStyle.Primary,
                            size = TrendyolButtonSize.Small
                        ) {
                            Text(text = "CTA Label")
                        }
                    }
                }
            }
        }
    }
}
