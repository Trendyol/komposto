package core

/**
 * Annotation to mark interaction/behavior tests (non-screenshot tests).
 * Tests annotated with this will be run separately from screenshot tests in CI.
 *
 * Use this for tests that verify component behavior, interactions, and event handling
 * rather than visual appearance.
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class InteractionTest
