package com.example.destinasia

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Destination(
    val destination: String,
    val description: String,
    val photo: Int,
): Parcelable

