package com.trendyol.design.bottomsheet

import com.google.android.material.bottomsheet.BottomSheetDialogFragment

abstract class TrendyolDesignBottomSheetFragment : BottomSheetDialogFragment() {

    override fun getTheme(): Int = R.style.BaseBottomSheetDialog
}