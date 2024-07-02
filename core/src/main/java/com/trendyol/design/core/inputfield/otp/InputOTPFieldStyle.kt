package com.trendyol.design.core.inputfield.otp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color

/**
 * An interface for defining the styling of an OTP (One-Time Password) input field.
 * This interface provides several composable methods to retrieve different style attributes
 * based on the state of the input field such as whether it is enabled, focused, or has an error.
 *
 * The methods in this interface are expected to be implemented in a way that they return
 * the appropriate `Color` values wrapped in `State` objects for reactive updates.
 */
@Immutable
interface InputOTPFieldStyle {

    /**
     * Returns the border color for the OTP input field in style based on its state.
     *
     * @param enabled Indicates whether the input field is enabled.
     *                When false, the field is not interactive.
     * @param isFocused Indicates whether the input field is currently focused.
     *                  When true, the field is active and ready for input.
     * @param isError Indicates whether the input field is in an error state.
     *                When true, the field should display an error indication.
     * @return A `State` containing the `Color` value for the border based on the current state.
     */
    @Composable
    @ReadOnlyComposable
    fun getBorderColor(enabled: Boolean, isFocused: Boolean, isError: Boolean): State<Color>

    /**
     * Returns the text color for the OTP input field in style based on whether it is enabled or disabled.
     *
     * @param enabled Indicates whether the input field is enabled.
     *                When false, the field is not interactive.
     * @return A `State` containing the `Color` value for the text based on the current state.
     */
    @Composable
    @ReadOnlyComposable
    fun getTextColor(enabled: Boolean): State<Color>

    /**
     * Returns the background color for the OTP input field in style based on its state.
     *
     * @param enabled Indicates whether the input field is enabled.
     *                When false, the field is not interactive.
     * @param isError Indicates whether the input field is in an error state.
     *                When true, the field should display an error indication.
     * @return A `State` containing the `Color` value for the background based on the current state.
     */
    @Composable
    @ReadOnlyComposable
    fun getBackgroundColor(enabled: Boolean, isError: Boolean): State<Color>

    /**
     * Returns the tab indicator color for the OTP input field in style based on its state.
     * The tab indicator is typically used to show the cursor or active input position.
     *
     * @param enabled Indicates whether the input field is enabled.
     *                When false, the field is not interactive.
     * @param isFocused Indicates whether the input field is currently focused.
     *                  When true, the field is active and ready for input.
     * @param isError Indicates whether the input field is in an error state.
     *                When true, the field should display an error indication.
     * @return A `State` containing the `Color` value for the tab indicator based on the current state.
     */
    @Composable
    @ReadOnlyComposable
    fun getTabIndicatorColor(enabled: Boolean, isFocused: Boolean, isError: Boolean): State<Color>
}