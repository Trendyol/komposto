package com.trendyol.design.core.inputfield.email

import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.inputfield.KPOutlinedTextField
import com.trendyol.design.core.inputfield.KPOutlinedTextFieldStyle
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign

/**
 * Composable function representing an email input field with customizable appearance and behavior tailored for the
 * Komposto theme.
 *
 * @param email The current value of the email input field.
 * @param onValueChange Callback invoked when the value of the email input field changes.
 * @param modifier Optional [Modifier] that can be applied to the input field.
 * @param enabled Indicates whether the input field is enabled for user interaction.
 * @param readOnly Indicates whether the input field is read-only.
 * @param label Optional label displayed above the input field.
 * @param placeholder Optional placeholder text displayed when the input field is empty.
 * @param error Optional error message displayed below the input field if there is an error. If it's null no error
 * will be displayed.
 * @param keyboardActions [KeyboardActions] defining keyboard actions for the input field. If you don't provide one
 * it will auto complete the suggestion and clear the keyboard for any action.
 * @param interactionSource [MutableInteractionSource] representing the source of user interactions.
 * @param shape Shape of the input field.
 */
@ExperimentalKompostoApi
@Composable
public fun KPInputEmailField(
    email: String,
    onValueChange: ((String) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    error: String? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email),
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = MaterialTheme.shapes.small,
) {
    Column(
        modifier = modifier.width(IntrinsicSize.Max),
    ) {
        LaunchedEffect(email) {
            interactionSource.interactions.collect {
                if (it is PressInteraction.Release || it is FocusInteraction.Unfocus) {
                    val emailSuggestion = SuggestEmailProviderUtil.suggest(email)
                    if (email != emailSuggestion.text) {
                        onValueChange?.invoke(emailSuggestion.text)
                    }
                }
            }
        }

        val focusManager = LocalFocusManager.current
        val actionsOfKeyboard = if (keyboardActions == KeyboardActions.Default) {
            KeyboardActions(
                onAny = {
                    val emailSuggestion = SuggestEmailProviderUtil.suggest(email)
                    if (email != emailSuggestion.text) {
                        onValueChange?.invoke(emailSuggestion.text)
                    }
                    focusManager.clearFocus()
                }
            )
        } else keyboardActions
        KPOutlinedTextField(
            value = email,
            onValueChange = { value ->
                onValueChange?.invoke(value)
            },
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            readOnly = readOnly,
            label = label,
            placeholder = placeholder,
            interactionSource = interactionSource,
            isError = error != null,
            visualTransformation = EmailVisualTransformation(),
            keyboardOptions = keyboardOptions,
            keyboardActions = actionsOfKeyboard,
            singleLine = true,
            shape = shape,
            colors = KPOutlinedTextFieldStyle.Outlined.outlinedTextFieldColors,
        )

        if (enabled && error != null) {
            KPText(
                modifier = Modifier
                    .padding(
                        top = 8.dp,
                        start = 12.dp,
                        end = 12.dp,
                    )
                    .fillMaxWidth(),
                text = error,
                style = KPDesign.typography.body1ColorWarning,
            )
        }
    }
}
