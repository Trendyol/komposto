package core

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun BoxWithHorizontalPadding(
    content: @Composable () -> Unit
) {
    Box(modifier = Modifier.padding(horizontal = 8.dp)) {
        content()
    }
}