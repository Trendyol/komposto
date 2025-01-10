package com.trendyol.design.ui.component.listcell

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.R
import com.trendyol.design.bottomsheet.item.KPBottomSheetCheckboxItem
import com.trendyol.design.ui.component.common.Component.LIST_CELL_CHECKBOX_ITEM
import com.trendyol.design.ui.component.common.Group.LIST_CELL
import com.trendyol.design.ui.theme.TrendyolTheme

@Preview(showBackground = true)
@ShowkaseComposable(group = LIST_CELL, name = LIST_CELL_CHECKBOX_ITEM, styleName = "Basic")
@Composable
internal fun ListCellCheckboxBasic() = TrendyolTheme {
    Column {
        KPBottomSheetCheckboxItem(
            checked = true,
            text = stringResource(id = R.string.title),
            onCheckedChange = { },
            isIconVisible = true,
            modifier = Modifier.padding(vertical = 12.dp),
        )
        KPBottomSheetCheckboxItem(
            checked = true,
            text = stringResource(id = R.string.title),
            onCheckedChange = { },
            isIconVisible = false,
            modifier = Modifier.padding(vertical = 12.dp),
        )
        KPBottomSheetCheckboxItem(
            checked = false,
            text = stringResource(id = R.string.title),
            onCheckedChange = { },
            isIconVisible = true,
            modifier = Modifier.padding(vertical = 12.dp),
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = LIST_CELL, name = LIST_CELL_CHECKBOX_ITEM, styleName = "Rich")
@Composable
internal fun ListCellCheckboxRich() = TrendyolTheme {
    Column {
        KPBottomSheetCheckboxItem(
            checked = true,
            text = stringResource(id = R.string.title),
            onCheckedChange = { },
            isIconVisible = true,
            description = stringResource(id = R.string.description),
            modifier = Modifier.padding(vertical = 12.dp),
        )
        KPBottomSheetCheckboxItem(
            checked = true,
            text = stringResource(id = R.string.title),
            onCheckedChange = { },
            isIconVisible = false,
            description = stringResource(id = R.string.description),
            modifier = Modifier.padding(vertical = 12.dp),
        )
        KPBottomSheetCheckboxItem(
            checked = false,
            text = stringResource(id = R.string.title),
            onCheckedChange = { },
            isIconVisible = true,
            description = stringResource(id = R.string.description),
            modifier = Modifier.padding(vertical = 12.dp),
        )
    }
}
