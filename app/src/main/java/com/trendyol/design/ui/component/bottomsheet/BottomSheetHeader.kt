@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.ui.component.bottomsheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.R
import com.trendyol.design.bottomsheet.header.KPBottomSheetHeader
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.ui.component.common.Component.BOTTOM_SHEET_HEADER
import com.trendyol.design.ui.component.common.Group.BOTTOM_SHEET
import com.trendyol.design.ui.theme.TrendyolTheme

@Preview(showBackground = true)
@ShowkaseComposable(group = BOTTOM_SHEET, name = BOTTOM_SHEET_HEADER, styleName = "1.SingleRow")
@Composable
internal fun KPBottomSheetHeaderSingleRow() = TrendyolTheme {
    Column {
        KPBottomSheetHeader(
            title = stringResource(id = R.string.title),
            onCloseIconClick = { },
        )
        Spacer(modifier = Modifier.height(16.dp))
        KPBottomSheetHeader(
            title = stringResource(id = R.string.title),
            onCloseIconClick = { },
            isBackIconVisible = true
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = BOTTOM_SHEET, name = BOTTOM_SHEET_HEADER, styleName = "2.DoubleRow")
@Composable
internal fun KPBottomSheetHeaderDoubleRow() = TrendyolTheme {
    Column {
        KPBottomSheetHeader(
            title = LoremIpsum().values.joinToString(),
            onCloseIconClick = { },
        )
        Spacer(modifier = Modifier.height(16.dp))
        KPBottomSheetHeader(
            title = LoremIpsum().values.joinToString(),
            onCloseIconClick = { },
            isBackIconVisible = true
        )
    }
}
