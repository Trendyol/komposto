package com.trendyol.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

public open class TrendyolDesignTypography {

    //region Header
    //region HeaderVariants
    public open val header: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
        )
    public open val headerColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val headerColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val headerColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val headerColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val headerColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val headerColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val headerColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val headerColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region HeaderMediumVariants
    public open val headerMedium: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
        )
    public open val headerMediumColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val headerMediumColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val headerMediumColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val headerMediumColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val headerMediumColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val headerMediumColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val headerMediumColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val headerMediumColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region HeaderBoldVariants
    public open val headerBold: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
        )
    public open val headerBoldColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val headerBoldColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val headerBoldColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val headerBoldColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val headerBoldColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val headerBoldColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val headerBoldColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 20.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val headerBoldColorBlue: TextStyle
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
    public open val title: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
        )
    public open val titleColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val titleColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val titleColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val titleColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val titleColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val titleColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val titleColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val titleColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region TitleMediumVariants
    public open val titleMedium: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
        )
    public open val titleMediumColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val titleMediumColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val titleMediumColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val titleMediumColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val titleMediumColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val titleMediumColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val titleMediumColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val titleMediumColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region TitleBoldVariants
    public open val titleBold: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
        )
    public open val titleBoldColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val titleBoldColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val titleBoldColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val titleBoldColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val titleBoldColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val titleBoldColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val titleBoldColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 16.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val titleBoldColorBlue: TextStyle
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
    public open val subtitle: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
        )
    public open val subtitleColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val subtitleColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val subtitleColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val subtitleColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val subtitleColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val subtitleColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val subtitleColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val subtitleColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region SubtitleMediumVariants
    public open val subtitleMedium: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
        )
    public open val subtitleMediumColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val subtitleMediumColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val subtitleMediumColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val subtitleMediumColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val subtitleMediumColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val subtitleMediumColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val subtitleMediumColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val subtitleMediumColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region SubtitleBoldVariants
    public open val subtitleBold: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
        )
    public open val subtitleBoldColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )

    public open val subtitleBoldColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )

    public open val subtitleBoldColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val subtitleBoldColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val subtitleBoldColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val subtitleBoldColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val subtitleBoldColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 14.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val subtitleBoldColorBlue: TextStyle
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
    public open val body1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
        )
    public open val body1ColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val body1ColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val body1ColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val body1ColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val body1ColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val body1ColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val body1ColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val body1ColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region Body1MediumVariants
    public open val body1Medium: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
        )
    public open val body1MediumColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val body1MediumColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val body1MediumColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val body1MediumColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val body1MediumColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val body1MediumColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val body1MediumColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val body1MediumColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region Body1BoldVariants
    public open val body1Bold: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
        )
    public open val body1BoldColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val body1BoldColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val body1BoldColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val body1BoldColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val body1BoldColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val body1BoldColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val body1BoldColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 12.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val body1BoldColorBlue: TextStyle
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
    public open val body2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
        )
    public open val body2ColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )

    public open val body2ColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val body2ColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val body2ColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val body2ColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val body2ColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val body2ColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val body2ColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region Body2MediumVariants
    public open val body2Medium: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
        )
    public open val body2MediumColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val body2MediumColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val body2MediumColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val body2MediumColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val body2MediumColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val body2MediumColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val body2MediumColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val body2MediumColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region Body2BoldVariants
    public open val body2Bold: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
        )
    public open val body2BoldColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val body2BoldColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val body2BoldColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val body2BoldColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val body2BoldColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val body2BoldColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val body2BoldColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 10.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val body2BoldColorBlue: TextStyle
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
    public open val overLine: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
        )
    public open val overLineColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val overLineColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val overLineColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val overLineColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val overLineColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val overLineColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val overLineColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val overLineColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.regular,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region OverLineMediumVariants
    public open val overLineMedium: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
        )
    public open val overLineMediumColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val overLineMediumColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val overLineMediumColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val overLineMediumColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val overLineMediumColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val overLineMediumColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val overLineMediumColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val overLineMediumColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.medium,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )

    //endregion
    //region OverLineBoldVariants
    public open val overLineBold: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
        )
    public open val overLineBoldColorOnSurfaceVariant1: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant1
        )
    public open val overLineBoldColorOnSurfaceVariant2: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant2
        )
    public open val overLineBoldColorOnSurfaceVariant3: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnSurfaceVariant3
        )
    public open val overLineBoldColorPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorPrimary
        )
    public open val overLineBoldColorOnPrimary: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorOnPrimary
        )
    public open val overLineBoldColorWarning: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorWarning
        )
    public open val overLineBoldColorGreen: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorGreen
        )
    public open val overLineBoldColorBlue: TextStyle
        @ReadOnlyComposable
        @Composable get() = TextStyle(
            fontFamily = LocalTrendyolDesignTheme.current.fontFamily.bold,
            fontSize = 8.sp,
            color = LocalTrendyolDesignTheme.current.colors.colorBlue
        )
    //endregion
    //endregion
}
