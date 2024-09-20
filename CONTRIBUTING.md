# CONTRIBUTING

### Table of Contents

1. [Getting Started](#getting-started)
2. [Pull Requests](#pull-requests)
3. [FAQ](#faq)
    - [Detekt](#detekt-fails)
    - [Binary Compatibility Validator](#binary-compatibility-validator-fails)
4. [Publishing new releases](#publishing-new-releases)

### Getting Started

- Fork the repository and clone it to your machine.
- Navigate to the project directory and create a new branch for your fix or feature.

### Pull Requests

1. Clone the repository.
2. Create your branch from `main`.
3. Add or edit the code.
4. Add tests if applicable. (ps. It's always always applicable.)
5. Update the documentation if necessary.
6. Ensure your changes pass all tests and adhere to the style guidelines by
   running `./gradlew check`.
7. Push the branch.
8. Open a pull request and ensure it has a clear title and description.

### FAQ

#### Check task fails:

- #### Detekt Fails
  You can invoke `./gradlew :module-name:detekt --auto-correct` to fix most of the issues
  automatically. But that doesn't fix all the issues. You can fix the rest of the issues manually.
  This project follows the default detekt rule-set.

### Publishing new releases

This project uses the "publish" job in the Gitlab CI pipeline to deploy a new release.
To create a new release, you need to update the version in the `gradle/published-libs.versions.toml`
file and push the changes to the `main` branch. This will trigger the deploy job and it will create
a new release.

### Publishing locally for testing purposes

If you want to publish a new version of Design libraries only to test it with a different app, then
do this:

1. In the Design project, update the `gradle/published-libs.versions.toml` file and set a test
   version. For example `1.0.0-ANDDEV-1234`.
2. In the Design project, run `./gradlew publishToMavenLocal` in the terminal. This will publish the
   test build to your local Maven repository.
3. In the other project where you want to test Design library, make sure `mavenLocal()` Gradle
   repository is added in the `dependencyResolutionManagement` block. You can search
   for `mavenCentral()` and add `mavenLocal()` below.
4. Sync and run the app you want to test.
