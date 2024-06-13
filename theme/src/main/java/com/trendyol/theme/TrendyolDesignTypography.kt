package com.trendyol.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

open class TrendyolDesignTypography {

    //region Header
    //region HeaderVariants
    open val header: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
        )
    open val headerColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val headerColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val headerColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val headerColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val headerColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val headerColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val headerColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region HeaderMediumVariants
    open val headerMedium: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
        )
    open val headerMediumColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val headerMediumColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val headerMediumColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val headerMediumColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val headerMediumColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val headerMediumColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val headerMediumColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region HeaderBoldVariants
    open val headerBold: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
        )
    open val headerBoldColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val headerBoldColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val headerBoldColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val headerBoldColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val headerBoldColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val headerBoldColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val headerBoldColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )
    //endregion
    //endregion

    //region Title
    //region TitleVariants
    open val title: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
        )
    open val titleColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val titleColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val titleColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val titleColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val titleColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val titleColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val titleColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region TitleMediumVariants
    open val titleMedium: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
        )
    open val titleMediumColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val titleMediumColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    open val titleMediumColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val titleMediumColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val titleMediumColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val titleMediumColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val titleMediumColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val titleMediumColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region TitleBoldVariants
    open val titleBold: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
        )
    open val titleBoldColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val titleBoldColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val titleBoldColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val titleBoldColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val titleBoldColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val titleBoldColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val titleBoldColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )
    //endregion
    //endregion

    //region Subtitle
    //region SubtitleVariants
    open val subtitle: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
        )
    open val subtitleColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val subtitleColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    open val subtitleColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val subtitleColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val subtitleColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val subtitleColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val subtitleColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val subtitleColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region SubtitleMediumVariants
    open val subtitleMedium: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
        )
    open val subtitleMediumColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val subtitleMediumColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    open val subtitleMediumColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val subtitleMediumColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val subtitleMediumColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val subtitleMediumColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val subtitleMediumColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val subtitleMediumColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region SubtitleBoldVariants
    open val subtitleBold: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
        )
    open val subtitleBoldColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )

    open val subtitleBoldColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )

    open val subtitleBoldColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val subtitleBoldColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val subtitleBoldColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val subtitleBoldColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val subtitleBoldColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val subtitleBoldColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )
    //endregion
    //endregion

    //region Body1
    //region Body1Variants
    open val body1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
        )
    open val body1ColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val body1ColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    open val body1ColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val body1ColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val body1ColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val body1ColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val body1ColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val body1ColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region Body1MediumVariants
    open val body1Medium: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
        )
    open val body1MediumColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val body1MediumColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    open val body1MediumColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val body1MediumColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val body1MediumColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val body1MediumColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val body1MediumColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val body1MediumColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region Body1BoldVariants
    open val body1Bold: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
        )
    open val body1BoldColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val body1BoldColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val body1BoldColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val body1BoldColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val body1BoldColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val body1BoldColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val body1BoldColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )
    //endregion
    //endregion

    //region Body2
    //region Body2Variants
    open val body2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
        )
    open val body2ColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )

    open val body2ColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    open val body2ColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val body2ColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val body2ColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val body2ColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val body2ColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val body2ColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region Body2MediumVariants
    open val body2Medium: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
        )
    open val body2MediumColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val body2MediumColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    open val body2MediumColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val body2MediumColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val body2MediumColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val body2MediumColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val body2MediumColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val body2MediumColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region Body2BoldVariants
    open val body2Bold: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
        )
    open val body2BoldColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val body2BoldColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val body2BoldColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val body2BoldColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val body2BoldColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val body2BoldColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val body2BoldColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )
    //endregion
    //endregion

    //region OverLine
    //region OverLineVariants
    open val overLine: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
        )
    open val overLineColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val overLineColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val overLineColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val overLineColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val overLineColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val overLineColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val overLineColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region OverLineMediumVariants
    open val overLineMedium: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
        )
    open val overLineMediumColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val overLineMediumColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val overLineMediumColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val overLineMediumColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val overLineMediumColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val overLineMediumColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val overLineMediumColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region OverLineBoldVariants
    open val overLineBold: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
        )
    open val overLineBoldColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    open val overLineBoldColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    open val overLineBoldColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    open val overLineBoldColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    open val overLineBoldColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    open val overLineBoldColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    open val overLineBoldColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )
    //endregion
    //endregion
}
