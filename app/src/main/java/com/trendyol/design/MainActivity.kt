package com.trendyol.design

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.icon.icons.outline.Back
import com.trendyol.design.core.inputfield.Dropdown
import com.trendyol.design.core.inputfield.MultiLineOutlineTextField
import com.trendyol.design.core.inputfield.SingleLineOutlinedTextField
import com.trendyol.design.core.inputfield.TrendyolDropdownStyle
import com.trendyol.design.core.inputfield.TrendyolOutlinedTextFieldStyle
import com.trendyol.design.core.inputfield.email.InputEmailField
import com.trendyol.design.core.inputfield.phone.InputPhoneNumberField
import com.trendyol.design.core.search.SearchBar
import com.trendyol.design.core.search.TrendyolSearchBarSize
import com.trendyol.design.core.search.TrendyolSearchBarStyle
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
                        state = State.ContentWithLoading(null),
                        contentStateLayout = {
                            var text by remember { mutableStateOf("") }
                            Column() {
                                SearchBar(
                                    modifier = Modifier.padding(8.dp),
                                    value = text,
                                    style = TrendyolSearchBarStyle.Outline,
                                    size = TrendyolSearchBarSize.Small,
                                    onValueChange = {
                                        text = it
                                    },
                                )

                                SingleLineOutlinedTextField(
                                    modifier = Modifier.padding(8.dp),
                                    style = TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined,
                                    value = text
                                ) {
                                    text = it
                                }

                                MultiLineOutlineTextField(
                                    modifier = Modifier.padding(8.dp),
                                    style = TrendyolOutlinedTextFieldStyle.Filled,
                                    value = text,
                                    maxChar = 10
                                ) {
                                    text = it
                                }

                                Dropdown(
                                    modifier = Modifier.padding(8.dp),
                                    style = TrendyolDropdownStyle.Filled,
                                    value = text
                                ) {
                                    text = "dropdown"
                                }

                                InputEmailField(
                                    modifier = Modifier.padding(8.dp),
                                    email = text,
                                    onValueChange = { text = it })

                                InputPhoneNumberField(
                                    modifier = Modifier.padding(8.dp),
                                    countryCode = text,
                                    number = text,
                                    onCountryCodeClick = { text = "onCountryCodeClick" },
                                    onValueChange = { text = it }
                                )
                            }
                        }
                    )
                }
            }
        }
    }
}
