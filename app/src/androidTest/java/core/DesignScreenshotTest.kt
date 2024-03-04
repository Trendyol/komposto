package core

import androidx.compose.runtime.Composable
import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import com.karumi.shot.ScreenshotTest
import com.trendyol.design.ui.theme.TrendyolTheme
import org.junit.Rule

internal abstract class DesignScreenshotTest : ScreenshotTest {

    @get:Rule
    internal val composeTestRule: ComposeContentTestRule = createComposeRule()

    internal fun runScreenShotTest(
        testName: String,
        node: SemanticsNodeInteraction = composeTestRule.onRoot(),
        content: @Composable () -> Unit,
    ) {
        createTestEnvironment(
            composeTestRule = composeTestRule,
            content = content
        )
        compareScreenshot(
            node = node,
            name = testName
        )
    }

    internal fun runScreenShotTest(
        testName: String,
        node: SemanticsNodeInteraction = composeTestRule.onRoot(),
        contents: List<DesignScreenshotTestContainer>,
    ) {
        runScreenShotTest(testName = testName, node = node) {
            DesignScreenshotTestScreen(title = testName, containers = contents)
        }
    }

    private fun createTestEnvironment(
        composeTestRule: ComposeContentTestRule,
        content: @Composable () -> Unit
    ) {
        composeTestRule.setContent {
            TrendyolTheme {
                content()
            }
        }
    }
}