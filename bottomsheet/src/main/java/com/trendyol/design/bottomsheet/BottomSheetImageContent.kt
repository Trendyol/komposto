package com.trendyol.design.bottomsheet

import android.content.res.Configuration
import android.graphics.Bitmap
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.drawable.toBitmap
import coil.ImageLoader
import coil.request.ImageRequest
import com.trendyol.design.bottomsheet.header.BottomSheetHeader
import com.trendyol.design.bottomsheet.preview.PreviewTheme

/**
 * A composable function that creates a bottom sheet content layout with an image and a customizable header.
 *
 * @param title The title to be displayed in the header.
 * @param onCloseIconClick A lambda function to be invoked when the close icon in the header is clicked.
 * @param model The data model for the image to be displayed.
 * @param modifier A `Modifier` for styling and layout customization. Default is `Modifier`.
 * @param header A composable lambda for customizing the header content. Default is a `BottomSheetHeader` with the provided title and close icon click action.
 * @param outerPadding A `PaddingValues` object to set the padding around the image content. Default is `PaddingValues(horizontal = 16.dp, vertical = 12.dp)`.
 */
@Composable
fun BottomSheetImageContent(
    title: String,
    onCloseIconClick: () -> Unit,
    model: Any?,
    modifier: Modifier = Modifier,
    header: @Composable () -> Unit = {
        BottomSheetHeader(title = title, onCloseIconClick = onCloseIconClick)
    },
    outerPadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
) {
    Column(
        modifier = modifier,
    ) {
        header()

        val configuration = LocalConfiguration.current
        val context = LocalContext.current
        val imageRequest = ImageRequest.Builder(LocalContext.current)
            .data(model)
            .build()
        var bitmap by remember { mutableStateOf<Bitmap?>(null) }
        LaunchedEffect(key1 = model) {
            bitmap = ImageLoader(context).execute(imageRequest).drawable?.toBitmap()
        }
        bitmap?.let {
            val imageRatio = it.height.toDouble() / it.width
            Image(
                bitmap = it.asImageBitmap(),
                contentDescription = title,
                modifier = Modifier
                    .setImageRatioIfNeeded(imageRatio, configuration)
                    .padding(paddingValues = outerPadding),
            )
        }
    }
}

private fun Modifier.setImageRatioIfNeeded(
    imageRatio: Double,
    configuration: Configuration,
): Modifier {
    return if (imageRatio <= 0.0) this
    else {
        val width = configuration.screenWidthDp
        val height = (width * imageRatio).dp
        then(size(width = width.dp, height = height))
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() = PreviewTheme {
    BottomSheetImageContent(
        title = "Some Title",
        onCloseIconClick = { },
        model = "https://fastly.picsum.photos/id/340/536/354.jpg?hmac=TEqJ_0Lnvw38Q0oP_A5i3KuSxW6HV1xiJ3U_W8LW7G4",
    )
}
