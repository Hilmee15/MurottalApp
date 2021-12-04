package com.idn.murottalapp.data

//import android.os.Parcelable
//import kotlinx.parcelize.Parcelize

// @Parcelize
data class ListSurah(
    val file: Int,
    val name: String,
    val name_arabic: String,
    val origin: String,
    val amount: Int,
    val numbers: Int
) // : Parcelable
