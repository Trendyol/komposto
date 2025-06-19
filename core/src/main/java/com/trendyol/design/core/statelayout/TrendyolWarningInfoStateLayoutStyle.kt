package com.trendyol.design.core.statelayout

import androidx.compose.ui.graphics.vector.ImageVector
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.icon.icons.fill.StateWarningInfoDefault

public sealed interface KPWarningInfoStateLayoutStyle {

    public data class SingleButtonFullVersion(
        val icon: ImageVector = KPIcons.Fill.StateWarningInfoDefault,
        val iconSize: StateLayoutIconSize,
        val title: String = DEFAULT_TITLE,
        val description: String = DEFAULT_DESCRIPTION,
        val primaryButtonText: String = DEFAULT_PRIMARY_BUTTON_TEXT,
        val primaryButtonClickListener: (() -> Unit),
    ) : WarningInfoStateLayoutStyle {
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

    public data class SingleButtonNoTitle(
        val icon: ImageVector = KPIcons.Fill.StateWarningInfoDefault,
        val iconSize: StateLayoutIconSize,
        val description: String = DEFAULT_DESCRIPTION,
        val primaryButtonText: String = DEFAULT_PRIMARY_BUTTON_TEXT,
        val primaryButtonClickListener: (() -> Unit),
    ) : WarningInfoStateLayoutStyle {
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

    public data class SingleButtonNoDescription(
        val icon: ImageVector = KPIcons.Fill.StateWarningInfoDefault,
        val iconSize: StateLayoutIconSize,
        val title: String = DEFAULT_TITLE,
        val primaryButtonText: String = DEFAULT_PRIMARY_BUTTON_TEXT,
        val primaryButtonClickListener: (() -> Unit),
    ) : WarningInfoStateLayoutStyle {
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

    public data class TwoButtonsFullVersion(
        val icon: ImageVector = KPIcons.Fill.StateWarningInfoDefault,
        val iconSize: StateLayoutIconSize,
        val title: String,
        val description: String,
        val primaryButtonText: String,
        val secondaryButtonText: String,
        val primaryButtonClickListener: (() -> Unit),
        val secondaryButtonClickListener: (() -> Unit),
    ) : WarningInfoStateLayoutStyle {
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

    public data class TwoButtonsNoTitle(
        val icon: ImageVector = KPIcons.Fill.StateWarningInfoDefault,
        val iconSize: StateLayoutIconSize,
        val description: String,
        val primaryButtonText: String,
        val secondaryButtonText: String,
        val primaryButtonClickListener: (() -> Unit),
        val secondaryButtonClickListener: (() -> Unit),
    ) : WarningInfoStateLayoutStyle {
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

    public data class TwoButtonsNoDescription(
        val icon: ImageVector = KPIcons.Fill.StateWarningInfoDefault,
        val iconSize: StateLayoutIconSize,
        val title: String,
        val primaryButtonText: String,
        val secondaryButtonText: String,
        val primaryButtonClickListener: (() -> Unit),
        val secondaryButtonClickListener: (() -> Unit),
    ) : WarningInfoStateLayoutStyle {
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

    public data class NoButtonFullVersion(
        val icon: ImageVector = KPIcons.Fill.StateWarningInfoDefault,
        val iconSize: StateLayoutIconSize,
        val title: String,
        val description: String,
    ) : WarningInfoStateLayoutStyle {
        override val infoModel: InfoModel
            get() = InfoModel(
                title = title,
                description = description,
                image = icon,
                iconSize = iconSize
            )
    }

    public data class NoButtonNoTitle(
        val icon: ImageVector = KPIcons.Fill.StateWarningInfoDefault,
        val iconSize: StateLayoutIconSize,
        val description: String,
    ) : WarningInfoStateLayoutStyle {
        override val infoModel: InfoModel
            get() = InfoModel(
                description = description,
                image = icon,
                iconSize = iconSize
            )
    }

    public data class NoButtonNoDescription(
        val icon: ImageVector = KPIcons.Fill.StateWarningInfoDefault,
        val iconSize: StateLayoutIconSize,
        val title: String,
    ) : WarningInfoStateLayoutStyle {
        override val infoModel: InfoModel
            get() = InfoModel(
                title = title,
                image = icon,
                iconSize = iconSize
            )
    }

    public companion object {
        private const val DEFAULT_TITLE = "İçerik Bulunamadı"
        private const val DEFAULT_DESCRIPTION = "Yeni içerikler keşfedebilirsin."
        private const val DEFAULT_PRIMARY_BUTTON_TEXT = "Alışverişe Devam Et"
    }
}
