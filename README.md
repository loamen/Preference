# Preference

Preference is an Android Kotlin library which builds upon [Jetpack Preference](https://developer.android.com/jetpack/androidx/releases/preference) and [Material Components](https://github.com/material-components/material-components-android). 
## Setup

You can use it in your own Android project by adding it to your depenencies:

```
dependencies {
    implementation "com.loamen.android:preference:1.0.0"
}
```

## Usage

Make sure your preference fragments are derived from `preference.PreferenceFragmentBase`.
This will notably take care of using a compatible `preferenceTheme` if none was specified in your theme styles. Failing to do so or using an incompatible `preferenceTheme` can lead to crashes.

## Customisation

You can define your own `preferenceTheme` attribute in your theme styles. Like so:
`<item name="preferenceTheme">@style/PreferenceThemeOverlay.Loamen.Custom</item>`

## Features

Run and explore the demo application and code documentation for more information.

### BasicPreference

Extend the basic preference with convenient features and tricks.

### EnumListPreference

Easily build a list preference from an enum.

### SliderPreference

Preference using a [Material Slider](https://m2.material.io/components/sliders#usage).

## Release 

Increase the library version number from [`lib/build.gradle.kts`](lib/build.gradle.kts).

Generate your upload package by running:<br> 
`.\gradlew generateUploadPackage`

It outputs a file named `preference.zip` in the following folder `lib\build\distributions`. You can directly upload this ZIP file for publication on [Maven Central](https://central.sonatype.com/publishing).
