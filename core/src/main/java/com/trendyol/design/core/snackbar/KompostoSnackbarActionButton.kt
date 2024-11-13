package com.trendyol.design.core.snackbar

public sealed class KompostoSnackbarActionButton(public val text: String) {
    public data class TextButton(val buttonText: String) : KompostoSnackbarActionButton(buttonText)
    public data class SecondaryButton(val buttonText: String) : KompostoSnackbarActionButton(buttonText)
    public data object None : KompostoSnackbarActionButton("")
}