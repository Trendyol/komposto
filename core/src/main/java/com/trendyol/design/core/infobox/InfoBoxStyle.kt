package com.trendyol.design.core.infobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

/**
 * `InfoBoxStyle` is an interface that defines the styling properties for an information box.
 * It provides customizable colors for the background, border, text, and icon.
 *
 * Each property is annotated with `@Composable`, allowing it to be used within composable functions
 * and providing the ability to dynamically change styles based on the composition context.
 *
 * Properties:
 *
 * @property backgroundColor A [Color] that sets the background color of the info box.
 * @property borderColor A [Color] that sets the border color of the info box.
 * @property textColor A [Color] that sets the color of the text within the info box.
 * @property iconTint A [Color] that sets the tint color for the icon displayed in the info box.
 */

public interface InfoBoxStyle {
    @get:Composable
    public val backgroundColor: Color

    @get:Composable
    public val borderColor: Color

    @get:Composable
    public val dashedBorderDashWidth: Dp?

    @get:Composable
    public val dashedBorderGapWidth: Dp?

    @get:Composable
    public val textColor: Color

    @get:Composable
    public val iconTint: Color
}
