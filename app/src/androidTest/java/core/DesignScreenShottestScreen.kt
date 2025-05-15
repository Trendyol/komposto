package core

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign

@Composable
internal fun DesignScreenshotTestScreen(
    modifier: Modifier = Modifier,
    title: String,
    containers: List<DesignScreenshotTestContainer>,
) {
    Column(
        modifier = modifier.padding(vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        KPText(
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .align(Alignment.CenterHorizontally),
            text = title,
            style = KPDesign.typography.titleMediumColorOnSurfaceVariant1
        )
        Divider(color = KPDesign.colors.colorBorder)
        containers.forEach { container ->
            KPText(
                modifier = Modifier.padding(horizontal = 8.dp),
                text = container.name,
                style = KPDesign.typography.title
            )
            Divider(color = KPDesign.colors.colorBorder)
            container.content()
            Divider(color = KPDesign.colors.colorBorder)
        }
    }
}