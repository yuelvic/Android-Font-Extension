## Android Font Extension
This library provides global configurations for your font,

## Requirements

Your project must implement the [Data Binding Library](https://developer.android.com/topic/libraries/data-binding/).

## Setup

Add jitpack in your project level build.gradle

```gradle
allprojects {
    repositories {
		maven { url 'https://jitpack.io' }
	}
}
```

Add the dependency in you app level build.gradle

```gradle
dependencies {
    implementation 'com.github.yuelvic:Android-Font-Extension:0.1.0'
}
```

## How to use

Place your fonts.json inside main/assets/fonts. It should look like this:

```json
{
    "header": {
        "font": "fonts/Gabriel-custom.ttf",
        "size": 20,
        "style": "bold"
    },
    "body": {
        "font": "fonts/Gabriel-serif.ttf",
        "size": 16,
        "style": "normal"
    },
    "footer": {
        "font": "fonts/Gabriel-custom.ttf",
        "size": 22,
        "style": "normal"
    }
}
```

And initialize the extension in your Application class

```kotlin
FontExt.set(context)

// or if you don't have fonts.json
FontExt.set(jsonString) // your json string
FontExt.set(map) // HashMap<String, FontStyle> The key should be your TextView type
```
