package com.trendyol.design.ui.component.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.R
import com.trendyol.design.core.text.Text
import com.trendyol.design.ui.component.common.Component.OVERLINE
import com.trendyol.design.ui.component.common.Group.TYPOGRAPHY
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.TrendyolDesign

@ShowkaseComposable(group = TYPOGRAPHY, name = OVERLINE, styleName = "Overline")
@Composable
internal fun F_Overline() = TrendyolTheme {
    Text(
        text = LoremIpsum().values.joinToString(),
        style = TrendyolDesign.typography.overLine,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = OVERLINE, styleName = "Overline.Bold")
@Composable
internal fun Overline_Bold() = TrendyolTheme {
    Text(
        text = LoremIpsum().values.joinToString(),
        style = TrendyolDesign.typography.overLineBold,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = OVERLINE, styleName = "Overline.Medium")
@Composable
internal fun Overline_Medium() = TrendyolTheme {
    Text(
        text = LoremIpsum().values.joinToString(),
        style = TrendyolDesign.typography.overLineMedium,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = OVERLINE, styleName = "Overline.Medium.OneLine")
@Composable
internal fun Overline_Medium_OneLine() = TrendyolTheme {
    Text(
        text = LoremIpsum().values.joinToString(),
        style = TrendyolDesign.typography.overLineMedium,
        maxLines = 1,
    )
}

@Preview
@Composable
private fun Preview() {
    F_Overline()
}

@Preview
@Composable
private fun PreviewBold() {
    Overline_Bold()
}

@Preview
@Composable
private fun PreviewMedium() {
    Overline_Medium()
}

@Preview
@Composable
private fun PreviewMediumOneLine() {
    Overline_Medium_OneLine()
}
