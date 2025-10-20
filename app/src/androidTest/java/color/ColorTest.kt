@file:OptIn(ExperimentalKompostoApi::class)

package color

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.text.KPText
import com.trendyol.design.ui.component.color.colorPrimary
import com.trendyol.design.ui.component.color.colorPrimaryVariant1
import com.trendyol.design.ui.component.color.colorPrimaryVariant2
import com.trendyol.design.ui.component.color.colorOnSurfaceVariant1
import com.trendyol.design.ui.component.color.colorOnSurfaceVariant2
import com.trendyol.design.ui.component.color.colorOnSurfaceVariant3
import com.trendyol.design.ui.component.color.colorBorder
import com.trendyol.design.ui.component.color.colorBackground
import com.trendyol.design.ui.component.color.colorWarning
import com.trendyol.design.ui.component.color.colorWarningVariant
import com.trendyol.design.ui.component.color.colorWarningVariant2
import com.trendyol.design.ui.component.color.colorGreen
import com.trendyol.design.ui.component.color.colorGreenVariant1
import com.trendyol.design.ui.component.color.colorGreenVariant2
import com.trendyol.design.ui.component.color.colorStar
import com.trendyol.design.ui.component.color.colorStarVariant1
import com.trendyol.design.ui.component.color.colorStarVariant2
import com.trendyol.design.ui.component.color.colorBlue
import com.trendyol.design.ui.component.color.colorBlueVariant1
import com.trendyol.design.ui.component.color.colorBlueVariant2
import com.trendyol.design.ui.component.color.colorPink
import com.trendyol.design.ui.component.color.colorPinkVariant1
import com.trendyol.design.ui.component.color.colorPinkVariant2
import com.trendyol.design.ui.component.color.colorOnPrimary
import com.trendyol.design.ui.component.color.colorSurface
import core.BoxWithHorizontalPadding
import core.DesignScreenshotTest
import core.DesignScreenshotTestContainer
import org.junit.Test

internal class ColorTest : DesignScreenshotTest() {

    private val colorSize = 60.dp
    private val colorSpacing = 8.dp

    @Test
    fun primaryColorsTest() = runScreenShotTest(
        testName = "primaryColorsTest",
        contents = listOf(
            DesignScreenshotTestContainer("Primary Colors") {
                BoxWithHorizontalPadding {
                    Column {
                        Row {
                            ColorSwatch("Primary", colorPrimary)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("Primary Variant 1", colorPrimaryVariant1)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("Primary Variant 2", colorPrimaryVariant2)
                        }
                    }
                }
            }
        )
    )

    @Test
    fun grayscaleColorsTest() = runScreenShotTest(
        testName = "grayscaleColorsTest",
        contents = listOf(
            DesignScreenshotTestContainer("Grayscale Colors") {
                BoxWithHorizontalPadding {
                    Column {
                        Row {
                            ColorSwatch("On Surface Variant 1", colorOnSurfaceVariant1)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("On Surface Variant 2", colorOnSurfaceVariant2)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("On Surface Variant 3", colorOnSurfaceVariant3)
                        }
                        Spacer(modifier = Modifier.height(colorSpacing))
                        Row {
                            ColorSwatch("Border", colorBorder)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("Background", colorBackground)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("Surface", colorSurface)
                        }
                    }
                }
            }
        )
    )

    @Test
    fun warningColorsTest() = runScreenShotTest(
        testName = "warningColorsTest",
        contents = listOf(
            DesignScreenshotTestContainer("Warning Colors") {
                BoxWithHorizontalPadding {
                    Column {
                        Row {
                            ColorSwatch("Warning", colorWarning)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("Warning Variant 1", colorWarningVariant)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("Warning Variant 2", colorWarningVariant2)
                        }
                    }
                }
            }
        )
    )

    @Test
    fun successColorsTest() = runScreenShotTest(
        testName = "successColorsTest",
        contents = listOf(
            DesignScreenshotTestContainer("Success Colors") {
                BoxWithHorizontalPadding {
                    Column {
                        Row {
                            ColorSwatch("Green", colorGreen)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("Green Variant 1", colorGreenVariant1)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("Green Variant 2", colorGreenVariant2)
                        }
                    }
                }
            }
        )
    )

    @Test
    fun supporterColorsTest() = runScreenShotTest(
        testName = "supporterColorsTest",
        contents = listOf(
            DesignScreenshotTestContainer("Supporter Colors") {
                BoxWithHorizontalPadding {
                    Column {
                        Row {
                            ColorSwatch("Star", colorStar)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("Star Variant 1", colorStarVariant1)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("Star Variant 2", colorStarVariant2)
                        }
                        Spacer(modifier = Modifier.height(colorSpacing))
                        Row {
                            ColorSwatch("Blue", colorBlue)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("Blue Variant 1", colorBlueVariant1)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("Blue Variant 2", colorBlueVariant2)
                        }
                        Spacer(modifier = Modifier.height(colorSpacing))
                        Row {
                            ColorSwatch("Pink", colorPink)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("Pink Variant 1", colorPinkVariant1)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("Pink Variant 2", colorPinkVariant2)
                        }
                    }
                }
            }
        )
    )

    @Test
    fun whiteColorsTest() = runScreenShotTest(
        testName = "whiteColorsTest",
        contents = listOf(
            DesignScreenshotTestContainer("White Colors") {
                BoxWithHorizontalPadding {
                    Column {
                        Row {
                            ColorSwatch("On Primary", colorOnPrimary, textColor = Color.Black)
                            Spacer(modifier = Modifier.width(colorSpacing))
                            ColorSwatch("Surface", colorSurface, textColor = Color.Black)
                        }
                    }
                }
            }
        )
    )

    @Composable
    private fun ColorSwatch(
        name: String,
        color: Color,
        textColor: Color = Color.Black
    ) {
        Column {
            Box(
                modifier = Modifier
                    .size(colorSize)
                    .background(color)
            )
            Spacer(modifier = Modifier.height(4.dp))
            KPText(
                text = name,
                color = textColor,
                modifier = Modifier.width(colorSize)
            )
        }
    }
}
