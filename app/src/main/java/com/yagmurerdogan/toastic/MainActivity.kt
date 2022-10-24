package com.yagmurerdogan.toastic

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yagmurerdogan.toastic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var animateIcon: Boolean = false
    private var changeFont: Boolean = false
    private var setCustomIcon: Boolean = false
    private var setCustomBackground: Boolean = false
    private var changeTextColor: Boolean = false
    private var setCustomIconAnim: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {

            animateIconSwitch.setOnCheckedChangeListener { _, isChecked ->
                animateIcon = isChecked
            }
            changeFontSwitch.setOnCheckedChangeListener { _, isChecked ->
                changeFont = isChecked
            }
            customIconSwitch.setOnCheckedChangeListener { _, isChecked ->
                setCustomIcon = isChecked
            }
            customBgSwitch.setOnCheckedChangeListener { _, isChecked ->
                setCustomBackground = isChecked
            }
            textColorSwitch.setOnCheckedChangeListener { _, isChecked ->
                changeTextColor = isChecked
            }
            customIconAnimSwitch.setOnCheckedChangeListener { _, isChecked ->
                setCustomIconAnim = isChecked
            }

            successBtn.setOnClickListener {
                Toastic.toastic(
                    context = this@MainActivity,
                    message = "This is Success Toastic!",
                    duration = Toastic.LENGTH_SHORT,
                    type = Toastic.SUCCESS,
                    isIconAnimated = animateIcon,
                    font = if (changeFont) R.font.helveticabold else null,
                    customIcon = if (setCustomIcon) R.drawable.ic_custom_icon else null,
                    textColor = if (changeTextColor) Color.BLUE else null,
                    customIconAnimation = if (setCustomIconAnim) R.anim.rotate else null
                )
            }

            warningBtn.setOnClickListener {
                Toastic.toastic(
                    context = this@MainActivity,
                    message = "This is Warning Toastic!",
                    duration = Toastic.LENGTH_SHORT,
                    type = Toastic.WARNING,
                    isIconAnimated = animateIcon,
                    font = if (changeFont) R.font.helveticabold else null,
                    customIcon = if (setCustomIcon) R.drawable.ic_custom_icon else null,
                    textColor = if (changeTextColor) Color.BLUE else null,
                    customIconAnimation = if (setCustomIconAnim) R.anim.rotate else null
                )
            }

            errorBtn.setOnClickListener {
                Toastic.toastic(
                    context = this@MainActivity,
                    message = "This is Error Toastic!",
                    duration = Toastic.LENGTH_SHORT,
                    type = Toastic.ERROR,
                    isIconAnimated = animateIcon,
                    font = if (changeFont) R.font.helveticabold else null,
                    customIcon = if (setCustomIcon) R.drawable.ic_custom_icon else null,
                    textColor = if (changeTextColor) Color.BLUE else null,
                    customIconAnimation = if (setCustomIconAnim) R.anim.rotate else null
                )
            }

            infoBtn.setOnClickListener {
                Toastic.toastic(
                    context = this@MainActivity,
                    message = "This is Info Toastic!",
                    duration = Toastic.LENGTH_SHORT,
                    type = Toastic.INFO,
                    isIconAnimated = animateIcon,
                    font = if (changeFont) R.font.helveticabold else null,
                    customIcon = if (setCustomIcon) R.drawable.ic_custom_icon else null,
                    textColor = if (changeTextColor) Color.BLUE else null,
                    customIconAnimation = if (setCustomIconAnim) R.anim.rotate else null
                )
            }

            defaultBtn.setOnClickListener {
                Toastic.toastic(
                    context = this@MainActivity,
                    message = "This is Default Toastic!",
                    duration = Toastic.LENGTH_SHORT,
                    type = Toastic.DEFAULT,
                    isIconAnimated = animateIcon,
                    customIcon = if (setCustomIcon) R.drawable.ic_custom_icon else null,
                    font = if (changeFont) R.font.helveticabold else null,
                    customBackground = if (setCustomBackground) R.drawable.bg_custom_toastic else null,
                    textColor = if (changeTextColor) Color.WHITE else null,
                    customIconAnimation = if (setCustomIconAnim) R.anim.rotate else null
                )
            }
        }
    }
}