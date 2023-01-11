# CHANGELOG
Inspired from [Keep a Changelog](https://keepachangelog.com/en/1.0.0/)

## [Unreleased]
### Added
- Github workflow for changelog verification ([#239](https://github.com/opensearch-project/opensearch-java/pull/239))
- Github workflow for dependabot PRs ([#247](https://github.com/opensearch-project/opensearch-java/pull/247))

### Dependencies
- Bumps `grgit-gradle` from 4.0.1 to 5.0.0
- Update Jackson to 2.14.0 ([#259](https://github.com/opensearch-project/opensearch-java/pull/259))

### Changed
- Update literature around changelog contributions in CONTRIBUTING.md ([#242](https://github.com/opensearch-project/opensearch-java/pull/242))
- Update tests to use JUnit's Assert ([#244](https://github.com/opensearch-project/opensearch-java/pull/244))
- Add support to parse sub-aggregations from filter/nested aggregations ([#234](https://github.com/opensearch-project/opensearch-java/pull/234))
- Add timeout and throttle to the jenkins workflows ([#231](https://github.com/opensearch-project/opensearch-java/pull/231)) 
- Updating maintainers, admins and documentation ([#248](https://github.com/opensearch-project/opensearch-java/pull/248))
- Update Gradle to 7.6 ([#311](https://github.com/opensearch-project/opensearch-java/pull/311))

### Deprecated

### Removed

### Fixed
- Make ChildrenAggregate as a SingleBucketAggregate ([#306](https://github.com/opensearch-project/opensearch-java/pull/306))
- Fix /_nodes/stats, /_nodes/info throwing serialization error ([#315](https://github.com/opensearch-project/opensearch-java/pull/315))

### Security


[Unreleased]: https://github.com/opensearch-project/opensearch-java/compare/2.0...HEAD
