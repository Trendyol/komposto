package com.trendyol.design.core.snackbar

public data class KompostoSnackbarData(
    val title: String,
    val subtitle: String = "",
    val actionButton: KompostoSnackbarActionButton,
    val isDismissButtonVisible: Boolean = false
)
