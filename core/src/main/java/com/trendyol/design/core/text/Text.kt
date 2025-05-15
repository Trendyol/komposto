package com.trendyol.design.core.text

import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.material.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit

/**
 * A customized text composable that wraps [androidx.compose.material.Text] with modified default values for
 * [letterSpacing] and [style]. This composable ensures a more consistent typography design
 * by overriding specific defaults, such as removing font padding.
 *
 * @param text The text content to display, provided as a `String`.
 * @param modifier [Modifier] for customizing the layout or adding behavior to the text. Default is [Modifier].
 * @param color The color of the text. Default is [Color.Unspecified], which defers to the [style] parameter.
 * @param fontSize The size of the text, specified as a [TextUnit]. Default is [TextUnit.Unspecified], which
 * defers to the [style] parameter.
 * @param fontStyle The style of the text (e.g., italic). Default is `null`, which defers to the [style] parameter.
 * @param fontWeight The weight of the text (e.g., bold). Default is `null`, which defers to the [style] parameter.
 * @param fontFamily The font family for the text. Default is `null`, which defers to the [style] parameter.
 * @param letterSpacing The amount of space to add between each letter. Default is [KPTextDefaults.letterSpacing].
 * @param textDecoration Decorations such as underline or strikethrough. Default is `null`.
 * @param textAlign Alignment of the text within its container (e.g., start, center). Default is `null`.
 * @param lineHeight The height of each line of text, specified as a [TextUnit]. Default is [TextUnit.Unspecified].
 * @param overflow Behavior for handling text overflow (e.g., ellipsis, clip). Default is [TextOverflow.Clip].
 * @param softWrap Whether the text should wrap when it reaches the container's bounds. Default is `true`.
 * @param maxLines The maximum number of lines for the text. Default is [Int.MAX_VALUE].
 * @param minLines The minimum number of lines for the text. Default is `1`.
 * @param onTextLayout Callback invoked with the [TextLayoutResult] after the text is laid out. Default is an empty lambda.
 * @param style [TextStyle] configuration for the text, such as color, font, and line height. This overrides
 * `platformStyle` to remove the default font padding. Default is [LocalTextStyle.current].
 *
 * Example usage:
 * ```
 * KPText(
 *     text = "Hello, KP Design!",
 * )
 * ```
 *
 * @see androidx.compose.material.Text
 * @see KPTextDefaults
 * @see TextStyle
 */
@Composable
public fun KPText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = KPTextDefaults.letterSpacing,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current
) {
    androidx.compose.material.Text(
        text = text,
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        onTextLayout = onTextLayout,
        style = style.copy(
            platformStyle = KPTextDefaults.platformStyle,
        ),
    )
}

/**
 * Text wrapper around [androidx.compose.material.Text] which changes some default values of [letterSpacing]
 * and [style].
 *
 * @param text The text content to be displayed with given `String`.
 * @param letterSpacing The amount of space to add between each letter. Default is `0.sp`
 * @param style Style configuration for the text such as color, font, line height etc. It overrides `platformStyle` in
 * order to remove default font padding value.
 */
@Composable
@Deprecated(
    message = "Use KPText instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun Text(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TrendyolTextDefaults.letterSpacing,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current
) {
    androidx.compose.material.Text(
        text = text,
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        onTextLayout = onTextLayout,
        style = style.copy(
            platformStyle = TrendyolTextDefaults.platformStyle,
        ),
    )
}

/**
 * A customized text composable that wraps [androidx.compose.material.Text], allowing for rich text formatting
 * using [AnnotatedString]. This composable adjusts default values for [letterSpacing] and [style], ensuring
 * consistent typography and removing default font padding.
 *
 * @param text The text content to display, provided as an [AnnotatedString]. It allows rich text formatting,
 * such as styled spans or inline content.
 * @param modifier [Modifier] for customizing the layout or adding behavior to the text. Default is [Modifier].
 * @param color The color of the text. Default is [Color.Unspecified], which defers to the [style] parameter.
 * @param fontSize The size of the text, specified as a [TextUnit]. Default is [TextUnit.Unspecified], which
 * defers to the [style] parameter.
 * @param fontStyle The style of the text (e.g., italic). Default is `null`, which defers to the [style] parameter.
 * @param fontWeight The weight of the text (e.g., bold). Default is `null`, which defers to the [style] parameter.
 * @param fontFamily The font family for the text. Default is `null`, which defers to the [style] parameter.
 * @param letterSpacing The amount of space to add between each letter. Default is [KPTextDefaults.letterSpacing].
 * @param textDecoration Decorations such as underline or strikethrough. Default is `null`.
 * @param textAlign Alignment of the text within its container (e.g., start, center). Default is `null`.
 * @param lineHeight The height of each line of text, specified as a [TextUnit]. Default is [TextUnit.Unspecified].
 * @param overflow Behavior for handling text overflow (e.g., ellipsis, clip). Default is [TextOverflow.Clip].
 * @param softWrap Whether the text should wrap when it reaches the container's bounds. Default is `true`.
 * @param maxLines The maximum number of lines for the text. Default is [Int.MAX_VALUE].
 * @param minLines The minimum number of lines for the text. Default is `1`.
 * @param inlineContent A map of [InlineTextContent] identified by keys within the [AnnotatedString].
 * This allows embedding custom composables inline with the text. Default is an empty map.
 * @param onTextLayout Callback invoked with the [TextLayoutResult] after the text is laid out. Default is an empty lambda.
 * @param style [TextStyle] configuration for the text, such as color, font, and line height. This overrides
 * `platformStyle` to remove the default font padding. Default is [LocalTextStyle.current].
 *
 * Example usage:
 * ```
 * val annotatedString = buildAnnotatedString {
 *     append("Hello, ")
 *     withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
 *         append("KP Design!")
 *     }
 * }
 *
 * KPText(
 *     text = annotatedString,
 * )
 * ```
 *
 * @see androidx.compose.material.Text
 * @see AnnotatedString
 * @see KPTextDefaults
 * @see TextStyle
 */
@Composable
public fun KPText(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = KPTextDefaults.letterSpacing,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    inlineContent: Map<String, InlineTextContent> = mapOf(),
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current
) {
    androidx.compose.material.Text(
        text = text,
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        inlineContent = inlineContent,
        onTextLayout = onTextLayout,
        style = style.copy(
            platformStyle = KPTextDefaults.platformStyle,
        ),
    )
}

/**
 * Text wrapper around [androidx.compose.material.Text] which changes some default values of [letterSpacing]
 * and [style].
 *
 * @param text The text content to be displayed with given `AnnotatedString`.
 * @param letterSpacing The amount of space to add between each letter. Default is `0.sp`
 * @param style Style configuration for the text such as color, font, line height etc. It overrides `platformStyle` in
 * order to remove default font padding value.
 */
@Composable
@Deprecated(
    message = "Use KPText instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun Text(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TrendyolTextDefaults.letterSpacing,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    inlineContent: Map<String, InlineTextContent> = mapOf(),
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current
) {
    androidx.compose.material.Text(
        text = text,
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        inlineContent = inlineContent,
        onTextLayout = onTextLayout,
        style = style.copy(
            platformStyle = TrendyolTextDefaults.platformStyle,
        ),
    )
}
