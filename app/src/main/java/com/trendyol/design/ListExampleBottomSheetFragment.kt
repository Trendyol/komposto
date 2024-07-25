package com.trendyol.design

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.trendyol.design.bottomsheet.BottomSheetImageContent
import com.trendyol.design.bottomsheet.BottomSheetListContent
import com.trendyol.design.bottomsheet.TrendyolDesignBottomSheetFragment
import com.trendyol.design.bottomsheet.item.BottomSheetStaticItem
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Bullet
import com.trendyol.design.ui.theme.TrendyolTheme
import kotlinx.collections.immutable.toPersistentList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ListExampleBottomSheetFragment : TrendyolDesignBottomSheetFragment() {

    @Composable
    override fun PageContent() {
        TrendyolTheme {
            BottomSheetImageContent(
                title = "Some Title",
                onCloseIconClick = { dismiss() },
                model = "https://cdn.dsmcdn.com/ty1435/pimWidgetApi/mobile_20240722061404_2970506KadinMobile202407191702.jpg",
            )
        }
    }
}
