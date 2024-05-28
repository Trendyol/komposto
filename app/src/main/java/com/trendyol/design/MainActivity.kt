package com.trendyol.design

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.outline.Back
import com.trendyol.design.core.inputfield.Dropdown
import com.trendyol.design.core.inputfield.MultiLineOutlineTextField
import com.trendyol.design.core.inputfield.SingleLineOutlinedTextField
import com.trendyol.design.core.inputfield.TrendyolDropdownStyle
import com.trendyol.design.core.inputfield.TrendyolOutlinedTextFieldStyle
import com.trendyol.design.core.statelayout.State
import com.trendyol.design.core.statelayout.StateComposeLayout
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
                        state = State.ContentWithLoading(null),
                        contentStateLayout = {
                            Column(
                                modifier = Modifier.padding(8.dp),

                            ) {
                                SingleLineOutlinedTextField(
                                    modifier = Modifier.padding(8.dp),
                                    style = TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined,
                                    label = "Label",
                                    value = "",
                                    errorLabel = "Error Label",
                                    isError = false,
                                    enabled = true
                                ) {}

                                MultiLineOutlineTextField(
                                    modifier = Modifier.padding(8.dp),
                                    style = TrendyolOutlinedTextFieldStyle.Outlined,
                                    value = "",
                                    maxChar = 20000,
                                    label = "Label",
                                    errorLabel = "Error Label",
                                    isError = true,
                                ) {}

                                Dropdown(
                                    modifier = Modifier.padding(8.dp),
                                    style = TrendyolDropdownStyle.Filled,
                                    value = "",
                                    label = "Label",
                                    errorLabel = "errorLabel",
                                    isError = true,
                                ) {}
                            }

                        }
                    )
                }
            }
        }
    }
}
