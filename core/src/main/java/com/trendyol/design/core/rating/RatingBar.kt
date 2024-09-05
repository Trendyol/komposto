package com.trendyol.design.core.rating

import android.graphics.drawable.AdaptiveIconDrawable
import android.os.Build
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.drawable.toBitmap
import com.trendyol.design.core.R
import com.trendyol.design.core.icon.Icons
import com.trendyol.design.core.icon.icons.fill.Star
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign
import kotlin.math.floor

/**
 * A composable function that renders a rating bar with customizable styles and parameters.
 *
 * This `RatingBar` function provides a flexible way to display a rating with stars, optionally
 * showing the rating value, a review count, and a camera icon. The stars can be customized in terms
 * of size, spacing, and colors. The function uses a Canvas to draw the stars and supports vector
 * images for the star icons.
 *
 * @param rating The current rating value to be displayed. It is a Float value representing
 * the rating.
 * @param size The size and style to be applied to the rating bar, defined by the `RatingBarStyle`
 * sealed interface.
 * @param modifier The modifier to apply to the rating bar for layout adjustments and styling.
 * @param itemCount The number of stars to be displayed in the rating bar.
 * @param reviewCount An optional parameter to display the count of reviews as a String.
 * @param showRating A Boolean indicating whether to show the rating value text.
 * @param showCameraIcon A Boolean indicating whether to show a camera icon at the end of
 * the rating bar.
 * @param itemSize The size of each star in the rating bar.
 * @param spaceBetween The space between each star in the rating bar.
 * @param icon The resource of the image vector to use for the stars.
 * @param emptyColor The color of the empty stars.
 * @param filledColor The color of the filled stars.
 */
@Composable
public fun RatingBar(
    rating: Float,
    size: RatingBarSize,
    modifier: Modifier = Modifier,
    itemCount: Int = 5,
    reviewCount: String? = null,
    showRating: Boolean = false,
    showCameraIcon: Boolean = false,
    itemSize: Dp = size.starIconSize,
    spaceBetween: Dp = 2.dp,
    icon: ImageVector = Icons.Fill.Star,
    filledColor: Color = TrendyolDesign.colors.colorStar,
    emptyColor: Color = TrendyolDesign.colors.colorBorder,
) {

    val vectorPainter = rememberVectorPainter(image = icon)
    val spacePx: Float = with(LocalDensity.current) { spaceBetween.toPx() }
    val totalWidth: Dp = remember { itemSize * itemCount + spaceBetween * (itemCount - 1) }

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (showRating) {
            Text(
                modifier = Modifier.padding(end = 4.dp),
                text = rating.toString(),
                style = size.textSize,
            )
        }

        Canvas(
            modifier = Modifier
                .mirror()
                .size(width = totalWidth, height = itemSize)
                .graphicsLayer(alpha = 0.99f)
        ) {
            drawRating(
                itemCount = itemCount,
                painter = vectorPainter,
                rating = rating,
                filledColor = filledColor,
                emptyColor = emptyColor,
                space = spacePx
            )
        }

        reviewCount?.let { reviews ->
            Text(
                modifier = Modifier.padding(start = 4.dp),
                text = "($reviews)",
                style = size.textSize,
            )
        }

        if (showCameraIcon) {
            Icon(
                modifier = Modifier
                    .padding(start = 4.dp)
                    .size(size.cameraIconSize),
                painter = adaptiveIconPainterResource(id = R.drawable.medium),
                contentDescription = "Camera Icon",
                tint = Color.Unspecified,
            )
        }
    }
}

@Composable
private fun adaptiveIconPainterResource(@DrawableRes id: Int): Painter {
    val res = LocalContext.current.resources
    val theme = LocalContext.current.theme

    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        // Android O supports adaptive icons, try loading this first
        // (even though this is least likely to be the format).
        val adaptiveIcon = ResourcesCompat.getDrawable(res, id, theme) as? AdaptiveIconDrawable
        if (adaptiveIcon != null) {
            BitmapPainter(adaptiveIcon.toBitmap().asImageBitmap())
        } else {
            // We couldn't load the drawable as an Adaptive Icon, just use painterResource
            painterResource(id)
        }
    } else {
        // We're not on Android O or later, just use painterResource
        painterResource(id)
    }
}

private fun DrawScope.drawRating(
    itemCount: Int,
    painter: Painter,
    rating: Float,
    filledColor: Color,
    emptyColor: Color,
    space: Float,
) {
    val itemWidth = size.height

    repeat(itemCount) { index ->
        val startPos = (itemWidth * index) + (space * index)
        translate(left = startPos) {
            with(painter) {
                draw(
                    size = Size(size.height, size.height),
                    colorFilter = ColorFilter.tint(emptyColor)
                )
            }
        }
    }

    val rectWidth = (rating * itemWidth) + (floor(rating) * space)
    drawRect(
        color = filledColor,
        size = Size(width = rectWidth, height = size.height),
        blendMode = BlendMode.SrcIn,
    )
}

@Composable
private fun Modifier.mirror(): Modifier {
    val layoutDirection = LocalLayoutDirection.current
    return if (layoutDirection == LayoutDirection.Rtl)
        this.scale(scaleX = -1f, scaleY = 1f)
    else
        this
}

@Preview(showBackground = true)
@Composable
private fun RatingBarFullSmallPreview() {
    PreviewTheme {
        RatingBar(
            size = TrendyolRatingBarSize.Small,
            rating = 3.5f,
            showRating = true,
            reviewCount = "277",
            filledColor = TrendyolDesign.colors.colorStar,
            emptyColor = TrendyolDesign.colors.colorBackground,
            spaceBetween = 2.dp,
            itemCount = 5,
            itemSize = 10.dp,
            showCameraIcon = true,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun RatingBarFullMediumPreview() {
    PreviewTheme {
        RatingBar(
            size = TrendyolRatingBarSize.Medium,
            rating = 3.5f,
            showRating = true,
            reviewCount = "277",
            filledColor = TrendyolDesign.colors.colorStar,
            emptyColor = TrendyolDesign.colors.colorBackground,
            spaceBetween = 2.dp,
            itemCount = 5,
            itemSize = 10.dp,
            showCameraIcon = true,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun RatingBarScoreSmallPreview() {
    PreviewTheme {
        RatingBar(
            size = TrendyolRatingBarSize.Small,
            rating = 3.5f,
            showRating = true,
            filledColor = TrendyolDesign.colors.colorStar,
            emptyColor = TrendyolDesign.colors.colorBackground,
            spaceBetween = 2.dp,
            itemCount = 5,
            itemSize = 10.dp,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun RatingBarScoreMediumPreview() {
    PreviewTheme {
        RatingBar(
            size = TrendyolRatingBarSize.Medium,
            rating = 3.5f,
            showRating = true,
            filledColor = TrendyolDesign.colors.colorStar,
            emptyColor = TrendyolDesign.colors.colorBackground,
            spaceBetween = 2.dp,
            itemCount = 5,
            itemSize = 10.dp,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun RatingBarScoreReviewSmallPreview() {
    PreviewTheme {
        RatingBar(
            size = TrendyolRatingBarSize.Small,
            rating = 3.5f,
            showRating = true,
            reviewCount = "277",
            filledColor = TrendyolDesign.colors.colorStar,
            emptyColor = TrendyolDesign.colors.colorBackground,
            spaceBetween = 2.dp,
            itemCount = 5,
            itemSize = 10.dp,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun RatingBarScoreReviewMediumPreview() {
    PreviewTheme {
        RatingBar(
            size = TrendyolRatingBarSize.Medium,
            rating = 3.5f,
            showRating = true,
            reviewCount = "277",
            filledColor = TrendyolDesign.colors.colorStar,
            emptyColor = TrendyolDesign.colors.colorBackground,
            spaceBetween = 2.dp,
            itemCount = 5,
            itemSize = 10.dp,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun RatingBarReviewWithCameraIconSmallPreview() {
    PreviewTheme {
        RatingBar(
            size = TrendyolRatingBarSize.Small,
            rating = 3.5f,
            showCameraIcon = true,
            reviewCount = "277",
            filledColor = TrendyolDesign.colors.colorStar,
            emptyColor = TrendyolDesign.colors.colorBackground,
            spaceBetween = 2.dp,
            itemCount = 5,
            itemSize = 10.dp,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun RatingBarReviewWithCameraIconMediumPreview() {
    PreviewTheme {
        RatingBar(
            size = TrendyolRatingBarSize.Medium,
            rating = 3.5f,
            showCameraIcon = true,
            reviewCount = "277",
            filledColor = TrendyolDesign.colors.colorStar,
            emptyColor = TrendyolDesign.colors.colorBackground,
            spaceBetween = 2.dp,
            itemCount = 5,
            itemSize = 10.dp,
        )
    }
}
