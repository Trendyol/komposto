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

/**
 *
 * @param icon If you need an icon in your campaign text, you can set it in this parameter.
 * @param iconSize If you need an icon size in your campaign text, you can set it in this parameter.
 * @param iconTint If you need an iconTint in your campaign text, you can set it in this parameter.
 * @param upperInfoText If you need a upperInfo like campaign text, you can set it in this parameter.
 * @param upperInfoTextStyle If you need a textStyle in your upperInfo text, you can set it in this parameter.
 * @param salePriceText If you need a salePrice, you can set it in this parameter.
 * @param salePriceTextStyle If you need a textStyle in your salePriceText, you can set it in this parameter.
 * @param marketPriceText If you need a marketPrice, you can set it in this parameter.
 * @param marketPriceTextStyle If you need a textStyle in your marketPriceText, you can set it in this parameter.
 * @param bottomInfoText If you need a bottomInfo like unit price, you can set it in this parameter.
 * @param bottomInfoTextStyle If you need a textStyle in your bottomInfoText, you can set it in this parameter.
 */
@Stable
@Parcelize
data class PriceModel(
    val icon: @RawValue ImageVector? = null,
    val iconSize: @RawValue IconSize = TrendyolIconSize.XXSmall,
    val iconTint: @RawValue Color? = null,
    val upperInfoText: String? = null,
    val upperInfoTextStyle: @RawValue TextStyle? = null,
    val salePriceText: String? = null,
    val salePriceTextStyle: @RawValue TextStyle? = null,
    val marketPriceText: String? = null,
    val marketPriceTextStyle: @RawValue TextStyle? = null,
    val bottomInfoText: String? = null,
    val bottomInfoTextStyle: @RawValue TextStyle? = null,
) : Parcelable
