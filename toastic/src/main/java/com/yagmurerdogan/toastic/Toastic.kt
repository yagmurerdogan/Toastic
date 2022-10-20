package com.yagmurerdogan.toastic

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.annotation.IntDef
import androidx.core.content.res.ResourcesCompat
import com.yagmurerdogan.toastic.databinding.ToasticLayoutBinding

class Toastic(context: Context) : Toast(context) {

    companion object {

        @Retention(AnnotationRetention.SOURCE)
        @IntDef(SUCCESS, WARNING, ERROR, INFO, DEFAULT)
        annotation class LayoutType

        const val SUCCESS = 1
        const val WARNING = 2
        const val ERROR = 3
        const val INFO = 4
        const val DEFAULT = 5

        @Retention(AnnotationRetention.SOURCE)
        @IntDef(LENGTH_SHORT, LENGTH_LONG)
        annotation class Duration

        const val LENGTH_SHORT = Toast.LENGTH_SHORT
        const val LENGTH_LONG = Toast.LENGTH_LONG

        @JvmStatic
        fun toastic(
            context: Context,
            message: CharSequence,
            @Duration duration: Int,
            @LayoutType type: Int,
            customIcon: Int? = null,
            isIconAnimated: Boolean? = false,
            customIconAnimation: Int? = null,
            font: Int? = null,
            customBackground: Int? = null,
            textColor: Int? = null
        ): Toast {

            val binding = ToasticLayoutBinding.inflate(LayoutInflater.from(context), null, false)

            binding.toasticText.text = message

            when (type) {
                SUCCESS -> {
                    binding.toasticLayout.setBackgroundResource(R.drawable.bg_success)
                    binding.toasticIcon.setImageResource(R.drawable.success)
                    if (isIconAnimated == true)
                        startAnimation(context, binding.toasticIcon, R.anim.pulse)

                }
                WARNING -> {
                    binding.toasticLayout.setBackgroundResource(R.drawable.bg_warning)
                    binding.toasticIcon.setImageResource(R.drawable.warning)
                    if (isIconAnimated == true)
                        startAnimation(context, binding.toasticIcon, R.anim.shake)

                }
                ERROR -> {
                    binding.toasticLayout.setBackgroundResource(R.drawable.bg_error)
                    binding.toasticIcon.setImageResource(R.drawable.error)
                    if (isIconAnimated == true)
                        startAnimation(context, binding.toasticIcon, R.anim.shake)

                }
                INFO -> {
                    binding.toasticLayout.setBackgroundResource(R.drawable.bg_info)
                    binding.toasticIcon.setImageResource(R.drawable.info)
                    if (isIconAnimated == true)
                        startAnimation(context, binding.toasticIcon, R.anim.pulse)

                }
                DEFAULT -> {
                    binding.toasticLayout.setBackgroundResource(R.drawable.bg_default)
                    if (customIcon == null) binding.toasticIcon.visibility = View.GONE

                }
            }

            font?.let {
                binding.toasticText.typeface = ResourcesCompat.getFont(context, font)
            }

            customIcon?.let {
                binding.toasticIcon.setImageResource(customIcon)
            }

            customBackground?.let {
                binding.toasticLayout.setBackgroundResource(customBackground)
            }

            textColor?.let {
                binding.toasticText.setTextColor(textColor)
            }

            if (isIconAnimated == true && customIconAnimation != null) {
                startAnimation(context, binding.toasticIcon, customIconAnimation)
            }

            val toast = Toast(context)
            toast.duration = duration
            toast.view = binding.root
            return toast
        }

        private fun startAnimation(context: Context, view: View, animRes: Int) {
            val animation = AnimationUtils.loadAnimation(context, animRes)
            view.startAnimation(animation)
        }
    }

}