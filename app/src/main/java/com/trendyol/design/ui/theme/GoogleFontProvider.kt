package com.trendyol.design.ui.theme

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont

object GoogleFontProvider {

    fun getGoogleFontFamily(
        name: String,
        weight: FontWeight,
        provider: GoogleFont.Provider? = null,
    ): FontFamily? {
        return provider?.let {
            FontFamily(
                Font(
                    googleFont = GoogleFont(name),
                    fontProvider = provider,
                    weight = weight
                )
            )
        }
    }
}
