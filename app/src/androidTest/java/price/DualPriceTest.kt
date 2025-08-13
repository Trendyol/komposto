@file:OptIn(ExperimentalKompostoApi::class)

package price

import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Basket
import com.trendyol.design.core.icon.icons.fill.CampaignDownArrow
import com.trendyol.design.core.price.KPPrice
import com.trendyol.design.core.price.KPPriceStyle
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.KPDesign
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class DualPriceTest : DesignScreenshotTest() {

    @Test
    fun verticalDualPrice() = runScreenShotTest(
        testName = "verticalDualPrice",
        contents = listOf(
            DesignScreenshotTestContainer("Vertical Dual Price") {
                TrendyolTheme {
                    KPPrice(
                        style = KPPriceStyle.DualPrice(
                            salePriceText = "999999.90 TL",
                            marketPriceText = "999999.90 TL",
                            salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                            marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                            isPriceViewVertical = true
                        )
                    )
                }
            },
        )
    )

    @Test
    fun horizontalDualPrice() = runScreenShotTest(
        testName = "horizontalDualPrice",
        contents = listOf(
            DesignScreenshotTestContainer("Horizontal Dual Price") {
                TrendyolTheme {
                    KPPrice(
                        style = KPPriceStyle.DualPrice(
                            salePriceText = "999999.90 TL",
                            marketPriceText = "999999.90 TL",
                            salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                            marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                            isPriceViewVertical = false
                        )
                    )
                }
            },
        )
    )

    @Test
    fun verticalDualPriceWithBottomInfo() = runScreenShotTest(
        testName = "verticalDualPriceWithBottomInfo",
        contents = listOf(
            DesignScreenshotTestContainer("Vertical Dual Price With Bottom Info") {
                TrendyolTheme {
                    KPPrice(
                        style = KPPriceStyle.DualPriceWithBottomInfo(
                            salePriceText = "999999.90 TL",
                            salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                            bottomInfoText = "(99.90 TL / Kapsül)",
                            bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary,
                            marketPriceText = "999999.90 TL",
                            marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                            isPriceViewVertical = true
                        )
                    )
                }
            },
        )
    )

    @Test
    fun horizontalDualPriceWithBottomInfo() = runScreenShotTest(
        testName = "horizontalDualPriceWithBottomInfo",
        contents = listOf(
            DesignScreenshotTestContainer("Horizontal Dual Price With Bottom Info") {
                TrendyolTheme {
                    KPPrice(
                        style = KPPriceStyle.DualPriceWithBottomInfo(
                            salePriceText = "999999.90 TL",
                            salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                            bottomInfoText = "(99.90 TL / Kapsül)",
                            bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary,
                            marketPriceText = "999999.90 TL",
                            marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                            isPriceViewVertical = false
                        )
                    )
                }
            },
        )
    )

    @Test
    fun verticalDualPriceWithUpperInfoBasket() = runScreenShotTest(
        testName = "verticalDualPriceWithUpperInfoBasket",
        contents = listOf(
            DesignScreenshotTestContainer("Vertical Dual Price With Upper Info-Basket Campaign") {
                TrendyolTheme {
                    KPPrice(
                        style = KPPriceStyle.DualPriceWithUpperInfo(
                            salePriceText = "999999.90 TL",
                            salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                            upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                            upperInfoText = "9999 TL’ye 999 TL İndirim",
                            icon = KPIcons.Fill.Basket,
                            iconSize = KPIconSize.XXSmall,
                            iconTint = KPDesign.colors.colorPrimary,
                            marketPriceText = "999999.90 TL",
                            marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                            isPriceViewVertical = true
                        )
                    )
                }
            },
        )
    )

    @Test
    fun horizontalDualPriceWithUpperInfoBasket() = runScreenShotTest(
        testName = "horizontalDualPriceWithUpperInfoBasket",
        contents = listOf(
            DesignScreenshotTestContainer("Horizontal Dual Price With Upper Info-Basket Campaign") {
                TrendyolTheme {
                    KPPrice(
                        style = KPPriceStyle.DualPriceWithUpperInfo(
                            salePriceText = "999999.90 TL",
                            salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                            upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                            upperInfoText = "9999 TL’ye 999 TL İndirim",
                            icon = KPIcons.Fill.Basket,
                            iconSize = KPIconSize.XXSmall,
                            iconTint = KPDesign.colors.colorPrimary,
                            marketPriceText = "999999.90 TL",
                            marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                            isPriceViewVertical = false
                        )
                    )
                }
            },
        )
    )

    @Test
    fun verticalDualPriceWithUpperInfoLowestPriceCampaign() = runScreenShotTest(
        testName = "verticalDualPriceWithUpperInfoLowestPriceCampaign",
        contents = listOf(
            DesignScreenshotTestContainer("Vertical Dual Price With Upper Info-Lowest Price Campaign") {
                TrendyolTheme {
                    KPPrice(
                        style = KPPriceStyle.DualPriceWithUpperInfo(
                            salePriceText = "999999.90 TL",
                            salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                            upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                            upperInfoText = "Son 30 Günün En Düşük Fiyatı",
                            icon = KPIcons.Fill.CampaignDownArrow,
                            iconSize = KPIconSize.XXSmall,
                            iconTint = KPDesign.colors.colorWarning,
                            marketPriceText = "999999.90 TL",
                            marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                            isPriceViewVertical = true
                        )
                    )
                }
            },
        )
    )

    @Test
    fun horizontalDualPriceWithUpperInfoLowestPriceCampaign() = runScreenShotTest(
        testName = "horizontalDualPriceWithUpperInfoLowestPriceCampaign",
        contents = listOf(
            DesignScreenshotTestContainer("Horizontal Dual Price With Upper Info-Lowest Price Campaign") {
                TrendyolTheme {
                    KPPrice(
                        style = KPPriceStyle.DualPriceWithUpperInfo(
                            salePriceText = "999999.90 TL",
                            salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                            upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                            upperInfoText = "Son 30 Günün En Düşük Fiyatı",
                            icon = KPIcons.Fill.CampaignDownArrow,
                            iconSize = KPIconSize.XXSmall,
                            iconTint = KPDesign.colors.colorWarning,
                            marketPriceText = "999999.90 TL",
                            marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                            isPriceViewVertical = false
                        )
                    )
                }
            },
        )
    )

    @Test
    fun verticalDualPriceWithUpperAndBottomInfoBasketCampaign() = runScreenShotTest(
        testName = "verticalDualPriceWithUpperAndBottomInfoBasketCampaign",
        contents = listOf(
            DesignScreenshotTestContainer("Vertical Dual Price With Upper And Bottom Info-Basket Campaign") {
                TrendyolTheme {
                    KPPrice(
                        style = KPPriceStyle.DualPriceWithUpperAndBottomInfo(
                            salePriceText = "999999.90 TL",
                            salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                            upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                            upperInfoText = "9999 TL’ye 999 TL İndirim",
                            icon = KPIcons.Fill.Basket,
                            iconSize = KPIconSize.XXSmall,
                            iconTint = KPDesign.colors.colorPrimary,
                            bottomInfoText = "(99.90 TL / Kapsül)",
                            bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary,
                            marketPriceText = "999999.90 TL",
                            marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                            isPriceViewVertical = true
                        )
                    )
                }
            },
        )
    )

    @Test
    fun horizontalDualPriceWithUpperAndBottomInfoBasketCampaign() = runScreenShotTest(
        testName = "horizontalDualPriceWithUpperAndBottomInfoBasketCampaign",
        contents = listOf(
            DesignScreenshotTestContainer("Horizontal Dual Price With Upper And Bottom Info-Basket Campaign") {
                TrendyolTheme {
                    KPPrice(
                        style = KPPriceStyle.DualPriceWithUpperAndBottomInfo(
                            salePriceText = "999999.90 TL",
                            salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                            upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                            upperInfoText = "9999 TL’ye 999 TL İndirim",
                            icon = KPIcons.Fill.Basket,
                            iconSize = KPIconSize.XXSmall,
                            iconTint = KPDesign.colors.colorPrimary,
                            bottomInfoText = "(99.90 TL / Kapsül)",
                            bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary,
                            marketPriceText = "999999.90 TL",
                            marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                            isPriceViewVertical = false
                        )
                    )
                }
            },
        )
    )

    @Test
    fun verticalDualPriceWithUpperAndBottomInfoLowestPriceCampaign() = runScreenShotTest(
        testName = "verticalDualPriceWithUpperAndBottomInfoLowestPriceCampaign",
        contents = listOf(
            DesignScreenshotTestContainer("Vertical Dual Price With Upper And Bottom Info-Lowest Price Campaign") {
                TrendyolTheme {
                    KPPrice(
                        style = KPPriceStyle.DualPriceWithUpperAndBottomInfo(
                            salePriceText = "999999.90 TL",
                            salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                            upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                            upperInfoText = "9999 TL’ye 999 TL İndirim",
                            iconSize = KPIconSize.XXSmall,
                            iconTint = KPDesign.colors.colorWarning,
                            icon = KPIcons.Fill.CampaignDownArrow,
                            bottomInfoText = "(99.90 TL / Kapsül)",
                            bottomInfoTextStyle = KPDesign.typography.body2ColorWarning,
                            marketPriceText = "999999.90 TL",
                            marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                            isPriceViewVertical = true
                        )
                    )
                }
            },
        )
    )

    @Test
    fun horizontalDualPriceWithUpperAndBottomInfoLowestPriceCampaign() = runScreenShotTest(
        testName = "horizontalDualPriceWithUpperAndBottomInfoLowestPriceCampaign",
        contents = listOf(
            DesignScreenshotTestContainer("Horizontal Dual Price With Upper And Bottom Info-Lowest Price Campaign") {
                TrendyolTheme {
                    KPPrice(
                        style = KPPriceStyle.DualPriceWithUpperAndBottomInfo(
                            salePriceText = "999999.90 TL",
                            salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                            upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                            upperInfoText = "9999 TL’ye 999 TL İndirim",
                            iconSize = KPIconSize.XXSmall,
                            iconTint = KPDesign.colors.colorWarning,
                            icon = KPIcons.Fill.CampaignDownArrow,
                            bottomInfoText = "(99.90 TL / Kapsül)",
                            bottomInfoTextStyle = KPDesign.typography.body2ColorWarning,
                            marketPriceText = "999999.90 TL",
                            marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                            isPriceViewVertical = false
                        )
                    )
                }
            },
        )
    )
}