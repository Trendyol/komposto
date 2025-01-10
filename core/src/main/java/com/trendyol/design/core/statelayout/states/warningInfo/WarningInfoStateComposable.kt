package com.trendyol.design.core.statelayout.states.warningInfo

import StateWarningInfoDefault
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.button.Button
import com.trendyol.design.core.button.KPButton
import com.trendyol.design.core.button.KPButtonSize
import com.trendyol.design.core.button.KPButtonStyle
import com.trendyol.design.core.button.TrendyolButtonSize
import com.trendyol.design.core.button.TrendyolButtonStyle
import com.trendyol.design.core.icon.Icon
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.statelayout.WarningInfoStateLayoutStyle
import com.trendyol.design.core.text.Text
import com.trendyol.design.core.preview.PreviewTheme
import com.trendyol.design.core.statelayout.KPWarningInfoStateLayoutStyle
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign
import com.trendyol.theme.TrendyolDesign

/**
 * A composable function that displays a warning or informational state using a combination of icons, text,
 * and buttons. The layout and content are defined by the provided [WarningInfoStateLayoutStyle].
 *
 * This composable is useful for presenting user feedback such as warnings, errors, or general information
 * with actionable buttons.
 *
 * @param modifier [Modifier] to be applied to the root container of this composable. Default is [Modifier].
 * @param warningInfoStateLayoutStyle A [WarningInfoStateLayoutStyle] instance that specifies the layout style,
 * including the icon, title, description, and button configurations.
 *
 * ## Example Usage
 * ```
 * KPWarningInfoStateComposable(
 *     warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.SingleButtonFullVersion(
 *         icon = KPIcons.Fill.StateWarningInfoDefault,
 *         iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
 *         title = "Empty State Title",
 *         description = "Description will be here. Description can be for example; 2",
 *         primaryButtonText = "primaryButton",
 *         primaryButtonClickListener = {}
 *     )
 * )
 * ```
 *
 * ### Layout Description
 * - The composable displays an icon, a title, a description, and up to two buttons.
 * - The icon size, title style, and button styles are derived from the [WarningInfoStateLayoutStyle].
 * - Buttons are optional and are only displayed if text and click listeners are provided in the model.
 *
 * @see WarningInfoStateLayoutStyle
 * @see KPWarningInfoStateLayoutStyle
 */
@Composable
public fun KPWarningInfoStateComposable(
    modifier: Modifier = Modifier,
    warningInfoStateLayoutStyle: WarningInfoStateLayoutStyle,
) {
    val infoModel = warningInfoStateLayoutStyle.infoModel
    val iconSize = infoModel.iconSize

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(KPDesign.colors.colorBackground),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            KPIcon(
                modifier = Modifier.padding(bottom = 8.dp),
                imageVector = getIcon(infoModel.image),
                size = iconSize
            )
            infoModel.title?.let {
                KPText(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
                    text = infoModel.title,
                    style = KPDesign.typography.titleMediumColorOnSurfaceVariant2,
                )
            }
            infoModel.description?.let {
                KPText(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
                    text = infoModel.description,
                    style = KPDesign.typography.body1MediumColorOnSurfaceVariant1,
                )
            }
            if (infoModel.buttonsInfoModel?.primaryButtonText.isNullOrEmpty().not()) {
                Spacer(modifier = Modifier.size(28.dp))
                KPButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    onClick = infoModel.buttonsInfoModel?.primaryButtonClickListener ?: {},
                    style = KPButtonStyle.Primary,
                    size = KPButtonSize.Large
                ) {
                    infoModel.buttonsInfoModel?.primaryButtonText?.let {
                        KPText(text = it)
                    }
                }
            }

            if (infoModel.buttonsInfoModel?.secondaryButtonText.isNullOrEmpty().not()) {
                Spacer(modifier = Modifier.size(16.dp))
                KPButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    onClick = infoModel.buttonsInfoModel?.secondaryButtonClickListener ?: {},
                    style = KPButtonStyle.Secondary,
                    size = KPButtonSize.Large
                ) {
                    infoModel.buttonsInfoModel?.secondaryButtonText?.let {
                        KPText(text = it)
                    }
                }
            }
        }
    }
}

@Composable
@Deprecated(
    message = "Use KPWarningInfoStateComposable instead for consistent naming. " +
        "This API will get removed in future releases.",
    level = DeprecationLevel.WARNING
)
public fun WarningInfoStateComposable(
    modifier: Modifier = Modifier,
    warningInfoStateLayoutStyle: WarningInfoStateLayoutStyle,
) {
    val infoModel = warningInfoStateLayoutStyle.infoModel
    val iconSize = infoModel.iconSize

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(TrendyolDesign.colors.colorBackground),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .size(iconSize.dp),
                shape = CircleShape,
                elevation = 1.dp,
            ) {
                Icon(
                    modifier = Modifier,
                    imageVector = getIcon(infoModel.image),
                    size = iconSize,
                )
            }
            infoModel.title?.let {
                Text(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
                    text = infoModel.title,
                    style = TrendyolDesign.typography.titleMediumColorOnSurfaceVariant2,
                    textAlign = infoModel.titleTextAlignment,
                )
            }
            infoModel.description?.let {
                Text(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
                    text = infoModel.description,
                    style = TrendyolDesign.typography.body1MediumColorOnSurfaceVariant1,
                    textAlign = infoModel.descriptionTextAlignment,
                )
            }
            if (infoModel.buttonsInfoModel?.primaryButtonText.isNullOrEmpty().not()) {
                Spacer(modifier = Modifier.size(28.dp))
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
    return icon ?: KPIcons.Fill.StateWarningInfoDefault
}

@Preview(showBackground = true)
@Composable
private fun SingleButtonFullVersionStylePreview() {
    PreviewTheme {
        KPWarningInfoStateComposable(
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.SingleButtonFullVersion(
                icon = KPIcons.Fill.StateWarningInfoDefault,
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
        KPWarningInfoStateComposable(
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.SingleButtonNoTitle(
                icon = KPIcons.Fill.StateWarningInfoDefault,
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
        KPWarningInfoStateComposable(
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.SingleButtonNoDescription(
                icon = KPIcons.Fill.StateWarningInfoDefault,
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
        KPWarningInfoStateComposable(
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsFullVersion(
                icon = KPIcons.Fill.StateWarningInfoDefault,
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
        KPWarningInfoStateComposable(
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsNoTitle(
                icon = KPIcons.Fill.StateWarningInfoDefault,
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
        KPWarningInfoStateComposable(
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsNoDescription(
                icon = KPIcons.Fill.StateWarningInfoDefault,
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
        KPWarningInfoStateComposable(
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonFullVersion(
                icon = KPIcons.Fill.StateWarningInfoDefault,
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
        KPWarningInfoStateComposable(
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonNoTitle(
                icon = KPIcons.Fill.StateWarningInfoDefault,
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
        KPWarningInfoStateComposable(
            warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonNoDescription(
                icon = KPIcons.Fill.StateWarningInfoDefault,
                title = "Empty State Title",
                iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
            )
        )
    }
}
