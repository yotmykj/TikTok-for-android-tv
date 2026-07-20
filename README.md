
# FixTok (Android TV & Google TV)

FixTok is a 10-foot, production-ready TV browser optimized specifically for the official TikTok website, built with Kotlin and Jetpack Compose for TV.

## Features
- Hardware-accelerated WebView targeting TikTok's desktop interface.
- Native TV D-Pad mapping (Up/Down to scroll, Left for Navigation Drawer).
- Graceful degradation: Uses Android Custom Tabs if TikTok blocks the WebView instance.
- Persistent login sessions via CookieManager.

## Building
This project uses GitHub Actions for CI/CD. Pushing to `main` automatically builds both Debug and unsigned Release APKs accessible in the Actions Artifacts tab.

To build locally:
`./gradlew assembleDebug`
