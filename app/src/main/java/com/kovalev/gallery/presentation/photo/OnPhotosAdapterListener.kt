package com.kovalev.gallery.presentation.photo

import android.widget.ImageView


/**
 * To make an interaction between [PhotosAdapter] & [PhotosFragment]
 * */
interface OnPhotosAdapterListener{

    fun gotoDetailPage(imageView: ImageView,id: Long)

}