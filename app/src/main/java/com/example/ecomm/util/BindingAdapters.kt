package com.example.ecomm.util


import android.view.View
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

@BindingAdapter("progressBarObserver")
fun setProgressBarObserver(view: View, isVisible: Boolean) {
    if (isVisible) {
        view.visibility = View.VISIBLE
    } else {
        view.visibility = View.GONE
    }
}