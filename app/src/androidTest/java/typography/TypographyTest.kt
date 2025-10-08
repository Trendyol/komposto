@file:OptIn(ExperimentalKompostoApi::class)

package typography

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class TypographyTest : DesignScreenshotTest() {

    private val sampleText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
    private val longText = "This is a very long text that should demonstrate how the typography handles multiple lines and text wrapping in different scenarios."

    @Test
    fun headerStylesTest() = runScreenShotTest(
        testName = "headerStylesTest",
        contents = listOf(
            DesignScreenshotTestContainer("Header") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.header,
                        maxLines = 3,
                    )
                }
            },
            DesignScreenshotTestContainer("Header Bold") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.headerBold,
                        maxLines = 3,
                    )
                }
            },
            DesignScreenshotTestContainer("Header Medium") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.headerMedium,
                        maxLines = 3,
                    )
                }
            },
            DesignScreenshotTestContainer("Header Medium One Line") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = longText,
                        style = KPDesign.typography.headerMedium,
                        maxLines = 1,
                    )
                }
            }
        )
    )

    @Test
    fun titleStylesTest() = runScreenShotTest(
        testName = "titleStylesTest",
        contents = listOf(
            DesignScreenshotTestContainer("Title") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.title,
                        maxLines = 2,
                    )
                }
            },
            DesignScreenshotTestContainer("Title Medium") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.titleMedium,
                        maxLines = 2,
                    )
                }
            },
            DesignScreenshotTestContainer("Title Bold") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.titleBold,
                        maxLines = 2,
                    )
                }
            }
        )
    )

    @Test
    fun subtitleStylesTest() = runScreenShotTest(
        testName = "subtitleStylesTest",
        contents = listOf(
            DesignScreenshotTestContainer("Subtitle") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.subtitle,
                        maxLines = 2,
                    )
                }
            },
            DesignScreenshotTestContainer("Subtitle Medium") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.subtitleMedium,
                        maxLines = 2,
                    )
                }
            },
            DesignScreenshotTestContainer("Subtitle Bold") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.subtitleBold,
                        maxLines = 2,
                    )
                }
            }
        )
    )

    @Test
    fun bodyStylesTest() = runScreenShotTest(
        testName = "bodyStylesTest",
        contents = listOf(
            DesignScreenshotTestContainer("Body 1") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.body1,
                        maxLines = 3,
                    )
                }
            },
            DesignScreenshotTestContainer("Body 2") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.body2,
                        maxLines = 3,
                    )
                }
            },
            DesignScreenshotTestContainer("Body1 Medium") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.body1Medium,
                        maxLines = 3,
                    )
                }
            },
            DesignScreenshotTestContainer("Body1 Bold") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.body1Bold,
                        maxLines = 3,
                    )
                }
            },
            DesignScreenshotTestContainer("Body2 Medium") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.body2Medium,
                        maxLines = 3,
                    )
                }
            }
        )
    )

    @Test
    fun body2StylesTest() = runScreenShotTest(
        testName = "body2StylesTest",
        contents = listOf(
            DesignScreenshotTestContainer("Body2 Bold") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.body2Bold,
                        maxLines = 2,
                    )
                }
            }
        )
    )

    @Test
    fun body1BoldStylesTest() = runScreenShotTest(
        testName = "body1BoldStylesTest",
        contents = listOf(
            DesignScreenshotTestContainer("Body1 Bold") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText.uppercase(),
                        style = KPDesign.typography.body1Bold,
                        maxLines = 2,
                    )
                }
            }
        )
    )

    @Test
    fun textAlignmentTest() = runScreenShotTest(
        testName = "textAlignmentTest",
        contents = listOf(
            DesignScreenshotTestContainer("Left Aligned") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.body1,
                        textAlign = TextAlign.Start,
                        maxLines = 2,
                    )
                }
            },
            DesignScreenshotTestContainer("Center Aligned") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.body1,
                        textAlign = TextAlign.Center,
                        maxLines = 2,
                    )
                }
            },
            DesignScreenshotTestContainer("Right Aligned") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.body1,
                        textAlign = TextAlign.End,
                        maxLines = 2,
                    )
                }
            }
        )
    )

    @Test
    fun textColorTest() = runScreenShotTest(
        testName = "textColorTest",
        contents = listOf(
            DesignScreenshotTestContainer("Primary Color") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.body1,
                        color = KPDesign.colors.colorPrimary,
                        maxLines = 2,
                    )
                }
            },
            DesignScreenshotTestContainer("Secondary Color") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.body1,
                        color = KPDesign.colors.colorOnSurfaceVariant1,
                        maxLines = 2,
                    )
                }
            },
            DesignScreenshotTestContainer("Error Color") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = sampleText,
                        style = KPDesign.typography.body1,
                        color = KPDesign.colors.colorWarning,
                        maxLines = 2,
                    )
                }
            }
        )
    )

    @Test
    fun typographyHierarchyTest() = runScreenShotTest(
        testName = "typographyHierarchyTest",
        contents = listOf(
            DesignScreenshotTestContainer("Typography Hierarchy") {
                BoxWithHorizontalPadding {
                    Column {
                        KPText(
                            text = "Header Text",
                            style = KPDesign.typography.header,
                            maxLines = 1,
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        KPText(
                            text = "Title Text",
                            style = KPDesign.typography.title,
                            maxLines = 1,
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        KPText(
                            text = "Subtitle Text",
                            style = KPDesign.typography.subtitle,
                            maxLines = 1,
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        KPText(
                            text = "Body Text",
                            style = KPDesign.typography.body1,
                            maxLines = 2,
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        KPText(
                            text = "Body2 Text",
                            style = KPDesign.typography.body2,
                            maxLines = 1,
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        KPText(
                            text = "BODY1 BOLD TEXT",
                            style = KPDesign.typography.body1Bold,
                            maxLines = 1,
                        )
                    }
                }
            }
        )
    )

    @Test
    fun maxLinesTest() = runScreenShotTest(
        testName = "maxLinesTest",
        contents = listOf(
            DesignScreenshotTestContainer("Single Line") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = longText,
                        style = KPDesign.typography.body1,
                        maxLines = 1,
                    )
                }
            },
            DesignScreenshotTestContainer("Two Lines") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = longText,
                        style = KPDesign.typography.body1,
                        maxLines = 2,
                    )
                }
            },
            DesignScreenshotTestContainer("Three Lines") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = longText,
                        style = KPDesign.typography.body1,
                        maxLines = 3,
                    )
                }
            },
            DesignScreenshotTestContainer("Unlimited Lines") {
                BoxWithHorizontalPadding {
                    KPText(
                        text = longText,
                        style = KPDesign.typography.body1,
                        maxLines = Int.MAX_VALUE,
                    )
                }
            }
        )
    )
}
