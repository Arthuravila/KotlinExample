package com.example.ecomm.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso


@BindingAdapter("url")
fun setImage(view: ImageView, url: String?) {
    Picasso.get()
        .load(url)
        .fit()
        .into(view)
}