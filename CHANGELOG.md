# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [0.7.4] - 2024-07-09

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
