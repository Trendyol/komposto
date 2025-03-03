package inputfield

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.icon.icons.fill.InfoIcon
import com.trendyol.design.core.inputfield.email.KPInputEmailField
import com.trendyol.design.core.text.KPText
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Ignore
import org.junit.Test

internal class KPInputEmailFieldTest : DesignScreenshotTest() {

    private val email = "komposto@trendyol.com"
    private val labelText = "Example Label Text"
    private val placeholderText = "Example Placeholder Text"
    private val errorText = "Example Error Text"

    @Test
    fun kpInputEmailFieldEnabledTest() = runScreenShotTest(
        testName = "KPInputEmailField Enabled Test",
        contents = listOf(
            DesignScreenshotTestContainer("enabled=true") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = email,
                        onValueChange = {},
                        enabled = true,
                    )
                }
            },
            DesignScreenshotTestContainer("enabled=false") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = email,
                        onValueChange = {},
                        enabled = false,
                    )
                }
            },
        )
    )

    @Test
    fun kpInputEmailFieldReadOnlyTest() = runScreenShotTest(
        testName = "KPInputEmailField ReadOnly Test",
        contents = listOf(
            DesignScreenshotTestContainer("readOnly=true") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = email,
                        onValueChange = {},
                        readOnly = true,
                    )
                }
            },
            DesignScreenshotTestContainer("readOnly=false") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = email,
                        onValueChange = {},
                        readOnly = false,
                    )
                }
            },
        )
    )

    @Ignore("ANDDEV-8473")
    @Test
    fun kpInputEmailFieldLabelTest() {
        runScreenShotTest(
            testName = "KPInputEmailField Label Test",
            contents = listOf(
                DesignScreenshotTestContainer("text") {
                    BoxWithHorizontalPadding {
                        KPInputEmailField(
                            email = email,
                            onValueChange = { },
                            label = {
                                KPText(labelText)
                            }
                        )
                    }
                },
            DesignScreenshotTestContainer("icon + text") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = email,
                        onValueChange = {},
                        label = {
                            Row {
                                KPIcon(
                                    imageVector = KPIcons.Fill.InfoIcon,
                                    size = KPIconSize.XXSmall,
                                )
                                KPText(labelText)
                            }
                        }
                    )
                }
            },
            )
        )
    }

    @Test
    fun kpInputEmailFieldPlaceholderTest() = runScreenShotTest(
        testName = "KPInputEmailField Placeholder Test",
        contents = listOf(
            DesignScreenshotTestContainer("text") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = "",
                        onValueChange = {},
                        placeholder = {
                            KPText(placeholderText)
                        }
                    )
                }
            },
            DesignScreenshotTestContainer("icon + text") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = "",
                        onValueChange = {},
                        label = {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                KPIcon(
                                    imageVector = KPIcons.Fill.Help,
                                    size = KPIconSize.XXSmall,
                                )
                                KPText(placeholderText)
                            }
                        }
                    )
                }
            },
        )
    )

    @Test
    fun kpInputEmailFieldErrorTest() = runScreenShotTest(
        testName = "KPInputEmailField Error Test",
        contents = listOf(
            DesignScreenshotTestContainer("text") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = email,
                        onValueChange = {},
                        error = errorText
                    )
                }
            },
        )
    )

    @Test
    fun kpInputEmailFieldShapeTest() = runScreenShotTest(
        testName = "KPInputEmailField Shape Test",
        contents = listOf(
            DesignScreenshotTestContainer("RoundedCornerShape") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = email,
                        onValueChange = {},
                        shape = RoundedCornerShape(16.dp)
                    )
                }
            },
            DesignScreenshotTestContainer("RectangleShape") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = email,
                        onValueChange = {},
                        shape = RectangleShape
                    )
                }
            },
            DesignScreenshotTestContainer("CutCornerShape") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = email,
                        onValueChange = {},
                        shape = CutCornerShape(8.dp)
                    )
                }
            },
        )
    )

    @Test
    fun kpInputEmailFieldSuggestionTest() = runScreenShotTest(
        testName = "KPInputEmailField Suggestion Test",
        contents = listOf(
            DesignScreenshotTestContainer("without @") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = "komposto",
                        onValueChange = {},
                    )
                }
            },
            DesignScreenshotTestContainer("only @") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = "komposto@",
                        onValueChange = {},
                    )
                }
            },
            DesignScreenshotTestContainer("chars after @") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = "komposto@gm",
                        onValueChange = {},
                    )
                }
            },
        )
    )

    @Test
    fun kpInputEmailFieldMaxWidthTest() = runScreenShotTest(
        testName = "KPInputEmailField MaxWidth Test",
        contents = listOf(
            DesignScreenshotTestContainer("fillMaxWidth") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = "komposto",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
            },
        )
    )

    @Test
    fun kpInputEmailFieldLongTextTest() = runScreenShotTest(
        testName = "KPInputEmailField LongText Test",
        contents = listOf(
            DesignScreenshotTestContainer("LongText") {
                BoxWithHorizontalPadding {
                    KPInputEmailField(
                        email = "kompostokompostokompostokompostokomposto@trendyol.com",
                        onValueChange = {},
                    )
                }
            },
        )
    )
}
