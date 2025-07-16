## 📸 Screenshot Tests Description

### What screenshot tests does this PR add/update?
<!--- Provide a clear description of the screenshot tests being added or updated -->

### Components/Screens Covered
<!--- List the components or screens that are covered by these screenshot tests -->
- [ ] Component 1
- [ ] Component 2

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

## 📝 Additional Notes
<!--- Any additional information for reviewers -->

---