package com.trendyol.design.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.Composable
import androidx.fragment.compose.content
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

/**
 * An abstract class that represents a bottom sheet fragment with a Compose UI.
 * This class extends `BottomSheetDialogFragment` and provides a structure for implementing a Compose-based bottom sheet.
 */
public abstract class KPBottomSheetFragment : BottomSheetDialogFragment() {

    /**
     * An abstract composable function to define the content of the page.
     * This function needs to be implemented by subclasses to provide the specific content for the bottom sheet.
     */
    @Composable
    protected abstract fun PageContent()

    /**
     * Overrides the default theme for the bottom sheet dialog. This style makes corner of the bottom sheet soft.
     *
     * @return The resource ID of the theme to be applied.
     */
    override fun getTheme(): Int = R.style.BaseBottomSheetDialog

    /**
     * Creates and returns the view hierarchy associated with the fragment.
     * This method inflates a `ComposeView` and sets the content to the `PageContent` composable function.
     *
     * @param inflater The LayoutInflater object that can be used to inflate any views in the fragment.
     * @param container If non-null, this is the parent view that the fragment's UI should be attached to.
     * @param savedInstanceState If non-null, this fragment is being re-constructed from a previous saved state as given here.
     * @return The `ComposeView` with the content set to the `PageContent` composable function.
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = content {
        PageContent()
    }
}

/**
 * An abstract class that represents a bottom sheet fragment with a Compose UI.
 * This class extends `BottomSheetDialogFragment` and provides a structure for implementing a Compose-based bottom sheet.
 */
@Deprecated(
    message = "Use KPBottomSheetFragment instead for consistent naming. " +
        "This API will get removed in future releases.",
    replaceWith = ReplaceWith(
        expression = "KPBottomSheetFragment"
    ),
    level = DeprecationLevel.WARNING
)
public abstract class TrendyolDesignBottomSheetFragment : BottomSheetDialogFragment() {

    /**
     * An abstract composable function to define the content of the page.
     * This function needs to be implemented by subclasses to provide the specific content for the bottom sheet.
     */
    @Composable
    protected abstract fun PageContent()

    /**
     * Overrides the default theme for the bottom sheet dialog. This style makes corner of the bottom sheet soft.
     *
     * @return The resource ID of the theme to be applied.
     */
    override fun getTheme(): Int = R.style.BaseBottomSheetDialog

    /**
     * Creates and returns the view hierarchy associated with the fragment.
     * This method inflates a `ComposeView` and sets the content to the `PageContent` composable function.
     *
     * @param inflater The LayoutInflater object that can be used to inflate any views in the fragment.
     * @param container If non-null, this is the parent view that the fragment's UI should be attached to.
     * @param savedInstanceState If non-null, this fragment is being re-constructed from a previous saved state as given here.
     * @return The `ComposeView` with the content set to the `PageContent` composable function.
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = content {
        PageContent()
    }
}
