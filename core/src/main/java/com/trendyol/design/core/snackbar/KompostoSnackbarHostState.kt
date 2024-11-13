package com.trendyol.design.core.snackbar

import androidx.compose.material.SnackbarDuration
import androidx.compose.material.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
public fun rememberKompostoSnackbarHostState(
    snackbarHostState: SnackbarHostState = remember { SnackbarHostState() },
    coroutineScope: CoroutineScope = rememberCoroutineScope()
): KompostoSnackbarHostState = remember {
    KompostoSnackbarHostState(snackbarHostState, coroutineScope)
}

@Stable
public class KompostoSnackbarHostState(
    public val snackbarHostState: SnackbarHostState,
    public val coroutineScope: CoroutineScope
) {
    public var currentSnackbarData: KompostoSnackbarData? by mutableStateOf(null)
        private set

    public fun showKompostoSnackbar(
        kompostoSnackbarData: KompostoSnackbarData,
        duration: SnackbarDuration = SnackbarDuration.Short
    ) {
        currentSnackbarData = kompostoSnackbarData
        coroutineScope.launch {
            snackbarHostState.showSnackbar("", duration = duration)
        }
    }
}
