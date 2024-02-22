package com.trendyol.design.ui.theme

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.GoogleFont
import com.trendyol.design.R

object Fonts {

    private const val PROVIDER_AUTHORITY = "com.google.android.gms.fonts"
    private const val PROVIDER_PACKAGE = "com.google.android.gms"

    // You may comment out this if you don't have any font certificate.
    private val fontProvider: GoogleFont.Provider =
        GoogleFont.Provider(
            providerAuthority = PROVIDER_AUTHORITY,
            providerPackage = PROVIDER_PACKAGE,
            certificates = -1,
        )

    val RobotoRegular = GoogleFontProvider.getGoogleFontFamily("Roboto", FontWeight.Normal, fontProvider)
        ?: FontFamily.Default

    val RobotoMedium = GoogleFontProvider.getGoogleFontFamily("Roboto", FontWeight.Medium, fontProvider)
        ?: FontFamily.Default

    val RobotoSemiBold = GoogleFontProvider.getGoogleFontFamily("Roboto", FontWeight.SemiBold, fontProvider)
        ?: FontFamily.Default

    val RobotoBold = GoogleFontProvider.getGoogleFontFamily("Roboto", FontWeight.Bold, fontProvider)
        ?: FontFamily.Default
}
