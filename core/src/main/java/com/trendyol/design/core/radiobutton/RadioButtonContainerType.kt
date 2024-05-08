package com.trendyol.design.core.radiobutton

import androidx.compose.runtime.Composable

/**
 * Interface defining what to display after radio dot while using [TrendyolRadioButton].
 */
interface RadioButtonContainerType {

    /**
     * Represents a RadioButton container with no additional properties. Just showing radio dot.
     */
    interface None : RadioButtonContainerType

    /**
     * Represents a RadioButton container with a text.
     */
    interface Text : RadioButtonContainerType {
        val text: String
    }

    /**
     * Represents a RadioButton container with custom composable content.
     */
    interface Content : RadioButtonContainerType {
        val content: @Composable () -> Unit
    }
}
