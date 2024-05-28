package com.trendyol.design.core.price

import android.os.Parcelable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import com.trendyol.design.core.icon.IconSize
import com.trendyol.design.core.icon.TrendyolIconSize
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Stable
@Parcelize
data class PriceModel(
    val icon: @RawValue ImageVector? = null,
    val iconSize: @RawValue IconSize = TrendyolIconSize.XXSmall,
    val iconTint: @RawValue Color? = null,
    val campaignText: String? = null,
    val campaignTextStyle: @RawValue TextStyle? = null,
    val salePriceText: String? = null,
    val salePriceTextStyle: @RawValue TextStyle? = null,
    val marketPriceText: String? = null,
    val marketPriceTextStyle: @RawValue TextStyle? = null,
    val unitPriceText: String? = null,
    val unitPriceTextStyle: @RawValue TextStyle? = null,
) : Parcelable
