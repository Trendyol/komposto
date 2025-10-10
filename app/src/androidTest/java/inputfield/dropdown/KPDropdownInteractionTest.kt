@file:OptIn(ExperimentalKompostoApi::class)

package inputfield.dropdown

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.click
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.longClick
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performTouchInput
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.inputfield.KPDropdown
import com.trendyol.design.core.inputfield.KPDropdownStyle
import com.trendyol.design.ui.theme.TrendyolTheme
import core.InteractionTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test

@InteractionTest
class KPDropdownInteractionTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun dropdown_singleClick_triggersOnClickOnce() {
        // Arrange
        var clickCount = 0
        
        composeTestRule.setContent {
            TrendyolTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    KPDropdown(
                        modifier = Modifier.testTag("dropdown"),
                        style = KPDropdownStyle.Filled,
                        value = "Test Value",
                        onClick = { clickCount++ }
                    )
                }
            }
        }

        // Act - Perform a normal click
        composeTestRule.onNodeWithTag("dropdown")
            .performTouchInput {
                click() 
            }

        // Give it time to process the interaction
        composeTestRule.waitForIdle()

        // Assert - onClick should be called exactly once
        assertEquals("Single click should trigger onClick exactly once", 1, clickCount)
    }

    @Test
    fun dropdown_longPress_triggersOnClickOnlyOnce() {
        // Arrange
        var clickCount = 0
        
        composeTestRule.setContent {
            TrendyolTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    KPDropdown(
                        modifier = Modifier.testTag("dropdown"),
                        style = KPDropdownStyle.Filled,
                        value = "Test Value",
                        onClick = { clickCount++ }
                    )
                }
            }
        }

        // Act - Perform a long press
        composeTestRule.onNodeWithTag("dropdown")
            .performTouchInput { 
                longClick() // This is the key test for the bug fix!
            }

        // Give it time to process the interaction
        composeTestRule.waitForIdle()

        // Assert - onClick should be called exactly once, not multiple times
        assertEquals("Long press should trigger onClick exactly once", 1, clickCount)
    }

    @Test
    fun dropdown_pressAndDrag_triggersOnClickOnce() {
        // Arrange
        var clickCount = 0
        
        composeTestRule.setContent {
            TrendyolTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    KPDropdown(
                        modifier = Modifier.testTag("dropdown"),
                        style = KPDropdownStyle.Filled,
                        value = "Test Value",
                        onClick = { clickCount++ }
                    )
                }
            }
        }

        // Act - Press down, drag away, then release
        composeTestRule.onNodeWithTag("dropdown")
            .performTouchInput {
                down(center)
                moveBy(delta = Offset(100f, 100f))
                up()
            }

        // Give it time to process the interaction
        composeTestRule.waitForIdle()

        // Assert - Dragging triggers Cancel event, which should trigger onClick once
        // This is expected behavior for a dropdown - any press completion should open it
        assertEquals("Press and drag should trigger onClick once (via Cancel)", 1, clickCount)
    }

    @Test
    fun dropdown_multipleClicks_eachTriggersOnClickOnce() {
        // Arrange
        var clickCount = 0
        
        composeTestRule.setContent {
            TrendyolTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    KPDropdown(
                        modifier = Modifier.testTag("dropdown"),
                        style = KPDropdownStyle.Filled,
                        value = "Test Value",
                        onClick = { clickCount++ }
                    )
                }
            }
        }

        // Act - Perform 3 separate clicks
        repeat(3) {
            composeTestRule.onNodeWithTag("dropdown")
                .performTouchInput { click() }
            composeTestRule.waitForIdle()
        }

        // Assert - Each click should increment exactly once
        assertEquals("Three clicks should trigger onClick three times", 3, clickCount)
    }

    @Test
    fun dropdown_pressWithoutCompletion_doesNotTriggerOnClick() {
        // Arrange
        var clickCount = 0
        
        composeTestRule.setContent {
            TrendyolTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    KPDropdown(
                        modifier = Modifier.testTag("dropdown"),
                        style = KPDropdownStyle.Filled,
                        value = "Test Value",
                        onClick = { clickCount++ }
                    )
                }
            }
        }

        // Act - Press down but never complete (no up or cancel)
        composeTestRule.onNodeWithTag("dropdown")
            .performTouchInput {
                down(center)
                // Note: no up() call - press is never completed
            }

        // Give it time to process the interaction
        composeTestRule.waitForIdle()

        // Assert - onClick should NOT be triggered without press completion
        // Only Release or Cancel should trigger onClick
        assertEquals("Press without completion should not trigger onClick", 0, clickCount)
    }

    @Test
    fun debugTest_whatInteractionsAreEmittedDuringLongPress() {
        // This is a diagnostic test to see what interactions are emitted
        val emittedInteractions = mutableListOf<String>()
        
        composeTestRule.setContent {
            TrendyolTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    val interactionSource = remember { MutableInteractionSource() }
                    
                    // Collect all interactions for debugging
                    LaunchedEffect(interactionSource) {
                        interactionSource.interactions.collect { interaction ->
                            val interactionName = when (interaction) {
                                is PressInteraction.Press -> "Press"
                                is PressInteraction.Release -> "Release"
                                is PressInteraction.Cancel -> "Cancel"
                                else -> interaction::class.simpleName ?: "Unknown"
                            }
                            emittedInteractions.add(interactionName)
                            println("Interaction emitted: $interactionName")
                        }
                    }
                    
                    KPDropdown(
                        modifier = Modifier.testTag("dropdown"),
                        style = KPDropdownStyle.Filled,
                        value = "Test Value",
                        interactionSource = interactionSource,
                        onClick = { }
                    )
                }
            }
        }

        // Perform long press
        composeTestRule.onNodeWithTag("dropdown")
            .performTouchInput { 
                longClick() 
            }

        composeTestRule.waitForIdle()

        // Print what was emitted
        println("=== Interactions emitted during longClick(): $emittedInteractions ===")
        
        // This test will show us what's actually happening
        assertTrue(
            "Should have emitted at least one interaction, got: $emittedInteractions",
            emittedInteractions.isNotEmpty()
        )
    }
}

