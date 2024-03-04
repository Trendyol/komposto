package core

import androidx.compose.runtime.Composable

data class DesignScreenshotTestContainer(
    val name: String,
    val content: @Composable () -> Unit,
)