package com.trendyol.design.core.inputfield.otp

import android.view.KeyEvent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.previewtheme.PreviewTheme
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

@Composable
fun InputOTPField(
    style: InputOTPFieldStyle,
    otp: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    otpLength: Int = DEFAULT_OTP_LENGTH,
    enabled: Boolean = true,
    hint: String? = null,
    errorText: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    var otpValue by remember { mutableStateOf(otp) }
    val focusManager = LocalFocusManager.current
    val isFocused by interactionSource.collectIsFocusedAsState()
    val isError = errorText != null

    Column(modifier = modifier.fillMaxWidth()) {
        BasicTextField(
            modifier = Modifier
                .fillMaxWidth()
                .onKeyEvent { keyEvent ->
                    if (keyEvent.nativeKeyEvent.keyCode == KeyEvent.KEYCODE_ENTER) {
                        focusManager.clearFocus(force = true)
                        onValueChange(otpValue)

                        return@onKeyEvent true
                    }

                    false
                },
            value = otpValue,
            onValueChange = { value ->
                if (value.trim().length <= otpLength) {
                    otpValue = value.trim()
                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
            interactionSource = interactionSource,
            enabled = enabled,
            decorationBox = {
                Box(
                    modifier = Modifier
                        .background(
                            color = style.getBackgroundColor(
                                enabled = enabled,
                                isError = isError
                            ).value
                        )
                        .border(
                            borderThickness,
                            color = style.getBorderColor(
                                enabled = enabled,
                                isFocused = isFocused,
                                isError = isError
                            ).value,
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(
                            start = 12.dp,
                            top = 12.dp,
                            bottom = 8.dp,
                            end = 10.dp
                        )
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        repeat(otpLength) { index ->
                            val shouldFocusChar = isFocused && otpValue.length == index
                            val char = when {
                                index >= otpValue.length -> EMPTY
                                else -> otpValue[index].toString()
                            }

                            Box(
                                modifier = Modifier
                                    .width(20.dp)
                                    .height(24.dp)
                            ) {
                                Text(
                                    modifier = Modifier.align(Alignment.Center),
                                    text = char,
                                    style = TrendyolDesign.typography.subtitleMedium,
                                    color = style.getTextColor(enabled = enabled).value,
                                    textAlign = TextAlign.Center
                                )

                                Divider(
                                    modifier = Modifier
                                        .align(Alignment.BottomCenter)
                                        .fillMaxWidth()
                                        .background(
                                            color = style.getTabIndicatorColor(
                                                enabled = enabled,
                                                isFocused = shouldFocusChar,
                                                isError = isError
                                            ).value,
                                        ),
                                    thickness = borderThickness
                                )
                            }

                            Spacer(modifier = Modifier.width(8.dp))
                        }
                    }
                }
            }
        )

        if (enabled && errorText != null) {
            Text(
                modifier = Modifier
                    .padding(top = 8.dp, start = 12.dp, end = 12.dp)
                    .fillMaxWidth(),
                text = errorText,
                style = TrendyolDesign.typography.body1ColorWarning,
            )
        }

        if (!isError && hint != null) {
            Text(
                modifier = Modifier
                    .padding(top = 8.dp, start = 12.dp, end = 12.dp)
                    .fillMaxWidth(),
                text = hint,
                style = TrendyolDesign.typography.body1ColorOnSurfaceVariant1,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun OutlinedInputOTPFieldPreview() {
    PreviewTheme {
        InputOTPField(
            modifier = Modifier.padding(16.dp),
            style = TrendyolInputOTPFieldStyle.Outline,
            otp = "123",
            onValueChange = { }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DisabledOutlinedInputOTPFieldPreview() {
    PreviewTheme {
        InputOTPField(
            modifier = Modifier.padding(16.dp),
            style = TrendyolInputOTPFieldStyle.Outline,
            otp = "123",
            enabled = false,
            onValueChange = { }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ErrorOutlinedInputOTPFieldPreview() {
    PreviewTheme {
        InputOTPField(
            modifier = Modifier.padding(16.dp),
            style = TrendyolInputOTPFieldStyle.Outline,
            otp = "123",
            errorText = "Unexpected error occurred.",
            onValueChange = { }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun FilledInputOTPFieldPreview() {
    PreviewTheme {
        InputOTPField(
            modifier = Modifier.padding(16.dp),
            style = TrendyolInputOTPFieldStyle.Filled,
            otp = "123",
            onValueChange = { }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun FilledOutlinedInputOTPFieldPreview() {
    PreviewTheme {
        InputOTPField(
            modifier = Modifier.padding(16.dp),
            style = TrendyolInputOTPFieldStyle.Filled,
            otp = "123",
            enabled = false,
            onValueChange = { }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ErrorFilledInputOTPFieldPreview() {
    PreviewTheme {
        InputOTPField(
            modifier = Modifier.padding(16.dp),
            style = TrendyolInputOTPFieldStyle.Filled,
            otp = "123",
            errorText = "Unexpected error occurred.",
            onValueChange = { }
        )
    }
}

private const val EMPTY = ""
private const val DEFAULT_OTP_LENGTH = 6
private val borderThickness = 1.dp