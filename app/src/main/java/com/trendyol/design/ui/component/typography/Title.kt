package com.trendyol.design.ui.component.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.R
import com.trendyol.design.core.text.Text
import com.trendyol.design.ui.component.common.Component.TITLE
import com.trendyol.design.ui.component.common.Group.TYPOGRAPHY
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.TrendyolDesign

@ShowkaseComposable(group = TYPOGRAPHY, name = TITLE, styleName = "Title")
@Composable
internal fun B_Title() = TrendyolTheme {
    Text(
        text = LoremIpsum().values.joinToString(),
        style = TrendyolDesign.typography.title,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = TITLE, styleName = "Title.Bold")
@Composable
internal fun Title_Bold() = TrendyolTheme {
    Text(
        text = LoremIpsum().values.joinToString(),
        style = TrendyolDesign.typography.titleBold,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = TITLE, styleName = "Title.Medium")
@Composable
internal fun Title_Medium() = TrendyolTheme {
    Text(
        text = LoremIpsum().values.joinToString(),
        style = TrendyolDesign.typography.titleMedium,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = TITLE, styleName = "Title.Medium.OneLine")
@Composable
internal fun Title_Medium_OneLine() = TrendyolTheme {
    Text(
        text = LoremIpsum().values.joinToString(),
        style = TrendyolDesign.typography.titleMedium,
        maxLines = 1,
    )
}

@Preview
@Composable
private fun Preview() {
    B_Title()
}

@Preview
@Composable
private fun PreviewBold() {
    Title_Bold()
}

@Preview
@Composable
private fun PreviewMedium() {
    Title_Medium()
}

@Preview
@Composable
private fun PreviewMediumOneLine() {
    Title_Medium_OneLine()
}
