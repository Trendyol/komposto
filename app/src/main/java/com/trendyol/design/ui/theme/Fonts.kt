package com.trendyol.design.ui.theme

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
            certificates = R.array.com_google_android_gms_fonts_certs,
        )

    val RobotoRegular = GoogleFontProvider.getGoogleFontFamily("Roboto", FontWeight.Normal, fontProvider)
    val RobotoMedium = GoogleFontProvider.getGoogleFontFamily("Roboto", FontWeight.Medium, fontProvider)
    val RobotoSemiBold = GoogleFontProvider.getGoogleFontFamily("Roboto", FontWeight.SemiBold, fontProvider)
    val RobotoBold = GoogleFontProvider.getGoogleFontFamily("Roboto", FontWeight.Bold, fontProvider)
}
