# Design Android

## Getting Started

### Add Dependencies

Add the following dependencies to your project's `build.gradle` file:

```kotlin
implementation("com.trendyol:design-core:LATEST_VERSION")
implementation("com.trendyol:design-theme:LATEST_VERSION")
implementation("com.trendyol:bottom-sheet:LATEST_VERSION")
```

This artifacts are published in the [internal nexus repository](http://10.84.105.74/).
To download the artifacts, you need to add the following repository to
your project's `buildscript` or `dependencyResolutionManagement` block:

```kotlin
repositories {
    maven {
        url = uri("http://10.84.105.74/repository/maven-releases")
        isAllowInsecureProtocol = true
        // This part is optional but it's always a good idea to filter the dependencies to look for
        content { 
            includeGroupByRegex("com.trendyol.*")
        }
    }
}
```

### Contributing

We welcome contributions in the form of feedback, bug reports, or pull requests.
Before proposing a change, please discuss your change by raising an issue.
Please make sure to read the [Contributing Guide](CONTRIBUTING.md) before making a pull request.