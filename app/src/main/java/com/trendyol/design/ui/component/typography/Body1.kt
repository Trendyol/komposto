package com.trendyol.design.ui.component.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.R
import com.trendyol.design.core.text.Text
import com.trendyol.design.ui.component.common.Component.BODY1
import com.trendyol.design.ui.component.common.Group.TYPOGRAPHY
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.TrendyolDesign

@ShowkaseComposable(group = TYPOGRAPHY, name = BODY1, styleName = "Body1")
@Composable
internal fun D_Body1() = TrendyolTheme {
    Text(
        text = LoremIpsum().values.joinToString(),
        style = TrendyolDesign.typography.body1,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = BODY1, styleName = "Body1.Bold")
@Composable
internal fun D_Body1_Bold() = TrendyolTheme {
    Text(
        text = LoremIpsum().values.joinToString(),
        style = TrendyolDesign.typography.body1Bold,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = BODY1, styleName = "Body1.Medium")
@Composable
internal fun D_Body1_Medium() = TrendyolTheme {
    Text(
        text = LoremIpsum().values.joinToString(),
        style = TrendyolDesign.typography.body1Medium,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = BODY1, styleName = "Body1.Medium.OneLine")
@Composable
internal fun D_Body1_Medium_OneLine() = TrendyolTheme {
    Text(
        text = LoremIpsum().values.joinToString(),
        style = TrendyolDesign.typography.body1Medium,
        maxLines = 1,
    )
}

@Preview
@Composable
private fun Preview() {
    D_Body1()
}

@Preview
@Composable
private fun PreviewBold() {
    D_Body1_Bold()
}

@Preview
@Composable
private fun PreviewMedium() {
    D_Body1_Medium()
}

@Preview
@Composable
private fun PreviewMediumOneLine() {
    D_Body1_Medium_OneLine()
}
