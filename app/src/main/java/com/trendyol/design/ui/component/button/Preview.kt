package com.trendyol.design.ui.component.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.trendyol.design.core.button.ButtonSize
import com.trendyol.design.core.button.ButtonStyle
import com.trendyol.design.core.button.KPButton
import com.trendyol.design.core.button.KPButtonSize
import com.trendyol.design.core.button.KPButtonStyle
import com.trendyol.design.core.text.KPText
import com.trendyol.design.ui.theme.TrendyolTheme

private class KPButtonStyleParameterProvider : PreviewParameterProvider<ButtonStyle> {
    override val values: Sequence<ButtonStyle>
        get() = sequenceOf(
            KPButtonStyle.Primary,
            KPButtonStyle.Secondary,
            KPButtonStyle.Tertiary,
        )
}

private class KPButtonSizeParameterProvider : PreviewParameterProvider<ButtonSize> {
    override val values: Sequence<ButtonSize>
        get() = sequenceOf(
            KPButtonSize.Large,
            KPButtonSize.Medium,
            KPButtonSize.Small,
            KPButtonSize.XSmall,
        )
}

@Preview
@Composable
private fun Preview_Button_Style(
    @PreviewParameter(KPButtonStyleParameterProvider::class) style: ButtonStyle,
) {
    TrendyolTheme {
        KPButton(
            onClick = { },
            style = style,
            size = KPButtonSize.Large,
        ) {
            KPText(text = BUTTON_TEXT)
        }
    }
}

@Preview
@Composable
private fun Preview_Button_Size(
    @PreviewParameter(KPButtonSizeParameterProvider::class) size: ButtonSize,
) {
    TrendyolTheme {
        KPButton(
            onClick = { },
            style = KPButtonStyle.Primary,
            size = size,
        ) {
            KPText(text = BUTTON_TEXT)
        }
    }
}
