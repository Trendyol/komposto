# UI-Kit Screenshot Rule Sets

### Create an emulator with following configurations in order to align with awilix instances:
- Pixel 6
- API 32

## For External Contributors (Fork PRs)

**Important:** Screenshots must always be generated on CI to ensure consistency across different platforms. Never generate screenshots locally!

When your PR fails screenshot tests, you have two options:

### Option 1: Automatic Update (Recommended)
1. Go to the **Actions** tab in your fork repository
2. Select **"Update Screenshots (For Forks)"** workflow
3. Click **"Run workflow"** button
4. Select your branch from the dropdown
5. Click the green **"Run workflow"** button
6. Wait for the workflow to complete (~5-10 minutes)
7. Screenshots will be automatically committed to your branch
8. Your PR will be updated automatically

### Option 2: Manual Download
1. Download the `screenshot-test-results` artifact from the failed workflow run
2. Extract the `app/screenshots/debug/` folder to your local repository
3. Commit and push the screenshots to your branch

---

We can consider the following items to create a rule set that guides those who will write a screenshot test of a new component. This set will be a step-by-step guide and guideline, so that even beginners can write component screenshot tests correctly and consistently.
Android Screenshot Test Rule Set:
### 1. Follow Test Name Standards
**Test name should be meaningful:** Choose a meaningful name that will give information about the purpose and component of your screenshot test.
**Recommended Name Structure:** ```{ComponentName}_{Property}_{Status}```
Example: ```Button_Disabled_LargeSize``` or ```Toolbar_WithIcons```
### 2. Cover Component Styles
Test components in different styles. Create a separate test case for each style.
Example: Test a toolbar in different styles like ```EndIcon, TextButton, None```.
### 3. Pay Attention to Component Sizes
If the component has different size options (e.g. small, medium, large button), write a separate screenshot test for each of these sizes.
Sizes are important because they are critical for UI consistency and verifying the space it takes up on the screen.
Example: ```Button_SmallSize, Button_LargeSize```.
### 4. Test Component States
Test every state that the component can interact with (active, passive, error state, etc.).
Example: Test the states of a button like ```Enabled, Disabled, Loading```.

When testing states, make sure to properly represent each state.
### 5. Pay Attention to Test Case Design
Each test case should be simple and independent. Be careful not to mix different scenarios.
Instead of trying multiple scenarios in a single test, write each scenario as a separate test. This makes the tests cleaner and bugs easier to track.
### 6. Don't Ignore Screen Sizes and DPI Scope
Test on devices with different screen resolutions to verify how the component looks for different device sizes and DPI options.
These tests are especially important for responsive UI.
### 7. Test Component-Specific Parameters
Test how components look with different parameters. For example, you can test different combinations of ```text, icon``` or ```backgroundColor``` for a button.

Example: ```Button_WithIcon, Button_WithTextOnly```.
### 8. Take Screenshots as Test Results
Don't forget to take screenshots for each component in your tests. Make sure that the screenshot you take is rendered correctly and completely.
Take a screenshot at the end of the test and save the result to the folder you specified.
### 9. Write Stateless Tests
Each test should be independent and should not depend on other tests or the global state. Each test should be able to run on its own.

Tests that rely on a global state make debugging difficult.
### 10. Avoid Code Duplication
Create reusable functions for different states of the same component. This way, you can avoid writing duplicate code.

Example: Using a single function ```runToolbarScreenshotTest``` for a toolbar test with different styles.
### 11. Verify Test Results (Assertion)
If possible, use assertions to verify that the screenshots you take match expectations. However, this can also mean manual visual inspection, especially during UI changes.
Scope of Rule Set Sample Test Code:
kotlin

```kotlin
@Test
fun buttonStatesTest() {
    runScreenShotTest(
        testName = "Button_Disabled_SmallSize",
        contents = listOf(
            DesignScreenshotTestContainer("DisabledSmall") {
                Button(
                    text = "Disabled",
                    enabled = false,
                    size = ButtonSize.Small,
                    onClick = { }
                )
            },
            DesignScreenshotTestContainer("EnabledMedium") {
                Button(
                    text = "Enabled",
                    enabled = true,
                    size = ButtonSize.Medium,
                    onClick = { }
                )
            }
        )
    )
}
```

This rule set covers the basic points to be considered when writing screenshot tests for components and guides test writers.

*Gradle Commands:*
- **Screenshot Test Execution:** ./gradlew executeScreenshotTests
- **Test Execution for a specific test class:** ./gradlew executeScreenshotTests -Pandroid.testInstrumentationRunnerArguments.class=text.TextWeightTest