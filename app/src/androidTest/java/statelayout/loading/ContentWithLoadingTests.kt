package statelayout.loading

import com.trendyol.design.core.statelayout.State
import com.trendyol.design.core.statelayout.StateComposeLayout
import com.trendyol.design.core.statelayout.states.loading.LoadingType
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class ContentWithLoadingTests : DesignScreenshotTest() {

    @Test
    fun circularLoadingTests() = runScreenShotTest(
        testName = "Circular Loading Tests",
        contents = listOf(
            DesignScreenshotTestContainer("Circular Loading") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(state = State.ContentWithLoading(LoadingType.Circular))
                }
            }
        )
    )

    @Test
    fun progressiveLoadingTests() = runScreenShotTest(
        testName = "Progressive Loading Tests",
        contents = listOf(
            DesignScreenshotTestContainer("Progressive Loading") {
                BoxWithHorizontalPadding {
                    StateComposeLayout(state = State.ContentWithLoading(LoadingType.Progressive))
                }
            }
        )
    )
}