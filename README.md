# Komposto Design System

[![Maven Central](https://img.shields.io/maven-central/v/com.trendyol.design/core.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.trendyol.design%22)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.1.21-blue.svg)](https://kotlinlang.org)
[![Android](https://img.shields.io/badge/Android-5.0%2B-green.svg)](https://android.com)
[![Compose](https://img.shields.io/badge/Compose-2025.05.00-brightgreen.svg)](https://developer.android.com/jetpack/compose)

Komposto is Trendyol's comprehensive Android design system built with Jetpack Compose. It provides a collection of reusable UI components, design tokens, and guidelines to help developers create consistent and beautiful user interfaces across Trendyol's Android applications.

## ✨ Features

- **Modern Architecture**: Built with Jetpack Compose
- **Comprehensive Components**: 20+ UI components covering common use cases
- **Design Tokens**: Consistent colors, typography, and spacing
- **RTL Support**: Full right-to-left layout support
- **Accessibility**: Components follow accessibility best practices
- **Type Safety**: Kotlin-first design with compile-time safety
- **Screenshot Testing**: Visual regression testing for components
- **Showkase Integration**: Interactive component catalog

## 🚀 Installation

### Gradle (Kotlin DSL)

Add the following dependencies to your `build.gradle.kts`:

```kotlin
dependencies {
    // Core module (required)
    implementation("com.trendyol.design:core:0.17.0")
    
    // Theme module (required)
    implementation("com.trendyol.design:theme:0.17.0")
    
    // Optional: Bottom sheet components
    implementation("com.trendyol.design:bottomsheet:0.17.0")
}
```

## 🏗️ Architecture

Komposto is organized into modular components:

- **`core`**: Main UI components and design tokens
- **`theme`**: Theme configuration and color system
- **`bottomsheet`**: Bottom sheet components and layouts
- **`app`**: Demo application with Showkase integration

## 🎨 Getting Started

### 1. Setup Your Theme

Create your own theme using Komposto's design system. The `TrendyolTheme` in the demo app is just an example - you'll need to set up your own theme provider:

```kotlin
@Composable
fun MyAppTheme(
    content: @Composable () -> Unit
) {
    // Create your custom theme
    val myDesignTheme = KPDesignTheme(
        colors = KPDesignColors(
            // Customize colors for your app
            colorPrimary = Color(0xFF6200EE), // Your brand color
            colorBackground = Color(0xFFFFFBFE)
        ),
        typography = KPDesignTypography(),
        fontFamily = KPDesignFontFamily()
    )
    
    CompositionLocalProvider(
        LocalKPDesignTheme provides myDesignTheme
    ) {
        content()
    }
}
```

### 2. Wrap Your App

Apply your theme to your entire app:

```kotlin
@Composable
fun MyApp() {
    MyAppTheme {
        // Your app content
        MyAppContent()
    }
}
```

### 3. Using Components

Access design tokens and components through `KPDesign`:

```kotlin
@Composable
fun MyScreen() {
    Column {
        KPText(
            text = "Welcome to Komposto",
            style = KPDesign.typography.header,
            color = KPDesign.colors.colorPrimary
        )
        
        KPButton(
            onClick = { /* Handle click */ },
            style = KPButtonStyle.Primary,
            size = KPButtonSize.Large
        ) {
            KPText(text = "Get Started")
        }
    }
}
```

### 4. Design Tokens Access

Use design tokens consistently across your app:

```kotlin
@Composable
fun MyCustomComponent() {
    Box(
        modifier = Modifier
            .background(KPDesign.colors.colorBackground)
            .padding(16.dp)
    ) {
        KPText(
            text = "Custom Component",
            style = KPDesign.typography.body1,
            color = KPDesign.colors.colorOnSurface
        )
    }
}
```

## 📚 Available Components

### Core Components

| Component | Description |
|-----------|-------------|
| **KPButton** | Primary, secondary, and tertiary buttons with various sizes |
| **KPText** | Typography component with predefined styles |
| **KPCheckbox** | Checkbox with text and content variants |
| **KPRadioButton** | Radio button with customizable content |
| **KPToolbar** | App bar with various action configurations |
| **KPIcon** | Icon component with size and color options |
| **KPInputField** | Text input fields (single-line, multi-line, email, password, etc.) |
| **KPSearchBar** | Search input with customizable appearance |
| **KPDialog** | Alert, success, error, and generic dialogs |
| **KPInfoBox** | Information display with icon support |
| **KPPrice** | Price display with single and dual price modes |
| **KPRatingBar** | Star rating component |
| **KPCountdownTimer** | Countdown timer with customizable styling |
| **KPBoxBadge** | Badge components for various use cases |
| **KPStateLayout** | Loading and warning state layouts |

### Bottom Sheet Components

| Component | Description |
|-----------|-------------|
| **KPBottomSheetHeader** | Header with title and action buttons |
| **KPBottomSheetListContent** | List-based content for bottom sheets |
| **KPBottomSheetImageContent** | Image gallery for bottom sheets |
| **KPBottomSheetSliderContent** | Slider/carousel content |
| **KPBottomSheetRadioItem** | Radio selection items |
| **KPBottomSheetCheckboxItem** | Checkbox selection items |

### Design Tokens

Access design tokens through `KPDesign`:

```kotlin
// Colors
KPDesign.colors.colorPrimary
KPDesign.colors.colorBackground
KPDesign.colors.colorOnSurface

// Typography
KPDesign.typography.header
KPDesign.typography.body1
KPDesign.typography.body2
```

## 🧪 Testing

Komposto includes comprehensive screenshot testing. Components are tested across different:

- **Styles**: All component variations
- **Sizes**: Small, medium, large options
- **States**: Enabled, disabled, loading, error states

## 📖 Documentation

- **Component Catalog**: Run the demo app to see all components in action
- **Showkase Integration**: Browse components interactively
- **API Documentation**: Generated KDoc documentation

## 🤝 Contributing

We welcome contributions! Please see our [Contributing Guide](CONTRIBUTING.md) for details.

### Development Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/Trendyol/komposto.git
   cd komposto
   ```

2. Open in Android Studio

3. Run the demo app to see components in action

### Guidelines

- Follow existing component patterns
- Add screenshot tests for new components
- Update documentation and examples
- Maintain backward compatibility

## 📱 Demo App

The included demo app showcases all components with Showkase integration:

1. Run the `app` module
2. Browse components by category
3. View different states and configurations
4. Copy code examples

## 🔗 Links

- **GitHub**: [https://github.com/Trendyol/komposto](https://github.com/Trendyol/komposto)
- **Maven Central**: [https://search.maven.org/search?q=g:com.trendyol.design](https://search.maven.org/search?q=g:com.trendyol.design)
- **Issues**: [https://github.com/Trendyol/komposto/issues](https://github.com/Trendyol/komposto/issues)
- **Changelog**: [CHANGELOG.md](CHANGELOG.md)

## 📄 License

```
Copyright 2024 Trendyol

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

---

<div align="center">
  <p>Made with ❤️ by the Komposto Team</p>
</div>