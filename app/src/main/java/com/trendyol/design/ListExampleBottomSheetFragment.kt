package com.trendyol.design

import androidx.compose.runtime.Composable
import com.trendyol.design.bottomsheet.BottomSheetImageContent
import com.trendyol.design.bottomsheet.TrendyolDesignBottomSheetFragment
import com.trendyol.design.ui.theme.TrendyolTheme

class ListExampleBottomSheetFragment : TrendyolDesignBottomSheetFragment() {

    @Composable
    override fun PageContent() {
        TrendyolTheme {
            BottomSheetImageContent(
                title = "Some Title",
                onCloseIconClick = { dismiss() },
                model =
                "https://cdn.dsmcdn.com/ty1435/pimWidgetApi/mobile_20240722061404_2970506KadinMobile202407191702.jpg",
            )
        }
    }
}
