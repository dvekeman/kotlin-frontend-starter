# Kotlin Frontend Starter

Empty project setup for Kotlin JS development:

- Gradle + Kotlin DSL
- Kotlin Frontend Plugin
- Webpack

Some relevant settings (and how to change them)

- Module system: `umd` (change in `build.gradle.kts` and `webpack.config.d/custom.js`)
- Kotlin JS output: `build/js/main.js` (change in `build.gradle.kts`)
- Kotlin bundle output: `build/bundle/main.bundle.js` (change in `build.gradle.kts` and `webpack.config.d/custom.js`)
