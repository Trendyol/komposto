package com.trendyol.design.core.inputfield.impl

import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.VisualTransformation

/**
 * A decoration box which helps creating custom text fields based on
 * <a href="https://material.io/components/text-fields#outlined-text-field" class="external" target="_blank">Material Design outlined text field</a>.
 *
 * If your text field requires customising elements that aren't exposed by [OutlinedTextField],
 * consider using this decoration box to achieve the desired design.
 *
 * For example, if you need to create a dense outlined text field, use [contentPadding] parameter to
 * decrease the paddings around the input field. If you need to change the thickness of the border,
 * use [border] parameter to achieve that.
 *
 * @param value the input [String] shown by the text field
 * @param innerTextField input text field that this decoration box wraps. You will pass here a
 * framework-controlled composable parameter "innerTextField" from the decorationBox lambda of the
 * [BasicTextField]
 * @param enabled controls the enabled state of the [OutlinedTextField]. When `false`, visually
 * text field will appear in the disabled UI state. You must also pass the same value to the
 * [BasicTextField] for it to adjust the behavior accordingly making the text field non-editable,
 * non-focusable and non-selectable
 * @param singleLine indicates if this is a single line or multi line text field. You must pass
 * the same value as to [BasicTextField]
 * @param visualTransformation transforms the visual representation of the input [value]. You must
 * pass the same value as to [BasicTextField]
 * @param interactionSource this is a read-only [InteractionSource] representing the stream of
 * [Interaction]s for this text field. You first create and pass in your own remembered
 * [MutableInteractionSource] to the [BasicTextField] for it to dispatch events. And then pass the
 * same instance to this decoration box for it to observe [Interaction]s and customize the
 * appearance / behavior in different [Interaction]s.
 * @param isError indicates if the text field's current value is in error state. If set to
 * true, the label, bottom indicator and trailing icon by default will be displayed in error color
 * @param label the optional label to be displayed inside the text field container. The default
 * text style for internal [Text] is [Typography.caption] when the text field is in focus and
 * [Typography.subtitle1] when the text field is not in focus
 * @param placeholder the optional placeholder to be displayed when the text field is in focus and
 * the input text is empty. The default text style for internal [Text] is [Typography.subtitle1]
 * @param leadingIcon the optional leading icon to be displayed at the beginning of the text field
 * container
 * @param trailingIcon the optional trailing icon to be displayed at the end of the text field
 * container
 * @param colors [TextFieldColors] that will be used to resolve color of the text and content
 * (including label, placeholder, leading and trailing icons, border) for this text field in
 * different states. See [TextFieldDefaults.outlinedTextFieldColors]
 * @param border the border to be drawn around the text field. The cutout to fit the [label] will
 * be automatically added by the framework. Note that by default the color of the border comes from
 * the [colors].
 * @param contentPadding the spacing values to apply internally between the internals of text field
 * and the decoration box container. You can use it to implement dense text fields or simply to
 * control horizontal padding. See [TextFieldDefaults.outlinedTextFieldPadding]
 */
@Composable
@ExperimentalMaterialApi
fun TrendyolOutlinedTextFieldDecorationBox(
    value: String,
    innerTextField: @Composable () -> Unit,
    enabled: Boolean,
    singleLine: Boolean,
    visualTransformation: VisualTransformation,
    interactionSource: InteractionSource,
    isError: Boolean = false,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    colors: TextFieldColors = TextFieldDefaults.outlinedTextFieldColors(),
    contentPadding: PaddingValues = TextFieldDefaults.outlinedTextFieldPadding(),
    border: @Composable () -> Unit = {
        TextFieldDefaults.BorderBox(enabled, isError, interactionSource, colors)
    }
) {
    TrendyolCommonDecorationBox(
        type = TrendyolTextFieldType.Outlined,
        value = value,
        visualTransformation = visualTransformation,
        innerTextField = innerTextField,
        placeholder = placeholder,
        label = label,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        singleLine = singleLine,
        enabled = enabled,
        isError = isError,
        interactionSource = interactionSource,
        colors = colors,
        contentPadding = contentPadding,
        border = border
    )
}
