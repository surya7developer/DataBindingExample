package com.suresh.databinding.example

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("loadImage")
fun ImageView.setUrl(url:String){
    Glide.with(this).load(url).into(this)
}