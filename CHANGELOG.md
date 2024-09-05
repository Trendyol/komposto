# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [0.11.0] - 2024-08-26

### Added

- Introduced `CountDownTimer` composable to have a styled and custom sized component
- Implemented `TrendyolCountdownTimerSize` for different sizes (`Large`, `Medium`, and `Small`)
- Implemented `TrendyolCountdownTimerStyle` for different styles (`Primary`)

## [0.10.0] - 2024-08-22

### Added

- Introduced `SearchBar` composable to facilitate customizable search bar components
- Implemented `TrendyolSearchBarSize` for defining different sizes (`Small` and `Large`)
  of the search bar.
- Implemented `TrendyolSearchBarStyle` for defining different styles (`Outline` and `Filled`)
  of the search bar.
- Added `Search` icon as the leading icon in the `SearchBar` component.
- Added `Cancel` icon as the trailing icon in the `SearchBar` component.

### Fixed

- Fixed issue with state updates not being applied in input fields.

### Changed

- Updated `ArrowDown` icon preview naming.

## [0.9.0] - 2024-08-19

### Added

- Introduced `RatingBar` composable to facilitate customizable rating bar components
- Implemented `TrendyolRatingBarSize` for defining different sizes (`Small` and `Medium`)
  of the rating bar.
- Added `Star` icon to represent the rating in the `RatingBar` component.

### Added
- Added Kotlin's binary-compatibility-validator in order to validate public APIs
- Enabled explicitApi in order to prevent publishing wrong APIs to public

### Added

- Added sample code in the `:app` module.

## [0.8.0] - 2024-07-23

### Added

- Added bottom sheet Composable APIs(`BottomSheetListContent`, `BottomSheetSliderContent`, etc...).
- Added bottom sheet item Composable APIs(`BottomSheetCheckboxItem`, `BottomSheetSingleSelectionItem`).


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
