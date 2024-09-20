package com.trendyol.design.core.inputfield.otp

import androidx.compose.material.ContentAlpha
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import com.trendyol.theme.TrendyolDesign

/**
 * A sealed interface defining styles for the OTP (One-Time Password) input field.
 * This interface provides different implementations for various input field styles,
 * such as Outline and Filled, each determining the appearance based on the component's state.
 *
 * Implementations of this interface use Composable functions to dynamically provide style attributes
 * like border color, text color, background color, and tab indicator color.
 */
public sealed interface TrendyolInputOTPFieldStyle {

    /**
     * An object defining the Outline style for the OTP input field.
     * This style typically features a border that changes color based on the focus and error states.
     */
    public data object Outline : InputOTPFieldStyle {

        @Composable
        override fun getBorderColor(
            enabled: Boolean,
            isFocused: Boolean,
            isError: Boolean
        ): State<Color> {
            val color = when {
                isError -> TrendyolDesign.colors.colorWarning
                !isFocused && enabled -> TrendyolDesign.colors.colorOnSurfaceVariant1
                isFocused && enabled -> TrendyolDesign.colors.colorPrimary
                else -> TrendyolDesign.colors.colorBorder
            }

            return rememberUpdatedState(newValue = color)
        }

        @Composable
        override fun getTextColor(enabled: Boolean): State<Color> {
            val color = if (enabled) {
                TrendyolDesign.colors.colorOnSurfaceVariant3
            } else {
                TrendyolDesign.colors.colorOnSurfaceVariant1
            }

            return rememberUpdatedState(newValue = color)
        }

        @Composable
        override fun getBackgroundColor(enabled: Boolean, isError: Boolean): State<Color> {
            return rememberUpdatedState(newValue = TrendyolDesign.colors.colorSurface)
        }

        @Composable
        override fun getTabIndicatorColor(
            enabled: Boolean,
            isFocused: Boolean,
            isError: Boolean
        ): State<Color> {
            val color = when {
                isError -> TrendyolDesign.colors.colorWarning
                !isFocused && enabled -> TrendyolDesign.colors.colorOnSurfaceVariant1
                isFocused && enabled -> TrendyolDesign.colors.colorPrimary
                else -> TrendyolDesign.colors.colorBorder
            }

            return rememberUpdatedState(newValue = color)
        }
    }

    public data object Filled : InputOTPFieldStyle {
        @Composable
        override fun getBorderColor(
            enabled: Boolean,
            isFocused: Boolean,
            isError: Boolean
        ): State<Color> {
            val color = when {
                isError -> TrendyolDesign.colors.colorWarning
                !enabled -> TrendyolDesign.colors.colorBorder.copy(alpha = ContentAlpha.disabled)
                else -> TrendyolDesign.colors.colorBorder
            }

            return rememberUpdatedState(newValue = color)
        }

        @Composable
        override fun getTextColor(enabled: Boolean): State<Color> {
            val color = if (enabled) {
                TrendyolDesign.colors.colorOnSurfaceVariant3
            } else {
                TrendyolDesign.colors.colorOnSurfaceVariant1.copy(alpha = ContentAlpha.disabled)
            }

            return rememberUpdatedState(newValue = color)
        }

        @Composable
        override fun getBackgroundColor(enabled: Boolean, isError: Boolean): State<Color> {
            val color = when {
                isError -> TrendyolDesign.colors.colorWarningVariant1
                !isError && enabled -> TrendyolDesign.colors.colorBackground
                else -> TrendyolDesign.colors.colorBackground.copy(alpha = ContentAlpha.disabled)
            }

            return rememberUpdatedState(newValue = color)
        }

        @Composable
        override fun getTabIndicatorColor(
            enabled: Boolean,
            isFocused: Boolean,
            isError: Boolean
        ): State<Color> {
            val color = when {
                isError -> TrendyolDesign.colors.colorWarning
                !enabled -> TrendyolDesign.colors.colorBorder.copy(alpha = ContentAlpha.disabled)
                isFocused && enabled -> TrendyolDesign.colors.colorPrimary
                else -> TrendyolDesign.colors.colorBorder
            }

            return rememberUpdatedState(newValue = color)
        }
    }
}
