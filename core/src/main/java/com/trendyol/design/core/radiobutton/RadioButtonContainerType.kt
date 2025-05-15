package com.trendyol.design.core.radiobutton

import androidx.compose.runtime.Composable

/**
 * Interface defining what to display after radio dot while using [TrendyolRadioButton].
 */
public interface RadioButtonContainerType {

    /**
     * Represents a RadioButton container with no additional properties. Just showing radio dot.
     */
    public interface None : RadioButtonContainerType

    /**
     * Represents a RadioButton container with a text.
     */
    public interface Text : RadioButtonContainerType {
        public val text: String
    }

    /**
     * Represents a RadioButton container with custom composable content.
     */
    public interface Content : RadioButtonContainerType {
        public val content: @Composable () -> Unit
    }
}
