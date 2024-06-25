package statelayout.loading

import com.trendyol.design.core.statelayout.State
import com.trendyol.design.core.statelayout.StateComposeLayout
import com.trendyol.design.core.statelayout.states.loading.LoadingType
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class ContentWithLoadingTests : DesignScreenshotTest() {

    private val contents = listOf(
        DesignScreenshotTestContainer("Circular Loading") {
            BoxWithHorizontalPadding {
                StateComposeLayout(state = State.ContentWithLoading(LoadingType.Circular))
            }
            Thread.sleep(15000)
        },
        DesignScreenshotTestContainer("Progressive Loading") {
            BoxWithHorizontalPadding {
                StateComposeLayout(state = State.ContentWithLoading(LoadingType.Progressive))
            }
            Thread.sleep(15000)
        }

    )

    @Test
    fun circularLoadingTests() = runScreenShotTest(
        testName = "Content With Loading Tests",
        contents = contents
    )
}