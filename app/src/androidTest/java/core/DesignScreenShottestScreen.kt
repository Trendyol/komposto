package core

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trendyol.design.core.text.Text
import com.trendyol.theme.TrendyolDesign

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
        Text(
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .align(Alignment.CenterHorizontally),
            text = title,
            style = TrendyolDesign.typography.titleMediumColorOnSurfaceVariant1
        )
        Divider(color = TrendyolDesign.colors.colorBorder)
        containers.forEach { container ->
            Text(
                modifier = Modifier.padding(horizontal = 8.dp),
                text = container.name,
                style = TrendyolDesign.typography.title
            )
            Divider(color = TrendyolDesign.colors.colorBorder)
            container.content()
            Divider(color = TrendyolDesign.colors.colorBorder)
        }
    }
}