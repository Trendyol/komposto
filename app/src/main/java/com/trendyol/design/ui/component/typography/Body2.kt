package com.trendyol.design.ui.component.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.R
import com.trendyol.design.core.text.KPText
import com.trendyol.design.ui.component.common.Component.BODY2
import com.trendyol.design.ui.component.common.Group.TYPOGRAPHY
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.KPDesign

@ShowkaseComposable(group = TYPOGRAPHY, name = BODY2, styleName = "Body2")
@Composable
internal fun E_Body2() = TrendyolTheme {
    KPText(
        text = LoremIpsum().values.joinToString(),
        style = KPDesign.typography.body2,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = BODY2, styleName = "Body2.Bold")
@Composable
internal fun E_Body2_Bold() = TrendyolTheme {
    KPText(
        text = LoremIpsum().values.joinToString(),
        style = KPDesign.typography.body2Bold,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = BODY2, styleName = "Body2.Medium")
@Composable
internal fun E_Body2_Medium() = TrendyolTheme {
    KPText(
        text = LoremIpsum().values.joinToString(),
        style = KPDesign.typography.body2Medium,
        maxLines = integerResource(id = R.integer.typography_max_line),
    )
}

@ShowkaseComposable(group = TYPOGRAPHY, name = BODY2, styleName = "Body2.Medium.OneLine")
@Composable
internal fun E_Body2_Medium_OneLine() = TrendyolTheme {
    KPText(
        text = LoremIpsum().values.joinToString(),
        style = KPDesign.typography.body2Medium,
        maxLines = 1,
    )
}

@Preview
@Composable
private fun Preview() {
    E_Body2()
}

@Preview
@Composable
private fun PreviewBold() {
    E_Body2_Bold()
}

@Preview
@Composable
private fun PreviewMedium() {
    E_Body2_Medium()
}

@Preview
@Composable
private fun PreviewMediumOneLine() {
    E_Body2_Medium_OneLine()
}
