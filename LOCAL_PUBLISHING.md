# Komposto Local Publishing Guide

This document explains how to publish Komposto library to your local Maven repository.

## 📋 Requirements

- Java 21
- Android SDK
- Gradle Wrapper (included with project)

## 🚀 Local Publishing

### Quick Start

```bash
./gradlew publishToMavenLocal
```

This command publishes with the default version `1.0.0-LOCAL-SNAPSHOT`.

### Custom Version Publishing

If you need a different version, modify the hardcoded version in `PublishConvention.kt`:

```kotlin
// gradle/build-logic/convention/src/main/kotlin/.../PublishConvention.kt
version = getVersionFromEnv() ?: "1.0.0-LOCAL-SNAPSHOT", // <- Change this line
```

## 📦 Published Artifacts

The following artifacts are created for each module:

- **Core Module**: `com.trendyol.design:core:YOUR_VERSION`
- **Theme Module**: `com.trendyol.design:theme:YOUR_VERSION`  
- **Bottomsheet Module**: `com.trendyol.design:bottomsheet:YOUR_VERSION`

## 📍 Local Repository Location

Artifacts are stored in:
```
~/.m2/repository/com/trendyol/design/
```

## 🔍 Checking Published Versions

```bash
# List published versions
ls -la ~/.m2/repository/com/trendyol/design/core/
ls -la ~/.m2/repository/com/trendyol/design/theme/
ls -la ~/.m2/repository/com/trendyol/design/bottomsheet/
```

## 🎯 Using in Other Projects

To use your locally published version in another project:

```kotlin
// build.gradle.kts
repositories {
    mavenLocal() // Check local repository first
    mavenCentral()
}

dependencies {
    implementation("com.trendyol.design:core:1.0.0-LOCAL-SNAPSHOT")
    implementation("com.trendyol.design:theme:1.0.0-LOCAL-SNAPSHOT")
}
```

## ⚠️ Important Notes

1. **Signing**: No signing is performed for local publishing (automatically enabled in CI)
2. **Default Version**: `1.0.0-LOCAL-SNAPSHOT`
3. **Cache**: Clear Gradle cache with: `./gradlew clean`

## 🔧 Troubleshooting

### Cache Issues
```bash
# Clear Gradle cache
./gradlew clean

# Clear local Maven cache (if needed)
rm -rf ~/.m2/repository/com/trendyol/design/
```

## 📋 Summary

1. Run `./gradlew publishToMavenLocal`
2. Use `com.trendyol.design:*:1.0.0-LOCAL-SNAPSHOT` in your projects
3. Add `mavenLocal()` to your repositories
4. That's it! 🎉 