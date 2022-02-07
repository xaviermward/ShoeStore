package com.udacity.shoestore.models

import kotlinx.parcelize.Parcelize
import android.os.Parcelable


@Parcelize
data class Shoe(var name: String, var size: Double, var company: String, var description: String,
                val images: List<String> = mutableListOf()) : Parcelable