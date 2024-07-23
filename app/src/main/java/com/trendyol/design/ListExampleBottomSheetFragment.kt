package com.trendyol.design

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.trendyol.design.bottomsheet.BottomSheetListContent
import com.trendyol.design.bottomsheet.TrendyolDesignBottomSheetFragment
import com.trendyol.design.bottomsheet.item.BottomSheetStaticItem
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Bullet
import com.trendyol.design.ui.theme.TrendyolTheme
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ListExampleBottomSheetFragment : TrendyolDesignBottomSheetFragment() {

    @Composable
    override fun PageContent() {
        TrendyolTheme {
            BottomSheetListContent(
                title = "Some Title",
                onCloseIconClick = { dismiss() },
                itemList = MutableStateFlow(LoremIpsum().values.first().split(" ").subList(0, 30)).asStateFlow().collectAsState().value,
                itemContent = { _, item->
                    BottomSheetStaticItem(
                        text = item,
                        onClick = { },
                        icon = Icons.Fill.Bullet,
                        iconPosition = Alignment.CenterVertically,
                        description = "Description",
                    )
                },
            )
//            BottomSheetImageContent(
//                title = "Some Title",
//                onCloseIconClick = { dismiss() },
//                model = "https://fastly.picsum.photos/id/340/536/354.jpg?hmac=TEqJ_0Lnvw38Q0oP_A5i3KuSxW6HV1xiJ3U_W8LW7G4"
//            )
        }
    }
}