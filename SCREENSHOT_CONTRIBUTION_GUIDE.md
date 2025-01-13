# UI-Kit Screenshot Rule Sets

### Create an emulator with following configurations in order to align with awilix instances:
- Pixel 6
- API 32

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

```
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
- **Recording/Updating screenshots:** ./gradlew executeScreenshotTests -Precord
- **Screentshot Test Excecution:** ./gradlew executeScreenshotTests
- **Test Execution for a specific test class:** ./gradlew executeScreenshotTests -Precord -Pandroid.testInstrumentationRunnerArguments.class=text.TextWeightTest