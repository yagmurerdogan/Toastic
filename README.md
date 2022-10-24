<p align="center">
<img src="https://user-images.githubusercontent.com/47380312/197545150-219f4b85-ac1a-443a-8c91-a655800f7023.png"/>
</p>


##  🟢 Success Toastic

<p align="center" >
<img src="https://user-images.githubusercontent.com/47380312/197556428-c8146f2e-e163-4d69-abe5-9ba8d3f5151b.gif" width="50%"/>
</p> 

```kotlin
    button.setOnClickListener {
                Toastic.toastic(
                    context = this@MainActivity,
                    message = "This is Success Toastic!",
                    duration = Toastic.LENGTH_SHORT,
                    type = Toastic.SUCCESS,
                    isIconAnimated = true
                )
            }
```
## 🔵  Info Toastic

<p align="center" >
<img src="https://user-images.githubusercontent.com/47380312/197559355-b3660d0d-a0e8-4074-890b-ec691e7337ba.gif" width="50%"/>
</p> 

```kotlin
    button.setOnClickListener {
                Toastic.toastic(
                    context = this@MainActivity,
                    message = "This is Info Toastic!",
                    duration = Toastic.LENGTH_SHORT,
                    type = Toastic.INFO,
                    isIconAnimated = true
                )
            }
```
## 🟡 Warning Toastic

<p align="center" >
<img src="https://user-images.githubusercontent.com/47380312/197560183-48a2aad9-f4f1-485b-b70a-1984d6083fb8.gif" width="50%"/>
</p> 

```kotlin
    button.setOnClickListener {
                Toastic.toastic(
                    context = this@MainActivity,
                    message = "This is Warning Toastic!",
                    duration = Toastic.LENGTH_SHORT,
                    type = Toastic.WARNING,
                    isIconAnimated = true
                )
            }
```
## 🔴 Error Toastic

<p align="center" >
<img src="https://user-images.githubusercontent.com/47380312/197561950-b367f91d-32a2-45cb-afdd-6087ab6d8ba2.gif" width="50%"/>
</p> 

```kotlin
    button.setOnClickListener {
                Toastic.toastic(
                    context = this@MainActivity,
                    message = "This is Error Toastic!",
                    duration = Toastic.LENGTH_SHORT,
                    type = Toastic.ERROR,
                    isIconAnimated = true
                )
            }
```
## ⚫️ Default Toastic

<p align="center" >
<img src="https://user-images.githubusercontent.com/47380312/197569430-4946c3a2-8e48-43f1-b7f0-7a07489ad303.gif" width="50%"/>
</p> 

```kotlin
    button.setOnClickListener {
                Toastic.toastic(
                    context = this@MainActivity,
                    message = "This is Default Toastic!",
                    duration = Toastic.LENGTH_SHORT,
                    type = Toastic.DEFAULT,
                    isIconAnimated = true
                )
            }
```
# 💁🏻‍♀️ Can I customize the Toastic more?

<p align="center">
<img src="https://media.giphy.com/media/xT9DPiHFM8Iy3hiC3e/giphy.gif" width="70%"/>
</p><br>


## 💖 Customized Default Toastic

<p align="center" >
<img src="https://user-images.githubusercontent.com/47380312/197565396-e2375e52-fc91-4632-a764-8e1f51e1e1e5.gif" width="50%"/>
</p> 

```kotlin
    button.setOnClickListener {
                Toastic.toastic(
                    context = this@MainActivity,
                    message = "This is Default Toastic!",
                    duration = Toastic.LENGTH_SHORT,
                    type = Toastic.DEFAULT,
                    isIconAnimated = true,
                    customIcon = R.drawable.ic_heart,
                    font = R.font.helveticabold,
                    customBackground = R.drawable.bg_pink,
                    textColor = Color.WHITE,
                    customIconAnimation = R.anim.rotate
                )
            }
```

# 📌 F.A.Q
✨ Can I add any icon I want instead of defaults? 👉🏻 Yes!

```kotlin
customIcon = R.drawable.ic_heart
```

✨ Can I add any animation to icon instead of defaults? 👉🏻 Yes!

```kotlin
customIconAnimation = R.anim.rotate
```

✨ Can I use different font style for text? 👉🏻 Yes!

```kotlin
font = R.font.helveticabold
```

✨ Can I change the text color? 👉🏻 Yes!

```kotlin
textColor = Color.WHITE
```

✨ Can I change the background? 👉🏻 Yes!

```kotlin
customBackground = R.drawable.bg_pink
```

✨ I don't want to use any animation for icon. Is that possible to use without animation? 👉🏻 Yes!

```kotlin
isIconAnimated = false
```


# 🧜🏻‍♀️  Sample App

<p align="center" >
<img src="https://user-images.githubusercontent.com/47380312/197580813-5a0201e6-c589-4911-9455-dc06c03aaa39.png" width="30%"/>
</p><br>

<p align="center" >
<img src="https://user-images.githubusercontent.com/47380312/197563617-8dd4ff57-7889-4451-ae90-8152d65af2c9.gif" width="30%"/>
</p> 

# 📚 License
```xml
Created by 2022 yagmurerdogan (Yağmur Erdoğan)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
