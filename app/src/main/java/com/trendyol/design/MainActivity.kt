package com.trendyol.design

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.models.Showkase
import com.trendyol.design.core.button.Button
import com.trendyol.design.core.button.TrendyolButtonSize
import com.trendyol.design.core.button.TrendyolButtonStyle
import com.trendyol.design.core.text.Text
import com.trendyol.design.di.getBrowserIntent
import com.trendyol.design.ui.theme.TrendyolTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrendyolTheme {
                Column {
                    Button(
                        onClick = {
                            startActivity(Showkase.getBrowserIntent(context = this@MainActivity))
                        },
                        style = TrendyolButtonStyle.Primary,
                        size = TrendyolButtonSize.Large,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Text(text = "Navigate To Showkase")
                    }
                }
            }
        }

        if (savedInstanceState == null) {
            startActivity(Showkase.getBrowserIntent(context = this))
        }
    }
}
