package boxbadge

import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.badge.boxbadge.BoxBadge
import com.trendyol.design.core.badge.boxbadge.KPBoxBadge
import com.trendyol.design.core.badge.boxbadge.KPBoxBadgeType
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class SingleBadgesTest(
    private val badgeType: BoxBadge,
    private val badgeName: String
) : DesignScreenshotTest() {

    @OptIn(ExperimentalKompostoApi::class)
    @Test
    fun badgeTest() = runScreenShotTest(
        testName = "${badgeName}BadgeTest",
        contents = listOf(
            DesignScreenshotTestContainer(badgeName) {
                BoxWithHorizontalPadding {
                    KPBoxBadge(badgeType)
                }
            }
        )
    )

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{1}")
        fun badgeData(): Collection<Array<Any>> {
            return listOf(
                arrayOf(KPBoxBadgeType.Defaults.Coupon(), "Coupon"),
                arrayOf(KPBoxBadgeType.Defaults.FreeDelivery(), "FreeDelivery"),
                arrayOf(KPBoxBadgeType.Defaults.FastDelivery(), "FastDelivery"),
                arrayOf(KPBoxBadgeType.Defaults.BuyMorePayLess(), "BuyMorePayLess"),
                arrayOf(KPBoxBadgeType.Defaults.BuyTogether(), "BuyTogether"),
                arrayOf(KPBoxBadgeType.Defaults.Video(), "Video"),
                arrayOf(KPBoxBadgeType.Defaults.TodayDelivery(), "TodayDelivery"),
                arrayOf(KPBoxBadgeType.Defaults.Credit(), "Credit"),
                arrayOf(KPBoxBadgeType.Defaults.InfluencerChoice(), "InfluencerChoice")
            )
        }
    }
}