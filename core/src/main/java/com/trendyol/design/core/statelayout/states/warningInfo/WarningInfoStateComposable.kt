package com.trendyol.design.core.statelayout.states.warningInfo

import WarningInfoStateDefaultIcon
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.button.Button
import com.trendyol.design.core.button.TrendyolButtonSize
import com.trendyol.design.core.button.TrendyolButtonStyle
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.previewtheme.PreviewTheme
import com.trendyol.design.core.statelayout.StateLayoutStyle
import com.trendyol.design.core.statelayout.TrendyolStateLayoutStyle
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

@Composable
fun WarningInfoStateComposable(
    modifier: Modifier = Modifier,
    stateLayoutStyle: StateLayoutStyle,
) {
    val infoModel = stateLayoutStyle.infoModel
    val iconSize = infoModel.iconSize

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = getIcon(infoModel.image),
                size = iconSize
            )
            infoModel.title?.let {
                Spacer(modifier = Modifier.size(12.dp))
                Text(
                    modifier = Modifier
                        .padding(horizontal = 16.dp),
                    text = infoModel.title,
                    style = TrendyolDesign.typography.titleMediumColorOnSurfaceVariant2,
                )
            }
            infoModel.description?.let {
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    modifier = Modifier
                        .padding(horizontal = 16.dp),
                    text = infoModel.description,
                    style = TrendyolDesign.typography.body1MediumColorOnSurfaceVariant1,
                )
            }
            if (infoModel.buttonsInfoModel?.primaryButtonText.isNullOrEmpty().not()) {
                Spacer(modifier = Modifier.size(32.dp))
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    onClick = infoModel.buttonsInfoModel?.primaryButtonClickListener ?: {},
                    style = TrendyolButtonStyle.Primary,
                    size = TrendyolButtonSize.Large
                ) {
                    infoModel.buttonsInfoModel?.primaryButtonText?.let {
                        Text(text = it)
                    }
                }
            }

            if (infoModel.buttonsInfoModel?.secondaryButtonText.isNullOrEmpty().not()) {
                Spacer(modifier = Modifier.size(16.dp))
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    onClick = infoModel.buttonsInfoModel?.secondaryButtonClickListener ?: {},
                    style = TrendyolButtonStyle.Secondary,
                    size = TrendyolButtonSize.Large
                ) {
                    infoModel.buttonsInfoModel?.secondaryButtonText?.let {
                        Text(text = it)
                    }
                }
            }
        }
    }
}

private fun getIcon(icon: ImageVector?): ImageVector {
    return icon ?: WarningInfoStateDefaultIcon
}

@Preview(showBackground = true)
@Composable
private fun SingleButtonFullVersionStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            stateLayoutStyle = TrendyolStateLayoutStyle.SingleButtonFullVersion(
                icon = WarningInfoStateDefaultIcon,
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                title = "Empty State Title",
                description = "Description will be here. Description can be for example; 2",
                primaryButtonText = "primaryButton",
                primaryButtonClickListener = {}
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SingleButtonNoTitleStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            stateLayoutStyle = TrendyolStateLayoutStyle.SingleButtonNoTitle(
                icon = WarningInfoStateDefaultIcon,
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                description = "Description will be here. Description can be for example; 2",
                primaryButtonText = "primaryButton",
                primaryButtonClickListener = {}
            ),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SingleButtonNoDescriptionStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            stateLayoutStyle = TrendyolStateLayoutStyle.SingleButtonNoDescription(
                icon = WarningInfoStateDefaultIcon,
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                title = "Empty State Title",
                primaryButtonText = "primaryButton",
                primaryButtonClickListener = {}
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TwoButtonsFullVersionStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            stateLayoutStyle = TrendyolStateLayoutStyle.TwoButtonsFullVersion(
                icon = WarningInfoStateDefaultIcon,
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                title = "Empty State Title",
                description = "Description will be here. Description can be for example; 2",
                primaryButtonText = "primaryButton",
                primaryButtonClickListener = {},
                secondaryButtonText = "secondaryButton",
                secondaryButtonClickListener = {}
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TwoButtonsNoTitleStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            stateLayoutStyle = TrendyolStateLayoutStyle.TwoButtonsNoTitle(
                icon = WarningInfoStateDefaultIcon,
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                description = "Description will be here. Description can be for example; 2",
                primaryButtonText = "primaryButton",
                primaryButtonClickListener = {},
                secondaryButtonText = "secondaryButton",
                secondaryButtonClickListener = {}
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TwoButtonsNoDescriptionStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            stateLayoutStyle = TrendyolStateLayoutStyle.TwoButtonsNoDescription(
                icon = WarningInfoStateDefaultIcon,
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                title = "Empty State Title",
                primaryButtonText = "primaryButton",
                primaryButtonClickListener = {},
                secondaryButtonText = "secondaryButton",
                secondaryButtonClickListener = {}
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NoButtonFullVersionStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            stateLayoutStyle = TrendyolStateLayoutStyle.NoButtonFullVersion(
                icon = WarningInfoStateDefaultIcon,
                title = "Empty State Title",
                description = "Description will be here. Description can be for example; 2",
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NoButtonNoTitleStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            stateLayoutStyle = TrendyolStateLayoutStyle.NoButtonNoTitle(
                icon = WarningInfoStateDefaultIcon,
                description = "Description will be here. Description can be for example; 2",
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NoButtonNoDescriptionStylePreview() {
    PreviewTheme {
        WarningInfoStateComposable(
            stateLayoutStyle = TrendyolStateLayoutStyle.NoButtonNoDescription(
                icon = WarningInfoStateDefaultIcon,
                title = "Empty State Title",
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
            )
        )
    }
}
