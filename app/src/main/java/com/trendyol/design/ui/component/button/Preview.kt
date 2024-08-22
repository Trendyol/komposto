package com.trendyol.design.ui.component.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.trendyol.design.core.button.Button
import com.trendyol.design.core.button.ButtonSize
import com.trendyol.design.core.button.ButtonStyle
import com.trendyol.design.core.button.TrendyolButtonSize
import com.trendyol.design.core.button.TrendyolButtonStyle
import com.trendyol.design.core.text.Text
import com.trendyol.design.ui.theme.TrendyolTheme

private class TrendyolButtonStyleParameterProvider : PreviewParameterProvider<ButtonStyle> {
    override val values: Sequence<ButtonStyle>
        get() = sequenceOf(
            TrendyolButtonStyle.Primary,
            TrendyolButtonStyle.Secondary,
            TrendyolButtonStyle.Tertiary,
        )
}

private class TrendyolButtonSizeParameterProvider : PreviewParameterProvider<ButtonSize> {
    override val values: Sequence<ButtonSize>
        get() = sequenceOf(
            TrendyolButtonSize.Large,
            TrendyolButtonSize.Medium,
            TrendyolButtonSize.Small,
            TrendyolButtonSize.XSmall,
        )
}

@Preview
@Composable
private fun Preview_Button_Style(
    @PreviewParameter(TrendyolButtonStyleParameterProvider::class) style: ButtonStyle,
) {
    TrendyolTheme {
        Button(
            onClick = { },
            style = style,
            size = TrendyolButtonSize.Large,
        ) {
            Text(text = BUTTON_TEXT)
        }
    }
}

@Preview
@Composable
private fun Preview_Button_Size(
    @PreviewParameter(TrendyolButtonSizeParameterProvider::class) size: ButtonSize,
) {
    TrendyolTheme {
        Button(
            onClick = { },
            style = TrendyolButtonStyle.Primary,
            size = size,
        ) {
            Text(text = BUTTON_TEXT)
        }
    }
}
