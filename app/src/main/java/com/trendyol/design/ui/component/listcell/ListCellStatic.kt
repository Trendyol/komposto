@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.ui.component.listcell

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.R
import com.trendyol.design.bottomsheet.item.KPBottomSheetStaticItem
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Bullet
import com.trendyol.design.core.icon.icons.outline.Union
import com.trendyol.design.ui.component.common.Component.LIST_CELL_STATIC_ITEM
import com.trendyol.design.ui.component.common.Group.LIST_CELL
import com.trendyol.design.ui.theme.TrendyolTheme

@Preview(showBackground = true)
@ShowkaseComposable(group = LIST_CELL, name = LIST_CELL_STATIC_ITEM, styleName = "Basic")
@Composable
internal fun ListCellStaticBasic() = TrendyolTheme {
    Column {
        KPBottomSheetStaticItem(
            text = stringResource(id = R.string.title),
            onClick = { },
            modifier = Modifier.padding(vertical = 12.dp),
        )
        KPBottomSheetStaticItem(
            text = stringResource(id = R.string.title),
            onClick = { },
            description = stringResource(id = R.string.description),
            modifier = Modifier.padding(vertical = 12.dp),
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = LIST_CELL, name = LIST_CELL_STATIC_ITEM, styleName = "Union")
@Composable
internal fun ListCellStaticIcon() = TrendyolTheme {
    Column {
        KPBottomSheetStaticItem(
            text = stringResource(id = R.string.title),
            onClick = { },
            icon = KPIcons.Outline.Union,
            modifier = Modifier.padding(vertical = 12.dp),
        )
        KPBottomSheetStaticItem(
            text = stringResource(id = R.string.title),
            onClick = { },
            icon = KPIcons.Outline.Union,
            iconPosition = Alignment.Top,
            description = stringResource(id = R.string.description),
            modifier = Modifier.padding(vertical = 12.dp),
        )
        KPBottomSheetStaticItem(
            text = stringResource(id = R.string.title),
            onClick = { },
            icon = KPIcons.Outline.Union,
            iconPosition = Alignment.CenterVertically,
            description = stringResource(id = R.string.description),
            modifier = Modifier.padding(vertical = 12.dp),
        )
        KPBottomSheetStaticItem(
            text = stringResource(id = R.string.title),
            onClick = { },
            icon = KPIcons.Outline.Union,
            iconPosition = Alignment.Bottom,
            description = stringResource(id = R.string.description),
            modifier = Modifier.padding(vertical = 12.dp),
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(group = LIST_CELL, name = LIST_CELL_STATIC_ITEM, styleName = "Bullet")
@Composable
internal fun ListCellStaticBullet() = TrendyolTheme {
    Column {
        KPBottomSheetStaticItem(
            text = stringResource(id = R.string.title),
            onClick = { },
            icon = KPIcons.Fill.Bullet,
            modifier = Modifier.padding(vertical = 12.dp),
        )
        KPBottomSheetStaticItem(
            text = stringResource(id = R.string.title),
            onClick = { },
            icon = KPIcons.Fill.Bullet,
            iconPosition = Alignment.Top,
            description = stringResource(id = R.string.description),
            modifier = Modifier.padding(vertical = 12.dp),
        )
        KPBottomSheetStaticItem(
            text = stringResource(id = R.string.title),
            onClick = { },
            icon = KPIcons.Fill.Bullet,
            iconPosition = Alignment.CenterVertically,
            description = stringResource(id = R.string.description),
            modifier = Modifier.padding(vertical = 12.dp),
        )
        KPBottomSheetStaticItem(
            text = stringResource(id = R.string.title),
            onClick = { },
            icon = KPIcons.Fill.Bullet,
            iconPosition = Alignment.Bottom,
            description = stringResource(id = R.string.description),
            modifier = Modifier.padding(vertical = 12.dp),
        )
    }
}
