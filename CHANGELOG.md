# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [0.7.5] - 2024-07-10

### Added

- InputOTPField composable is introduced with [TrendyolInputOTPFieldStyle.Outline] and
  [TrendyolInputOTPFieldStyle.Filled] styles.
- InputPasswordField composable is introduced with [TrendyolOutlinedTextFieldStyle.Outline],
  [TrendyolOutlinedTextFieldStyle.FloatingLabelOutlined] and [FloatingLabelOutlined.Filled] styles.
- OutlinedTextField disabled label color changed to colorOnSurfaceVariant1.

## [0.7.4] - 2024-07-19

### Added

- Add new vertical price api

## [0.7.3] - 2024-06-20

### Added

- This changelog file.
- Contribution guide in the `CONTRIBUTING.md` file.

### Fixed

- Some compose dependencies were not using the the version from Compose Bill of Materials (BoM).

### Changed

- Updated Gradle from 8.7 to 8.8.
- Migrated all Gradle dependency definitions to version catalogs and type-safe project accessors.
- Updated CI/CD pipeline to automatically publish artifacts when the `published-libs.versions.toml`
  file is changed.
- Used "check" task instead of "detekt" task in CI/CD pipeline to check if everything is OK. "check"
  task includes Detekt and other checks such as running unit tests and Android Lint.
