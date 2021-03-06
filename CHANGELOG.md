Changelog
=========

### Version 1.1-beta2 ###
Released on ?? (unreleased)

- NEW: added the "Debug" setting
- FIX: widget buttons would end up under the widget text when the weather icon was hidden
- FIX: some use cases require using the ACCESS_FINE_LOCATION permission which was not requested by the app (WiFi/Google location off, GPS on)
- FIX: opening the Authors dialog on Android 2.3 would crash the app
- FIX: minor UI fixes

### Version 1.1-beta1 ###
Released on 8th July 2013

- NEW: added Settings Activity
    - Customize widget
    - Dark mode (useful for bright background)
    - Set refresh rate and manually refresh
    - Licenses, credits, feedback mechanism
- NEW: added buttons on the widget to refresh and configure it
- NEW: use Google Play Services Location provider where available (better accuracy, low power consumption)
- NEW: use Google Analytics to get feedback on errors and issues and direct future development (with opt-out)
- FIXED: widget being stuck on "loading" ("Let me look out of a f*****g window")
- FIXED: bad handling of weather JSON when there is an error/malformation

### Version 1.0 ###
Released on 30th June 2013

- First Play Store build
- Basic widget, no customization