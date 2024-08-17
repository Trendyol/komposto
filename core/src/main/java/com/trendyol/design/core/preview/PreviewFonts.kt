package com.trendyol.design.core.preview

import android.content.Context
import android.graphics.Typeface
import androidx.compose.ui.text.font.FontFamily

internal object PreviewFonts {

    fun getRobotoRegular(context: Context): FontFamily =
        FontFamily(Typeface.createFromAsset(context.assets, "fonts/roboto_regular.ttf"))


    fun getRobotoMedium(context: Context): FontFamily =
        FontFamily(Typeface.createFromAsset(context.assets, "fonts/roboto_medium.ttf"))


    fun getRobotoBold(context: Context): FontFamily =
        FontFamily(Typeface.createFromAsset(context.assets, "fonts/roboto_bold.ttf"))

}
