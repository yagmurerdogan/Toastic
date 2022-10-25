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
                ).show()
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
                ).show()
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
                ).show()
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
                ).show()
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
                ).show()
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
                ).show()
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

https://user-images.githubusercontent.com/47380312/197612088-1bf309ed-2553-4d9e-a372-88b09336e65c.mp4


# 🛼 Thanks for [Icons](https://www.flaticon.com/)

<img src="https://user-images.githubusercontent.com/47380312/197574914-2be1036f-8b04-4c31-ab25-40c14c43911b.png" a href= "https://www.flaticon.com/free-icons/tick" width="10%"><img src="https://user-images.githubusercontent.com/47380312/197576339-5f8f12c6-6deb-4d6f-bd5e-46e22a2f01df.png" a href= "https://www.flaticon.com/free-icons/error" width="10%"><img src="https://user-images.githubusercontent.com/47380312/197576285-1f5186fe-d61c-4148-a91c-d861d2311531.png" a href= "https://www.flaticon.com/free-icons/warning" width="10%"><img src="https://user-images.githubusercontent.com/47380312/197576050-ea0be80f-ba0a-4204-8a01-af481a2a78fc.png" a href= "https://www.flaticon.com/free-icons/info" width="10%">

<a href="https://www.flaticon.com/free-icons/tick" title="tick icons">Tick icons created by Alfredo Hernandez - Flaticon</a>

<a href="https://www.flaticon.com/free-icons/error" title="error icons">Error icons created by Ilham Fitrotul Hayat - Flaticon</a>

<a href="https://www.flaticon.com/free-icons/warning" title="warning icons">Warning icons created by Creatype - Flaticon</a>

<a href="https://www.flaticon.com/free-icons/info" title="info icons">Info icons created by Plastic Donut - Flaticon</a>

# 🌍 Contribution 

Please feel free to contribute! 

If this will be your first contributon, you can check this [website.](https://opensource.guide/how-to-contribute/)

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
