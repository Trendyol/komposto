package com.trendyol.design.ui.component.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.R
import com.trendyol.design.core.text.KPText
import com.trendyol.design.ui.component.common.Component.HEADER
import com.trendyol.design.ui.component.common.Group.TYPOGRAPHY
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.KPDesign

@ShowkaseComposable(group = TYPOGRAPHY, name = HEADER, styleName = "Header")
@Composable
internal fun A_Header() = TrendyolTheme {
    KPText(
        text = LoremIpsum().values.joinToString(),
        style = KPDesign.typography.header,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = HEADER, styleName = "Header.Bold")
@Composable
internal fun Header_Bold() = TrendyolTheme {
    KPText(
        text = LoremIpsum().values.joinToString(),
        style = KPDesign.typography.headerBold,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = HEADER, styleName = "Header.Medium")
@Composable
internal fun Header_Medium() = TrendyolTheme {
    KPText(
        text = LoremIpsum().values.joinToString(),
        style = KPDesign.typography.headerMedium,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = HEADER, styleName = "Header.Medium.OneLine")
@Composable
internal fun Header_Medium_OneLine() = TrendyolTheme {
    KPText(
        text = LoremIpsum().values.joinToString(),
        style = KPDesign.typography.headerMedium,
        maxLines = 1,
    )
}

@Preview
@Composable
private fun Preview() {
    A_Header()
}

@Preview
@Composable
private fun PreviewBold() {
    Header_Bold()
}

@Preview
@Composable
private fun PreviewMedium() {
    Header_Medium()
}

@Preview
@Composable
private fun PreviewMediumOneLine() {
    Header_Medium_OneLine()
}
