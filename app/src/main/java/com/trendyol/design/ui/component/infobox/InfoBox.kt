@file:OptIn(ExperimentalKompostoApi::class)

package com.trendyol.design.ui.component.infobox

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.infobox.KPInfoBox
import com.trendyol.design.core.infobox.KPInfoBoxStyle
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.design.ui.theme.TrendyolTheme

private const val TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eget metus commodo."

@Preview
@ShowkaseComposable(
    group = Group.INFO_BOX,
    name = Component.INFO_BOX_LEFT_ICON,
    styleName = "Info Box Left Icon"
)
@Composable
internal fun InfoBox_LeftIcon() {
    TrendyolTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Orange,
            text = TEXT,
            iconPosition = Arrangement.Start
        )
    }
}

@Preview
@ShowkaseComposable(
    group = Group.INFO_BOX,
    name = Component.INFO_BOX_RIGHT_ICON,
    styleName = "Info Box Right Icon"
)
@Composable
internal fun InfoBox_RightIcon() {
    TrendyolTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Red,
            text = TEXT,
            iconPosition = Arrangement.End
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INFO_BOX,
    name = Component.INFO_BOX_NO_ICON,
    styleName = "Info Box No Icon"
)
@Composable
internal fun InfoBox_NoIcon() {
    TrendyolTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Gray,
            text = TEXT
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INFO_BOX,
    name = Component.INFO_BOX_LEFT_ICON,
    styleName = "Info Box Left Icon With Border"
)
@Composable
internal fun InfoBox_LeftIconWithBorder() {
    TrendyolTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.White,
            text = TEXT,
            iconPosition = Arrangement.Start,
            showBorder = true
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INFO_BOX,
    name = Component.INFO_BOX_RIGHT_ICON,
    styleName = "Info Box Right Icon With Border"
)
@Composable
internal fun InfoBox_RightIconWithBorder() {
    TrendyolTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Blue,
            text = TEXT,
            iconPosition = Arrangement.End,
            showBorder = true
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INFO_BOX,
    name = Component.INFO_BOX_NO_ICON,
    styleName = "Info Box No Icon With Border"
)
@Composable
internal fun InfoBox_NoIconWithBorder() {
    TrendyolTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Green,
            text = TEXT,
            showBorder = true
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INFO_BOX,
    name = Component.INFO_BOX_LEFT_ICON,
    styleName = "Info Box Left Icon With Dashed Border"
)
@Composable
internal fun InfoBox_LeftIconWithDashedBorder() {
    TrendyolTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Green,
            iconPosition = Arrangement.Start,
            text = TEXT,
            showDashedBorder = true
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INFO_BOX,
    name = Component.INFO_BOX_RIGHT_ICON,
    styleName = "Info Box Right Icon With Dashed Border"
)
@Composable
internal fun InfoBox_RightIconWithDashedBorder() {
    TrendyolTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Green,
            iconPosition = Arrangement.End,
            text = TEXT,
            showDashedBorder = true
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INFO_BOX,
    name = Component.INFO_BOX_NO_ICON,
    styleName = "Info Box No Icon With Dashed Border"
)
@Composable
internal fun InfoBox_NoIconWithDashedBorder() {
    TrendyolTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Blue,
            text = TEXT,
            showDashedBorder = true
        )
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INFO_BOX,
    name = Component.INFO_BOX_LEFT_ICON,
    styleName = "Info Box Left Icon With Two Texts"
)
@Composable
internal fun InfoBox_LeftIconWithTwoTexts() {
    TrendyolTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Pink,
            iconPosition = Arrangement.Start
        ) {
            Text(
                text = TEXT
            )
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = TEXT
            )
        }
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INFO_BOX,
    name = Component.INFO_BOX_LEFT_ICON,
    styleName = "Info Box Left Icon With Single Line Two Texts"
)
@Composable
internal fun InfoBox_LeftIconWithSingleLineTwoTexts() {
    TrendyolTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Pink,
            iconPosition = Arrangement.Start
        ) {
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            )
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            )
        }
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INFO_BOX,
    name = Component.INFO_BOX_RIGHT_ICON,
    styleName = "Info Box Right Icon With Two Texts"
)
@Composable
internal fun InfoBox_RightIconWithBorderAndTwoTexts() {
    TrendyolTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Pink,
            iconPosition = Arrangement.End,
            showBorder = true
        ) {
            Text(
                text = TEXT
            )
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = TEXT
            )
        }
    }
}

@Preview(showBackground = true)
@ShowkaseComposable(
    group = Group.INFO_BOX,
    name = Component.INFO_BOX_NO_ICON,
    styleName = "Info Box No Icon With Two Texts"
)
@Composable
internal fun InfoBox_NoIconWithBorderAndTwoTexts() {
    TrendyolTheme {
        KPInfoBox(
            style = KPInfoBoxStyle.Pink,
        ) {
            Text(
                text = TEXT
            )
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = TEXT
            )
        }
    }
}
