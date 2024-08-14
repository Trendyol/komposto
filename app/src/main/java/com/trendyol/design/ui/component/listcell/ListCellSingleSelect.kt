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
import com.trendyol.design.bottomsheet.item.BottomSheetSingleSelectItem
import com.trendyol.design.ui.component.common.Component.LIST_CELL_SINGLE_SELECT_ITEM
import com.trendyol.design.ui.component.common.Group.LIST_CELL
import com.trendyol.design.ui.theme.TrendyolTheme

@Preview(showBackground = true)
@ShowkaseComposable(group = LIST_CELL, name = LIST_CELL_SINGLE_SELECT_ITEM, styleName = "Basic")
@Composable
internal fun ListCellSingleSelectBasic() = TrendyolTheme {
    Column {
        BottomSheetSingleSelectItem(
            selected = false,
            text = stringResource(id = R.string.title),
            onClick = { },
            helperText = stringResource(id = R.string.helper_text),
            modifier = Modifier.padding(vertical = 12.dp),
        )
        BottomSheetSingleSelectItem(
            selected = false,
            text = stringResource(id = R.string.title),
            onClick = { },
            modifier = Modifier.padding(vertical = 12.dp),
        )
        BottomSheetSingleSelectItem(
            selected = false,
            text = stringResource(id = R.string.title),
            onClick = { },
            isIconVisible = false,
            helperText = stringResource(id = R.string.helper_text),
            modifier = Modifier.padding(vertical = 12.dp),
        )
        BottomSheetSingleSelectItem(
            selected = false,
            text = stringResource(id = R.string.title),
            onClick = { },
            isIconVisible = false,
            modifier = Modifier.padding(vertical = 12.dp),
        )
        BottomSheetSingleSelectItem(
            selected = true,
            text = stringResource(id = R.string.title),
            onClick = { },
            helperText = stringResource(id = R.string.helper_text),
            modifier = Modifier.padding(vertical = 12.dp),
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = LIST_CELL, name = LIST_CELL_SINGLE_SELECT_ITEM, styleName = "Rich")
@Composable
internal fun ListCellSingleSelectRich() = TrendyolTheme {
    Column {
        BottomSheetSingleSelectItem(
            selected = false,
            text = stringResource(id = R.string.title),
            onClick = { },
            description = stringResource(id = R.string.description),
            helperText = stringResource(id = R.string.helper_text),
            modifier = Modifier.padding(vertical = 12.dp),
        )
        BottomSheetSingleSelectItem(
            selected = false,
            text = stringResource(id = R.string.title),
            onClick = { },
            description = stringResource(id = R.string.description),
            modifier = Modifier.padding(vertical = 12.dp),
        )
        BottomSheetSingleSelectItem(
            selected = false,
            text = stringResource(id = R.string.title),
            onClick = { },
            description = stringResource(id = R.string.description),
            isIconVisible = false,
            helperText = stringResource(id = R.string.helper_text),
            modifier = Modifier.padding(vertical = 12.dp),
        )
        BottomSheetSingleSelectItem(
            selected = false,
            text = stringResource(id = R.string.title),
            onClick = { },
            description = stringResource(id = R.string.description),
            isIconVisible = false,
            modifier = Modifier.padding(vertical = 12.dp),
        )
        BottomSheetSingleSelectItem(
            selected = true,
            text = stringResource(id = R.string.title),
            onClick = { },
            description = stringResource(id = R.string.description),
            helperText = stringResource(id = R.string.helper_text),
            modifier = Modifier.padding(vertical = 12.dp),
        )
    }
}
