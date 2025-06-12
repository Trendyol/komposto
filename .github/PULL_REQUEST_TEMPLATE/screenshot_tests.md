## 📸 Screenshot Tests Description

### What screenshot tests does this PR add/update?
<!--- Provide a clear description of the screenshot tests being added or updated -->

### Components/Screens Covered
<!--- List the components or screens that are covered by these screenshot tests -->
- [ ] Component 1
- [ ] Component 2
- [ ] Screen/Flow

### Test Scenarios Added
<!--- What specific scenarios are being tested? -->
- [ ] Default state
- [ ] Loading state
- [ ] Error state
- [ ] Success state
- [ ] Empty state
- [ ] Focused state
- [ ] Disabled state
- [ ] Different content lengths
- [ ] Interaction states

## 📋 Related Issue
<!--- Link related issues -->
Closes #<!-- issue number -->
Related to #<!-- issue number -->

## 🧪 Testing

### Screenshot Test Coverage
<!--- What variations were tested? -->
- [ ] Light theme
- [ ] Dark theme
- [ ] Different screen densities (mdpi, hdpi, xhdpi, xxhdpi)
- [ ] Different screen sizes (phone, tablet)
- [ ] RTL layout
- [ ] Different font scales
- [ ] Accessibility features enabled

### Screenshot Test Commands
<!--- Document the commands used -->
```bash
# Generate new screenshots
./gradlew executeScreenshotTests -Precord

# Verify screenshots
./gradlew executeScreenshotTests
```

## 🔍 Code Review Checklist

### General
- [ ] Screenshot test code follows project standards
- [ ] Test names are descriptive and consistent
- [ ] Screenshots are generated in correct directories
- [ ] No unnecessary screenshot files added

### Screenshot Quality
- [ ] Screenshots are clear and properly framed
- [ ] All relevant UI elements are visible
- [ ] Screenshots represent realistic usage scenarios
- [ ] Consistent with existing screenshot style

### Testing
- [ ] All new screenshot tests pass locally
- [ ] No existing screenshot tests broken
- [ ] Test coverage is comprehensive

## 🚀 Impact Assessment

### Coverage Improvement
<!--- How does this improve our test coverage? -->
- [ ] Adds coverage for previously untested component
- [ ] Improves coverage for existing component
- [ ] Adds regression prevention for specific bug
- [ ] Covers new component states/variations

### Breaking Changes
- [ ] This change introduces breaking changes to existing tests
- [ ] This change is backward compatible

### Performance Impact
<!--- Does this change affect test execution time? -->
- [ ] No impact on test execution time
- [ ] Minor increase in test execution time
- [ ] Significant increase in test execution time (explain below)

**Performance Details:**
<!--- If applicable, explain test performance implications -->

## 🔗 Additional Context

### Test Maintenance
<!--- Information about maintaining these tests -->
- [ ] Tests are stable and unlikely to be flaky
- [ ] Clear documentation for updating tests when UI changes
- [ ] Proper naming convention followed

### Related PRs
<!--- Link any related PRs -->

### Follow-up Work
<!--- Any follow-up screenshot test work needed? -->

## 🏁 Final Checklist
- [ ] PR title follows conventional commit format
- [ ] All screenshot tests pass locally
- [ ] Screenshots are properly organized
- [ ] Labels have been added

## 📝 Additional Notes
<!--- Any additional information for reviewers -->

---