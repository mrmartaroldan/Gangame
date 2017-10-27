package com.example.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by a630465 on 26/10/2017.
 */

fun ViewGroup.inflate(layoutResId: Int, attachToRoot: Boolean = false): View{
    val inflater = LayoutInflater.from(context)
    return inflater.inflate(layoutResId, this, attachToRoot)
}