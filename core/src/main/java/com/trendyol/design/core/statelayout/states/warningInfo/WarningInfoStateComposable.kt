package com.trendyol.design.core.statelayout.states.warningInfo

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.button.Button
import com.trendyol.design.core.button.TrendyolButtonSize
import com.trendyol.design.core.button.TrendyolButtonStyle
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.IconSize
import com.trendyol.design.core.icon.TrendyolIconSize
import com.trendyol.design.core.icon.icons.fill.WarningInfoStateDefaultIcon
import com.trendyol.design.core.previewtheme.PreviewTheme
import com.trendyol.design.core.statelayout.ButtonsInfoModel
import com.trendyol.design.core.statelayout.InfoModel
import com.trendyol.design.core.statelayout.LayoutStyle
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

@Composable
fun WarningInfoStateComposable(
    modifier: Modifier = Modifier,
    infoModel: InfoModel
) {
    val iconSize = remember { getIconSize(infoModel.layoutStyle) }

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Icon(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                imageVector = getIcon(infoModel.image),
                size = iconSize
            )
            Spacer(modifier = Modifier.size(12.dp))
            infoModel.title?.let {
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = it,
                    style = TrendyolDesign.typography.titleMediumColorOnSurfaceVariant2,
                )
            }
            infoModel.description?.let {
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = it,
                    style = TrendyolDesign.typography.body1MediumColorOnSurfaceVariant1,
                )
            }
            Spacer(modifier = Modifier.size(32.dp))

            if (infoModel.buttonsInfoModel.showPrimaryButton) {
                Button(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    onClick = infoModel.buttonsInfoModel.primaryButtonClickListener ?: {},
                    style = TrendyolButtonStyle.Primary,
                    size = TrendyolButtonSize.Large
                ) {
                    infoModel.buttonsInfoModel.primaryButtonText?.let {
                        Text(text = it)
                    }
                }
            }

            if (infoModel.buttonsInfoModel.showSecondaryButton) {
                Spacer(modifier = Modifier.size(16.dp))
                Button(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    onClick = infoModel.buttonsInfoModel.secondaryButtonClickListener ?: {},
                    style = TrendyolButtonStyle.Secondary,
                    size = TrendyolButtonSize.Large
                ) {
                    infoModel.buttonsInfoModel.secondaryButtonText?.let {
                        Text(text = it)
                    }
                }
            }
        }
    }
}

private fun getIconSize(layoutStyle: LayoutStyle): IconSize {
    return when (layoutStyle) {
        LayoutStyle.SMALL -> TrendyolIconSize.WarningInfoStateLayoutSmallIcon
        LayoutStyle.MEDIUM -> TrendyolIconSize.WarningInfoStateLayoutMediumIcon
    }
}

private fun getIcon(icon: ImageVector?): ImageVector {
    return icon ?: WarningInfoStateDefaultIcon
}

@Preview(showBackground = true)
@Composable
private fun DefaultSmallStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            infoModel = InfoModel(
                image = WarningInfoStateDefaultIcon,
                layoutStyle = LayoutStyle.SMALL,
                title = "Empty State Title",
                description = "Description will be here. Description can be for example; 2 ",
                buttonsInfoModel = ButtonsInfoModel(
                    showPrimaryButton = true,
                    showSecondaryButton = false,
                    primaryButtonClickListener = {},
                    secondaryButtonClickListener = {},
                    primaryButtonText = "primaryButton",
                    secondaryButtonText = "secondaryButton",
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultMediumStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            infoModel = InfoModel(
                image = WarningInfoStateDefaultIcon,
                layoutStyle = LayoutStyle.MEDIUM,
                title = "Empty State Title",
                description = "Description will be here. Description can be for example; 2 ",
                buttonsInfoModel = ButtonsInfoModel(
                    showPrimaryButton = true,
                    showSecondaryButton = false,
                    primaryButtonClickListener = {},
                    secondaryButtonClickListener = {},
                    primaryButtonText = "primaryButton",
                    secondaryButtonText = "secondaryButton",
                )
            )

        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TwoButtonSmallStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            infoModel = InfoModel(
                image = WarningInfoStateDefaultIcon,
                layoutStyle = LayoutStyle.SMALL,
                title = "Empty State Title",
                description = "Description will be here. Description can be for example; 2 ",
                buttonsInfoModel = ButtonsInfoModel(
                    showPrimaryButton = true,
                    showSecondaryButton = true,
                    primaryButtonClickListener = {},
                    secondaryButtonClickListener = {},
                    primaryButtonText = "primaryButton",
                    secondaryButtonText = "secondaryButton",
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TwoButtonMediumStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            infoModel = InfoModel(
                image = WarningInfoStateDefaultIcon,
                layoutStyle = LayoutStyle.MEDIUM,
                title = "Empty State Title",
                description = "Description will be here. Description can be for example; 2 ",
                buttonsInfoModel = ButtonsInfoModel(
                    showPrimaryButton = true,
                    showSecondaryButton = true,
                    primaryButtonClickListener = {},
                    secondaryButtonClickListener = {},
                    primaryButtonText = "primaryButton",
                    secondaryButtonText = "secondaryButton",
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NoDescriptionSmallStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            infoModel = InfoModel(
                image = WarningInfoStateDefaultIcon,
                layoutStyle = LayoutStyle.SMALL,
                title = "Empty State Title",
                description = null,
                buttonsInfoModel = ButtonsInfoModel(
                    showPrimaryButton = true,
                    showSecondaryButton = false,
                    primaryButtonClickListener = {},
                    secondaryButtonClickListener = {},
                    primaryButtonText = "primaryButton",
                    secondaryButtonText = "secondaryButton",
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NoDescriptionMediumStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            infoModel = InfoModel(
                image = WarningInfoStateDefaultIcon,
                layoutStyle = LayoutStyle.MEDIUM,
                title = "Empty State Title",
                description = null,
                buttonsInfoModel = ButtonsInfoModel(
                    showPrimaryButton = true,
                    showSecondaryButton = false,
                    primaryButtonClickListener = {},
                    secondaryButtonClickListener = {},
                    primaryButtonText = "primaryButton",
                    secondaryButtonText = "secondaryButton",
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NoTitleSmallStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            infoModel = InfoModel(
                image = WarningInfoStateDefaultIcon,
                layoutStyle = LayoutStyle.SMALL,
                title = null,
                description = "Description will be here. Description can be for example; 2 ",
                buttonsInfoModel = ButtonsInfoModel(
                    showPrimaryButton = true,
                    showSecondaryButton = false,
                    primaryButtonClickListener = {},
                    secondaryButtonClickListener = {},
                    primaryButtonText = "primaryButton",
                    secondaryButtonText = "secondaryButton",
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NoTitleMediumStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            infoModel = InfoModel(
                image = WarningInfoStateDefaultIcon,
                layoutStyle = LayoutStyle.MEDIUM,
                title = null,
                description = "Description will be here. Description can be for example; 2 ",
                buttonsInfoModel = ButtonsInfoModel(
                    showPrimaryButton = true,
                    showSecondaryButton = false,
                    primaryButtonClickListener = {},
                    secondaryButtonClickListener = {},
                    primaryButtonText = "primaryButton",
                    secondaryButtonText = "secondaryButton",
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NoButtonSmallStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            infoModel = InfoModel(
                image = WarningInfoStateDefaultIcon,
                layoutStyle = LayoutStyle.SMALL,
                title = "Empty State Title",
                description = "Description will be here. Description can be for example; 2 ",
                buttonsInfoModel = ButtonsInfoModel(
                    showPrimaryButton = false,
                    showSecondaryButton = false,
                    primaryButtonClickListener = {},
                    secondaryButtonClickListener = {},
                    primaryButtonText = "primaryButton",
                    secondaryButtonText = "secondaryButton",
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NoButtonMediumStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            infoModel = InfoModel(
                image = WarningInfoStateDefaultIcon,
                layoutStyle = LayoutStyle.MEDIUM,
                title = "Empty State Title",
                description = "Description will be here. Description can be for example; 2 ",
                buttonsInfoModel = ButtonsInfoModel(
                    showPrimaryButton = false,
                    showSecondaryButton = false,
                    primaryButtonClickListener = {},
                    secondaryButtonClickListener = {},
                    primaryButtonText = "primaryButton",
                    secondaryButtonText = "secondaryButton",
                )
            )
        )
    }
}
