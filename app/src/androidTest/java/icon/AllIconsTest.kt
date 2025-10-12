package icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.ArrowDown
import com.trendyol.design.core.icon.icons.fill.Basket
import com.trendyol.design.core.icon.icons.fill.Bullet
import com.trendyol.design.core.icon.icons.fill.Campaign
import com.trendyol.design.core.icon.icons.fill.CampaignDownArrow
import com.trendyol.design.core.icon.icons.fill.Cancel
import com.trendyol.design.core.icon.icons.fill.Cargo
import com.trendyol.design.core.icon.icons.fill.CircleIcon
import com.trendyol.design.core.icon.icons.fill.Colon
import com.trendyol.design.core.icon.icons.fill.Coupon
import com.trendyol.design.core.icon.icons.fill.Credit
import com.trendyol.design.core.icon.icons.fill.Delivery
import com.trendyol.design.core.icon.icons.fill.FavoriteSelected
import com.trendyol.design.core.icon.icons.fill.FenomenGradient
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.icon.icons.fill.InfoIcon
import com.trendyol.design.core.icon.icons.fill.PauseButton
import com.trendyol.design.core.icon.icons.fill.Percentage
import com.trendyol.design.core.icon.icons.fill.PlayButton
import com.trendyol.design.core.icon.icons.fill.PlayGradient
import com.trendyol.design.core.icon.icons.fill.RunningOut
import com.trendyol.design.core.icon.icons.fill.SaveSelected
import com.trendyol.design.core.icon.icons.fill.Search
import com.trendyol.design.core.icon.icons.fill.Share
import com.trendyol.design.core.icon.icons.fill.Star
import com.trendyol.design.core.icon.icons.fill.StateOrder
import com.trendyol.design.core.icon.icons.fill.StatePin
import com.trendyol.design.core.icon.icons.fill.StateRefresh
import com.trendyol.design.core.icon.icons.fill.StateWarningInfoDefault
import com.trendyol.design.core.icon.icons.fill.Tick
import com.trendyol.design.core.icon.icons.fill.Trash
import com.trendyol.design.core.icon.icons.outline.*
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
internal class AllIconsTest(
    private val iconName: String,
    private val icon: ImageVector,
) : DesignScreenshotTest() {

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() = listOf(
            arrayOf("ArrowDown", KPIcons.Fill.ArrowDown),
            arrayOf("Basket", KPIcons.Fill.Basket),
            arrayOf("Bullet", KPIcons.Fill.Bullet),
            arrayOf("Campaign", KPIcons.Fill.Campaign),
            arrayOf("CampaignDownArrow", KPIcons.Fill.CampaignDownArrow),
            arrayOf("Cancel", KPIcons.Fill.Cancel),
            arrayOf("Cargo", KPIcons.Fill.Cargo),
            arrayOf("CircleIcon", KPIcons.Fill.CircleIcon),
            arrayOf("Colon", KPIcons.Fill.Colon),
            arrayOf("Coupon", KPIcons.Fill.Coupon),
            arrayOf("Credit", KPIcons.Fill.Credit),
            arrayOf("Delivery", KPIcons.Fill.Delivery),
            arrayOf("FavoriteSelected", KPIcons.Fill.FavoriteSelected),
            arrayOf("FenomenGradient", KPIcons.Fill.FenomenGradient),
            arrayOf("Help", KPIcons.Fill.Help),
            arrayOf("InfoIcon", KPIcons.Fill.InfoIcon),
            arrayOf("PauseButton", KPIcons.Fill.PauseButton),
            arrayOf("Percentage", KPIcons.Fill.Percentage),
            arrayOf("PlayButton", KPIcons.Fill.PlayButton),
            arrayOf("PlayGradient", KPIcons.Fill.PlayGradient),
            arrayOf("RunningOut", KPIcons.Fill.RunningOut),
            arrayOf("SaveSelected", KPIcons.Fill.SaveSelected),
            arrayOf("Search", KPIcons.Fill.Search),
            arrayOf("Share", KPIcons.Fill.Share),
            arrayOf("Star", KPIcons.Fill.Star),
            arrayOf("StateOrder", KPIcons.Fill.StateOrder),
            arrayOf("StatePin", KPIcons.Fill.StatePin),
            arrayOf("StateRefresh", KPIcons.Fill.StateRefresh),
            arrayOf("Tick", KPIcons.Fill.Tick),
            arrayOf("Trash", KPIcons.Fill.Trash),
            arrayOf("WarningInfoStateDefaultIcon", KPIcons.Fill.StateWarningInfoDefault),
            arrayOf("Back", KPIcons.Outline.Back),
            arrayOf("Cancel", KPIcons.Outline.Cancel),
            arrayOf("Chevron", KPIcons.Outline.Chevron),
            arrayOf("ErrorState", KPIcons.Outline.ErrorState),
            arrayOf("FavoriteUnselected", KPIcons.Outline.FavoriteUnselected),
            arrayOf("Info", KPIcons.Outline.Info),
            arrayOf("SaveUnselected", KPIcons.Outline.SaveUnselected),
            arrayOf("StateCaution", KPIcons.Outline.StateCaution),
            arrayOf("SuccessState", KPIcons.Outline.SuccessState),
            arrayOf("Union", KPIcons.Outline.Union),
        )
    }

    @Test
    fun iconTest() {
        val testName = "$iconName Icon Tests"
        val contents = iconContainers(icon, Color.Unspecified)

        runScreenShotTest(
            testName = testName,
            contents = contents
        )
    }

    private fun iconContainers(icon: ImageVector, tint: Color): List<DesignScreenshotTestContainer> {
        return listOf(
            DesignScreenshotTestContainer("XXSmall") {
                BoxWithHorizontalPadding {
                    KPIcon(imageVector = icon, size = KPIconSize.XXSmall, tint = tint)
                }
            },
            DesignScreenshotTestContainer("XSmall") {
                BoxWithHorizontalPadding {
                    KPIcon(imageVector = icon, size = KPIconSize.XSmall, tint = tint)
                }
            },
            DesignScreenshotTestContainer("Small") {
                BoxWithHorizontalPadding {
                    KPIcon(imageVector = icon, size = KPIconSize.Small, tint = tint)
                }
            },
            DesignScreenshotTestContainer("Medium") {
                BoxWithHorizontalPadding {
                    KPIcon(imageVector = icon, size = KPIconSize.Medium, tint = tint)
                }
            },
            DesignScreenshotTestContainer("Large") {
                BoxWithHorizontalPadding {
                    KPIcon(imageVector = icon, size = KPIconSize.Large, tint = tint)
                }
            },
            DesignScreenshotTestContainer("XLarge") {
                BoxWithHorizontalPadding {
                    KPIcon(imageVector = icon, size = KPIconSize.XLarge, tint = tint)
                }
            },
            DesignScreenshotTestContainer("XXLarge") {
                BoxWithHorizontalPadding {
                    KPIcon(imageVector = icon, size = KPIconSize.XXLarge, tint = tint)
                }
            },
            DesignScreenshotTestContainer("XXXLarge") {
                BoxWithHorizontalPadding {
                    KPIcon(imageVector = icon, size = KPIconSize.XXXLarge, tint = tint)
                }
            }
        )
    }
}
