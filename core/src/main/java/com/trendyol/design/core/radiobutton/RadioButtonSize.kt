package com.trendyol.design.core.radiobutton

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp

/**
 * Interface defining the size properties for [TrendyolRadioButton] components.
 */
public interface RadioButtonSize {

    /**
     * The radius of the ripple effect when the RadioButton is pressed.
     */
    public val rippleRadius: Dp

    /**
     * The size of the RadioButton button itself.
     */
    public val buttonSize: Dp

    /**
     * The size of the dot inside the RadioButton when it is selected.
     */
    public val dotSize: Dp

    /**
     * The width of the stroke outlining the RadioButton button.
     */
    public val strokeWidth: Dp

    /**
     * The text style used for [RadioButtonContainerType.Text] container type associated with RadioButton components.
     */
    @get:Composable
    public val textSize: TextStyle
}
