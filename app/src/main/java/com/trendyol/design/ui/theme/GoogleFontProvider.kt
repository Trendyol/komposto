package com.trendyol.design.ui.theme

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont

object GoogleFontProvider {

    private const val PROVIDER_AUTHORITY = "com.google.android.gms.fonts"
    private const val PROVIDER_PACKAGE = "com.google.android.gms"

    fun getGoogleFontFamily(
        name: String,
        weight: FontWeight,
        provider: GoogleFont.Provider = fontProvider,
    ): FontFamily {
        return FontFamily(
            Font(
                googleFont = GoogleFont(name),
                fontProvider = provider,
                weight = weight
            )
        )
    }

    private val fontProvider: GoogleFont.Provider =
        GoogleFont.Provider(
            providerAuthority = PROVIDER_AUTHORITY,
            providerPackage = PROVIDER_PACKAGE,
            certificates = com.trendyol.design.R.array.com_google_android_gms_fonts_certs
        )
}
