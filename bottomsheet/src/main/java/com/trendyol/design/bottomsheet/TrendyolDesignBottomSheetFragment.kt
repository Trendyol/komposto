package com.trendyol.design.bottomsheet

import androidx.compose.runtime.Composable
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.trendyol.design.bottomsheet.header.BottomSheetHeader

abstract class TrendyolDesignBottomSheetFragment : BottomSheetDialogFragment(), BottomSheetContent {

    override fun getTheme(): Int = R.style.BaseBottomSheetDialog

    @Composable
    override fun Header() {
        BottomSheetHeader(
            title = title(),
            onCloseIconClick = { dismiss() },
        )
    }
}
