package com.trendyol.design.core.inputfield.impl

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.ClipOp
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import com.trendyol.design.core.util.lerp
import kotlin.math.max
import kotlin.math.roundToInt

/**
 * Layout of the leading and trailing icons and the text field, label and placeholder in
 * [OutlinedTextField].
 * It doesn't use Row to position the icons and middle part because label should not be
 * positioned in the middle part.
\ */

@Composable
internal fun TrendyolOutlinedTextFieldLayout(
    modifier: Modifier,
    textField: @Composable () -> Unit,
    placeholder: @Composable ((Modifier) -> Unit)?,
    label: @Composable (() -> Unit)?,
    leading: @Composable (() -> Unit)?,
    trailing: @Composable (() -> Unit)?,
    singleLine: Boolean,
    animationProgress: Float,
    onLabelMeasured: (Size) -> Unit,
    border: @Composable () -> Unit,
    paddingValues: PaddingValues
) {
    val measurePolicy = remember(onLabelMeasured, singleLine, animationProgress, paddingValues) {
        TrendyolOutlinedTextFieldMeasurePolicy(
            onLabelMeasured,
            singleLine,
            animationProgress,
            paddingValues
        )
    }
    val layoutDirection = LocalLayoutDirection.current
    Layout(
        modifier = modifier,
        content = {
            // We use additional box here to place an outlined cutout border as a sibling after the
            // rest of UI. This allows us to use Modifier.border to draw an outline on top of the
            // text field. We can't use the border modifier directly on the IconsWithTextFieldLayout
            // as we also need to do the clipping (to form the cutout) which should not affect
            // the rest of text field UI
            border()

            if (leading != null) {
                Box(
                    modifier = Modifier
                        .layoutId(LeadingId)
                        .then(IconDefaultSizeModifier),
                    contentAlignment = Alignment.Center
                ) {
                    leading()
                }
            }
            if (trailing != null) {
                Box(
                    modifier = Modifier
                        .layoutId(TrailingId)
                        .then(IconDefaultSizeModifier),
                    contentAlignment = Alignment.Center
                ) {
                    trailing()
                }
            }

            val startTextFieldPadding = paddingValues.calculateStartPadding(layoutDirection)
            val endTextFieldPadding = paddingValues.calculateEndPadding(layoutDirection)
            val padding = Modifier.padding(
                start = if (leading != null) {
                    (startTextFieldPadding - HorizontalIconPadding).coerceAtLeast(
                        0.dp
                    )
                } else {
                    startTextFieldPadding
                },
                end = if (trailing != null) {
                    (endTextFieldPadding - HorizontalIconPadding).coerceAtLeast(0.dp)
                } else {
                    endTextFieldPadding
                }
            )
            if (placeholder != null) {
                placeholder(
                    Modifier
                        .layoutId(PlaceholderId)
                        .then(padding)
                )
            }

            Box(
                modifier = Modifier
                    .layoutId(TextFieldId)
                    .then(padding),
                propagateMinConstraints = true
            ) {
                textField()
            }

            if (label != null) {
                Box(modifier = Modifier.layoutId(LabelId)) { label() }
            }
        },
        measurePolicy = measurePolicy
    )
}

private class TrendyolOutlinedTextFieldMeasurePolicy(
    private val onLabelMeasured: (Size) -> Unit,
    private val singleLine: Boolean,
    private val animationProgress: Float,
    private val paddingValues: PaddingValues
) : MeasurePolicy {
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints
    ): MeasureResult {
        // used to calculate the constraints for measuring elements that will be placed in a row
        var occupiedSpaceHorizontally = 0
        val bottomPadding = paddingValues.calculateBottomPadding().roundToPx()

        // measure leading icon
        val relaxedConstraints = constraints.copy(minWidth = 0, minHeight = 0)
        val leadingPlaceable = measurables.find {
            it.layoutId == LeadingId
        }?.measure(relaxedConstraints)
        occupiedSpaceHorizontally += widthOrZero(
            leadingPlaceable
        )

        // measure trailing icon
        val trailingPlaceable = measurables.find { it.layoutId == TrailingId }
            ?.measure(relaxedConstraints.offset(horizontal = -occupiedSpaceHorizontally))
        occupiedSpaceHorizontally += widthOrZero(
            trailingPlaceable
        )

        // measure label
        val labelHorizontalPaddingOffset =
            paddingValues.calculateLeftPadding(layoutDirection).roundToPx() +
                    paddingValues.calculateRightPadding(layoutDirection).roundToPx()
        val labelConstraints = relaxedConstraints.offset(
            horizontal = lerp(
                -occupiedSpaceHorizontally - labelHorizontalPaddingOffset,
                -labelHorizontalPaddingOffset,
                animationProgress,
            ),
            vertical = -bottomPadding
        )
        val labelPlaceable =
            measurables.find { it.layoutId == LabelId }?.measure(labelConstraints)
        labelPlaceable?.let {
            onLabelMeasured(Size(it.width.toFloat(), it.height.toFloat()))
        }

        // measure text field
        // on top we offset either by default padding or by label's half height if its too big
        // minHeight must not be set to 0 due to how foundation TextField treats zero minHeight
        val topPadding = max(
            heightOrZero(labelPlaceable) / 2,
            paddingValues.calculateTopPadding().roundToPx()
        )
        val textConstraints = constraints.offset(
            horizontal = -occupiedSpaceHorizontally,
            vertical = -bottomPadding - topPadding
        ).copy(minHeight = 0)
        val textFieldPlaceable =
            measurables.first { it.layoutId == TextFieldId }.measure(textConstraints)

        // measure placeholder
        val placeholderConstraints = textConstraints.copy(minWidth = 0)
        val placeholderPlaceable =
            measurables.find { it.layoutId == PlaceholderId }?.measure(placeholderConstraints)

        val width =
            calculateWidth(
                leadingPlaceableWidth = widthOrZero(leadingPlaceable),
                trailingPlaceableWidth = widthOrZero(trailingPlaceable),
                textFieldPlaceableWidth = textFieldPlaceable.width,
                labelPlaceableWidth = widthOrZero(labelPlaceable),
                placeholderPlaceableWidth = widthOrZero(
                    placeholderPlaceable
                ),
                animationProgress = animationProgress,
                constraints = constraints,
                density = density,
                paddingValues = paddingValues,
            )
        val height =
            calculateHeight(
                leadingPlaceableHeight = heightOrZero(leadingPlaceable),
                trailingPlaceableHeight = heightOrZero(trailingPlaceable),
                textFieldPlaceableHeight = textFieldPlaceable.height,
                labelPlaceableHeight = heightOrZero(labelPlaceable),
                placeholderPlaceableHeight = heightOrZero(
                    placeholderPlaceable
                ),
                animationProgress = animationProgress,
                constraints = constraints,
                density = density,
                paddingValues = paddingValues,
            )

        val borderPlaceable = measurables.first { it.layoutId == BorderId }.measure(
            Constraints(
                minWidth = if (width != Constraints.Infinity) width else 0,
                maxWidth = width,
                minHeight = if (height != Constraints.Infinity) height else 0,
                maxHeight = height
            )
        )
        return layout(width, height) {
            place(
                height,
                width,
                leadingPlaceable,
                trailingPlaceable,
                textFieldPlaceable,
                labelPlaceable,
                placeholderPlaceable,
                borderPlaceable,
                animationProgress,
                singleLine,
                density,
                layoutDirection,
                paddingValues
            )
        }
    }
}

/**
 * Calculate the width of the [OutlinedTextField] given all elements that should be
 * placed inside
 */
private fun calculateWidth(
    leadingPlaceableWidth: Int,
    trailingPlaceableWidth: Int,
    textFieldPlaceableWidth: Int,
    labelPlaceableWidth: Int,
    placeholderPlaceableWidth: Int,
    animationProgress: Float,
    constraints: Constraints,
    density: Float,
    paddingValues: PaddingValues,
): Int {
    val middleSection = maxOf(
        textFieldPlaceableWidth,
        lerp(labelPlaceableWidth, 0, animationProgress),
        placeholderPlaceableWidth
    )
    val wrappedWidth =
        leadingPlaceableWidth + middleSection + trailingPlaceableWidth

    // Actual LayoutDirection doesn't matter; we only need the sum
    val labelHorizontalPadding = (paddingValues.calculateLeftPadding(LayoutDirection.Ltr) +
            paddingValues.calculateRightPadding(LayoutDirection.Ltr)).value * density
    val focusedLabelWidth =
        ((labelPlaceableWidth + labelHorizontalPadding) * animationProgress).roundToInt()

    return maxOf(wrappedWidth, focusedLabelWidth, constraints.minWidth)
}

/**
 * Calculate the height of the [OutlinedTextField] given all elements that should be
 * placed inside
 */
private fun calculateHeight(
    leadingPlaceableHeight: Int,
    trailingPlaceableHeight: Int,
    textFieldPlaceableHeight: Int,
    labelPlaceableHeight: Int,
    placeholderPlaceableHeight: Int,
    animationProgress: Float,
    constraints: Constraints,
    density: Float,
    paddingValues: PaddingValues
): Int {
    val inputFieldHeight = maxOf(
        textFieldPlaceableHeight,
        placeholderPlaceableHeight,
        lerp(labelPlaceableHeight, 0, animationProgress),
    )
    val topPadding = paddingValues.calculateTopPadding().value * density
    val actualTopPadding = lerp(
        topPadding,
        max(topPadding, labelPlaceableHeight / 2f),
        animationProgress,
    )
    val bottomPadding = paddingValues.calculateBottomPadding().value * density
    val middleSectionHeight = actualTopPadding + inputFieldHeight + bottomPadding

    return max(
        constraints.minHeight,
        maxOf(
            leadingPlaceableHeight,
            trailingPlaceableHeight,
            middleSectionHeight.roundToInt()
        )
    )
}

/**
 * Places the provided text field, placeholder, label, optional leading and trailing icons inside
 * the [OutlinedTextField]
 */
private fun Placeable.PlacementScope.place(
    height: Int,
    width: Int,
    leadingPlaceable: Placeable?,
    trailingPlaceable: Placeable?,
    textFieldPlaceable: Placeable,
    labelPlaceable: Placeable?,
    placeholderPlaceable: Placeable?,
    borderPlaceable: Placeable,
    animationProgress: Float,
    singleLine: Boolean,
    density: Float,
    layoutDirection: LayoutDirection,
    paddingValues: PaddingValues
) {
    val topPadding = (paddingValues.calculateTopPadding().value * density).roundToInt()
    val startPadding =
        (paddingValues.calculateStartPadding(layoutDirection).value * density).roundToInt()

    val iconPadding = HorizontalIconPadding.value * density

    // placed center vertically and to the start edge horizontally
    leadingPlaceable?.placeRelative(
        0,
        Alignment.CenterVertically.align(leadingPlaceable.height, height)
    )

    // placed center vertically and to the end edge horizontally
    trailingPlaceable?.placeRelative(
        width - trailingPlaceable.width,
        Alignment.CenterVertically.align(trailingPlaceable.height, height)
    )

    // label position is animated
    // in single line text field label is centered vertically before animation starts
    labelPlaceable?.let {
        val startPositionY = if (singleLine) {
            Alignment.CenterVertically.align(it.height, height)
        } else {
            topPadding
        }
        val positionY = lerp(startPositionY, -(it.height / 2), animationProgress)
        val positionX = (
                if (leadingPlaceable == null) {
                    0f
                } else {
                    (widthOrZero(leadingPlaceable) - iconPadding) * (1 - animationProgress)
                }
                ).roundToInt() + startPadding
        it.placeRelative(positionX, positionY)
    }

    // placed center vertically and after the leading icon horizontally if single line text field
    // placed to the top with padding for multi line text field
    val textVerticalPosition = max(
        if (singleLine) {
            Alignment.CenterVertically.align(textFieldPlaceable.height, height)
        } else {
            topPadding
        },
        heightOrZero(labelPlaceable) / 2
    )
    textFieldPlaceable.placeRelative(widthOrZero(leadingPlaceable), textVerticalPosition)

    // placed similar to the input text above
    placeholderPlaceable?.let {
        val placeholderVerticalPosition = max(
            if (singleLine) {
                Alignment.CenterVertically.align(it.height, height)
            } else {
                topPadding
            },
            heightOrZero(labelPlaceable) / 2
        )
        it.placeRelative(widthOrZero(leadingPlaceable), placeholderVerticalPosition)
    }

    // place border
    borderPlaceable.place(IntOffset.Zero)
}

internal fun Modifier.outlineCutout(labelSize: Size, paddingValues: PaddingValues) =
    this.drawWithContent {
        val labelWidth = labelSize.width
        if (labelWidth > 0f) {
            val innerPadding = OutlinedTextFieldInnerPadding.toPx()
            val leftLtr = paddingValues.calculateLeftPadding(layoutDirection).toPx() - innerPadding
            val rightLtr = leftLtr + labelWidth + 2 * innerPadding
            val left = when (layoutDirection) {
                LayoutDirection.Rtl -> size.width - rightLtr
                else -> leftLtr.coerceAtLeast(0f)
            }
            val right = when (layoutDirection) {
                LayoutDirection.Rtl -> size.width - leftLtr.coerceAtLeast(0f)
                else -> rightLtr
            }
            val labelHeight = labelSize.height
            // using label height as a cutout area to make sure that no hairline artifacts are
            // left when we clip the border
            clipRect(left, -labelHeight / 2, right, labelHeight / 2, ClipOp.Difference) {
                this@drawWithContent.drawContent()
            }
        } else {
            this@drawWithContent.drawContent()
        }
    }

private val OutlinedTextFieldInnerPadding = 4.dp

internal const val BorderId = "border"
