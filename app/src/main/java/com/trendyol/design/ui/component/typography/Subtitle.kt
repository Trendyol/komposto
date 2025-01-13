package com.trendyol.design.ui.component.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.R
import com.trendyol.design.core.text.KPText
import com.trendyol.design.ui.component.common.Component.SUBTITLE
import com.trendyol.design.ui.component.common.Group.TYPOGRAPHY
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.KPDesign

@ShowkaseComposable(group = TYPOGRAPHY, name = SUBTITLE, styleName = "Subtitle")
@Composable
internal fun C_Subtitle() = TrendyolTheme {
    KPText(
        text = LoremIpsum().values.joinToString(),
        style = KPDesign.typography.subtitle,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = SUBTITLE, styleName = "Subtitle.Bold")
@Composable
internal fun Subtitle_Bold() = TrendyolTheme {
    KPText(
        text = LoremIpsum().values.joinToString(),
        style = KPDesign.typography.subtitleBold,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = SUBTITLE, styleName = "Subtitle.Medium")
@Composable
internal fun Subtitle_Medium() = TrendyolTheme {
    KPText(
        text = LoremIpsum().values.joinToString(),
        style = KPDesign.typography.subtitleMedium,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = SUBTITLE, styleName = "Subtitle.Medium.OneLine")
@Composable
internal fun Subtitle_Medium_OneLine() = TrendyolTheme {
    KPText(
        text = LoremIpsum().values.joinToString(),
        style = KPDesign.typography.subtitleMedium,
        maxLines = 1,
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    C_Subtitle()
}

@Preview(showBackground = true)
@Composable
private fun PreviewBold() {
    Subtitle_Bold()
}

@Preview(showBackground = true)
@Composable
private fun PreviewMedium() {
    Subtitle_Medium()
}

@Preview(showBackground = true)
@Composable
private fun PreviewMediumOneLine() {
    Subtitle_Medium_OneLine()
}
