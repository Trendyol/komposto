@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.ui.component.inputfield

import androidx.compose.animation.ContentTransform
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Cancel
import com.trendyol.design.core.icon.icons.fill.Search
import com.trendyol.design.core.inputfield.KPOutlinedTextFieldStyle
import com.trendyol.design.core.inputfield.KPSingleLineOutlinedTextField
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

private const val LABEL = "Label"
private const val WRITE_HERE = "Write here"
private const val MIN_WIDTH = 280
private const val FADE_DURATION_MS = 1000
private const val SLIDE_DURATION_MS = 800
private const val SCALE_DURATION_MS = 800

private fun horizontalSlideTransition(forward: Boolean): ContentTransform {
    val enterOffset: (Int) -> Int = if (forward) ({ it }) else ({ -it })
    val exitOffset: (Int) -> Int = if (forward) ({ -it }) else ({ it })
    val enterTransition = slideInHorizontally(animationSpec = tween(SLIDE_DURATION_MS), initialOffsetX = enterOffset) +
        fadeIn(animationSpec = tween(SLIDE_DURATION_MS))
    val exitTransition = slideOutHorizontally(animationSpec = tween(SLIDE_DURATION_MS), targetOffsetX = exitOffset) +
        fadeOut(animationSpec = tween(SLIDE_DURATION_MS))
    return enterTransition togetherWith exitTransition
}

private fun scaleAndFadeTransition(): ContentTransform {
    val enterTransition = scaleIn(animationSpec = tween(SCALE_DURATION_MS)) +
        fadeIn(animationSpec = tween(SCALE_DURATION_MS))
    val exitTransition = scaleOut(animationSpec = tween(SCALE_DURATION_MS)) +
        fadeOut(animationSpec = tween(SCALE_DURATION_MS))
    return enterTransition togetherWith exitTransition
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_SINGLE_LINE,
    styleName = "1.Unfocused"
)
@Composable
internal fun Input_Field_1_SingleLine_1_Unfocused() = TrendyolTheme {
    Column {
        var value by remember { mutableStateOf("") }
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            label = LABEL,
            value = value,
            onValueChange = {
                value = it
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Outlined,
            value = value,
            placeholder = WRITE_HERE,
            onValueChange = {
                value = it
            },
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = value,
            placeholder = WRITE_HERE,
            onValueChange = {
                value = it
            },
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_SINGLE_LINE,
    styleName = "2.Typed"
)
@Composable
internal fun Input_Field_1_SingleLine_2_Typed() = TrendyolTheme {
    Column {
        var value by remember { mutableStateOf("Filled") }
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            label = LABEL,
            value = value,
            onValueChange = {
                value = it
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Outlined,
            value = value,
            placeholder = WRITE_HERE,
            onValueChange = {
                value = it
            },
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = value,
            placeholder = WRITE_HERE,
            onValueChange = {
                value = it
            },
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_SINGLE_LINE,
    styleName = "3.Disabled"
)
@Composable
internal fun Input_Field_1_SingleLine_3_Disabled() = TrendyolTheme {
    Column {
        var value by remember { mutableStateOf("Disabled") }
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            value = value,
            onValueChange = {
                value = it
            },
            enabled = false,
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Outlined,
            value = value,
            onValueChange = {
                value = it
            },
            enabled = false,
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = value,
            onValueChange = {
                value = it
            },
            enabled = false,
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_SINGLE_LINE,
    styleName = "4.Error"
)
@Composable
internal fun Input_Field_1_SingleLine_4_Error() = TrendyolTheme {
    Column {
        var value by remember { mutableStateOf("Error") }
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            label = LABEL,
            value = value,
            onValueChange = {
                value = it
            },
            isError = true,
            errorLabel = "Error message goes here",
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
            value = value,
            onValueChange = {
                value = it
            },
            isError = true,
            errorLabel = "Error message goes here",
        )
        Spacer(modifier = Modifier.height(8.dp))
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Filled,
            value = value,
            onValueChange = {
                value = it
            },
            isError = true,
            errorLabel = "Error message goes here",
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INPUT_FIELD,
    name = Component.INPUT_FIELD_SINGLE_LINE,
    styleName = "5.AnimatedTrailing"
)
@Composable
internal fun Input_Field_1_SingleLine_5_AnimatedTrailing() = TrendyolTheme {
    Column {
        // 1) Icon / Icon with classic fade.
        var query1 by remember { mutableStateOf("") }
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Outlined,
            value = query1,
            onValueChange = { query1 = it },
            label = "Fade",
            trailingContent = {
                AnimatedContent(
                    targetState = query1.isNotEmpty(),
                    transitionSpec = {
                        fadeIn(animationSpec = tween(durationMillis = FADE_DURATION_MS)) togetherWith
                            fadeOut(animationSpec = tween(durationMillis = FADE_DURATION_MS))
                    },
                    label = "fade",
                ) { hasQuery ->
                    if (hasQuery) {
                        Icon(
                            imageVector = KPIcons.Fill.Cancel,
                            onClick = { query1 = "" },
                            size = KPIconSize.Small,
                        )
                    } else {
                        Icon(
                            imageVector = KPIcons.Fill.Search,
                            onClick = {},
                            size = KPIconSize.Small,
                        )
                    }
                }
            },
        )

        Spacer(modifier = Modifier.height(8.dp))

        // 2) Icon / Text — proves AnimatedContent is generic across scope members.
        var query2 by remember { mutableStateOf("") }
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Outlined,
            value = query2,
            onValueChange = { query2 = it },
            label = "Icon / Text",
            trailingContent = {
                AnimatedContent(
                    targetState = query2.isNotEmpty(),
                    label = "icon-text",
                ) { hasQuery ->
                    if (hasQuery) {
                        Text(text = "Clear", onClick = { query2 = "" })
                    } else {
                        Icon(
                            imageVector = KPIcons.Fill.Search,
                            onClick = {},
                            size = KPIconSize.Small,
                        )
                    }
                }
            },
        )

        Spacer(modifier = Modifier.height(8.dp))

        // 3) `if` without `else` — empty state is valid (no single-child force).
        var query3 by remember { mutableStateOf("") }
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Outlined,
            value = query3,
            onValueChange = { query3 = it },
            label = "Empty else",
            trailingContent = {
                AnimatedContent(
                    targetState = query3.isNotEmpty(),
                    label = "empty-else",
                ) { hasQuery ->
                    if (hasQuery) {
                        Icon(
                            imageVector = KPIcons.Fill.Cancel,
                            onClick = { query3 = "" },
                            size = KPIconSize.Small,
                        )
                    }
                }
            },
        )

        Spacer(modifier = Modifier.height(8.dp))

        // 4) Icon / Icon with horizontal slide + fade.
        var query4 by remember { mutableStateOf("") }
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Outlined,
            value = query4,
            onValueChange = { query4 = it },
            label = "Slide",
            trailingContent = {
                AnimatedContent(
                    targetState = query4.isNotEmpty(),
                    transitionSpec = { horizontalSlideTransition(forward = targetState) },
                    label = "slide",
                ) { hasQuery ->
                    if (hasQuery) {
                        Icon(
                            imageVector = KPIcons.Fill.Cancel,
                            onClick = { query4 = "" },
                            size = KPIconSize.Small,
                        )
                    } else {
                        Icon(
                            imageVector = KPIcons.Fill.Search,
                            onClick = {},
                            size = KPIconSize.Small,
                        )
                    }
                }
            },
        )

        Spacer(modifier = Modifier.height(8.dp))

        // 5) Icon / Icon with scale + fade.
        var query5 by remember { mutableStateOf("") }
        KPSingleLineOutlinedTextField(
            modifier = Modifier.width(MIN_WIDTH.dp),
            style = KPOutlinedTextFieldStyle.Outlined,
            value = query5,
            onValueChange = { query5 = it },
            label = "Scale",
            trailingContent = {
                AnimatedContent(
                    targetState = query5.isNotEmpty(),
                    transitionSpec = { scaleAndFadeTransition() },
                    label = "scale",
                ) { hasQuery ->
                    if (hasQuery) {
                        Icon(
                            imageVector = KPIcons.Fill.Cancel,
                            onClick = { query5 = "" },
                            size = KPIconSize.Small,
                        )
                    } else {
                        Icon(
                            imageVector = KPIcons.Fill.Search,
                            onClick = {},
                            size = KPIconSize.Small,
                        )
                    }
                }
            },
        )
    }
}
