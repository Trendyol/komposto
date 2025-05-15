package com.trendyol.design.ui.component.bottomsheet

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.R
import com.trendyol.design.bottomsheet.KPBottomSheetImageContent
import com.trendyol.design.bottomsheet.KPBottomSheetListContent
import com.trendyol.design.bottomsheet.KPBottomSheetSliderContent
import com.trendyol.design.core.text.KPText
import com.trendyol.design.ui.component.common.Component.BOTTOM_SHEET_IMAGE
import com.trendyol.design.ui.component.common.Component.BOTTOM_SHEET_LIST
import com.trendyol.design.ui.component.common.Component.BOTTOM_SHEET_SLIDER
import com.trendyol.design.ui.component.common.Group.BOTTOM_SHEET
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.KPDesign
import kotlinx.collections.immutable.toPersistentList

private val exampleList =
    listOf(Unit, Unit, Unit).toPersistentList()

@Preview(showBackground = true)
@ShowkaseComposable(group = BOTTOM_SHEET, name = BOTTOM_SHEET_LIST)
@Composable
internal fun BottomSheetList() = TrendyolTheme {
    KPBottomSheetListContent(
        title = "Title",
        onCloseIconClick = { },
        itemList = exampleList,
        itemContent = { _, _ ->
            Row(
                modifier = Modifier
                    .height(48.dp)
                    .fillMaxWidth()
                    .border(
                        border = BorderStroke(1.dp, KPDesign.colors.colorBorder),
                        shape = RoundedCornerShape(8.dp)
                    ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                KPText(
                    text = stringResource(id = R.string.item),
                    style = KPDesign.typography.body1ColorOnSurfaceVariant1,
                )
            }
        }
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(group = BOTTOM_SHEET, name = BOTTOM_SHEET_SLIDER)
@Composable
internal fun BottomSheetSlider() = TrendyolTheme {
    KPBottomSheetSliderContent(
        title = stringResource(id = R.string.title),
        onCloseIconClick = { },
        itemList = exampleList,
        itemContent = { _, _ ->
            Row(
                modifier = Modifier
                    .height(210.dp)
                    .width(140.dp)
                    .border(
                        border = BorderStroke(1.dp, KPDesign.colors.colorBorder),
                        shape = RoundedCornerShape(8.dp)
                    ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                KPText(
                    text = stringResource(id = R.string.item),
                    style = KPDesign.typography.body1ColorOnSurfaceVariant1,
                )
            }
        }
    )
}

@Preview(showBackground = true)
@ShowkaseComposable(group = BOTTOM_SHEET, name = BOTTOM_SHEET_IMAGE)
@Composable
internal fun BottomSheetImage() = TrendyolTheme {
    KPBottomSheetImageContent(
        title = stringResource(id = R.string.title),
        onCloseIconClick = { },
        model = "https://fastly.picsum.photos/id/340/536/354.jpg?hmac=TEqJ_0Lnvw38Q0oP_A5i3KuSxW6HV1xiJ3U_W8LW7G4",
    )
}
