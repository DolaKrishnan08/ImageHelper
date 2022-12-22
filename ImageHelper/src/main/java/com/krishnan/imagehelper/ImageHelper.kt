package com.krishnan.imagehelper

import android.widget.ImageView
import androidx.constraintlayout.widget.Placeholder
import coil.load

class ImageHelper {

    fun loadImage(imageView: ImageView, data: Any, placeholder: Placeholder, drawableResId: Int) {
        imageView.load(data) {
            placeholder(drawableResId)
        }

    }

}