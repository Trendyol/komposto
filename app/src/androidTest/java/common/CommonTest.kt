@file:OptIn(ExperimentalKompostoApi::class)

package common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.text.KPText
import com.trendyol.design.ui.component.common.Component
import com.trendyol.design.ui.component.common.Group
import com.trendyol.theme.KPDesign
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class CommonTest : DesignScreenshotTest() {

    @Test
    fun componentConstantsTest() = runScreenShotTest(
        testName = "componentConstantsTest",
        contents = listOf(
            DesignScreenshotTestContainer("Typography Constants") {
                BoxWithHorizontalPadding {
                    Column {
                        KPText(
                            text = "Header: ${Component.HEADER}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Title: ${Component.TITLE}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Subtitle: ${Component.SUBTITLE}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Body1: ${Component.BODY1}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Body2: ${Component.BODY2}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Overline: ${Component.OVERLINE}",
                            style = KPDesign.typography.body1
                        )
                    }
                }
            },
            DesignScreenshotTestContainer("Button Constants") {
                BoxWithHorizontalPadding {
                    Column {
                        KPText(
                            text = "Primary: ${Component.PRIMARY_BUTTON}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Secondary: ${Component.SECONDARY_BUTTON}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Tertiary: ${Component.TERTIARY_BUTTON}",
                            style = KPDesign.typography.body1
                        )
                    }
                }
            },
            DesignScreenshotTestContainer("Icon Constants") {
                BoxWithHorizontalPadding {
                    Column {
                        KPText(
                            text = "Back: ${Component.BACK_ICON}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Cancel: ${Component.CANCEL_ICON}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Help: ${Component.HELP_ICON}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Trash: ${Component.TRASH_ICON}",
                            style = KPDesign.typography.body1
                        )
                    }
                }
            }
        )
    )

    @Test
    fun groupConstantsTest() = runScreenShotTest(
        testName = "groupConstantsTest",
        contents = listOf(
            DesignScreenshotTestContainer("Component Groups") {
                BoxWithHorizontalPadding {
                    Column {
                        KPText(
                            text = "Typography: ${Group.TYPOGRAPHY}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Button: ${Group.BUTTON}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Icon: ${Group.ICON}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "State Layout: ${Group.STATE_LAYOUT}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Toolbar: ${Group.TOOLBAR}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Input Field: ${Group.INPUT_FIELD}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Checkbox: ${Group.CHECKBOX}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Bottom Sheet: ${Group.BOTTOM_SHEET}",
                            style = KPDesign.typography.body1
                        )
                    }
                }
            },
            DesignScreenshotTestContainer("More Component Groups") {
                BoxWithHorizontalPadding {
                    Column {
                        KPText(
                            text = "List Cell: ${Group.LIST_CELL}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Rating Bar: ${Group.RATING_BAR}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Timer: ${Group.TIMER}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Box Badge: ${Group.BOX_BADGE}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Price: ${Group.PRICE}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Dialog: ${Group.DIALOG}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Info Box: ${Group.INFO_BOX}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Icon Button: ${Group.ICON_BUTTON}",
                            style = KPDesign.typography.body1
                        )
                    }
                }
            }
        )
    )

    @Test
    fun inputFieldConstantsTest() = runScreenShotTest(
        testName = "inputFieldConstantsTest",
        contents = listOf(
            DesignScreenshotTestContainer("Input Field Types") {
                BoxWithHorizontalPadding {
                    Column {
                        KPText(
                            text = "Single Line: ${Component.INPUT_FIELD_SINGLE_LINE}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Multi Line: ${Component.INPUT_FIELD_MULTI_LINE}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Dropdown: ${Component.INPUT_FIELD_DROPDOWN}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Email: ${Component.INPUT_FIELD_EMAIL}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Phone Number: ${Component.INPUT_FIELD_PHONE_NUMBER}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Password: ${Component.INPUT_FIELD_PASSWORD}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "OTP: ${Component.INPUT_FIELD_OTP}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Search Bar: ${Component.INPUT_FIELD_SEARCH_BAR}",
                            style = KPDesign.typography.body1
                        )
                    }
                }
            }
        )
    )

    @Test
    fun dialogConstantsTest() = runScreenShotTest(
        testName = "dialogConstantsTest",
        contents = listOf(
            DesignScreenshotTestContainer("Dialog Types") {
                BoxWithHorizontalPadding {
                    Column {
                        KPText(
                            text = "Alert Dialog: ${Component.ALERT_DIALOG}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Success Dialog: ${Component.SUCCESS_DIALOG}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Error Dialog: ${Component.ERROR_DIALOG}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Generic Dialog: ${Component.GENERIC_DIALOG}",
                            style = KPDesign.typography.body1
                        )
                    }
                }
            }
        )
    )

    @Test
    fun listCellConstantsTest() = runScreenShotTest(
        testName = "listCellConstantsTest",
        contents = listOf(
            DesignScreenshotTestContainer("List Cell Types") {
                BoxWithHorizontalPadding {
                    Column {
                        KPText(
                            text = "Radio Item: ${Component.LIST_CELL_RADIO_ITEM}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Checkbox Item: ${Component.LIST_CELL_CHECKBOX_ITEM}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Single Select Item: ${Component.LIST_CELL_SINGLE_SELECT_ITEM}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Static Item: ${Component.LIST_CELL_STATIC_ITEM}",
                            style = KPDesign.typography.body1
                        )
                    }
                }
            }
        )
    )

    @Test
    fun priceConstantsTest() = runScreenShotTest(
        testName = "priceConstantsTest",
        contents = listOf(
            DesignScreenshotTestContainer("Price Types") {
                BoxWithHorizontalPadding {
                    Column {
                        KPText(
                            text = "Single Price: ${Component.PRICE_SINGLE}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Dual Price: ${Component.PRICE_DUAL}",
                            style = KPDesign.typography.body1
                        )
                    }
                }
            }
        )
    )

    @Test
    fun iconButtonConstantsTest() = runScreenShotTest(
        testName = "iconButtonConstantsTest",
        contents = listOf(
            DesignScreenshotTestContainer("Icon Button Types") {
                BoxWithHorizontalPadding {
                    Column {
                        KPText(
                            text = "Standard Icon Button: ${Component.STANDARD_ICON_BUTTON}",
                            style = KPDesign.typography.body1
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        KPText(
                            text = "Contained Icon Button: ${Component.CONTAINED_ICON_BUTTON}",
                            style = KPDesign.typography.body1
                        )
                    }
                }
            }
        )
    )
}
