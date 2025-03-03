# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).


## [Unreleased]

## [0.16.1] - 2025-03-03

### Changed

- `KPInputOTPField` helper and error text's maxLines changed from `Int.MAX_VALUE` to `2`.
- `KPInputPhoneNumberField` error text's maxLines changed from `Int.MAX_VALUE` to `2`.
- `KPDropdown` error text's maxLines changed from `Int.MAX_VALUE` to `2`.

## [0.16.0] - 2025-01-13

### Added

- `KPStandardIconButton` and `KPContainedIconButton` APIs introduced
- Added Pause, Play, Save, Share icons

## [0.15.0] - 2025-01-10

### Changed
- We renamed all public APIs with 'KP' prefix to avoid conflicts with other libraries. Projects
must implement the new theme APIs in order to use Komposto APIs.
- We don't have significant date in order to remove deprecated APIs but we will remove them in the 
next major version. :alert:

## [0.14.1] - 2025-01-02

### Fixed
- Warning info icon elevation is added
- Warning info description and title text alignment is added
- Countdown timer onTimerFinished action is added
- Countdown timer background and separator colors separated.

## [0.14.0] - 2024-09-10

### Added

- InfoBox composable is introduced with icon positions, border and two lines

## [0.13.4] - 2024-11-18

### Added
- Added RunningOut icon

## [0.13.3] - 2024-11-14

### Fixed
- The mdpi resolution exception related to `RatingBar`s photo icon is fixed.

## [0.13.2] - 2024-11-14

### Added
- Added missing [colorOnSurfaceVariant2] typography APIs

## [0.13.1] - 2024-10-08

### Fixed

- The issue where the `Dropdown` component lacked a placeholder has been resolved.
- The problem preventing the `onClick` function of `Dropdown` component from being triggered
  has been addressed.

## [0.13.0] - 2024-09-26

### Added

- Introduced `AlertDiag` and `GenericDialog` composables
- Implemented `TrendyolGenericDialogType` for defining different generic dialog
  (`Success`, `Error` and `Custom`)
  of the rating bar.

## [0.12.3] - 2024-09-25

### Fixed

- Fixed back icon RTL mirror issue.

## [0.12.2] - 2024-09-17

### Fixed

- Fixed all of the input field components which uses `TrendyolOutlinedField` filling width issue.

## [0.12.1] - 2024-09-12

### Added
- Added Kotlin's binary-compatibility-validator in order to validate public APIs
- Enabled explicitApi in order to prevent publishing wrong APIs to public

## [0.12.0] - 2024-09-11

### Added

- BoxBadge composable is introduced with [KPBoxBadgeType.Custom] and
  predefined [KPBoxBadgeType.Defaults] types
- BoxBadgeGroup composable is introduced as a horizontal list of BoxBadge items

### Changed

- Add Ltr fonts to Preview Theme

## [0.11.1] - 2024-09-06

### Fixed

- Fixed `MultiLineTextField` filling max width issue.

### Changed

- Updated `MultiLineTextField` parameter `maxChar` as optional.
- Updated `RatingBar`RatingBar with onRatingClick and make it clickable. 

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

