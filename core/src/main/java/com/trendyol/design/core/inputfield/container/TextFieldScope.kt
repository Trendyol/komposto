package com.trendyol.design.core.inputfield.container

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.ContentTransform
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.IconSize
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.inputfield.container.TextFieldScope.Icon
import com.trendyol.design.core.inputfield.container.TextFieldScope.Text
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign
import kotlinx.collections.immutable.persistentSetOf
import androidx.compose.animation.AnimatedContent as ComposeAnimatedContent

@Stable
public object TextFieldScope {
    /**
     * Default icon used for TextField trailing container
     *
     * @param imageVector This mandatory parameter defines the vector graphic resource that will be
     * displayed as the icon. You'll need to provide an ImageVector object representing the
     * desired icon.
     * @param modifier The [Modifier] to be applied to SingleLineOutlinedTextField.
     * @param onClick This parameter allows you to specify an action to be performed when the user
     * clicks on the icon.
     * @param size  This parameter controls the size of the icon. It can be set to one of the
     * predefined IconSize enum values, such as [KPIconSize.Small] or [KPIconSize.Medium].
     * Defaults to the value from [KPIconSize.Small].
     */
    @Composable
    public fun Icon(
        imageVector: ImageVector,
        modifier: Modifier = Modifier,
        onClick: () -> Unit,
        size: IconSize = KPIconSize.Small,
        tint: Color = Color.Unspecified
    ) {
        Box(
            modifier
                .layoutId(TrailingIconLayoutId)
                .size(size = size.dp)
                .clickable(onClick = onClick),
        ) {
            KPIcon(
                imageVector = imageVector,
                size = KPIconSize.Medium,
                modifier = Modifier
                    .align(alignment = Alignment.Center)
                    .padding(all = 2.dp),
                tint = tint
            )
        }
    }

    /**
     * Default text used for TextField trailing container
     *
     * @param text The text to be displayed
     * @param modifier The [Modifier] to be applied to this text
     * @param style A TextStyle object that defines the text style
     * * @param onClick A lambda function that will be called when the user clicks on the text.
     */
    @Composable
    public fun Text(
        text: String,
        modifier: Modifier = Modifier,
        style: TextStyle = KPDesign.typography.subtitleMedium,
        onClick: () -> Unit,
    ) {
        KPText(
            text = text,
            modifier = modifier
                .layoutId(TrailingTextLayoutId)
                .clickable(onClick = onClick),
            style = style,
            maxLines = 1,
        )
    }

    /**
     * Animated wrapper for the TextField trailing slot. Renders one of the
     * [TextFieldScope] elements ([Icon] / [Text]) per [targetState] with a
     * smooth transition.
     *
     * The [content] lambda is invoked with [TextFieldScope] as its receiver,
     * so callers naturally use the scope's elements (`Icon(...)`, `Text(...)`).
     * Children may be omitted entirely (e.g. an `if` without an `else` branch)
     * — empty states are valid and will simply render nothing for that target.
     */
    @Composable
    public fun <T> AnimatedContent(
        targetState: T,
        modifier: Modifier = Modifier,
        transitionSpec: AnimatedContentTransitionScope<T>.() -> ContentTransform = { fadeIn() togetherWith fadeOut() },
        contentAlignment: Alignment = Alignment.Center,
        label: String = "TextFieldScopeAnimatedContent",
        content: @Composable TextFieldScope.(targetState: T) -> Unit,
    ) {
        ComposeAnimatedContent(
            targetState = targetState,
            modifier = modifier.layoutId(TrailingAnimatedContentLayoutId),
            transitionSpec = transitionSpec,
            contentAlignment = contentAlignment,
            label = label,
        ) { state ->
            CheckTextFieldLayoutIds(
                layoutId = persistentSetOf(TrailingIconLayoutId, TrailingTextLayoutId),
                isSingleChildRequired = false,
                errorMessage = "AnimatedContent should only contain TextFieldScope.Icon " +
                        "or TextFieldScope.Text elements",
            ) {
                TextFieldScope.content(state)
            }
            TextFieldScope.content(state)
        }
    }
}

internal object TrailingIconLayoutId
internal object TrailingTextLayoutId
internal object TrailingAnimatedContentLayoutId
