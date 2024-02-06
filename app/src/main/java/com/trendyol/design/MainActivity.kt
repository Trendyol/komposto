package com.trendyol.design

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.button.Button
import com.trendyol.design.core.button.TrendyolButtonSize
import com.trendyol.design.core.button.TrendyolButtonStyle
import com.trendyol.design.core.text.Text
import com.trendyol.design.ui.theme.TrendyolTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrendyolTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() = Column {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier.padding(16.dp),
        style = TrendyolButtonStyle.Primary,
        size = TrendyolButtonSize.Small
    ) {
        Text(text = "CTA Label")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TrendyolTheme {
        Greeting()
    }
}
