package com.trendyol.design.core.inputfield.email

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

/**
 * Visual transformation for transforming text input into email format.
 *
 * This transformation suggests email format based on the input text and applies the suggestion.
 */
internal class EmailVisualTransformation : VisualTransformation {

    override fun filter(text: AnnotatedString): TransformedText {
        val currentText = text.text
        val emailSuggestion = SuggestEmailProviderUtil.suggest(currentText)
        return if (currentText != emailSuggestion.text) {
            TransformedText(
                emailSuggestion,
                object : OffsetMapping {
                    override fun originalToTransformed(offset: Int): Int {
                        return offset
                    }

                    override fun transformedToOriginal(offset: Int): Int {
                        return currentText.length
                    }
                },
            )
        } else {
            TransformedText(
                text,
                OffsetMapping.Identity,
            )
        }
    }
}
