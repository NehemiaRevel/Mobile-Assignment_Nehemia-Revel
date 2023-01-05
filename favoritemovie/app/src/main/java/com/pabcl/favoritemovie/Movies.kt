package com.pabcl.favoritemovie

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movies(
    var name : String = "",
    var genre : String = "",
    var year : String = "",
    var detail : String = "",
    var photo : Int = 0,
) : Parcelable
