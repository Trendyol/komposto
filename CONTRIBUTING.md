# Contributing to Komposto

Thank you for your interest in contributing to Komposto, Trendyol's Android Design System! We appreciate your support and welcome contributions that help improve the library.

## Table of Contents

- [Types of Contributions We Welcome](#-types-of-contributions-we-welcome)
- [Getting Started](#-getting-started)
- [Contribution Process](#-contribution-process)
- [Testing Requirements](#-testing-requirements)
- [Code Standards](#-code-standards)
- [Design System Considerations](#-design-system-considerations)
- [Bug Reports](#-bug-reports)
- [Feature Suggestions](#-feature-suggestions)
- [Documentation](#-documentation)
- [Code Review Process](#-code-review-process)
- [Commit Message Format](#-commit-message-format)
- [Code of Conduct](#-code-of-conduct)
- [Getting Help](#-getting-help)
- [License](#-license)

## 🎯 Types of Contributions We Welcome

### ✅ What We Accept
- **Bug fixes** - Help us squash those pesky bugs
- **Performance improvements** - Optimizations for better app performance
- **Accessibility enhancements** - Making our components more inclusive
- **Documentation improvements** - Better docs, examples, and guides
- **UI tests and screenshot tests** - Help us maintain visual consistency and catch regressions
- **Code quality improvements** - Refactoring, code cleanup, and best practices
- **Feature suggestions** - Ideas for improving existing components (discuss first!)

### ❌ What We Don't Accept
- **New components** - Component design and implementation is handled internally by our design team
- **Breaking API changes** - We maintain backward compatibility for our consumers
- **Design changes** - Visual design decisions are made by our design team
- **Dependency additions** - New dependencies require internal review and approval

## 🚀 Getting Started

### Development Setup
1. Fork the repository
2. Clone your fork:
   ```bash
   git clone https://github.com/Trendyol/komposto.git
   cd komposto
   ```
3. Add the upstream remote:
   ```bash
   git remote add upstream https://github.com/Trendyol/komposto.git
   ```
4. Create a new branch:
   ```bash
   git checkout -b fix/your-bug-fix
   # or
   git checkout -b improvement/your-improvement
   # or
   git checkout -b test/add-screenshot-tests
   ```

## 📋 Contribution Process

### Before You Start
1. **Search existing issues** to avoid duplicates
2. **Open an issue** to discuss your proposed changes (except for minor fixes)
3. **Wait for approval** before starting work on significant changes

### Making Changes
1. **Keep changes focused** - One issue per pull request
2. **Follow existing code style** - We use Detekt for code analysis
3. **Write meaningful commit messages** - Use conventional commit format
4. **Add tests** for your changes when applicable
5. **Update documentation** if your changes affect public APIs

### Pull Request Guidelines
1. **Use descriptive titles** - Clearly describe what your PR does
2. **Fill out the PR template** - Provide all requested information
3. **Link related issues** - Reference the issue your PR addresses
4. **Request review** from maintainers
5. **Address feedback** promptly and professionally

## 🧪 Testing Requirements

### Required Tests
- **Screenshot tests** for UI components (using Shot)
- **UI tests** for component interactions and behavior
- **Accessibility tests** when applicable
- **Performance tests** for performance improvements

### Running Tests
```bash
# Run screenshot tests
./gradlew executeScreenshotTests

# Record new screenshots (after UI changes)
./gradlew executeScreenshotTests -Precord

# Run all checks (tests + linting)
./gradlew check
```

### Screenshot Testing Guidelines
- Screenshot tests must pass on our CI environment
- Use `./gradlew executeScreenshotTests -Precord` to update screenshots if needed
- Include before/after screenshots in your PR for visual changes
- Cover different component states (default, focused, disabled, etc.)

### UI Testing Best Practices
- Test user interactions (clicks, swipes, text input)
- Verify component behavior under different states
- Test accessibility features (content descriptions, focus handling)
- Keep tests focused and independent

## 📐 Code Standards

### Kotlin Guidelines
- Follow [Kotlin coding conventions](https://kotlinlang.org/docs/coding-conventions.html)
- Use meaningful variable and function names
- Add KDoc comments for public APIs
- Prefer immutable data structures when possible

### Compose Guidelines
- Follow [Compose API guidelines](https://github.com/androidx/androidx/blob/androidx-main/compose/docs/compose-api-guidelines.md)
- Use `remember` and `rememberSaveable` appropriately
- Avoid unnecessary recompositions
- Follow the single source of truth principle
- Use proper state hoisting patterns

### Architecture Patterns
- Follow existing module architecture
- Maintain separation of concerns

## 🎨 Design System Considerations

### Component Guidelines
- **Consistency** - Follow existing component patterns
- **Theming** - Ensure components work with our theming system
- **Accessibility** - Support screen readers and accessibility services
- **RTL Support** - Ensure proper right-to-left layout support
- **State Management** - Handle all component states (loading, error, success, etc.)

### Breaking Changes
- Avoid breaking changes to public APIs as much as possible
- If breaking changes are necessary, discuss with maintainers first
- Follow semantic versioning principles
- Provide migration guides for breaking changes

## 🐛 Bug Reports

### Creating Good Bug Reports
- Use the bug report template
- Provide minimal reproducible examples
- Include relevant environment information
- Add screenshots or videos when helpful
- Test with the latest library version

### Security Issues
For security-related issues, please contact our security team directly instead of opening a public issue.

## 💡 Feature Suggestions

### Suggesting Features
1. **Open an issue** using the feature request template
2. **Provide use cases** - Explain why the feature is needed
3. **Consider alternatives** - Have you explored existing solutions?
4. **Be patient** - Feature requests are reviewed by our design team

## 📚 Documentation

### Documentation Standards
- Write clear, concise documentation
- Update README files when necessary
- Use proper markdown formatting

### KDoc Guidelines
- Document all public classes and functions
- Include parameter descriptions
- Document any side effects or threading requirements

## 🔄 Code Review Process

### What We Look For
- **Correctness** - Does the code work as intended?
- **Performance** - Are there any performance implications?
- **Maintainability** - Is the code easy to understand and modify?
- **Testing** - Are there adequate tests?
- **Documentation** - Is the code properly documented?
- **Consistency** - Does it follow existing patterns?

## 🏷️ Commit Message Format
Internally we use:
```
ISSUE_ID | My commit message
 - My other commit message

ANDDEV-0 | Change Checkbox size from 24.dp to 20.dp
 - Update Checkbox KDoc
```

For GitHub issues we expect a similar approach:
```
ISSUE_ID | My commit message
- My other commit message

GH-12 | Change Checkbox size from 24.dp to 20.dp
 - Update Checkbox KDoc
```

## 🤝 Code of Conduct

### Our Standards
- **Be respectful** - Treat everyone with respect and kindness
- **Be inclusive** - Welcome contributors from all backgrounds
- **Be constructive** - Provide helpful feedback and suggestions
- **Be patient** - Remember that everyone is learning

### Unacceptable Behavior
- Harassment or discrimination of any kind
- Offensive or inappropriate language
- Personal attacks or insults
- Spam or self-promotion
- Sharing private information without permission

## 📞 Getting Help

### Where to Get Help
- **GitHub Issues** - For bug reports and feature requests
- **Documentation** - Check our docs first

## 📄 License

By contributing to Komposto, you agree that your contributions will be licensed under the same license as the project.

---

Thank you for contributing to Komposto! Your efforts help make Android development better for everyone. 🎉
