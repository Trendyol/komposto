# Migration Guide

## Migrating from Trendyol Named APIs to KP Named APIs

With the release of version `0.15.0`, we have renamed all public APIs with the 'KP' prefix to avoid conflicts with other libraries. This section outlines how developers can migrate their projects from using the Trendyol named APIs to the new KP named APIs.

### Deprecated APIs and Their Replacements

The following table gives and example the deprecated Trendyol named APIs and their corresponding replacements:

| Deprecated API                   | Replacement API                    |
|----------------------------------|------------------------------------|
| `TrendyolDesignTheme`             | `KPDesignTheme`                    |
| `LocalTrendyolDesignTheme`        | `LocalKPDesignTheme`               |

### Steps to Migrate

1. **Update Imports:**
   Replace all imports of the Trendyol named APIs with their KP counterparts.

   **Before Migration:**
   ```kotlin
   import com.trendyol.theme.TrendyolDesignTheme
   import androidx.compose.runtime.ProvidableCompositionLocal
   import androidx.compose.runtime.staticCompositionLocalOf
   ```

   **After Migration:**
   ```kotlin
   import com.trendyol.theme.KPDesignTheme
   import androidx.compose.runtime.ProvidableCompositionLocal
   import androidx.compose.runtime.staticCompositionLocalOf
   ```

2. **Replace API Usage:**
   Replace all instances of the deprecated Trendyol named APIs with their KP counterparts in your code.

   **Before Migration:**
   ```kotlin
   val LocalTheme = LocalTrendyolDesignTheme.current
   ```

   **After Migration:**
   ```kotlin
   val LocalTheme = LocalKPDesignTheme.current
   ```

3. **Update Composition Locals:**
   Ensure that you are using the new `LocalKPDesignTheme` in your theme provider.

   **Before Migration:**
   ```kotlin
   CompositionLocalProvider(LocalTrendyolDesignTheme provides trendyolTheme) {
       // Your composables
   }
   ```

   **After Migration:**
   ```kotlin
   CompositionLocalProvider(LocalKPDesignTheme provides kpTheme) {
       // Your composables
   }
   ```
