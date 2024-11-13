package com.trendyol.design.core.snackbar

import androidx.compose.material.SnackbarData
import androidx.compose.material.SnackbarHost
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
public fun KompostoSnackbarHost(
    modifier: Modifier = Modifier,
    kompostoSnackbarHostState: KompostoSnackbarHostState,
    kompostoSnackbar: @Composable (SnackbarData, KompostoSnackbarData?) -> Unit
) {
    SnackbarHost(
        hostState = kompostoSnackbarHostState.snackbarHostState,
        modifier = modifier
    ) { data ->
        kompostoSnackbar(data, kompostoSnackbarHostState.currentSnackbarData)
    }
}