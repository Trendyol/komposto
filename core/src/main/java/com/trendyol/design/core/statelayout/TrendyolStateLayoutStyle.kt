package com.trendyol.design.core.statelayout

import WarningInfoStateDefaultIcon
import androidx.compose.ui.graphics.vector.ImageVector
import com.trendyol.design.core.icon.StateLayoutIconSize

sealed interface TrendyolStateLayoutStyle {

    data class SingleButtonFullVersion(
        val icon: ImageVector = WarningInfoStateDefaultIcon,
        val iconSize: StateLayoutIconSize,
        val title: String = DEFAULT_TITLE,
        val description: String = DEFAULT_DESCRIPTION,
        val primaryButtonText: String = DEFAULT_PRIMARY_BUTTON_TEXT,
        val primaryButtonClickListener: (() -> Unit)? = null,
    ) : StateLayoutStyle {
        override val infoModel: InfoModel
            get() = InfoModel(
                title = title,
                description = description,
                buttonsInfoModel = ButtonsInfoModel(
                    primaryButtonText = primaryButtonText,
                    primaryButtonClickListener = primaryButtonClickListener,
                ),
                image = icon,
                iconSize = iconSize
            )
    }

    data class SingleButtonNoTitle(
        val icon: ImageVector = WarningInfoStateDefaultIcon,
        val iconSize: StateLayoutIconSize,
        val description: String = DEFAULT_DESCRIPTION,
        val primaryButtonText: String = DEFAULT_PRIMARY_BUTTON_TEXT,
        val primaryButtonClickListener: (() -> Unit)? = null,
    ) : StateLayoutStyle {
        override val infoModel: InfoModel
            get() = InfoModel(
                description = description,
                buttonsInfoModel = ButtonsInfoModel(
                    primaryButtonText = primaryButtonText,
                    primaryButtonClickListener = primaryButtonClickListener,
                ),
                image = icon,
                iconSize = iconSize
            )
    }

    data class SingleButtonNoDescription(
        val icon: ImageVector = WarningInfoStateDefaultIcon,
        val iconSize: StateLayoutIconSize,
        val title: String = DEFAULT_TITLE,
        val primaryButtonText: String = DEFAULT_PRIMARY_BUTTON_TEXT,
        val primaryButtonClickListener: (() -> Unit)? = null,
    ) : StateLayoutStyle {
        override val infoModel: InfoModel
            get() = InfoModel(
                title = title,
                buttonsInfoModel = ButtonsInfoModel(
                    primaryButtonText = primaryButtonText,
                    primaryButtonClickListener = primaryButtonClickListener,
                ),
                image = icon,
                iconSize = iconSize
            )
    }

    data class TwoButtonsFullVersion(
        val icon: ImageVector = WarningInfoStateDefaultIcon,
        val iconSize: StateLayoutIconSize,
        val title: String,
        val description: String,
        val primaryButtonText: String,
        val secondaryButtonText: String,
        val primaryButtonClickListener: (() -> Unit)? = null,
        val secondaryButtonClickListener: (() -> Unit)? = null,
    ) : StateLayoutStyle {
        override val infoModel: InfoModel
            get() = InfoModel(
                title = title,
                description = description,
                buttonsInfoModel = ButtonsInfoModel(
                    primaryButtonText = primaryButtonText,
                    secondaryButtonText = secondaryButtonText,
                    primaryButtonClickListener = primaryButtonClickListener,
                    secondaryButtonClickListener = secondaryButtonClickListener
                ),
                image = icon,
                iconSize = iconSize
            )
    }

    data class TwoButtonsNoTitle(
        val icon: ImageVector = WarningInfoStateDefaultIcon,
        val iconSize: StateLayoutIconSize,
        val description: String,
        val primaryButtonText: String,
        val secondaryButtonText: String,
        val primaryButtonClickListener: (() -> Unit)? = null,
        val secondaryButtonClickListener: (() -> Unit)? = null,
    ) : StateLayoutStyle {
        override val infoModel: InfoModel
            get() = InfoModel(
                description = description,
                buttonsInfoModel = ButtonsInfoModel(
                    primaryButtonText = primaryButtonText,
                    secondaryButtonText = secondaryButtonText,
                    primaryButtonClickListener = primaryButtonClickListener,
                    secondaryButtonClickListener = secondaryButtonClickListener
                ),
                image = icon,
                iconSize = iconSize
            )
    }

    data class TwoButtonsNoDescription(
        val icon: ImageVector = WarningInfoStateDefaultIcon,
        val iconSize: StateLayoutIconSize,
        val title: String,
        val primaryButtonText: String,
        val secondaryButtonText: String,
        val primaryButtonClickListener: (() -> Unit)? = null,
        val secondaryButtonClickListener: (() -> Unit)? = null,
    ) : StateLayoutStyle {
        override val infoModel: InfoModel
            get() = InfoModel(
                title = title,
                buttonsInfoModel = ButtonsInfoModel(
                    primaryButtonText = primaryButtonText,
                    secondaryButtonText = secondaryButtonText,
                    primaryButtonClickListener = primaryButtonClickListener,
                    secondaryButtonClickListener = secondaryButtonClickListener
                ),
                image = icon,
                iconSize = iconSize
            )
    }

    data class NoButtonFullVersion(
        val icon: ImageVector = WarningInfoStateDefaultIcon,
        val iconSize: StateLayoutIconSize,
        val title: String,
        val description: String,
    ) : StateLayoutStyle {
        override val infoModel: InfoModel
            get() = InfoModel(
                title = title,
                description = description,
                image = icon,
                iconSize = iconSize
            )
    }

    data class NoButtonNoTitle(
        val icon: ImageVector = WarningInfoStateDefaultIcon,
        val iconSize: StateLayoutIconSize,
        val description: String,
    ) : StateLayoutStyle {
        override val infoModel: InfoModel
            get() = InfoModel(
                description = description,
                image = icon,
                iconSize = iconSize
            )
    }

    data class NoButtonNoDescription(
        val icon: ImageVector = WarningInfoStateDefaultIcon,
        val iconSize: StateLayoutIconSize,
        val title: String,
    ) : StateLayoutStyle {
        override val infoModel: InfoModel
            get() = InfoModel(
                title = title,
                image = icon,
                iconSize = iconSize
            )
    }

    companion object {
        private const val DEFAULT_TITLE = "İçerik Bulunamadı"
        private const val DEFAULT_DESCRIPTION = "Yeni içerikler keşfedebilirsin."
        private const val DEFAULT_PRIMARY_BUTTON_TEXT = "Alışverişe Devam Et"
    }
}