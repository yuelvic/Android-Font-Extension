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

In your layout file you must specify the TextView type
```xml
<TextView
    app:type="@{'header'}"
/>
```

And initialize the extension in your Application class

```kotlin
FontExt.set(context)

// or if you don't have fonts.json
FontExt.set(jsonString) // your json string
FontExt.set(map) // HashMap<String, FontStyle> The key should be your TextView type
```

## License

```
MIT License

Copyright 2019 Emmanuel Victor Garcia

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```
