package com.trendyol.design.core.statelayout

import android.os.Parcelable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.vector.ImageVector
import com.trendyol.design.core.icon.StateLayoutIconSize
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Stable
@Parcelize
public data class InfoModel(
    val title: String? = null,
    val description: String? = null,
    val image: @RawValue ImageVector? = null,
    val iconSize: @RawValue StateLayoutIconSize,
    val buttonsInfoModel: ButtonsInfoModel? = null,
) : Parcelable

@Stable
@Parcelize
public data class ButtonsInfoModel(
    val primaryButtonText: String? = null,
    val secondaryButtonText: String? = null,
    val primaryButtonClickListener: (() -> Unit)? = null,
    val secondaryButtonClickListener: (() -> Unit)? = null,
) : Parcelable
